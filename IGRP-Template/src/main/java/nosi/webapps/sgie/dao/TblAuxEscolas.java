package nosi.webapps.sgie.dao;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * @author: Nositeste 23-11-2022
*/

@Entity
@Table(name = "tbl_aux_escolas", schema = "pgie")
@NamedQuery(name = "TblAuxEscolas.findAll", query = "SELECT t FROM TblAuxEscolas t")
public class TblAuxEscolas extends BaseActiveRecord<TblAuxEscolas> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "nivel_ensino")
	private String nivelEnsino;
	@Column(name = "zona")
	private String zona;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "telefone")
	private String telefone;
	@Column(name = "email")
	private String email;
	@Column(name = "concelho")
	private String concelho;
	@Column(name = "num_alunos")
	private Integer numAlunos;
	@Column(name = "gps")
	private String gps;
	@Column(name = "foto_escola")
	private String fotoEscola;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public String getNivelEnsino() { 
		return this.nivelEnsino;
	}

	public void setNivelEnsino(String nivelEnsino) {
		 this.nivelEnsino = nivelEnsino;
	}

	public String getZona() { 
		return this.zona;
	}

	public void setZona(String zona) {
		 this.zona = zona;
	}

	public String getLugar() { 
		return this.lugar;
	}

	public void setLugar(String lugar) {
		 this.lugar = lugar;
	}

	public String getTelefone() { 
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		 this.telefone = telefone;
	}

	public String getEmail() { 
		return this.email;
	}

	public void setEmail(String email) {
		 this.email = email;
	}

	public String getConcelho() { 
		return this.concelho;
	}

	public void setConcelho(String concelho) {
		 this.concelho = concelho;
	}

	public Integer getNumAlunos() { 
		return this.numAlunos;
	}

	public void setNumAlunos(Integer numAlunos) {
		 this.numAlunos = numAlunos;
	}

	public String getGps() { 
		return this.gps;
	}

	public void setGps(String gps) {
		 this.gps = gps;
	}

	public String getFotoEscola() { 
		return this.fotoEscola;
	}

	public void setFotoEscola(String fotoEscola) {
		 this.fotoEscola = fotoEscola;
	}

}