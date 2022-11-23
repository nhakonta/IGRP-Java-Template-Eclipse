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
@Table(name = "tbl_aux_localizacao_lote", schema = "pgie")
@NamedQuery(name = "TblAuxLocalizacaoLote.findAll", query = "SELECT t FROM TblAuxLocalizacaoLote t")
public class TblAuxLocalizacaoLote extends BaseActiveRecord<TblAuxLocalizacaoLote> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Column(name = "descricao")
	private String descricao;

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

}