package nosi.webapps.sgie.dao;

import javax.persistence.NamedQuery;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.Column;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * @author: Nositeste 23-11-2022
*/

@Entity
@Table(name = "tbl_descricao_morfo", schema = "pgie")
@NamedQuery(name = "TblDescricaoMorfo.findAll", query = "SELECT t FROM TblDescricaoMorfo t")
public class TblDescricaoMorfo extends BaseActiveRecord<TblDescricaoMorfo> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Column(name = "num_corpos")
	private Integer numCorpos;
	@ManyToOne
	@JoinColumn(name = "simetria", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxSimNao simetria;
	@Column(name = "num_compartimentos")
	private Integer numCompartimentos;
	@Column(name = "num_instal_sanitaria")
	private Integer numInstalSanitaria;
	@ManyToOne
	@JoinColumn(name = "forma", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxMorfaMorfo forma;
	@ManyToOne
	@JoinColumn(name = "entrada", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxEntradaMorfo entrada;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk4"))
	private TblAuxEscolas escId;
	@Column(name = "date")
	private LocalDate date;
	@Column(name = "user_id")
	private Integer userId;
	@Size(max = 1)
	@Column(name = "estado")
	private String estado;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public Integer getNumCorpos() { 
		return this.numCorpos;
	}

	public void setNumCorpos(Integer numCorpos) {
		 this.numCorpos = numCorpos;
	}

	public TblAuxSimNao getSimetria() { 
		return this.simetria;
	}

	public void setSimetria(TblAuxSimNao simetria) {
		 this.simetria = simetria;
	}

	public Integer getNumCompartimentos() { 
		return this.numCompartimentos;
	}

	public void setNumCompartimentos(Integer numCompartimentos) {
		 this.numCompartimentos = numCompartimentos;
	}

	public Integer getNumInstalSanitaria() { 
		return this.numInstalSanitaria;
	}

	public void setNumInstalSanitaria(Integer numInstalSanitaria) {
		 this.numInstalSanitaria = numInstalSanitaria;
	}

	public TblAuxMorfaMorfo getForma() { 
		return this.forma;
	}

	public void setForma(TblAuxMorfaMorfo forma) {
		 this.forma = forma;
	}

	public TblAuxEntradaMorfo getEntrada() { 
		return this.entrada;
	}

	public void setEntrada(TblAuxEntradaMorfo entrada) {
		 this.entrada = entrada;
	}

	public TblAuxEscolas getEscId() { 
		return this.escId;
	}

	public void setEscId(TblAuxEscolas escId) {
		 this.escId = escId;
	}

	public LocalDate getDate() { 
		return this.date;
	}

	public void setDate(LocalDate date) {
		 this.date = date;
	}

	public Integer getUserId() { 
		return this.userId;
	}

	public void setUserId(Integer userId) {
		 this.userId = userId;
	}

	public String getEstado() { 
		return this.estado;
	}

	public void setEstado(String estado) {
		 this.estado = estado;
	}

}