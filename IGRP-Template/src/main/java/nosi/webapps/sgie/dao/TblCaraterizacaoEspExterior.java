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
@Table(name = "tbl_caraterizacao_esp_exterior", schema = "pgie")
@NamedQuery(name = "TblCaraterizacaoEspExterior.findAll", query = "SELECT t FROM TblCaraterizacaoEspExterior t")
public class TblCaraterizacaoEspExterior extends BaseActiveRecord<TblCaraterizacaoEspExterior> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "acesso_auto", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxAnomalias acessoAuto;
	@ManyToOne
	@JoinColumn(name = "sistema_rega", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxAnomalias sistemaRega;
	@ManyToOne
	@JoinColumn(name = "luga_estacionamento", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxAnomalias lugaEstacionamento;
	@ManyToOne
	@JoinColumn(name = "manual", foreignKey = @ForeignKey(name = "fk4"))
	private TblAuxAnomalias manual;
	@ManyToOne
	@JoinColumn(name = "arvores_folha_perene", foreignKey = @ForeignKey(name = "fk5"))
	private TblAuxSimNao arvoresFolhaPerene;
	@ManyToOne
	@JoinColumn(name = "arvores_folha_caduca", foreignKey = @ForeignKey(name = "fk6"))
	private TblAuxSimNao arvoresFolhaCaduca;
	@ManyToOne
	@JoinColumn(name = "arvores_fruta", foreignKey = @ForeignKey(name = "fk7"))
	private TblAuxSimNao arvoresFruta;
	@ManyToOne
	@JoinColumn(name = "arbustos", foreignKey = @ForeignKey(name = "fk8"))
	private TblAuxSimNao arbustos;
	@ManyToOne
	@JoinColumn(name = "canteiros_floridos", foreignKey = @ForeignKey(name = "fk9"))
	private TblAuxSimNao canteirosFloridos;
	@Column(name = "quant_cant_floridos")
	private Integer quantCantFloridos;
	@ManyToOne
	@JoinColumn(name = "campo_futebol", foreignKey = @ForeignKey(name = "fk10"))
	private TblAuxAnomalias campoFutebol;
	@ManyToOne
	@JoinColumn(name = "campo_basquete", foreignKey = @ForeignKey(name = "fk11"))
	private TblAuxAnomalias campoBasquete;
	@ManyToOne
	@JoinColumn(name = "campo_voley", foreignKey = @ForeignKey(name = "fk12"))
	private TblAuxAnomalias campoVoley;
	@ManyToOne
	@JoinColumn(name = "recreio_cob_exterior", foreignKey = @ForeignKey(name = "fk13"))
	private TblAuxAnomalias recreioCobExterior;
	@ManyToOne
	@JoinColumn(name = "paviliao_poli_exterior", foreignKey = @ForeignKey(name = "fk14"))
	private TblAuxAnomalias paviliaoPoliExterior;
	@ManyToOne
	@JoinColumn(name = "outras_instal_exterior", foreignKey = @ForeignKey(name = "fk15"))
	private TblAuxAnomalias outrasInstalExterior;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk16"))
	private TblAuxEscolas escId;
	@Column(name = "data")
	private LocalDate data;
	@Column(name = "user_id")
	private Integer userId;
	@Size(max = 1)
	@Column(name = "estado")
	private String estado;
	@ManyToOne
	@JoinColumn(name = "paviliao_interior", foreignKey = @ForeignKey(name = "fk17"))
	private TblAuxAnomalias paviliaoInterior;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public TblAuxAnomalias getAcessoAuto() { 
		return this.acessoAuto;
	}

	public void setAcessoAuto(TblAuxAnomalias acessoAuto) {
		 this.acessoAuto = acessoAuto;
	}

	public TblAuxAnomalias getSistemaRega() { 
		return this.sistemaRega;
	}

	public void setSistemaRega(TblAuxAnomalias sistemaRega) {
		 this.sistemaRega = sistemaRega;
	}

	public TblAuxAnomalias getLugaEstacionamento() { 
		return this.lugaEstacionamento;
	}

	public void setLugaEstacionamento(TblAuxAnomalias lugaEstacionamento) {
		 this.lugaEstacionamento = lugaEstacionamento;
	}

	public TblAuxAnomalias getManual() { 
		return this.manual;
	}

	public void setManual(TblAuxAnomalias manual) {
		 this.manual = manual;
	}

	public TblAuxSimNao getArvoresFolhaPerene() { 
		return this.arvoresFolhaPerene;
	}

	public void setArvoresFolhaPerene(TblAuxSimNao arvoresFolhaPerene) {
		 this.arvoresFolhaPerene = arvoresFolhaPerene;
	}

	public TblAuxSimNao getArvoresFolhaCaduca() { 
		return this.arvoresFolhaCaduca;
	}

	public void setArvoresFolhaCaduca(TblAuxSimNao arvoresFolhaCaduca) {
		 this.arvoresFolhaCaduca = arvoresFolhaCaduca;
	}

	public TblAuxSimNao getArvoresFruta() { 
		return this.arvoresFruta;
	}

	public void setArvoresFruta(TblAuxSimNao arvoresFruta) {
		 this.arvoresFruta = arvoresFruta;
	}

	public TblAuxSimNao getArbustos() { 
		return this.arbustos;
	}

	public void setArbustos(TblAuxSimNao arbustos) {
		 this.arbustos = arbustos;
	}

	public TblAuxSimNao getCanteirosFloridos() { 
		return this.canteirosFloridos;
	}

	public void setCanteirosFloridos(TblAuxSimNao canteirosFloridos) {
		 this.canteirosFloridos = canteirosFloridos;
	}

	public Integer getQuantCantFloridos() { 
		return this.quantCantFloridos;
	}

	public void setQuantCantFloridos(Integer quantCantFloridos) {
		 this.quantCantFloridos = quantCantFloridos;
	}

	public TblAuxAnomalias getCampoFutebol() { 
		return this.campoFutebol;
	}

	public void setCampoFutebol(TblAuxAnomalias campoFutebol) {
		 this.campoFutebol = campoFutebol;
	}

	public TblAuxAnomalias getCampoBasquete() { 
		return this.campoBasquete;
	}

	public void setCampoBasquete(TblAuxAnomalias campoBasquete) {
		 this.campoBasquete = campoBasquete;
	}

	public TblAuxAnomalias getCampoVoley() { 
		return this.campoVoley;
	}

	public void setCampoVoley(TblAuxAnomalias campoVoley) {
		 this.campoVoley = campoVoley;
	}

	public TblAuxAnomalias getRecreioCobExterior() { 
		return this.recreioCobExterior;
	}

	public void setRecreioCobExterior(TblAuxAnomalias recreioCobExterior) {
		 this.recreioCobExterior = recreioCobExterior;
	}

	public TblAuxAnomalias getPaviliaoPoliExterior() { 
		return this.paviliaoPoliExterior;
	}

	public void setPaviliaoPoliExterior(TblAuxAnomalias paviliaoPoliExterior) {
		 this.paviliaoPoliExterior = paviliaoPoliExterior;
	}

	public TblAuxAnomalias getOutrasInstalExterior() { 
		return this.outrasInstalExterior;
	}

	public void setOutrasInstalExterior(TblAuxAnomalias outrasInstalExterior) {
		 this.outrasInstalExterior = outrasInstalExterior;
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

	public TblAuxAnomalias getPaviliaoInterior() { 
		return this.paviliaoInterior;
	}

	public void setPaviliaoInterior(TblAuxAnomalias paviliaoInterior) {
		 this.paviliaoInterior = paviliaoInterior;
	}

}