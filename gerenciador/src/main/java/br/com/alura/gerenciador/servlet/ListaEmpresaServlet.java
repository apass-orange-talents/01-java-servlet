package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import br.com.alura.gerenciador.dao.EmpresaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("empresas", new EmpresaDao().getEmpresas());

		request.getRequestDispatcher("/listaEmpresa.jsp").forward(request, response);

	}

}
