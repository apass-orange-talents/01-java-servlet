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

	/**
	 * Adiciona uma nova empresa.
	 * 
	 * @param empresa
	 */
	public void adiciona(Empresa empresa) {
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
