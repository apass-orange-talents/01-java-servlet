package br.com.alura.gerenciador.dao;

import java.util.ArrayList;
import java.util.Iterator;
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

	/**
	 * Guarda o código auto incrementado da empesa.
	 */
	private static Long autoIncremento = 1L;

	static {

		Empresa empresa = new Empresa();
		empresa.setId(autoIncremento++);
		empresa.setNome("Alura");
		lista.add(empresa);

		empresa = new Empresa();
		empresa.setId(autoIncremento++);
		empresa.setNome("Caelum");

		lista.add(empresa);

	}

	/**
	 * Adiciona uma nova empresa.
	 * 
	 * @param empresa
	 */
	public void adiciona(Empresa empresa) {
		empresa.setId(autoIncremento++);
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

	/**
	 * Remove uma empresa.
	 * 
	 * @param empresa
	 */
	public void removeEmpresa(Empresa empresa) {
		lista.remove(empresa);
	}

	/**
	 * Obtém uma empesa pelo código identificador.
	 * 
	 * @param parseLong
	 * @return
	 */
	public Empresa buscaEmpresaPeloId(long id) {

		for (Empresa empresa : lista) {
			if (empresa.getId() == id)
				return empresa;
		}

		return null;
	}

	/**
	 * Altera os dados de uma empresa.
	 * 
	 * @param empresa
	 */
	public void edita(Empresa empresa) {
		final var e = new Empresa();
		e.setId(empresa.getId());
		lista.remove(e);
		lista.add(empresa);
	}
}
