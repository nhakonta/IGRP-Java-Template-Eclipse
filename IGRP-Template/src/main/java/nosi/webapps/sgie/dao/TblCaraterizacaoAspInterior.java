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
@Table(name = "tbl_caraterizacao_asp_interior", schema = "pgie")
@NamedQuery(name = "TblCaraterizacaoAspInterior.findAll", query = "SELECT t FROM TblCaraterizacaoAspInterior t")
public class TblCaraterizacaoAspInterior extends BaseActiveRecord<TblCaraterizacaoAspInterior> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "muro_vedacao", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxAnomalias muroVedacao;
	@ManyToOne
	@JoinColumn(name = "patio_escola", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxAnomalias patioEscola;
	@ManyToOne
	@JoinColumn(name = "rampa_acesso", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxAnomalias rampaAcesso;
	@ManyToOne
	@JoinColumn(name = "cozinha", foreignKey = @ForeignKey(name = "fk4"))
	private TblAuxAnomalias cozinha;
	@ManyToOne
	@JoinColumn(name = "dispensa_armazem", foreignKey = @ForeignKey(name = "fk5"))
	private TblAuxAnomalias dispensaArmazem;
	@ManyToOne
	@JoinColumn(name = "placa_desportiva", foreignKey = @ForeignKey(name = "fk6"))
	private TblAuxAnomalias placaDesportiva;
	@ManyToOne
	@JoinColumn(name = "ginasio", foreignKey = @ForeignKey(name = "fk7"))
	private TblAuxAnomalias ginasio;
	@ManyToOne
	@JoinColumn(name = "casa_banho", foreignKey = @ForeignKey(name = "fk8"))
	private TblAuxAnomalias casaBanho;
	@ManyToOne
	@JoinColumn(name = "lab_informatica", foreignKey = @ForeignKey(name = "fk9"))
	private TblAuxAnomalias labInformatica;
	@ManyToOne
	@JoinColumn(name = "lab_biologia", foreignKey = @ForeignKey(name = "fk10"))
	private TblAuxAnomalias labBiologia;
	@ManyToOne
	@JoinColumn(name = "lab_quimica_fisica", foreignKey = @ForeignKey(name = "fk11"))
	private TblAuxAnomalias labQuimicaFisica;
	@ManyToOne
	@JoinColumn(name = "sala_multimedia", foreignKey = @ForeignKey(name = "fk12"))
	private TblAuxAnomalias salaMultimedia;
	@ManyToOne
	@JoinColumn(name = "biblioteca", foreignKey = @ForeignKey(name = "fk13"))
	private TblAuxAnomalias biblioteca;
	@ManyToOne
	@JoinColumn(name = "cantina", foreignKey = @ForeignKey(name = "fk14"))
	private TblAuxAnomalias cantina;
	@ManyToOne
	@JoinColumn(name = "clube_eco", foreignKey = @ForeignKey(name = "fk15"))
	private TblAuxAnomalias clubeEco;
	@ManyToOne
	@JoinColumn(name = "centro_recursos", foreignKey = @ForeignKey(name = "fk16"))
	private TblAuxAnomalias centroRecursos;
	@ManyToOne
	@JoinColumn(name = "lab_lingua", foreignKey = @ForeignKey(name = "fk17"))
	private TblAuxAnomalias labLingua;
	@ManyToOne
	@JoinColumn(name = "sala_profs", foreignKey = @ForeignKey(name = "fk18"))
	private TblAuxAnomalias salaProfs;
	@ManyToOne
	@JoinColumn(name = "secretaria", foreignKey = @ForeignKey(name = "fk19"))
	private TblAuxAnomalias secretaria;
	@ManyToOne
	@JoinColumn(name = "anfiteatro", foreignKey = @ForeignKey(name = "fk20"))
	private TblAuxAnomalias anfiteatro;
	@ManyToOne
	@JoinColumn(name = "direcao", foreignKey = @ForeignKey(name = "fk21"))
	private TblAuxAnomalias direcao;
	@ManyToOne
	@JoinColumn(name = "reprografia", foreignKey = @ForeignKey(name = "fk22"))
	private TblAuxAnomalias reprografia;
	@ManyToOne
	@JoinColumn(name = "sala_leitura", foreignKey = @ForeignKey(name = "fk23"))
	private TblAuxAnomalias salaLeitura;
	@ManyToOne
	@JoinColumn(name = "oficina_mecanica", foreignKey = @ForeignKey(name = "fk24"))
	private TblAuxAnomalias oficinaMecanica;
	@ManyToOne
	@JoinColumn(name = "oficina_electro", foreignKey = @ForeignKey(name = "fk25"))
	private TblAuxAnomalias oficinaElectro;
	@ManyToOne
	@JoinColumn(name = "oficina_const_civil", foreignKey = @ForeignKey(name = "fk126"))
	private TblAuxAnomalias oficinaConstCivil;
	@ManyToOne
	@JoinColumn(name = "oficina_artes_graficas", foreignKey = @ForeignKey(name = "fk27"))
	private TblAuxAnomalias oficinaArtesGraficas;
	@ManyToOne
	@JoinColumn(name = "oficina_informatica", foreignKey = @ForeignKey(name = "fk28"))
	private TblAuxAnomalias oficinaInformatica;
	@ManyToOne
	@JoinColumn(name = "oficina_soldadura", foreignKey = @ForeignKey(name = "fk29"))
	private TblAuxAnomalias oficinaSoldadura;
	@ManyToOne
	@JoinColumn(name = "sala_associa_alunos", foreignKey = @ForeignKey(name = "fk30"))
	private TblAuxAnomalias salaAssociaAlunos;
	@ManyToOne
	@JoinColumn(name = "papelaria", foreignKey = @ForeignKey(name = "fk31"))
	private TblAuxAnomalias papelaria;
	@ManyToOne
	@JoinColumn(name = "sala_especifica", foreignKey = @ForeignKey(name = "fk32"))
	private TblAuxAnomalias salaEspecifica;
	@ManyToOne
	@JoinColumn(name = "outos_espacos", foreignKey = @ForeignKey(name = "fk33"))
	private TblAuxAnomalias outosEspacos;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk34"))
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

	public TblAuxAnomalias getMuroVedacao() { 
		return this.muroVedacao;
	}

	public void setMuroVedacao(TblAuxAnomalias muroVedacao) {
		 this.muroVedacao = muroVedacao;
	}

	public TblAuxAnomalias getPatioEscola() { 
		return this.patioEscola;
	}

	public void setPatioEscola(TblAuxAnomalias patioEscola) {
		 this.patioEscola = patioEscola;
	}

	public TblAuxAnomalias getRampaAcesso() { 
		return this.rampaAcesso;
	}

	public void setRampaAcesso(TblAuxAnomalias rampaAcesso) {
		 this.rampaAcesso = rampaAcesso;
	}

	public TblAuxAnomalias getCozinha() { 
		return this.cozinha;
	}

	public void setCozinha(TblAuxAnomalias cozinha) {
		 this.cozinha = cozinha;
	}

	public TblAuxAnomalias getDispensaArmazem() { 
		return this.dispensaArmazem;
	}

	public void setDispensaArmazem(TblAuxAnomalias dispensaArmazem) {
		 this.dispensaArmazem = dispensaArmazem;
	}

	public TblAuxAnomalias getPlacaDesportiva() { 
		return this.placaDesportiva;
	}

	public void setPlacaDesportiva(TblAuxAnomalias placaDesportiva) {
		 this.placaDesportiva = placaDesportiva;
	}

	public TblAuxAnomalias getGinasio() { 
		return this.ginasio;
	}

	public void setGinasio(TblAuxAnomalias ginasio) {
		 this.ginasio = ginasio;
	}

	public TblAuxAnomalias getCasaBanho() { 
		return this.casaBanho;
	}

	public void setCasaBanho(TblAuxAnomalias casaBanho) {
		 this.casaBanho = casaBanho;
	}

	public TblAuxAnomalias getLabInformatica() { 
		return this.labInformatica;
	}

	public void setLabInformatica(TblAuxAnomalias labInformatica) {
		 this.labInformatica = labInformatica;
	}

	public TblAuxAnomalias getLabBiologia() { 
		return this.labBiologia;
	}

	public void setLabBiologia(TblAuxAnomalias labBiologia) {
		 this.labBiologia = labBiologia;
	}

	public TblAuxAnomalias getLabQuimicaFisica() { 
		return this.labQuimicaFisica;
	}

	public void setLabQuimicaFisica(TblAuxAnomalias labQuimicaFisica) {
		 this.labQuimicaFisica = labQuimicaFisica;
	}

	public TblAuxAnomalias getSalaMultimedia() { 
		return this.salaMultimedia;
	}

	public void setSalaMultimedia(TblAuxAnomalias salaMultimedia) {
		 this.salaMultimedia = salaMultimedia;
	}

	public TblAuxAnomalias getBiblioteca() { 
		return this.biblioteca;
	}

	public void setBiblioteca(TblAuxAnomalias biblioteca) {
		 this.biblioteca = biblioteca;
	}

	public TblAuxAnomalias getCantina() { 
		return this.cantina;
	}

	public void setCantina(TblAuxAnomalias cantina) {
		 this.cantina = cantina;
	}

	public TblAuxAnomalias getClubeEco() { 
		return this.clubeEco;
	}

	public void setClubeEco(TblAuxAnomalias clubeEco) {
		 this.clubeEco = clubeEco;
	}

	public TblAuxAnomalias getCentroRecursos() { 
		return this.centroRecursos;
	}

	public void setCentroRecursos(TblAuxAnomalias centroRecursos) {
		 this.centroRecursos = centroRecursos;
	}

	public TblAuxAnomalias getLabLingua() { 
		return this.labLingua;
	}

	public void setLabLingua(TblAuxAnomalias labLingua) {
		 this.labLingua = labLingua;
	}

	public TblAuxAnomalias getSalaProfs() { 
		return this.salaProfs;
	}

	public void setSalaProfs(TblAuxAnomalias salaProfs) {
		 this.salaProfs = salaProfs;
	}

	public TblAuxAnomalias getSecretaria() { 
		return this.secretaria;
	}

	public void setSecretaria(TblAuxAnomalias secretaria) {
		 this.secretaria = secretaria;
	}

	public TblAuxAnomalias getAnfiteatro() { 
		return this.anfiteatro;
	}

	public void setAnfiteatro(TblAuxAnomalias anfiteatro) {
		 this.anfiteatro = anfiteatro;
	}

	public TblAuxAnomalias getDirecao() { 
		return this.direcao;
	}

	public void setDirecao(TblAuxAnomalias direcao) {
		 this.direcao = direcao;
	}

	public TblAuxAnomalias getReprografia() { 
		return this.reprografia;
	}

	public void setReprografia(TblAuxAnomalias reprografia) {
		 this.reprografia = reprografia;
	}

	public TblAuxAnomalias getSalaLeitura() { 
		return this.salaLeitura;
	}

	public void setSalaLeitura(TblAuxAnomalias salaLeitura) {
		 this.salaLeitura = salaLeitura;
	}

	public TblAuxAnomalias getOficinaMecanica() { 
		return this.oficinaMecanica;
	}

	public void setOficinaMecanica(TblAuxAnomalias oficinaMecanica) {
		 this.oficinaMecanica = oficinaMecanica;
	}

	public TblAuxAnomalias getOficinaElectro() { 
		return this.oficinaElectro;
	}

	public void setOficinaElectro(TblAuxAnomalias oficinaElectro) {
		 this.oficinaElectro = oficinaElectro;
	}

	public TblAuxAnomalias getOficinaConstCivil() { 
		return this.oficinaConstCivil;
	}

	public void setOficinaConstCivil(TblAuxAnomalias oficinaConstCivil) {
		 this.oficinaConstCivil = oficinaConstCivil;
	}

	public TblAuxAnomalias getOficinaArtesGraficas() { 
		return this.oficinaArtesGraficas;
	}

	public void setOficinaArtesGraficas(TblAuxAnomalias oficinaArtesGraficas) {
		 this.oficinaArtesGraficas = oficinaArtesGraficas;
	}

	public TblAuxAnomalias getOficinaInformatica() { 
		return this.oficinaInformatica;
	}

	public void setOficinaInformatica(TblAuxAnomalias oficinaInformatica) {
		 this.oficinaInformatica = oficinaInformatica;
	}

	public TblAuxAnomalias getOficinaSoldadura() { 
		return this.oficinaSoldadura;
	}

	public void setOficinaSoldadura(TblAuxAnomalias oficinaSoldadura) {
		 this.oficinaSoldadura = oficinaSoldadura;
	}

	public TblAuxAnomalias getSalaAssociaAlunos() { 
		return this.salaAssociaAlunos;
	}

	public void setSalaAssociaAlunos(TblAuxAnomalias salaAssociaAlunos) {
		 this.salaAssociaAlunos = salaAssociaAlunos;
	}

	public TblAuxAnomalias getPapelaria() { 
		return this.papelaria;
	}

	public void setPapelaria(TblAuxAnomalias papelaria) {
		 this.papelaria = papelaria;
	}

	public TblAuxAnomalias getSalaEspecifica() { 
		return this.salaEspecifica;
	}

	public void setSalaEspecifica(TblAuxAnomalias salaEspecifica) {
		 this.salaEspecifica = salaEspecifica;
	}

	public TblAuxAnomalias getOutosEspacos() { 
		return this.outosEspacos;
	}

	public void setOutosEspacos(TblAuxAnomalias outosEspacos) {
		 this.outosEspacos = outosEspacos;
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