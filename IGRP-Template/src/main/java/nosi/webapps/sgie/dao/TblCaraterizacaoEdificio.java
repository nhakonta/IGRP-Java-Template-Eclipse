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
@Table(name = "tbl_caraterizacao_edificio", schema = "pgie")
@NamedQuery(name = "TblCaraterizacaoEdificio.findAll", query = "SELECT t FROM TblCaraterizacaoEdificio t")
public class TblCaraterizacaoEdificio extends BaseActiveRecord<TblCaraterizacaoEdificio> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Column(name = "decada")
	private Integer decada;
	@Column(name = "ano_constroi")
	private Integer anoConstroi;
	@Column(name = "pisos_acima_solo")
	private Integer pisosAcimaSolo;
	@Column(name = "pisos_abaixo_solo")
	private Integer pisosAbaixoSolo;
	@Column(name = "area_bruta")
	private Integer areaBruta;
	@Column(name = "area_lote")
	private Integer areaLote;
	@Column(name = "volumetria")
	private Integer volumetria;
	@Column(name = "num_lugares_estaciona")
	private Integer numLugaresEstaciona;
	@Column(name = "ano_reconstroi")
	private String anoReconstroi;
	@Column(name = "nome_empresa")
	private String nomeEmpresa;
	@Column(name = "morada_empresa")
	private String moradaEmpresa;
	@Column(name = "contacto_empresa")
	private String contactoEmpresa;
	@Column(name = "email_empresa")
	private String emailEmpresa;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxEscolas escId;
	@Column(name = "data")
	private LocalDate data;
	@Column(name = "user_id")
	private Integer userId;
	@Size(max = 1)
	@Column(name = "estado")
	private String estado;
	@ManyToOne
	@JoinColumn(name = "guarita", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxSimNao guarita;
	@Column(name = "altura_total_edificio")
	private Integer alturaTotalEdificio;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public Integer getDecada() { 
		return this.decada;
	}

	public void setDecada(Integer decada) {
		 this.decada = decada;
	}

	public Integer getAnoConstroi() { 
		return this.anoConstroi;
	}

	public void setAnoConstroi(Integer anoConstroi) {
		 this.anoConstroi = anoConstroi;
	}

	public Integer getPisosAcimaSolo() { 
		return this.pisosAcimaSolo;
	}

	public void setPisosAcimaSolo(Integer pisosAcimaSolo) {
		 this.pisosAcimaSolo = pisosAcimaSolo;
	}

	public Integer getPisosAbaixoSolo() { 
		return this.pisosAbaixoSolo;
	}

	public void setPisosAbaixoSolo(Integer pisosAbaixoSolo) {
		 this.pisosAbaixoSolo = pisosAbaixoSolo;
	}

	public Integer getAreaBruta() { 
		return this.areaBruta;
	}

	public void setAreaBruta(Integer areaBruta) {
		 this.areaBruta = areaBruta;
	}

	public Integer getAreaLote() { 
		return this.areaLote;
	}

	public void setAreaLote(Integer areaLote) {
		 this.areaLote = areaLote;
	}

	public Integer getVolumetria() { 
		return this.volumetria;
	}

	public void setVolumetria(Integer volumetria) {
		 this.volumetria = volumetria;
	}

	public Integer getNumLugaresEstaciona() { 
		return this.numLugaresEstaciona;
	}

	public void setNumLugaresEstaciona(Integer numLugaresEstaciona) {
		 this.numLugaresEstaciona = numLugaresEstaciona;
	}

	public String getAnoReconstroi() { 
		return this.anoReconstroi;
	}

	public void setAnoReconstroi(String anoReconstroi) {
		 this.anoReconstroi = anoReconstroi;
	}

	public String getNomeEmpresa() { 
		return this.nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		 this.nomeEmpresa = nomeEmpresa;
	}

	public String getMoradaEmpresa() { 
		return this.moradaEmpresa;
	}

	public void setMoradaEmpresa(String moradaEmpresa) {
		 this.moradaEmpresa = moradaEmpresa;
	}

	public String getContactoEmpresa() { 
		return this.contactoEmpresa;
	}

	public void setContactoEmpresa(String contactoEmpresa) {
		 this.contactoEmpresa = contactoEmpresa;
	}

	public String getEmailEmpresa() { 
		return this.emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		 this.emailEmpresa = emailEmpresa;
	}

	public TblAuxEscolas getEscId() { 
		return this.escId;
	}

	public void setEscId(TblAuxEscolas escId) {
		 this.escId = escId;
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

	public String getEstado() { 
		return this.estado;
	}

	public void setEstado(String estado) {
		 this.estado = estado;
	}

	public TblAuxSimNao getGuarita() { 
		return this.guarita;
	}

	public void setGuarita(TblAuxSimNao guarita) {
		 this.guarita = guarita;
	}

	public Integer getAlturaTotalEdificio() { 
		return this.alturaTotalEdificio;
	}

	public void setAlturaTotalEdificio(Integer alturaTotalEdificio) {
		 this.alturaTotalEdificio = alturaTotalEdificio;
	}

}