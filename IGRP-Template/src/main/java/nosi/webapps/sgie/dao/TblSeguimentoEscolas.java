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
@Table(name = "tbl_seguimento_escolas", schema = "pgie")
@NamedQuery(name = "TblSeguimentoEscolas.findAll", query = "SELECT t FROM TblSeguimentoEscolas t")
public class TblSeguimentoEscolas extends BaseActiveRecord<TblSeguimentoEscolas> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "direcao", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxAnomalias direcao;
	@ManyToOne
	@JoinColumn(name = "secretaria", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxAnomalias secretaria;
	@ManyToOne
	@JoinColumn(name = "biblioteca", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxAnomalias biblioteca;
	@ManyToOne
	@JoinColumn(name = "ginasio", foreignKey = @ForeignKey(name = "fk4"))
	private TblAuxAnomalias ginasio;
	@ManyToOne
	@JoinColumn(name = "laboratorio_informatico", foreignKey = @ForeignKey(name = "fk5"))
	private TblAuxAnomalias laboratorioInformatico;
	@ManyToOne
	@JoinColumn(name = "laboratorio_biologia", foreignKey = @ForeignKey(name = "fk6"))
	private TblAuxAnomalias laboratorioBiologia;
	@ManyToOne
	@JoinColumn(name = "laboratorio_quimicafisica", foreignKey = @ForeignKey(name = "fk7"))
	private TblAuxAnomalias laboratorioQuimicafisica;
	@ManyToOne
	@JoinColumn(name = "sala_multimedia", foreignKey = @ForeignKey(name = "fk8"))
	private TblAuxAnomalias salaMultimedia;
	@ManyToOne
	@JoinColumn(name = "reprografia", foreignKey = @ForeignKey(name = "fk9"))
	private TblAuxAnomalias reprografia;
	@ManyToOne
	@JoinColumn(name = "club_ecologico", foreignKey = @ForeignKey(name = "fk10"))
	private TblAuxAnomalias clubEcologico;
	@ManyToOne
	@JoinColumn(name = "sala_de_leitura", foreignKey = @ForeignKey(name = "fk11"))
	private TblAuxAnomalias salaDeLeitura;
	@ManyToOne
	@JoinColumn(name = "oficina_de_artes_graficas", foreignKey = @ForeignKey(name = "fk12"))
	private TblAuxAnomalias oficinaDeArtesGraficas;
	@ManyToOne
	@JoinColumn(name = "centros_de_recursos", foreignKey = @ForeignKey(name = "fk13"))
	private TblAuxAnomalias centrosDeRecursos;
	@ManyToOne
	@JoinColumn(name = "laboratorio_de_lingua_portuguesa", foreignKey = @ForeignKey(name = "fk14"))
	private TblAuxAnomalias laboratorioDeLinguaPortuguesa;
	@ManyToOne
	@JoinColumn(name = "laboratorio_de_lingua_inglesa", foreignKey = @ForeignKey(name = "fk15"))
	private TblAuxAnomalias laboratorioDeLinguaInglesa;
	@ManyToOne
	@JoinColumn(name = "laboratorio_de_lingua_francesa", foreignKey = @ForeignKey(name = "fk16"))
	private TblAuxAnomalias laboratorioDeLinguaFrancesa;
	@ManyToOne
	@JoinColumn(name = "oficina_de_eletrotecnica_eletronica", foreignKey = @ForeignKey(name = "fk17"))
	private TblAuxAnomalias oficinaDeEletrotecnicaEletronica;
	@ManyToOne
	@JoinColumn(name = "oficina_de_mecanica", foreignKey = @ForeignKey(name = "fk18"))
	private TblAuxAnomalias oficinaDeMecanica;
	@ManyToOne
	@JoinColumn(name = "oficina_de_informatica", foreignKey = @ForeignKey(name = "fk19"))
	private TblAuxAnomalias oficinaDeInformatica;
	@ManyToOne
	@JoinColumn(name = "papelaria", foreignKey = @ForeignKey(name = "fk20"))
	private TblAuxAnomalias papelaria;
	@ManyToOne
	@JoinColumn(name = "anfiteatroauditorio", foreignKey = @ForeignKey(name = "fk21"))
	private TblAuxAnomalias anfiteatroauditorio;
	@ManyToOne
	@JoinColumn(name = "oficina_de_soldaduraconstrucao_metalica", foreignKey = @ForeignKey(name = "fk22"))
	private TblAuxAnomalias oficinaDeSoldaduraconstrucaoMetalica;
	@ManyToOne
	@JoinColumn(name = "sala_de_associacao_de_alunos", foreignKey = @ForeignKey(name = "fk23"))
	private TblAuxAnomalias salaDeAssociacaoDeAlunos;
	@ManyToOne
	@JoinColumn(name = "salas_especificas", foreignKey = @ForeignKey(name = "fk24"))
	private TblAuxAnomalias salasEspecificas;
	@ManyToOne
	@JoinColumn(name = "oficina_de_construcao_civil", foreignKey = @ForeignKey(name = "fk25"))
	private TblAuxAnomalias oficinaDeConstrucaoCivil;
	@ManyToOne
	@JoinColumn(name = "outros_espacos", foreignKey = @ForeignKey(name = "fk26"))
	private TblAuxAnomalias outrosEspacos;
	@ManyToOne
	@JoinColumn(name = "campos_de_voleibol", foreignKey = @ForeignKey(name = "fk27"))
	private TblAuxAnomalias camposDeVoleibol;
	@ManyToOne
	@JoinColumn(name = "campos_de_futebol", foreignKey = @ForeignKey(name = "fk28"))
	private TblAuxAnomalias camposDeFutebol;
	@ManyToOne
	@JoinColumn(name = "campos_de_basquetebol", foreignKey = @ForeignKey(name = "fk29"))
	private TblAuxAnomalias camposDeBasquetebol;
	@ManyToOne
	@JoinColumn(name = "pavilhao_polivalente_exterior", foreignKey = @ForeignKey(name = "fk30"))
	private TblAuxAnomalias pavilhaoPolivalenteExterior;
	@ManyToOne
	@JoinColumn(name = "pavilhao_interior", foreignKey = @ForeignKey(name = "fk31"))
	private TblAuxAnomalias pavilhaoInterior;
	@ManyToOne
	@JoinColumn(name = "placa_desportiva", foreignKey = @ForeignKey(name = "fk32"))
	private TblAuxAnomalias placaDesportiva;
	@ManyToOne
	@JoinColumn(name = "outras_instalacoes_exteriores", foreignKey = @ForeignKey(name = "fk33"))
	private TblAuxAnomalias outrasInstalacoesExteriores;
	@ManyToOne
	@JoinColumn(name = "sala_de_professores", foreignKey = @ForeignKey(name = "fk34"))
	private TblAuxAnomalias salaDeProfessores;
	@ManyToOne
	@JoinColumn(name = "refeitorio", foreignKey = @ForeignKey(name = "fk35"))
	private TblAuxAnomalias refeitorio;
	@ManyToOne
	@JoinColumn(name = "armazemdispensa", foreignKey = @ForeignKey(name = "fk36"))
	private TblAuxAnomalias armazemdispensa;
	@ManyToOne
	@JoinColumn(name = "anexosarrecadacao", foreignKey = @ForeignKey(name = "fk37"))
	private TblAuxAnomalias anexosarrecadacao;
	@ManyToOne
	@JoinColumn(name = "escadas_e_corredores_internos", foreignKey = @ForeignKey(name = "fk38"))
	private TblAuxAnomalias escadasECorredoresInternos;
	@ManyToOne
	@JoinColumn(name = "casa_banhos_para_meninos", foreignKey = @ForeignKey(name = "fk39"))
	private TblAuxAnomalias casaBanhosParaMeninos;
	@ManyToOne
	@JoinColumn(name = "casa_banhos_para_meninas", foreignKey = @ForeignKey(name = "fk40"))
	private TblAuxAnomalias casaBanhosParaMeninas;
	@ManyToOne
	@JoinColumn(name = "casa_banhos_para_criancas_com_deficiencias", foreignKey = @ForeignKey(name = "fk41"))
	private TblAuxAnomalias casaBanhosParaCriancasComDeficiencias;
	@ManyToOne
	@JoinColumn(name = "casa_de_banho_para_professores", foreignKey = @ForeignKey(name = "fk42"))
	private TblAuxAnomalias casaDeBanhoParaProfessores;
	@ManyToOne
	@JoinColumn(name = "casa_de_banho_para_professoras", foreignKey = @ForeignKey(name = "fk43"))
	private TblAuxAnomalias casaDeBanhoParaProfessoras;
	@ManyToOne
	@JoinColumn(name = "cantina", foreignKey = @ForeignKey(name = "fk44"))
	private TblAuxAnomalias cantina;
	@ManyToOne
	@JoinColumn(name = "cozinha", foreignKey = @ForeignKey(name = "fk45"))
	private TblAuxAnomalias cozinha;
	@ManyToOne
	@JoinColumn(name = "rampa_de_acesso", foreignKey = @ForeignKey(name = "fk46"))
	private TblAuxAnomalias rampaDeAcesso;
	@ManyToOne
	@JoinColumn(name = "acesso_automovel", foreignKey = @ForeignKey(name = "fk47"))
	private TblAuxAnomalias acessoAutomovel;
	@ManyToOne
	@JoinColumn(name = "acesso_pedonal", foreignKey = @ForeignKey(name = "fk48"))
	private TblAuxAnomalias acessoPedonal;
	@ManyToOne
	@JoinColumn(name = "sistema_de_rega", foreignKey = @ForeignKey(name = "fk49"))
	private TblAuxAnomalias sistemaDeRega;
	@ManyToOne
	@JoinColumn(name = "muro_de_vedacao", foreignKey = @ForeignKey(name = "fk50"))
	private TblAuxAnomalias muroDeVedacao;
	@ManyToOne
	@JoinColumn(name = "patio_da_escola", foreignKey = @ForeignKey(name = "fk51"))
	private TblAuxAnomalias patioDaEscola;
	@ManyToOne
	@JoinColumn(name = "canteiros_floridos", foreignKey = @ForeignKey(name = "fk52"))
	private TblAuxAnomalias canteirosFloridos;
	@ManyToOne
	@JoinColumn(name = "parque_automovel", foreignKey = @ForeignKey(name = "fk53"))
	private TblAuxAnomalias parqueAutomovel;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk54"))
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

	public TblAuxAnomalias getDirecao() { 
		return this.direcao;
	}

	public void setDirecao(TblAuxAnomalias direcao) {
		 this.direcao = direcao;
	}

	public TblAuxAnomalias getSecretaria() { 
		return this.secretaria;
	}

	public void setSecretaria(TblAuxAnomalias secretaria) {
		 this.secretaria = secretaria;
	}

	public TblAuxAnomalias getBiblioteca() { 
		return this.biblioteca;
	}

	public void setBiblioteca(TblAuxAnomalias biblioteca) {
		 this.biblioteca = biblioteca;
	}

	public TblAuxAnomalias getGinasio() { 
		return this.ginasio;
	}

	public void setGinasio(TblAuxAnomalias ginasio) {
		 this.ginasio = ginasio;
	}

	public TblAuxAnomalias getLaboratorioInformatico() { 
		return this.laboratorioInformatico;
	}

	public void setLaboratorioInformatico(TblAuxAnomalias laboratorioInformatico) {
		 this.laboratorioInformatico = laboratorioInformatico;
	}

	public TblAuxAnomalias getLaboratorioBiologia() { 
		return this.laboratorioBiologia;
	}

	public void setLaboratorioBiologia(TblAuxAnomalias laboratorioBiologia) {
		 this.laboratorioBiologia = laboratorioBiologia;
	}

	public TblAuxAnomalias getLaboratorioQuimicafisica() { 
		return this.laboratorioQuimicafisica;
	}

	public void setLaboratorioQuimicafisica(TblAuxAnomalias laboratorioQuimicafisica) {
		 this.laboratorioQuimicafisica = laboratorioQuimicafisica;
	}

	public TblAuxAnomalias getSalaMultimedia() { 
		return this.salaMultimedia;
	}

	public void setSalaMultimedia(TblAuxAnomalias salaMultimedia) {
		 this.salaMultimedia = salaMultimedia;
	}

	public TblAuxAnomalias getReprografia() { 
		return this.reprografia;
	}

	public void setReprografia(TblAuxAnomalias reprografia) {
		 this.reprografia = reprografia;
	}

	public TblAuxAnomalias getClubEcologico() { 
		return this.clubEcologico;
	}

	public void setClubEcologico(TblAuxAnomalias clubEcologico) {
		 this.clubEcologico = clubEcologico;
	}

	public TblAuxAnomalias getSalaDeLeitura() { 
		return this.salaDeLeitura;
	}

	public void setSalaDeLeitura(TblAuxAnomalias salaDeLeitura) {
		 this.salaDeLeitura = salaDeLeitura;
	}

	public TblAuxAnomalias getOficinaDeArtesGraficas() { 
		return this.oficinaDeArtesGraficas;
	}

	public void setOficinaDeArtesGraficas(TblAuxAnomalias oficinaDeArtesGraficas) {
		 this.oficinaDeArtesGraficas = oficinaDeArtesGraficas;
	}

	public TblAuxAnomalias getCentrosDeRecursos() { 
		return this.centrosDeRecursos;
	}

	public void setCentrosDeRecursos(TblAuxAnomalias centrosDeRecursos) {
		 this.centrosDeRecursos = centrosDeRecursos;
	}

	public TblAuxAnomalias getLaboratorioDeLinguaPortuguesa() { 
		return this.laboratorioDeLinguaPortuguesa;
	}

	public void setLaboratorioDeLinguaPortuguesa(TblAuxAnomalias laboratorioDeLinguaPortuguesa) {
		 this.laboratorioDeLinguaPortuguesa = laboratorioDeLinguaPortuguesa;
	}

	public TblAuxAnomalias getLaboratorioDeLinguaInglesa() { 
		return this.laboratorioDeLinguaInglesa;
	}

	public void setLaboratorioDeLinguaInglesa(TblAuxAnomalias laboratorioDeLinguaInglesa) {
		 this.laboratorioDeLinguaInglesa = laboratorioDeLinguaInglesa;
	}

	public TblAuxAnomalias getLaboratorioDeLinguaFrancesa() { 
		return this.laboratorioDeLinguaFrancesa;
	}

	public void setLaboratorioDeLinguaFrancesa(TblAuxAnomalias laboratorioDeLinguaFrancesa) {
		 this.laboratorioDeLinguaFrancesa = laboratorioDeLinguaFrancesa;
	}

	public TblAuxAnomalias getOficinaDeEletrotecnicaEletronica() { 
		return this.oficinaDeEletrotecnicaEletronica;
	}

	public void setOficinaDeEletrotecnicaEletronica(TblAuxAnomalias oficinaDeEletrotecnicaEletronica) {
		 this.oficinaDeEletrotecnicaEletronica = oficinaDeEletrotecnicaEletronica;
	}

	public TblAuxAnomalias getOficinaDeMecanica() { 
		return this.oficinaDeMecanica;
	}

	public void setOficinaDeMecanica(TblAuxAnomalias oficinaDeMecanica) {
		 this.oficinaDeMecanica = oficinaDeMecanica;
	}

	public TblAuxAnomalias getOficinaDeInformatica() { 
		return this.oficinaDeInformatica;
	}

	public void setOficinaDeInformatica(TblAuxAnomalias oficinaDeInformatica) {
		 this.oficinaDeInformatica = oficinaDeInformatica;
	}

	public TblAuxAnomalias getPapelaria() { 
		return this.papelaria;
	}

	public void setPapelaria(TblAuxAnomalias papelaria) {
		 this.papelaria = papelaria;
	}

	public TblAuxAnomalias getAnfiteatroauditorio() { 
		return this.anfiteatroauditorio;
	}

	public void setAnfiteatroauditorio(TblAuxAnomalias anfiteatroauditorio) {
		 this.anfiteatroauditorio = anfiteatroauditorio;
	}

	public TblAuxAnomalias getOficinaDeSoldaduraconstrucaoMetalica() { 
		return this.oficinaDeSoldaduraconstrucaoMetalica;
	}

	public void setOficinaDeSoldaduraconstrucaoMetalica(TblAuxAnomalias oficinaDeSoldaduraconstrucaoMetalica) {
		 this.oficinaDeSoldaduraconstrucaoMetalica = oficinaDeSoldaduraconstrucaoMetalica;
	}

	public TblAuxAnomalias getSalaDeAssociacaoDeAlunos() { 
		return this.salaDeAssociacaoDeAlunos;
	}

	public void setSalaDeAssociacaoDeAlunos(TblAuxAnomalias salaDeAssociacaoDeAlunos) {
		 this.salaDeAssociacaoDeAlunos = salaDeAssociacaoDeAlunos;
	}

	public TblAuxAnomalias getSalasEspecificas() { 
		return this.salasEspecificas;
	}

	public void setSalasEspecificas(TblAuxAnomalias salasEspecificas) {
		 this.salasEspecificas = salasEspecificas;
	}

	public TblAuxAnomalias getOficinaDeConstrucaoCivil() { 
		return this.oficinaDeConstrucaoCivil;
	}

	public void setOficinaDeConstrucaoCivil(TblAuxAnomalias oficinaDeConstrucaoCivil) {
		 this.oficinaDeConstrucaoCivil = oficinaDeConstrucaoCivil;
	}

	public TblAuxAnomalias getOutrosEspacos() { 
		return this.outrosEspacos;
	}

	public void setOutrosEspacos(TblAuxAnomalias outrosEspacos) {
		 this.outrosEspacos = outrosEspacos;
	}

	public TblAuxAnomalias getCamposDeVoleibol() { 
		return this.camposDeVoleibol;
	}

	public void setCamposDeVoleibol(TblAuxAnomalias camposDeVoleibol) {
		 this.camposDeVoleibol = camposDeVoleibol;
	}

	public TblAuxAnomalias getCamposDeFutebol() { 
		return this.camposDeFutebol;
	}

	public void setCamposDeFutebol(TblAuxAnomalias camposDeFutebol) {
		 this.camposDeFutebol = camposDeFutebol;
	}

	public TblAuxAnomalias getCamposDeBasquetebol() { 
		return this.camposDeBasquetebol;
	}

	public void setCamposDeBasquetebol(TblAuxAnomalias camposDeBasquetebol) {
		 this.camposDeBasquetebol = camposDeBasquetebol;
	}

	public TblAuxAnomalias getPavilhaoPolivalenteExterior() { 
		return this.pavilhaoPolivalenteExterior;
	}

	public void setPavilhaoPolivalenteExterior(TblAuxAnomalias pavilhaoPolivalenteExterior) {
		 this.pavilhaoPolivalenteExterior = pavilhaoPolivalenteExterior;
	}

	public TblAuxAnomalias getPavilhaoInterior() { 
		return this.pavilhaoInterior;
	}

	public void setPavilhaoInterior(TblAuxAnomalias pavilhaoInterior) {
		 this.pavilhaoInterior = pavilhaoInterior;
	}

	public TblAuxAnomalias getPlacaDesportiva() { 
		return this.placaDesportiva;
	}

	public void setPlacaDesportiva(TblAuxAnomalias placaDesportiva) {
		 this.placaDesportiva = placaDesportiva;
	}

	public TblAuxAnomalias getOutrasInstalacoesExteriores() { 
		return this.outrasInstalacoesExteriores;
	}

	public void setOutrasInstalacoesExteriores(TblAuxAnomalias outrasInstalacoesExteriores) {
		 this.outrasInstalacoesExteriores = outrasInstalacoesExteriores;
	}

	public TblAuxAnomalias getSalaDeProfessores() { 
		return this.salaDeProfessores;
	}

	public void setSalaDeProfessores(TblAuxAnomalias salaDeProfessores) {
		 this.salaDeProfessores = salaDeProfessores;
	}

	public TblAuxAnomalias getRefeitorio() { 
		return this.refeitorio;
	}

	public void setRefeitorio(TblAuxAnomalias refeitorio) {
		 this.refeitorio = refeitorio;
	}

	public TblAuxAnomalias getArmazemdispensa() { 
		return this.armazemdispensa;
	}

	public void setArmazemdispensa(TblAuxAnomalias armazemdispensa) {
		 this.armazemdispensa = armazemdispensa;
	}

	public TblAuxAnomalias getAnexosarrecadacao() { 
		return this.anexosarrecadacao;
	}

	public void setAnexosarrecadacao(TblAuxAnomalias anexosarrecadacao) {
		 this.anexosarrecadacao = anexosarrecadacao;
	}

	public TblAuxAnomalias getEscadasECorredoresInternos() { 
		return this.escadasECorredoresInternos;
	}

	public void setEscadasECorredoresInternos(TblAuxAnomalias escadasECorredoresInternos) {
		 this.escadasECorredoresInternos = escadasECorredoresInternos;
	}

	public TblAuxAnomalias getCasaBanhosParaMeninos() { 
		return this.casaBanhosParaMeninos;
	}

	public void setCasaBanhosParaMeninos(TblAuxAnomalias casaBanhosParaMeninos) {
		 this.casaBanhosParaMeninos = casaBanhosParaMeninos;
	}

	public TblAuxAnomalias getCasaBanhosParaMeninas() { 
		return this.casaBanhosParaMeninas;
	}

	public void setCasaBanhosParaMeninas(TblAuxAnomalias casaBanhosParaMeninas) {
		 this.casaBanhosParaMeninas = casaBanhosParaMeninas;
	}

	public TblAuxAnomalias getCasaBanhosParaCriancasComDeficiencias() { 
		return this.casaBanhosParaCriancasComDeficiencias;
	}

	public void setCasaBanhosParaCriancasComDeficiencias(TblAuxAnomalias casaBanhosParaCriancasComDeficiencias) {
		 this.casaBanhosParaCriancasComDeficiencias = casaBanhosParaCriancasComDeficiencias;
	}

	public TblAuxAnomalias getCasaDeBanhoParaProfessores() { 
		return this.casaDeBanhoParaProfessores;
	}

	public void setCasaDeBanhoParaProfessores(TblAuxAnomalias casaDeBanhoParaProfessores) {
		 this.casaDeBanhoParaProfessores = casaDeBanhoParaProfessores;
	}

	public TblAuxAnomalias getCasaDeBanhoParaProfessoras() { 
		return this.casaDeBanhoParaProfessoras;
	}

	public void setCasaDeBanhoParaProfessoras(TblAuxAnomalias casaDeBanhoParaProfessoras) {
		 this.casaDeBanhoParaProfessoras = casaDeBanhoParaProfessoras;
	}

	public TblAuxAnomalias getCantina() { 
		return this.cantina;
	}

	public void setCantina(TblAuxAnomalias cantina) {
		 this.cantina = cantina;
	}

	public TblAuxAnomalias getCozinha() { 
		return this.cozinha;
	}

	public void setCozinha(TblAuxAnomalias cozinha) {
		 this.cozinha = cozinha;
	}

	public TblAuxAnomalias getRampaDeAcesso() { 
		return this.rampaDeAcesso;
	}

	public void setRampaDeAcesso(TblAuxAnomalias rampaDeAcesso) {
		 this.rampaDeAcesso = rampaDeAcesso;
	}

	public TblAuxAnomalias getAcessoAutomovel() { 
		return this.acessoAutomovel;
	}

	public void setAcessoAutomovel(TblAuxAnomalias acessoAutomovel) {
		 this.acessoAutomovel = acessoAutomovel;
	}

	public TblAuxAnomalias getAcessoPedonal() { 
		return this.acessoPedonal;
	}

	public void setAcessoPedonal(TblAuxAnomalias acessoPedonal) {
		 this.acessoPedonal = acessoPedonal;
	}

	public TblAuxAnomalias getSistemaDeRega() { 
		return this.sistemaDeRega;
	}

	public void setSistemaDeRega(TblAuxAnomalias sistemaDeRega) {
		 this.sistemaDeRega = sistemaDeRega;
	}

	public TblAuxAnomalias getMuroDeVedacao() { 
		return this.muroDeVedacao;
	}

	public void setMuroDeVedacao(TblAuxAnomalias muroDeVedacao) {
		 this.muroDeVedacao = muroDeVedacao;
	}

	public TblAuxAnomalias getPatioDaEscola() { 
		return this.patioDaEscola;
	}

	public void setPatioDaEscola(TblAuxAnomalias patioDaEscola) {
		 this.patioDaEscola = patioDaEscola;
	}

	public TblAuxAnomalias getCanteirosFloridos() { 
		return this.canteirosFloridos;
	}

	public void setCanteirosFloridos(TblAuxAnomalias canteirosFloridos) {
		 this.canteirosFloridos = canteirosFloridos;
	}

	public TblAuxAnomalias getParqueAutomovel() { 
		return this.parqueAutomovel;
	}

	public void setParqueAutomovel(TblAuxAnomalias parqueAutomovel) {
		 this.parqueAutomovel = parqueAutomovel;
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