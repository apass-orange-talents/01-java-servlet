package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.EmpresaDao;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Endpoint para cadastrar uma nova empresa.
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		final var empresa = new Empresa();

		empresa.setNome(req.getParameter("nome"));

		try {
			empresa.setDataAbertura(new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("dataAbertura")));
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		new EmpresaDao().adiciona(empresa);

		resp.sendRedirect("listaEmpresas");

	}
}
