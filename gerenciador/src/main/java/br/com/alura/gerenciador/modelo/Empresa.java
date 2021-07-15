package br.com.alura.gerenciador.modelo;

import java.util.Date;
import java.util.Objects;

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
	 * Guarda a data de abertura da empresa.
	 */
	private Date dataAbertura = new Date();

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

	/**
	 * Obt�m a data de abertura da empresa.
	 * 
	 * @return
	 */
	public Date getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * Define a data de abertura da empresa.
	 * 
	 * @param dataDeAbertura
	 */
	public void setDataAbertura(Date dataDeAbertura) {
		this.dataAbertura = dataDeAbertura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(id, other.id);
	}

}
