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
@Table(name = "tbl_aval_estado_conserva", schema = "pgie")
@NamedQuery(name = "TblAvalEstadoConserva.findAll", query = "SELECT t FROM TblAvalEstadoConserva t")
public class TblAvalEstadoConserva extends BaseActiveRecord<TblAvalEstadoConserva> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "estrutura_vertical", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxEstruturaVertical estruturaVertical;
	@ManyToOne
	@JoinColumn(name = "estrutura_horizontal", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxEstruturaHorizontal estruturaHorizontal;
	@ManyToOne
	@JoinColumn(name = "paredes_exteriores", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxParedeExterior paredesExteriores;
	@ManyToOne
	@JoinColumn(name = "revestimento_exterior", foreignKey = @ForeignKey(name = "fk4"))
	private TblAuxRevestExterior revestimentoExterior;
	@ManyToOne
	@JoinColumn(name = "cobertura", foreignKey = @ForeignKey(name = "fk5"))
	private TblAuxCobertura cobertura;
	@ManyToOne
	@JoinColumn(name = "vedacao", foreignKey = @ForeignKey(name = "fk6"))
	private TblAuxVedacao vedacao;
	@ManyToOne
	@JoinColumn(name = "portao_pedonal", foreignKey = @ForeignKey(name = "fk7"))
	private TblAuxPortaoPedAut portaoPedonal;
	@ManyToOne
	@JoinColumn(name = "portao_automovel", foreignKey = @ForeignKey(name = "fk8"))
	private TblAuxPortaoPedAut portaoAutomovel;
	@ManyToOne
	@JoinColumn(name = "escadas_ext", foreignKey = @ForeignKey(name = "fk9"))
	private TblAuxEscadaCorrimIntExtRampa escadasExt;
	@ManyToOne
	@JoinColumn(name = "escadas_interiores", foreignKey = @ForeignKey(name = "fk10"))
	private TblAuxEscadaCorrimIntExtRampa escadasInteriores;
	@ManyToOne
	@JoinColumn(name = "corrimaos_esc_ext", foreignKey = @ForeignKey(name = "fk11"))
	private TblAuxEscadaCorrimIntExtRampa corrimaosEscExt;
	@ManyToOne
	@JoinColumn(name = "corrimaos_esc_inter", foreignKey = @ForeignKey(name = "fk12"))
	private TblAuxEscadaCorrimIntExtRampa corrimaosEscInter;
	@ManyToOne
	@JoinColumn(name = "rampas_externas", foreignKey = @ForeignKey(name = "fk13"))
	private TblAuxEscadaCorrimIntExtRampa rampasExternas;
	@ManyToOne
	@JoinColumn(name = "formas_acesso", foreignKey = @ForeignKey(name = "fk14"))
	private TblAuxFormaAcessoEscola formasAcesso;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk15"))
	private TblAuxEscolas escId;
	@Column(name = "data")
	private LocalDate data;
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

	public TblAuxEstruturaVertical getEstruturaVertical() { 
		return this.estruturaVertical;
	}

	public void setEstruturaVertical(TblAuxEstruturaVertical estruturaVertical) {
		 this.estruturaVertical = estruturaVertical;
	}

	public TblAuxEstruturaHorizontal getEstruturaHorizontal() { 
		return this.estruturaHorizontal;
	}

	public void setEstruturaHorizontal(TblAuxEstruturaHorizontal estruturaHorizontal) {
		 this.estruturaHorizontal = estruturaHorizontal;
	}

	public TblAuxParedeExterior getParedesExteriores() { 
		return this.paredesExteriores;
	}

	public void setParedesExteriores(TblAuxParedeExterior paredesExteriores) {
		 this.paredesExteriores = paredesExteriores;
	}

	public TblAuxRevestExterior getRevestimentoExterior() { 
		return this.revestimentoExterior;
	}

	public void setRevestimentoExterior(TblAuxRevestExterior revestimentoExterior) {
		 this.revestimentoExterior = revestimentoExterior;
	}

	public TblAuxCobertura getCobertura() { 
		return this.cobertura;
	}

	public void setCobertura(TblAuxCobertura cobertura) {
		 this.cobertura = cobertura;
	}

	public TblAuxVedacao getVedacao() { 
		return this.vedacao;
	}

	public void setVedacao(TblAuxVedacao vedacao) {
		 this.vedacao = vedacao;
	}

	public TblAuxPortaoPedAut getPortaoPedonal() { 
		return this.portaoPedonal;
	}

	public void setPortaoPedonal(TblAuxPortaoPedAut portaoPedonal) {
		 this.portaoPedonal = portaoPedonal;
	}

	public TblAuxPortaoPedAut getPortaoAutomovel() { 
		return this.portaoAutomovel;
	}

	public void setPortaoAutomovel(TblAuxPortaoPedAut portaoAutomovel) {
		 this.portaoAutomovel = portaoAutomovel;
	}

	public TblAuxEscadaCorrimIntExtRampa getEscadasExt() { 
		return this.escadasExt;
	}

	public void setEscadasExt(TblAuxEscadaCorrimIntExtRampa escadasExt) {
		 this.escadasExt = escadasExt;
	}

	public TblAuxEscadaCorrimIntExtRampa getEscadasInteriores() { 
		return this.escadasInteriores;
	}

	public void setEscadasInteriores(TblAuxEscadaCorrimIntExtRampa escadasInteriores) {
		 this.escadasInteriores = escadasInteriores;
	}

	public TblAuxEscadaCorrimIntExtRampa getCorrimaosEscExt() { 
		return this.corrimaosEscExt;
	}

	public void setCorrimaosEscExt(TblAuxEscadaCorrimIntExtRampa corrimaosEscExt) {
		 this.corrimaosEscExt = corrimaosEscExt;
	}

	public TblAuxEscadaCorrimIntExtRampa getCorrimaosEscInter() { 
		return this.corrimaosEscInter;
	}

	public void setCorrimaosEscInter(TblAuxEscadaCorrimIntExtRampa corrimaosEscInter) {
		 this.corrimaosEscInter = corrimaosEscInter;
	}

	public TblAuxEscadaCorrimIntExtRampa getRampasExternas() { 
		return this.rampasExternas;
	}

	public void setRampasExternas(TblAuxEscadaCorrimIntExtRampa rampasExternas) {
		 this.rampasExternas = rampasExternas;
	}

	public TblAuxFormaAcessoEscola getFormasAcesso() { 
		return this.formasAcesso;
	}

	public void setFormasAcesso(TblAuxFormaAcessoEscola formasAcesso) {
		 this.formasAcesso = formasAcesso;
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

}