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
@Table(name = "tbl_caraterizacao_funcional", schema = "pgie")
@NamedQuery(name = "TblCaraterizacaoFuncional.findAll", query = "SELECT t FROM TblCaraterizacaoFuncional t")
public class TblCaraterizacaoFuncional extends BaseActiveRecord<TblCaraterizacaoFuncional> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Column(name = "num_alunos")
	private Integer numAlunos;
	@Column(name = "num_profs")
	private Integer numProfs;
	@Column(name = "area_util")
	private Integer areaUtil;
	@Column(name = "divisoes_principais")
	private Integer divisoesPrincipais;
	@Column(name = "cozinheiras")
	private Integer cozinheiras;
	@Column(name = "guardas")
	private Integer guardas;
	@Column(name = "pessoal_limpeza")
	private Integer pessoalLimpeza;
	@Column(name = "pessoal_manutencao")
	private Integer pessoalManutencao;
	@Column(name = "continos")
	private Integer continos;
	@ManyToOne
	@JoinColumn(name = "secretaria", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxSimNao secretaria;
	@ManyToOne
	@JoinColumn(name = "conselho_executivo", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxSimNao conselhoExecutivo;
	@ManyToOne
	@JoinColumn(name = "formas_acesso", foreignKey = @ForeignKey(name = "fk36"))
	private TblAuxFormaAcessoEscola formasAcesso;
	@ManyToOne
	@JoinColumn(name = "area_didaticas", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxSimNao areaDidaticas;
	@Column(name = "salas_aula")
	private Integer salasAula;
	@ManyToOne
	@JoinColumn(name = "biblioteca", foreignKey = @ForeignKey(name = "fk5"))
	private TblAuxSimNao biblioteca;
	@ManyToOne
	@JoinColumn(name = "club_eco", foreignKey = @ForeignKey(name = "fk6"))
	private TblAuxSimNao clubEco;
	@ManyToOne
	@JoinColumn(name = "auditorio", foreignKey = @ForeignKey(name = "fk7"))
	private TblAuxSimNao auditorio;
	@ManyToOne
	@JoinColumn(name = "sala_polivalente", foreignKey = @ForeignKey(name = "fk8"))
	private TblAuxSimNao salaPolivalente;
	@ManyToOne
	@JoinColumn(name = "ginasio", foreignKey = @ForeignKey(name = "fk9"))
	private TblAuxSimNao ginasio;
	@ManyToOne
	@JoinColumn(name = "sala_musica", foreignKey = @ForeignKey(name = "fk10"))
	private TblAuxSimNao salaMusica;
	@ManyToOne
	@JoinColumn(name = "ludoteca", foreignKey = @ForeignKey(name = "fk11"))
	private TblAuxSimNao ludoteca;
	@ManyToOne
	@JoinColumn(name = "sala_informatica", foreignKey = @ForeignKey(name = "fk12"))
	private TblAuxSimNao salaInformatica;
	@ManyToOne
	@JoinColumn(name = "sala_profs", foreignKey = @ForeignKey(name = "fk13"))
	private TblAuxSimNao salaProfs;
	@ManyToOne
	@JoinColumn(name = "sala_pais", foreignKey = @ForeignKey(name = "fk14"))
	private TblAuxSimNao salaPais;
	@ManyToOne
	@JoinColumn(name = "salas_auxiliares", foreignKey = @ForeignKey(name = "fk15"))
	private TblAuxSimNao salasAuxiliares;
	@ManyToOne
	@JoinColumn(name = "vestiario_alunos", foreignKey = @ForeignKey(name = "fk16"))
	private TblAuxSimNao vestiarioAlunos;
	@ManyToOne
	@JoinColumn(name = "sala_atl", foreignKey = @ForeignKey(name = "fk17"))
	private TblAuxSimNao salaAtl;
	@ManyToOne
	@JoinColumn(name = "gabinete_apoio", foreignKey = @ForeignKey(name = "fk18"))
	private TblAuxSimNao gabineteApoio;
	@ManyToOne
	@JoinColumn(name = "recreio_interior", foreignKey = @ForeignKey(name = "fk19"))
	private TblAuxSimNao recreioInterior;
	@ManyToOne
	@JoinColumn(name = "refeitorio", foreignKey = @ForeignKey(name = "fk20"))
	private TblAuxSimNao refeitorio;
	@ManyToOne
	@JoinColumn(name = "cozinha", foreignKey = @ForeignKey(name = "fk21"))
	private TblAuxSimNao cozinha;
	@ManyToOne
	@JoinColumn(name = "cozinha_equipada", foreignKey = @ForeignKey(name = "fk22"))
	private TblAuxSimNao cozinhaEquipada;
	@ManyToOne
	@JoinColumn(name = "cozinha_confeciona", foreignKey = @ForeignKey(name = "fk23"))
	private TblAuxSimNao cozinhaConfeciona;
	@ManyToOne
	@JoinColumn(name = "armazem", foreignKey = @ForeignKey(name = "fk24"))
	private TblAuxSimNao armazem;
	@ManyToOne
	@JoinColumn(name = "dispensa", foreignKey = @ForeignKey(name = "fk25"))
	private TblAuxSimNao dispensa;
	@ManyToOne
	@JoinColumn(name = "anexos", foreignKey = @ForeignKey(name = "fk26"))
	private TblAuxSimNao anexos;
	@ManyToOne
	@JoinColumn(name = "arrecadacao", foreignKey = @ForeignKey(name = "fk27"))
	private TblAuxSimNao arrecadacao;
	@ManyToOne
	@JoinColumn(name = "outras", foreignKey = @ForeignKey(name = "fk28"))
	private TblAuxSimNao outras;
	@ManyToOne
	@JoinColumn(name = "casa_banhos_rapazes", foreignKey = @ForeignKey(name = "fk29"))
	private TblAuxSimNao casaBanhosRapazes;
	@ManyToOne
	@JoinColumn(name = "casa_banho_raparigas", foreignKey = @ForeignKey(name = "fk30"))
	private TblAuxSimNao casaBanhoRaparigas;
	@ManyToOne
	@JoinColumn(name = "casa_banho_profs", foreignKey = @ForeignKey(name = "fk31"))
	private TblAuxSimNao casaBanhoProfs;
	@ManyToOne
	@JoinColumn(name = "casa_banho_professoras", foreignKey = @ForeignKey(name = "fk32"))
	private TblAuxSimNao casaBanhoProfessoras;
	@ManyToOne
	@JoinColumn(name = "casa_banho_nne", foreignKey = @ForeignKey(name = "fk33"))
	private TblAuxSimNao casaBanhoNne;
	@ManyToOne
	@JoinColumn(name = "possui_instacao_eletrica", foreignKey = @ForeignKey(name = "fk34"))
	private TblAuxSimNao possuiInstacaoEletrica;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk35"))
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

	public Integer getNumAlunos() { 
		return this.numAlunos;
	}

	public void setNumAlunos(Integer numAlunos) {
		 this.numAlunos = numAlunos;
	}

	public Integer getNumProfs() { 
		return this.numProfs;
	}

	public void setNumProfs(Integer numProfs) {
		 this.numProfs = numProfs;
	}

	public Integer getAreaUtil() { 
		return this.areaUtil;
	}

	public void setAreaUtil(Integer areaUtil) {
		 this.areaUtil = areaUtil;
	}

	public Integer getDivisoesPrincipais() { 
		return this.divisoesPrincipais;
	}

	public void setDivisoesPrincipais(Integer divisoesPrincipais) {
		 this.divisoesPrincipais = divisoesPrincipais;
	}

	public Integer getCozinheiras() { 
		return this.cozinheiras;
	}

	public void setCozinheiras(Integer cozinheiras) {
		 this.cozinheiras = cozinheiras;
	}

	public Integer getGuardas() { 
		return this.guardas;
	}

	public void setGuardas(Integer guardas) {
		 this.guardas = guardas;
	}

	public Integer getPessoalLimpeza() { 
		return this.pessoalLimpeza;
	}

	public void setPessoalLimpeza(Integer pessoalLimpeza) {
		 this.pessoalLimpeza = pessoalLimpeza;
	}

	public Integer getPessoalManutencao() { 
		return this.pessoalManutencao;
	}

	public void setPessoalManutencao(Integer pessoalManutencao) {
		 this.pessoalManutencao = pessoalManutencao;
	}

	public Integer getContinos() { 
		return this.continos;
	}

	public void setContinos(Integer continos) {
		 this.continos = continos;
	}

	public TblAuxSimNao getSecretaria() { 
		return this.secretaria;
	}

	public void setSecretaria(TblAuxSimNao secretaria) {
		 this.secretaria = secretaria;
	}

	public TblAuxSimNao getConselhoExecutivo() { 
		return this.conselhoExecutivo;
	}

	public void setConselhoExecutivo(TblAuxSimNao conselhoExecutivo) {
		 this.conselhoExecutivo = conselhoExecutivo;
	}

	public TblAuxFormaAcessoEscola getFormasAcesso() { 
		return this.formasAcesso;
	}

	public void setFormasAcesso(TblAuxFormaAcessoEscola formasAcesso) {
		 this.formasAcesso = formasAcesso;
	}

	public TblAuxSimNao getAreaDidaticas() { 
		return this.areaDidaticas;
	}

	public void setAreaDidaticas(TblAuxSimNao areaDidaticas) {
		 this.areaDidaticas = areaDidaticas;
	}

	public Integer getSalasAula() { 
		return this.salasAula;
	}

	public void setSalasAula(Integer salasAula) {
		 this.salasAula = salasAula;
	}

	public TblAuxSimNao getBiblioteca() { 
		return this.biblioteca;
	}

	public void setBiblioteca(TblAuxSimNao biblioteca) {
		 this.biblioteca = biblioteca;
	}

	public TblAuxSimNao getClubEco() { 
		return this.clubEco;
	}

	public void setClubEco(TblAuxSimNao clubEco) {
		 this.clubEco = clubEco;
	}

	public TblAuxSimNao getAuditorio() { 
		return this.auditorio;
	}

	public void setAuditorio(TblAuxSimNao auditorio) {
		 this.auditorio = auditorio;
	}

	public TblAuxSimNao getSalaPolivalente() { 
		return this.salaPolivalente;
	}

	public void setSalaPolivalente(TblAuxSimNao salaPolivalente) {
		 this.salaPolivalente = salaPolivalente;
	}

	public TblAuxSimNao getGinasio() { 
		return this.ginasio;
	}

	public void setGinasio(TblAuxSimNao ginasio) {
		 this.ginasio = ginasio;
	}

	public TblAuxSimNao getSalaMusica() { 
		return this.salaMusica;
	}

	public void setSalaMusica(TblAuxSimNao salaMusica) {
		 this.salaMusica = salaMusica;
	}

	public TblAuxSimNao getLudoteca() { 
		return this.ludoteca;
	}

	public void setLudoteca(TblAuxSimNao ludoteca) {
		 this.ludoteca = ludoteca;
	}

	public TblAuxSimNao getSalaInformatica() { 
		return this.salaInformatica;
	}

	public void setSalaInformatica(TblAuxSimNao salaInformatica) {
		 this.salaInformatica = salaInformatica;
	}

	public TblAuxSimNao getSalaProfs() { 
		return this.salaProfs;
	}

	public void setSalaProfs(TblAuxSimNao salaProfs) {
		 this.salaProfs = salaProfs;
	}

	public TblAuxSimNao getSalaPais() { 
		return this.salaPais;
	}

	public void setSalaPais(TblAuxSimNao salaPais) {
		 this.salaPais = salaPais;
	}

	public TblAuxSimNao getSalasAuxiliares() { 
		return this.salasAuxiliares;
	}

	public void setSalasAuxiliares(TblAuxSimNao salasAuxiliares) {
		 this.salasAuxiliares = salasAuxiliares;
	}

	public TblAuxSimNao getVestiarioAlunos() { 
		return this.vestiarioAlunos;
	}

	public void setVestiarioAlunos(TblAuxSimNao vestiarioAlunos) {
		 this.vestiarioAlunos = vestiarioAlunos;
	}

	public TblAuxSimNao getSalaAtl() { 
		return this.salaAtl;
	}

	public void setSalaAtl(TblAuxSimNao salaAtl) {
		 this.salaAtl = salaAtl;
	}

	public TblAuxSimNao getGabineteApoio() { 
		return this.gabineteApoio;
	}

	public void setGabineteApoio(TblAuxSimNao gabineteApoio) {
		 this.gabineteApoio = gabineteApoio;
	}

	public TblAuxSimNao getRecreioInterior() { 
		return this.recreioInterior;
	}

	public void setRecreioInterior(TblAuxSimNao recreioInterior) {
		 this.recreioInterior = recreioInterior;
	}

	public TblAuxSimNao getRefeitorio() { 
		return this.refeitorio;
	}

	public void setRefeitorio(TblAuxSimNao refeitorio) {
		 this.refeitorio = refeitorio;
	}

	public TblAuxSimNao getCozinha() { 
		return this.cozinha;
	}

	public void setCozinha(TblAuxSimNao cozinha) {
		 this.cozinha = cozinha;
	}

	public TblAuxSimNao getCozinhaEquipada() { 
		return this.cozinhaEquipada;
	}

	public void setCozinhaEquipada(TblAuxSimNao cozinhaEquipada) {
		 this.cozinhaEquipada = cozinhaEquipada;
	}

	public TblAuxSimNao getCozinhaConfeciona() { 
		return this.cozinhaConfeciona;
	}

	public void setCozinhaConfeciona(TblAuxSimNao cozinhaConfeciona) {
		 this.cozinhaConfeciona = cozinhaConfeciona;
	}

	public TblAuxSimNao getArmazem() { 
		return this.armazem;
	}

	public void setArmazem(TblAuxSimNao armazem) {
		 this.armazem = armazem;
	}

	public TblAuxSimNao getDispensa() { 
		return this.dispensa;
	}

	public void setDispensa(TblAuxSimNao dispensa) {
		 this.dispensa = dispensa;
	}

	public TblAuxSimNao getAnexos() { 
		return this.anexos;
	}

	public void setAnexos(TblAuxSimNao anexos) {
		 this.anexos = anexos;
	}

	public TblAuxSimNao getArrecadacao() { 
		return this.arrecadacao;
	}

	public void setArrecadacao(TblAuxSimNao arrecadacao) {
		 this.arrecadacao = arrecadacao;
	}

	public TblAuxSimNao getOutras() { 
		return this.outras;
	}

	public void setOutras(TblAuxSimNao outras) {
		 this.outras = outras;
	}

	public TblAuxSimNao getCasaBanhosRapazes() { 
		return this.casaBanhosRapazes;
	}

	public void setCasaBanhosRapazes(TblAuxSimNao casaBanhosRapazes) {
		 this.casaBanhosRapazes = casaBanhosRapazes;
	}

	public TblAuxSimNao getCasaBanhoRaparigas() { 
		return this.casaBanhoRaparigas;
	}

	public void setCasaBanhoRaparigas(TblAuxSimNao casaBanhoRaparigas) {
		 this.casaBanhoRaparigas = casaBanhoRaparigas;
	}

	public TblAuxSimNao getCasaBanhoProfs() { 
		return this.casaBanhoProfs;
	}

	public void setCasaBanhoProfs(TblAuxSimNao casaBanhoProfs) {
		 this.casaBanhoProfs = casaBanhoProfs;
	}

	public TblAuxSimNao getCasaBanhoProfessoras() { 
		return this.casaBanhoProfessoras;
	}

	public void setCasaBanhoProfessoras(TblAuxSimNao casaBanhoProfessoras) {
		 this.casaBanhoProfessoras = casaBanhoProfessoras;
	}

	public TblAuxSimNao getCasaBanhoNne() { 
		return this.casaBanhoNne;
	}

	public void setCasaBanhoNne(TblAuxSimNao casaBanhoNne) {
		 this.casaBanhoNne = casaBanhoNne;
	}

	public TblAuxSimNao getPossuiInstacaoEletrica() { 
		return this.possuiInstacaoEletrica;
	}

	public void setPossuiInstacaoEletrica(TblAuxSimNao possuiInstacaoEletrica) {
		 this.possuiInstacaoEletrica = possuiInstacaoEletrica;
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