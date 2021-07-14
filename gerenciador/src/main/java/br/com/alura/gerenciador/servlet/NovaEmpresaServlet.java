package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.alura.gerenciador.dao.EmpresaDao;
import br.com.alura.gerenciador.modelo.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Endpoint para cadastrar uma nova empresa.
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		final var empresaDao = new EmpresaDao();
		
		final var empresa = new Empresa();
		empresa.setNome(req.getParameter("nome"));
		
		empresaDao.adiciona(empresa);

		out.print("Empresa " + req.getParameter("nome") + " cadastradas com sucesso!");
	}
}
