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
@Table(name = "tbl_caraterizacao_construtiva", schema = "pgie")
@NamedQuery(name = "TblCaraterizacaoConstrutiva.findAll", query = "SELECT t FROM TblCaraterizacaoConstrutiva t")
public class TblCaraterizacaoConstrutiva extends BaseActiveRecord<TblCaraterizacaoConstrutiva> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "estr_fundacoes", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxFundacoes estrFundacoes;
	@ManyToOne
	@JoinColumn(name = "estr_elem_verticais_suporte", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxEstrElemVerticaisSuporte estrElemVerticaisSuporte;
	@ManyToOne
	@JoinColumn(name = "estr_pavimentos", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxPavimentos estrPavimentos;
	@ManyToOne
	@JoinColumn(name = "cober_forma", foreignKey = @ForeignKey(name = "fk4"))
	private TblAuxCobertForma coberForma;
	@ManyToOne
	@JoinColumn(name = "cober_estrutura_suporte", foreignKey = @ForeignKey(name = "fk5"))
	private TblAuxCoberturaEstSuporte coberEstruturaSuporte;
	@ManyToOne
	@JoinColumn(name = "cober_revist_terraco", foreignKey = @ForeignKey(name = "fk6"))
	private TblAuxRevestCoberturaTerraco coberRevistTerraco;
	@ManyToOne
	@JoinColumn(name = "cober_revist_inclinada", foreignKey = @ForeignKey(name = "fk7"))
	private TblAuxRevestCoberturaInclinada coberRevistInclinada;
	@ManyToOne
	@JoinColumn(name = "par_ext_tosco", foreignKey = @ForeignKey(name = "fk8"))
	private TblAuxParedeExtTosco parExtTosco;
	@ManyToOne
	@JoinColumn(name = "par_ext_revest_fachada", foreignKey = @ForeignKey(name = "fk9"))
	private TblAuxParedeExtRevestimFachadaEmpena parExtRevestFachada;
	@ManyToOne
	@JoinColumn(name = "par_ext_revest_empena", foreignKey = @ForeignKey(name = "fk10"))
	private TblAuxParedeExtRevestimFachadaEmpena parExtRevestEmpena;
	@ManyToOne
	@JoinColumn(name = "par_int_tosco", foreignKey = @ForeignKey(name = "fk11"))
	private TblAuxParedeIntTosco parIntTosco;
	@ManyToOne
	@JoinColumn(name = "par_int_revest_fachada", foreignKey = @ForeignKey(name = "fk12"))
	private TblAuxParedeIntRevestimFachada parIntRevestFachada;
	@ManyToOne
	@JoinColumn(name = "caixalharia_material", foreignKey = @ForeignKey(name = "fk13"))
	private TblAuxCaixalhariasMaterial caixalhariaMaterial;
	@ManyToOne
	@JoinColumn(name = "escada_estrut_suporte", foreignKey = @ForeignKey(name = "fk14"))
	private TblAuxEscadasEstrutSuporte escadaEstrutSuporte;
	@ManyToOne
	@JoinColumn(name = "estrutura_vertical", foreignKey = @ForeignKey(name = "fk16"))
	private TblAuxEstruturaVertical estruturaVertical;
	@ManyToOne
	@JoinColumn(name = "estrutura_horizontal", foreignKey = @ForeignKey(name = "fk21"))
	private TblAuxEstruturaHorizontal estruturaHorizontal;
	@ManyToOne
	@JoinColumn(name = "paredes_exteriores", foreignKey = @ForeignKey(name = "fk22"))
	private TblAuxParedeExterior paredesExteriores;
	@ManyToOne
	@JoinColumn(name = "revestimento_exterior", foreignKey = @ForeignKey(name = "fk23"))
	private TblAuxRevestExterior revestimentoExterior;
	@ManyToOne
	@JoinColumn(name = "cobertura", foreignKey = @ForeignKey(name = "fk24"))
	private TblAuxCobertura cobertura;
	@ManyToOne
	@JoinColumn(name = "vedacao", foreignKey = @ForeignKey(name = "fk26"))
	private TblAuxVedacao vedacao;
	@ManyToOne
	@JoinColumn(name = "portao_pedonal", foreignKey = @ForeignKey(name = "fk27"))
	private TblAuxPortaoPedAut portaoPedonal;
	@ManyToOne
	@JoinColumn(name = "portao_automovel", foreignKey = @ForeignKey(name = "fk28"))
	private TblAuxPortaoPedAut portaoAutomovel;
	@ManyToOne
	@JoinColumn(name = "escadas_ext", foreignKey = @ForeignKey(name = "fk29"))
	private TblAuxEscadaCorrimIntExtRampa escadasExt;
	@ManyToOne
	@JoinColumn(name = "escadas_interiores", foreignKey = @ForeignKey(name = "fk17"))
	private TblAuxEscadaCorrimIntExtRampa escadasInteriores;
	@ManyToOne
	@JoinColumn(name = "corrimaos_esc_ext", foreignKey = @ForeignKey(name = "fk18"))
	private TblAuxEscadaCorrimIntExtRampa corrimaosEscExt;
	@ManyToOne
	@JoinColumn(name = "corrimaos_esc_inter", foreignKey = @ForeignKey(name = "fk19"))
	private TblAuxEscadaCorrimIntExtRampa corrimaosEscInter;
	@ManyToOne
	@JoinColumn(name = "rampas_externas", foreignKey = @ForeignKey(name = "fk20"))
	private TblAuxEscadaCorrimIntExtRampa rampasExternas;
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

	public TblAuxFundacoes getEstrFundacoes() { 
		return this.estrFundacoes;
	}

	public void setEstrFundacoes(TblAuxFundacoes estrFundacoes) {
		 this.estrFundacoes = estrFundacoes;
	}

	public TblAuxEstrElemVerticaisSuporte getEstrElemVerticaisSuporte() { 
		return this.estrElemVerticaisSuporte;
	}

	public void setEstrElemVerticaisSuporte(TblAuxEstrElemVerticaisSuporte estrElemVerticaisSuporte) {
		 this.estrElemVerticaisSuporte = estrElemVerticaisSuporte;
	}

	public TblAuxPavimentos getEstrPavimentos() { 
		return this.estrPavimentos;
	}

	public void setEstrPavimentos(TblAuxPavimentos estrPavimentos) {
		 this.estrPavimentos = estrPavimentos;
	}

	public TblAuxCobertForma getCoberForma() { 
		return this.coberForma;
	}

	public void setCoberForma(TblAuxCobertForma coberForma) {
		 this.coberForma = coberForma;
	}

	public TblAuxCoberturaEstSuporte getCoberEstruturaSuporte() { 
		return this.coberEstruturaSuporte;
	}

	public void setCoberEstruturaSuporte(TblAuxCoberturaEstSuporte coberEstruturaSuporte) {
		 this.coberEstruturaSuporte = coberEstruturaSuporte;
	}

	public TblAuxRevestCoberturaTerraco getCoberRevistTerraco() { 
		return this.coberRevistTerraco;
	}

	public void setCoberRevistTerraco(TblAuxRevestCoberturaTerraco coberRevistTerraco) {
		 this.coberRevistTerraco = coberRevistTerraco;
	}

	public TblAuxRevestCoberturaInclinada getCoberRevistInclinada() { 
		return this.coberRevistInclinada;
	}

	public void setCoberRevistInclinada(TblAuxRevestCoberturaInclinada coberRevistInclinada) {
		 this.coberRevistInclinada = coberRevistInclinada;
	}

	public TblAuxParedeExtTosco getParExtTosco() { 
		return this.parExtTosco;
	}

	public void setParExtTosco(TblAuxParedeExtTosco parExtTosco) {
		 this.parExtTosco = parExtTosco;
	}

	public TblAuxParedeExtRevestimFachadaEmpena getParExtRevestFachada() { 
		return this.parExtRevestFachada;
	}

	public void setParExtRevestFachada(TblAuxParedeExtRevestimFachadaEmpena parExtRevestFachada) {
		 this.parExtRevestFachada = parExtRevestFachada;
	}

	public TblAuxParedeExtRevestimFachadaEmpena getParExtRevestEmpena() { 
		return this.parExtRevestEmpena;
	}

	public void setParExtRevestEmpena(TblAuxParedeExtRevestimFachadaEmpena parExtRevestEmpena) {
		 this.parExtRevestEmpena = parExtRevestEmpena;
	}

	public TblAuxParedeIntTosco getParIntTosco() { 
		return this.parIntTosco;
	}

	public void setParIntTosco(TblAuxParedeIntTosco parIntTosco) {
		 this.parIntTosco = parIntTosco;
	}

	public TblAuxParedeIntRevestimFachada getParIntRevestFachada() { 
		return this.parIntRevestFachada;
	}

	public void setParIntRevestFachada(TblAuxParedeIntRevestimFachada parIntRevestFachada) {
		 this.parIntRevestFachada = parIntRevestFachada;
	}

	public TblAuxCaixalhariasMaterial getCaixalhariaMaterial() { 
		return this.caixalhariaMaterial;
	}

	public void setCaixalhariaMaterial(TblAuxCaixalhariasMaterial caixalhariaMaterial) {
		 this.caixalhariaMaterial = caixalhariaMaterial;
	}

	public TblAuxEscadasEstrutSuporte getEscadaEstrutSuporte() { 
		return this.escadaEstrutSuporte;
	}

	public void setEscadaEstrutSuporte(TblAuxEscadasEstrutSuporte escadaEstrutSuporte) {
		 this.escadaEstrutSuporte = escadaEstrutSuporte;
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