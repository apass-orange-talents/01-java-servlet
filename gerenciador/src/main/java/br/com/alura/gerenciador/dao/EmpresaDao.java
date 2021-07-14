package br.com.alura.gerenciador.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.gerenciador.modelo.Empresa;

/**
 * 
 * Classe que capsula o acesso aos dados das empresas.
 *
 */
public class EmpresaDao {

	/**
	 * Guarda uma lista de empresas.
	 */
	private static List<Empresa> lista = new ArrayList<>();

	static {

		Empresa empresa = new Empresa();
		empresa.setId("1");
		empresa.setNome("Alura");
		lista.add(empresa);

		empresa = new Empresa();
		empresa.setId("2");
		empresa.setNome("Caelum");

		lista.add(empresa);

	}

	/**
	 * Adiciona uma nova empresa.
	 * 
	 * @param empresa
	 */
	public void adiciona(Empresa empresa) {
		empresa.setId(String.valueOf(lista.size() + 1));
		EmpresaDao.lista.add(empresa);
	}

	/**
	 * Obtém a lista de empresas.
	 * 
	 * @return
	 */
	public List<Empresa> getEmpresas() {
		return List.copyOf(EmpresaDao.lista);
	}
}
