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
 * Endpoint para alterar os dados de uma empesa.
 */
@WebServlet("/editaEmpresa")
public class EditaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final var empresa = new Empresa();

		empresa.setId(Long.parseLong(request.getParameter("id")));
		empresa.setNome(request.getParameter("nome"));
		try {
			empresa.setDataAbertura(new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dataAbertura")));
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		new EmpresaDao().edita(empresa);

		response.sendRedirect("listaEmpresas");

	}

}
