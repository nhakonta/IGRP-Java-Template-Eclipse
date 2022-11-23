package nosi.webapps.sgie.dao;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * @author: Nositeste 23-11-2022
*/

@Entity
@Table(name = "tbl_folha_avaliacao", schema = "pgie")
@NamedQuery(name = "TblFolhaAvaliacao.findAll", query = "SELECT t FROM TblFolhaAvaliacao t")
public class TblFolhaAvaliacao extends BaseActiveRecord<TblFolhaAvaliacao> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "valor")
	private Boolean valor;
	@Column(name = "folha")
	private Integer folha;
	@Column(name = "data")
	private LocalDate data;
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "campo_id")
	private Integer campoId;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public String getDescricao() { 
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		 this.descricao = descricao;
	}

	public Boolean getValor() { 
		return this.valor;
	}

	public void setValor(Boolean valor) {
		 this.valor = valor;
	}

	public Integer getFolha() { 
		return this.folha;
	}

	public void setFolha(Integer folha) {
		 this.folha = folha;
	}

	public LocalDate getData() { 
		return this.data;
	}

	public void setData(LocalDate data) {
		 this.data = data;
	}

	public Integer getUserId() { 
		return this.userId;
	}

	public void setUserId(Integer userId) {
		 this.userId = userId;
	}

	public Integer getCampoId() { 
		return this.campoId;
	}

	public void setCampoId(Integer campoId) {
		 this.campoId = campoId;
	}

}