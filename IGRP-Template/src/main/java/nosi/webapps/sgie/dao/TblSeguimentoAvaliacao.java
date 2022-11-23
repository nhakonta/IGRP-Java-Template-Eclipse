package nosi.webapps.sgie.dao;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * @author: Nositeste 23-11-2022
*/

@Entity
@Table(name = "tbl_seguimento_avaliacao", schema = "pgie")
@NamedQuery(name = "TblSeguimentoAvaliacao.findAll", query = "SELECT t FROM TblSeguimentoAvaliacao t")
public class TblSeguimentoAvaliacao extends BaseActiveRecord<TblSeguimentoAvaliacao> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "insuf_elementos_estruturais_estrutura", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxAnomalias insufElementosEstruturaisEstrutura;
	@ManyToOne
	@JoinColumn(name = "alteracao_geometria_estrutura", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxAnomalias alteracaoGeometriaEstrutura;
	@ManyToOne
	@JoinColumn(name = "fendilhacao_estrutura", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxAnomalias fendilhacaoEstrutura;
	@ManyToOne
	@JoinColumn(name = "armaduras_vista_estrutura", foreignKey = @ForeignKey(name = "fk4"))
	private TblAuxAnomalias armadurasVistaEstrutura;
	@ManyToOne
	@JoinColumn(name = "falta_cond_seguranca_estrutura", foreignKey = @ForeignKey(name = "fk5"))
	private TblAuxAnomalias faltaCondSegurancaEstrutura;
	@ManyToOne
	@JoinColumn(name = "falta_elem_fundamentais_cobert", foreignKey = @ForeignKey(name = "fk6"))
	private TblAuxAnomalias faltaElemFundamentaisCobert;
	@ManyToOne
	@JoinColumn(name = "alteracao_geometria_cobert", foreignKey = @ForeignKey(name = "fk7"))
	private TblAuxAnomalias alteracaoGeometriaCobert;
	@ManyToOne
	@JoinColumn(name = "extens_deteoracao_revist_cobert", foreignKey = @ForeignKey(name = "fk8"))
	private TblAuxAnomalias extensDeteoracaoRevistCobert;
	@ManyToOne
	@JoinColumn(name = "danos_sig_partes_sing_cobert", foreignKey = @ForeignKey(name = "fk9"))
	private TblAuxAnomalias danosSigPartesSingCobert;
	@ManyToOne
	@JoinColumn(name = "sistema_drenagem", foreignKey = @ForeignKey(name = "fk10"))
	private TblAuxAnomalias sistemaDrenagem;
	@ManyToOne
	@JoinColumn(name = "anomalias_indic_deteoracao_cobert", foreignKey = @ForeignKey(name = "fk11"))
	private TblAuxAnomalias anomaliasIndicDeteoracaoCobert;
	@ManyToOne
	@JoinColumn(name = "buracos_aberturas", foreignKey = @ForeignKey(name = "fk12"))
	private TblAuxAnomalias buracosAberturas;
	@ManyToOne
	@JoinColumn(name = "alteracao_geometria_paredes", foreignKey = @ForeignKey(name = "fk13"))
	private TblAuxAnomalias alteracaoGeometriaParedes;
	@ManyToOne
	@JoinColumn(name = "extens_deteoracao_revist_paredes", foreignKey = @ForeignKey(name = "fk14"))
	private TblAuxAnomalias extensDeteoracaoRevistParedes;
	@ManyToOne
	@JoinColumn(name = "danos_sig_partes_sing_paredes", foreignKey = @ForeignKey(name = "fk15"))
	private TblAuxAnomalias danosSigPartesSingParedes;
	@ManyToOne
	@JoinColumn(name = "anomalias_indic_deteoracao_paredes", foreignKey = @ForeignKey(name = "fk16"))
	private TblAuxAnomalias anomaliasIndicDeteoracaoParedes;
	@ManyToOne
	@JoinColumn(name = "sinais_presenca_agua", foreignKey = @ForeignKey(name = "fk17"))
	private TblAuxAnomalias sinaisPresencaAgua;
	@ManyToOne
	@JoinColumn(name = "buracos_pisos", foreignKey = @ForeignKey(name = "fk18"))
	private TblAuxAnomalias buracosPisos;
	@ManyToOne
	@JoinColumn(name = "fissuras_rachaduras", foreignKey = @ForeignKey(name = "fk19"))
	private TblAuxAnomalias fissurasRachaduras;
	@ManyToOne
	@JoinColumn(name = "alteracao_geometria_pavimento", foreignKey = @ForeignKey(name = "fk20"))
	private TblAuxAnomalias alteracaoGeometriaPavimento;
	@ManyToOne
	@JoinColumn(name = "insuf_elementos_estruturais_escadas", foreignKey = @ForeignKey(name = "fk21"))
	private TblAuxAnomalias insufElementosEstruturaisEscadas;
	@ManyToOne
	@JoinColumn(name = "alteracao_geometria_escadas", foreignKey = @ForeignKey(name = "fk22"))
	private TblAuxAnomalias alteracaoGeometriaEscadas;
	@ManyToOne
	@JoinColumn(name = "extens_deteoracao_revist_escadas", foreignKey = @ForeignKey(name = "fk23"))
	private TblAuxAnomalias extensDeteoracaoRevistEscadas;
	@ManyToOne
	@JoinColumn(name = "anomalias_indic_deteoracao_escadas", foreignKey = @ForeignKey(name = "fk24"))
	private TblAuxAnomalias anomaliasIndicDeteoracaoEscadas;
	@ManyToOne
	@JoinColumn(name = "portas_abrem_fecham_sem_forca", foreignKey = @ForeignKey(name = "fk25"))
	private TblAuxAnomalias portasAbremFechamSemForca;
	@ManyToOne
	@JoinColumn(name = "portas_tem_fechaduras", foreignKey = @ForeignKey(name = "fk26"))
	private TblAuxAnomalias portasTemFechaduras;
	@ManyToOne
	@JoinColumn(name = "janelas_abrem_fecham_sem_forca", foreignKey = @ForeignKey(name = "fk27"))
	private TblAuxAnomalias janelasAbremFechamSemForca;
	@ManyToOne
	@JoinColumn(name = "janelas_tem_fechaduras", foreignKey = @ForeignKey(name = "fk28"))
	private TblAuxAnomalias janelasTemFechaduras;
	@ManyToOne
	@JoinColumn(name = "elementos_constituientes_deterioradas", foreignKey = @ForeignKey(name = "fk29"))
	private TblAuxAnomalias elementosConstituientesDeterioradas;
	@ManyToOne
	@JoinColumn(name = "tem_lava_loica", foreignKey = @ForeignKey(name = "fk30"))
	private TblAuxAnomalias temLavaLoica;
	@ManyToOne
	@JoinColumn(name = "tem_bancada", foreignKey = @ForeignKey(name = "fk31"))
	private TblAuxAnomalias temBancada;
	@ManyToOne
	@JoinColumn(name = "local_ext_colocacao_gas", foreignKey = @ForeignKey(name = "fk32"))
	private TblAuxAnomalias localExtColocacaoGas;
	@ManyToOne
	@JoinColumn(name = "evacuacao_ar", foreignKey = @ForeignKey(name = "fk33"))
	private TblAuxAnomalias evacuacaoAr;
	@ManyToOne
	@JoinColumn(name = "ventilacao_com_exterior", foreignKey = @ForeignKey(name = "fk34"))
	private TblAuxAnomalias ventilacaoComExterior;
	@ManyToOne
	@JoinColumn(name = "janelas_com_redes", foreignKey = @ForeignKey(name = "fk35"))
	private TblAuxAnomalias janelasComRedes;
	@Column(name = "num_desinfestacao")
	private Integer numDesinfestacao;
	@ManyToOne
	@JoinColumn(name = "equipada_com_lavatorio", foreignKey = @ForeignKey(name = "fk36"))
	private TblAuxAnomalias equipadaComLavatorio;
	@ManyToOne
	@JoinColumn(name = "equipada_sanita_autoclismo", foreignKey = @ForeignKey(name = "fk37"))
	private TblAuxAnomalias equipadaSanitaAutoclismo;
	@Column(name = "num_sanitas")
	private Integer numSanitas;
	@ManyToOne
	@JoinColumn(name = "ventilacao_natural", foreignKey = @ForeignKey(name = "fk38"))
	private TblAuxAnomalias ventilacaoNatural;
	@ManyToOne
	@JoinColumn(name = "ventilacao_mecanica", foreignKey = @ForeignKey(name = "fk39"))
	private TblAuxAnomalias ventilacaoMecanica;
	@ManyToOne
	@JoinColumn(name = "equipada_mictorios", foreignKey = @ForeignKey(name = "fk40"))
	private TblAuxAnomalias equipadaMictorios;
	@Column(name = "num_mictorio")
	private Integer numMictorio;
	@ManyToOne
	@JoinColumn(name = "rede_publica_esgoto", foreignKey = @ForeignKey(name = "fk41"))
	private TblAuxAnomalias redePublicaEsgoto;
	@ManyToOne
	@JoinColumn(name = "fossa_septica", foreignKey = @ForeignKey(name = "fk42"))
	private TblAuxAnomalias fossaSeptica;
	@ManyToOne
	@JoinColumn(name = "fossa_rudimentar", foreignKey = @ForeignKey(name = "fk43"))
	private TblAuxAnomalias fossaRudimentar;
	@ManyToOne
	@JoinColumn(name = "evacucao_agua_residual_natureza", foreignKey = @ForeignKey(name = "fk44"))
	private TblAuxAnomalias evacucaoAguaResidualNatureza;
	@ManyToOne
	@JoinColumn(name = "evacucao_agua_residual_vala", foreignKey = @ForeignKey(name = "fk56"))
	private TblAuxAnomalias evacucaoAguaResidualVala;
	@ManyToOne
	@JoinColumn(name = "recolha_lixo_pelo_carro", foreignKey = @ForeignKey(name = "fk45"))
	private TblAuxAnomalias recolhaLixoPeloCarro;
	@ManyToOne
	@JoinColumn(name = "lixo_colocado_contentores", foreignKey = @ForeignKey(name = "fk46"))
	private TblAuxAnomalias lixoColocadoContentores;
	@ManyToOne
	@JoinColumn(name = "lixo_enterrado_queimado", foreignKey = @ForeignKey(name = "fk47"))
	private TblAuxAnomalias lixoEnterradoQueimado;
	@ManyToOne
	@JoinColumn(name = "lixo_jogado_naturaza", foreignKey = @ForeignKey(name = "fk48"))
	private TblAuxAnomalias lixoJogadoNaturaza;
	@ManyToOne
	@JoinColumn(name = "lixo_jogado_redor_escola", foreignKey = @ForeignKey(name = "fk49"))
	private TblAuxAnomalias lixoJogadoRedorEscola;
	@ManyToOne
	@JoinColumn(name = "reaproveitamento_agua_residual_para_rega", foreignKey = @ForeignKey(name = "fk50"))
	private TblAuxAnomalias reaproveitamentoAguaResidualParaRega;
	@ManyToOne
	@JoinColumn(name = "tem_disjuntores_diferencial", foreignKey = @ForeignKey(name = "fk51"))
	private TblAuxAnomalias temDisjuntoresDiferencial;
	@ManyToOne
	@JoinColumn(name = "degradacao_condutores_eletricos", foreignKey = @ForeignKey(name = "fk52"))
	private TblAuxAnomalias degradacaoCondutoresEletricos;
	@ManyToOne
	@JoinColumn(name = "aparelhagem_bom_estado", foreignKey = @ForeignKey(name = "fk53"))
	private TblAuxAnomalias aparelhagemBomEstado;
	@ManyToOne
	@JoinColumn(name = "risco_eletrocursao", foreignKey = @ForeignKey(name = "fk54"))
	private TblAuxAnomalias riscoEletrocursao;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk55"))
	private TblAuxEscolas escId;
	@Column(name = "data")
	private LocalDate data;
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "estado")
	private String estado;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public TblAuxAnomalias getInsufElementosEstruturaisEstrutura() { 
		return this.insufElementosEstruturaisEstrutura;
	}

	public void setInsufElementosEstruturaisEstrutura(TblAuxAnomalias insufElementosEstruturaisEstrutura) {
		 this.insufElementosEstruturaisEstrutura = insufElementosEstruturaisEstrutura;
	}

	public TblAuxAnomalias getAlteracaoGeometriaEstrutura() { 
		return this.alteracaoGeometriaEstrutura;
	}

	public void setAlteracaoGeometriaEstrutura(TblAuxAnomalias alteracaoGeometriaEstrutura) {
		 this.alteracaoGeometriaEstrutura = alteracaoGeometriaEstrutura;
	}

	public TblAuxAnomalias getFendilhacaoEstrutura() { 
		return this.fendilhacaoEstrutura;
	}

	public void setFendilhacaoEstrutura(TblAuxAnomalias fendilhacaoEstrutura) {
		 this.fendilhacaoEstrutura = fendilhacaoEstrutura;
	}

	public TblAuxAnomalias getArmadurasVistaEstrutura() { 
		return this.armadurasVistaEstrutura;
	}

	public void setArmadurasVistaEstrutura(TblAuxAnomalias armadurasVistaEstrutura) {
		 this.armadurasVistaEstrutura = armadurasVistaEstrutura;
	}

	public TblAuxAnomalias getFaltaCondSegurancaEstrutura() { 
		return this.faltaCondSegurancaEstrutura;
	}

	public void setFaltaCondSegurancaEstrutura(TblAuxAnomalias faltaCondSegurancaEstrutura) {
		 this.faltaCondSegurancaEstrutura = faltaCondSegurancaEstrutura;
	}

	public TblAuxAnomalias getFaltaElemFundamentaisCobert() { 
		return this.faltaElemFundamentaisCobert;
	}

	public void setFaltaElemFundamentaisCobert(TblAuxAnomalias faltaElemFundamentaisCobert) {
		 this.faltaElemFundamentaisCobert = faltaElemFundamentaisCobert;
	}

	public TblAuxAnomalias getAlteracaoGeometriaCobert() { 
		return this.alteracaoGeometriaCobert;
	}

	public void setAlteracaoGeometriaCobert(TblAuxAnomalias alteracaoGeometriaCobert) {
		 this.alteracaoGeometriaCobert = alteracaoGeometriaCobert;
	}

	public TblAuxAnomalias getExtensDeteoracaoRevistCobert() { 
		return this.extensDeteoracaoRevistCobert;
	}

	public void setExtensDeteoracaoRevistCobert(TblAuxAnomalias extensDeteoracaoRevistCobert) {
		 this.extensDeteoracaoRevistCobert = extensDeteoracaoRevistCobert;
	}

	public TblAuxAnomalias getDanosSigPartesSingCobert() { 
		return this.danosSigPartesSingCobert;
	}

	public void setDanosSigPartesSingCobert(TblAuxAnomalias danosSigPartesSingCobert) {
		 this.danosSigPartesSingCobert = danosSigPartesSingCobert;
	}

	public TblAuxAnomalias getSistemaDrenagem() { 
		return this.sistemaDrenagem;
	}

	public void setSistemaDrenagem(TblAuxAnomalias sistemaDrenagem) {
		 this.sistemaDrenagem = sistemaDrenagem;
	}

	public TblAuxAnomalias getAnomaliasIndicDeteoracaoCobert() { 
		return this.anomaliasIndicDeteoracaoCobert;
	}

	public void setAnomaliasIndicDeteoracaoCobert(TblAuxAnomalias anomaliasIndicDeteoracaoCobert) {
		 this.anomaliasIndicDeteoracaoCobert = anomaliasIndicDeteoracaoCobert;
	}

	public TblAuxAnomalias getBuracosAberturas() { 
		return this.buracosAberturas;
	}

	public void setBuracosAberturas(TblAuxAnomalias buracosAberturas) {
		 this.buracosAberturas = buracosAberturas;
	}

	public TblAuxAnomalias getAlteracaoGeometriaParedes() { 
		return this.alteracaoGeometriaParedes;
	}

	public void setAlteracaoGeometriaParedes(TblAuxAnomalias alteracaoGeometriaParedes) {
		 this.alteracaoGeometriaParedes = alteracaoGeometriaParedes;
	}

	public TblAuxAnomalias getExtensDeteoracaoRevistParedes() { 
		return this.extensDeteoracaoRevistParedes;
	}

	public void setExtensDeteoracaoRevistParedes(TblAuxAnomalias extensDeteoracaoRevistParedes) {
		 this.extensDeteoracaoRevistParedes = extensDeteoracaoRevistParedes;
	}

	public TblAuxAnomalias getDanosSigPartesSingParedes() { 
		return this.danosSigPartesSingParedes;
	}

	public void setDanosSigPartesSingParedes(TblAuxAnomalias danosSigPartesSingParedes) {
		 this.danosSigPartesSingParedes = danosSigPartesSingParedes;
	}

	public TblAuxAnomalias getAnomaliasIndicDeteoracaoParedes() { 
		return this.anomaliasIndicDeteoracaoParedes;
	}

	public void setAnomaliasIndicDeteoracaoParedes(TblAuxAnomalias anomaliasIndicDeteoracaoParedes) {
		 this.anomaliasIndicDeteoracaoParedes = anomaliasIndicDeteoracaoParedes;
	}

	public TblAuxAnomalias getSinaisPresencaAgua() { 
		return this.sinaisPresencaAgua;
	}

	public void setSinaisPresencaAgua(TblAuxAnomalias sinaisPresencaAgua) {
		 this.sinaisPresencaAgua = sinaisPresencaAgua;
	}

	public TblAuxAnomalias getBuracosPisos() { 
		return this.buracosPisos;
	}

	public void setBuracosPisos(TblAuxAnomalias buracosPisos) {
		 this.buracosPisos = buracosPisos;
	}

	public TblAuxAnomalias getFissurasRachaduras() { 
		return this.fissurasRachaduras;
	}

	public void setFissurasRachaduras(TblAuxAnomalias fissurasRachaduras) {
		 this.fissurasRachaduras = fissurasRachaduras;
	}

	public TblAuxAnomalias getAlteracaoGeometriaPavimento() { 
		return this.alteracaoGeometriaPavimento;
	}

	public void setAlteracaoGeometriaPavimento(TblAuxAnomalias alteracaoGeometriaPavimento) {
		 this.alteracaoGeometriaPavimento = alteracaoGeometriaPavimento;
	}

	public TblAuxAnomalias getInsufElementosEstruturaisEscadas() { 
		return this.insufElementosEstruturaisEscadas;
	}

	public void setInsufElementosEstruturaisEscadas(TblAuxAnomalias insufElementosEstruturaisEscadas) {
		 this.insufElementosEstruturaisEscadas = insufElementosEstruturaisEscadas;
	}

	public TblAuxAnomalias getAlteracaoGeometriaEscadas() { 
		return this.alteracaoGeometriaEscadas;
	}

	public void setAlteracaoGeometriaEscadas(TblAuxAnomalias alteracaoGeometriaEscadas) {
		 this.alteracaoGeometriaEscadas = alteracaoGeometriaEscadas;
	}

	public TblAuxAnomalias getExtensDeteoracaoRevistEscadas() { 
		return this.extensDeteoracaoRevistEscadas;
	}

	public void setExtensDeteoracaoRevistEscadas(TblAuxAnomalias extensDeteoracaoRevistEscadas) {
		 this.extensDeteoracaoRevistEscadas = extensDeteoracaoRevistEscadas;
	}

	public TblAuxAnomalias getAnomaliasIndicDeteoracaoEscadas() { 
		return this.anomaliasIndicDeteoracaoEscadas;
	}

	public void setAnomaliasIndicDeteoracaoEscadas(TblAuxAnomalias anomaliasIndicDeteoracaoEscadas) {
		 this.anomaliasIndicDeteoracaoEscadas = anomaliasIndicDeteoracaoEscadas;
	}

	public TblAuxAnomalias getPortasAbremFechamSemForca() { 
		return this.portasAbremFechamSemForca;
	}

	public void setPortasAbremFechamSemForca(TblAuxAnomalias portasAbremFechamSemForca) {
		 this.portasAbremFechamSemForca = portasAbremFechamSemForca;
	}

	public TblAuxAnomalias getPortasTemFechaduras() { 
		return this.portasTemFechaduras;
	}

	public void setPortasTemFechaduras(TblAuxAnomalias portasTemFechaduras) {
		 this.portasTemFechaduras = portasTemFechaduras;
	}

	public TblAuxAnomalias getJanelasAbremFechamSemForca() { 
		return this.janelasAbremFechamSemForca;
	}

	public void setJanelasAbremFechamSemForca(TblAuxAnomalias janelasAbremFechamSemForca) {
		 this.janelasAbremFechamSemForca = janelasAbremFechamSemForca;
	}

	public TblAuxAnomalias getJanelasTemFechaduras() { 
		return this.janelasTemFechaduras;
	}

	public void setJanelasTemFechaduras(TblAuxAnomalias janelasTemFechaduras) {
		 this.janelasTemFechaduras = janelasTemFechaduras;
	}

	public TblAuxAnomalias getElementosConstituientesDeterioradas() { 
		return this.elementosConstituientesDeterioradas;
	}

	public void setElementosConstituientesDeterioradas(TblAuxAnomalias elementosConstituientesDeterioradas) {
		 this.elementosConstituientesDeterioradas = elementosConstituientesDeterioradas;
	}

	public TblAuxAnomalias getTemLavaLoica() { 
		return this.temLavaLoica;
	}

	public void setTemLavaLoica(TblAuxAnomalias temLavaLoica) {
		 this.temLavaLoica = temLavaLoica;
	}

	public TblAuxAnomalias getTemBancada() { 
		return this.temBancada;
	}

	public void setTemBancada(TblAuxAnomalias temBancada) {
		 this.temBancada = temBancada;
	}

	public TblAuxAnomalias getLocalExtColocacaoGas() { 
		return this.localExtColocacaoGas;
	}

	public void setLocalExtColocacaoGas(TblAuxAnomalias localExtColocacaoGas) {
		 this.localExtColocacaoGas = localExtColocacaoGas;
	}

	public TblAuxAnomalias getEvacuacaoAr() { 
		return this.evacuacaoAr;
	}

	public void setEvacuacaoAr(TblAuxAnomalias evacuacaoAr) {
		 this.evacuacaoAr = evacuacaoAr;
	}

	public TblAuxAnomalias getVentilacaoComExterior() { 
		return this.ventilacaoComExterior;
	}

	public void setVentilacaoComExterior(TblAuxAnomalias ventilacaoComExterior) {
		 this.ventilacaoComExterior = ventilacaoComExterior;
	}

	public TblAuxAnomalias getJanelasComRedes() { 
		return this.janelasComRedes;
	}

	public void setJanelasComRedes(TblAuxAnomalias janelasComRedes) {
		 this.janelasComRedes = janelasComRedes;
	}

	public Integer getNumDesinfestacao() { 
		return this.numDesinfestacao;
	}

	public void setNumDesinfestacao(Integer numDesinfestacao) {
		 this.numDesinfestacao = numDesinfestacao;
	}

	public TblAuxAnomalias getEquipadaComLavatorio() { 
		return this.equipadaComLavatorio;
	}

	public void setEquipadaComLavatorio(TblAuxAnomalias equipadaComLavatorio) {
		 this.equipadaComLavatorio = equipadaComLavatorio;
	}

	public TblAuxAnomalias getEquipadaSanitaAutoclismo() { 
		return this.equipadaSanitaAutoclismo;
	}

	public void setEquipadaSanitaAutoclismo(TblAuxAnomalias equipadaSanitaAutoclismo) {
		 this.equipadaSanitaAutoclismo = equipadaSanitaAutoclismo;
	}

	public Integer getNumSanitas() { 
		return this.numSanitas;
	}

	public void setNumSanitas(Integer numSanitas) {
		 this.numSanitas = numSanitas;
	}

	public TblAuxAnomalias getVentilacaoNatural() { 
		return this.ventilacaoNatural;
	}

	public void setVentilacaoNatural(TblAuxAnomalias ventilacaoNatural) {
		 this.ventilacaoNatural = ventilacaoNatural;
	}

	public TblAuxAnomalias getVentilacaoMecanica() { 
		return this.ventilacaoMecanica;
	}

	public void setVentilacaoMecanica(TblAuxAnomalias ventilacaoMecanica) {
		 this.ventilacaoMecanica = ventilacaoMecanica;
	}

	public TblAuxAnomalias getEquipadaMictorios() { 
		return this.equipadaMictorios;
	}

	public void setEquipadaMictorios(TblAuxAnomalias equipadaMictorios) {
		 this.equipadaMictorios = equipadaMictorios;
	}

	public Integer getNumMictorio() { 
		return this.numMictorio;
	}

	public void setNumMictorio(Integer numMictorio) {
		 this.numMictorio = numMictorio;
	}

	public TblAuxAnomalias getRedePublicaEsgoto() { 
		return this.redePublicaEsgoto;
	}

	public void setRedePublicaEsgoto(TblAuxAnomalias redePublicaEsgoto) {
		 this.redePublicaEsgoto = redePublicaEsgoto;
	}

	public TblAuxAnomalias getFossaSeptica() { 
		return this.fossaSeptica;
	}

	public void setFossaSeptica(TblAuxAnomalias fossaSeptica) {
		 this.fossaSeptica = fossaSeptica;
	}

	public TblAuxAnomalias getFossaRudimentar() { 
		return this.fossaRudimentar;
	}

	public void setFossaRudimentar(TblAuxAnomalias fossaRudimentar) {
		 this.fossaRudimentar = fossaRudimentar;
	}

	public TblAuxAnomalias getEvacucaoAguaResidualNatureza() { 
		return this.evacucaoAguaResidualNatureza;
	}

	public void setEvacucaoAguaResidualNatureza(TblAuxAnomalias evacucaoAguaResidualNatureza) {
		 this.evacucaoAguaResidualNatureza = evacucaoAguaResidualNatureza;
	}

	public TblAuxAnomalias getEvacucaoAguaResidualVala() { 
		return this.evacucaoAguaResidualVala;
	}

	public void setEvacucaoAguaResidualVala(TblAuxAnomalias evacucaoAguaResidualVala) {
		 this.evacucaoAguaResidualVala = evacucaoAguaResidualVala;
	}

	public TblAuxAnomalias getRecolhaLixoPeloCarro() { 
		return this.recolhaLixoPeloCarro;
	}

	public void setRecolhaLixoPeloCarro(TblAuxAnomalias recolhaLixoPeloCarro) {
		 this.recolhaLixoPeloCarro = recolhaLixoPeloCarro;
	}

	public TblAuxAnomalias getLixoColocadoContentores() { 
		return this.lixoColocadoContentores;
	}

	public void setLixoColocadoContentores(TblAuxAnomalias lixoColocadoContentores) {
		 this.lixoColocadoContentores = lixoColocadoContentores;
	}

	public TblAuxAnomalias getLixoEnterradoQueimado() { 
		return this.lixoEnterradoQueimado;
	}

	public void setLixoEnterradoQueimado(TblAuxAnomalias lixoEnterradoQueimado) {
		 this.lixoEnterradoQueimado = lixoEnterradoQueimado;
	}

	public TblAuxAnomalias getLixoJogadoNaturaza() { 
		return this.lixoJogadoNaturaza;
	}

	public void setLixoJogadoNaturaza(TblAuxAnomalias lixoJogadoNaturaza) {
		 this.lixoJogadoNaturaza = lixoJogadoNaturaza;
	}

	public TblAuxAnomalias getLixoJogadoRedorEscola() { 
		return this.lixoJogadoRedorEscola;
	}

	public void setLixoJogadoRedorEscola(TblAuxAnomalias lixoJogadoRedorEscola) {
		 this.lixoJogadoRedorEscola = lixoJogadoRedorEscola;
	}

	public TblAuxAnomalias getReaproveitamentoAguaResidualParaRega() { 
		return this.reaproveitamentoAguaResidualParaRega;
	}

	public void setReaproveitamentoAguaResidualParaRega(TblAuxAnomalias reaproveitamentoAguaResidualParaRega) {
		 this.reaproveitamentoAguaResidualParaRega = reaproveitamentoAguaResidualParaRega;
	}

	public TblAuxAnomalias getTemDisjuntoresDiferencial() { 
		return this.temDisjuntoresDiferencial;
	}

	public void setTemDisjuntoresDiferencial(TblAuxAnomalias temDisjuntoresDiferencial) {
		 this.temDisjuntoresDiferencial = temDisjuntoresDiferencial;
	}

	public TblAuxAnomalias getDegradacaoCondutoresEletricos() { 
		return this.degradacaoCondutoresEletricos;
	}

	public void setDegradacaoCondutoresEletricos(TblAuxAnomalias degradacaoCondutoresEletricos) {
		 this.degradacaoCondutoresEletricos = degradacaoCondutoresEletricos;
	}

	public TblAuxAnomalias getAparelhagemBomEstado() { 
		return this.aparelhagemBomEstado;
	}

	public void setAparelhagemBomEstado(TblAuxAnomalias aparelhagemBomEstado) {
		 this.aparelhagemBomEstado = aparelhagemBomEstado;
	}

	public TblAuxAnomalias getRiscoEletrocursao() { 
		return this.riscoEletrocursao;
	}

	public void setRiscoEletrocursao(TblAuxAnomalias riscoEletrocursao) {
		 this.riscoEletrocursao = riscoEletrocursao;
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