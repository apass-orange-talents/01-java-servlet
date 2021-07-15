package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.EmpresaDao;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Endpoint para cadastrar uma nova empresa.
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		final var empresaDao = new EmpresaDao();
		
		final var empresa = new Empresa();
		empresa.setNome(req.getParameter("nome"));
		
		empresaDao.adiciona(empresa);

		req.setAttribute("empresa", empresa);
		
		req.getRequestDispatcher("/novaEmpresaCriada.jsp").forward(req, resp);
		
	}
}
