package br.com.alura.gerenciador.modelo;

/**
 * Classe que representa uma empresa.
 * 
 */
public class Empresa {

	/**
	 * Guarda o c�digo da empresa.
	 */
	private String id;

	/**
	 * Guarda o nome da empresa.
	 */
	private String Nome;

	/**
	 * Obt�m o c�digo identificador da empresa.
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * Define o c�digo identificador da empresa.
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Obt�m o nome da empresa.
	 * 
	 * @return
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * Define o nome da empresa.
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

}
