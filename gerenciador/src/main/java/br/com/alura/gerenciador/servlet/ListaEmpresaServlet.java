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

		final var empresaDao = new EmpresaDao();
		final var listaEmpresas = empresaDao.getEmpresas();
		
		final var out = response.getWriter();
		
			out.append("<!DOCTYPE html><html lang=\"pt-BR\">")
			.append("<head>")
			.append("<meta charset=\"utf-8\"/>")
			.append("</head>")
			.append("<body>")
			.append("<ul>");
			
			for(var empresa: listaEmpresas) {
				out.append("<li>").append(empresa.getNome()).append("</li>");
			}
			
			
			out.append("</ul></body></html>");
		
	}

}
