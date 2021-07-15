package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.EmpresaDao;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class MostraEmpesa
 */
@WebServlet("/mostraEmpresa")
public class MostraEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final var empresa = new EmpresaDao().buscaEmpresaPeloId(Long.parseLong(request.getParameter("id")));

		request.setAttribute("empresa", empresa);
		request.getRequestDispatcher("/formNovaEmpresa.jsp").forward(request, response);
	}

}
