package nosi.webapps.sgie.pages.dados_infra_carater_funcional;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Dados_infra_carater_funcional extends Model{		

	@RParam(rParamName = "p_geral")
	private String geral;

	@RParam(rParamName = "p_numero_de_alunos")
	private Integer numero_de_alunos;

	@RParam(rParamName = "p_numero_de_professores")
	private Integer numero_de_professores;

	@RParam(rParamName = "p_area_util")
	private Integer area_util;

	@RParam(rParamName = "p_divisoes_principais")
	private Integer divisoes_principais;

	@RParam(rParamName = "p_cozinheiras")
	private Integer cozinheiras;

	@RParam(rParamName = "p_guardas")
	private Integer guardas;

	@RParam(rParamName = "p_pessoal_de_limpeza")
	private Integer pessoal_de_limpeza;

	@RParam(rParamName = "p_continuos")
	private Integer continuos;

	@RParam(rParamName = "p_pessoal_manutencao")
	private Integer pessoal_manutencao;

	@RParam(rParamName = "p_formas_de_acesso_a_escola")
	private String formas_de_acesso_a_escola;

	@RParam(rParamName = "p_areas_administrativas")
	private String areas_administrativas;

	@RParam(rParamName = "p_secretaria_carat_funcional")
	private String secretaria_carat_funcional;

	@RParam(rParamName = "p_conselho_executivo_")
	private String conselho_executivo_;

	@RParam(rParamName = "p_areas_didaticas")
	private String areas_didaticas;

	@RParam(rParamName = "p_numero_de_sala_de_aulas")
	private Integer numero_de_sala_de_aulas;

	@RParam(rParamName = "p_biblioteca_carat_funcional")
	private String biblioteca_carat_funcional;

	@RParam(rParamName = "p_club_ecologico_carat_funcional")
	private String club_ecologico_carat_funcional;

	@RParam(rParamName = "p_auditorio")
	private String auditorio;

	@RParam(rParamName = "p_sala_polivalente")
	private String sala_polivalente;

	@RParam(rParamName = "p_ginasio_carat_funcional")
	private String ginasio_carat_funcional;

	@RParam(rParamName = "p_sala_de_musica")
	private String sala_de_musica;

	@RParam(rParamName = "p_ludoteca")
	private String ludoteca;

	@RParam(rParamName = "p_sala_de_informatica")
	private String sala_de_informatica;

	@RParam(rParamName = "p_sala_de_professores")
	private String sala_de_professores;

	@RParam(rParamName = "p_sala_de_pais_")
	private String sala_de_pais_;

	@RParam(rParamName = "p_sala_auxiliares")
	private String sala_auxiliares;

	@RParam(rParamName = "p_vestiario_de_alunos")
	private String vestiario_de_alunos;

	@RParam(rParamName = "p_sala_de_atl")
	private String sala_de_atl;

	@RParam(rParamName = "p_gabinete_de_apoio_")
	private String gabinete_de_apoio_;

	@RParam(rParamName = "p_recreio_interior")
	private String recreio_interior;

	@RParam(rParamName = "p_areas_de_servico")
	private String areas_de_servico;

	@RParam(rParamName = "p_refeitorio")
	private String refeitorio;

	@RParam(rParamName = "p_cozinha_carat_funcional")
	private String cozinha_carat_funcional;

	@RParam(rParamName = "p_cozinha_equipada")
	private String cozinha_equipada;

	@RParam(rParamName = "p_cozinha_confeciona")
	private String cozinha_confeciona;

	@RParam(rParamName = "p_armazemdispensa_carat_funcional")
	private String armazemdispensa_carat_funcional;

	@RParam(rParamName = "p_anexos")
	private String anexos;

	@RParam(rParamName = "p_arrecadacao")
	private String arrecadacao;

	@RParam(rParamName = "p_outras")
	private String outras;

	@RParam(rParamName = "p_casa_banhos_para_meninos")
	private String casa_banhos_para_meninos;

	@RParam(rParamName = "p_casa_de_banho_para_meninas")
	private String casa_de_banho_para_meninas;

	@RParam(rParamName = "p_casa_de_banho_para_professores")
	private String casa_de_banho_para_professores;

	@RParam(rParamName = "p_casa_de_banho_para_professoras")
	private String casa_de_banho_para_professoras;

	@RParam(rParamName = "p_casa_de_banho_adaptado_para_criancas_com_nee")
	private String casa_de_banho_adaptado_para_criancas_com_nee;

	@RParam(rParamName = "p_o_estabelecimento_possui_instalacao_eletrica")
	private String o_estabelecimento_possui_instalacao_eletrica;

	@RParam(rParamName = "p_esc_id")
	private String esc_id;
	
	public void setGeral(String geral){
		this.geral = geral;
	}
	public String getGeral(){
		return this.geral;
	}
	
	public void setNumero_de_alunos(Integer numero_de_alunos){
		this.numero_de_alunos = numero_de_alunos;
	}
	public Integer getNumero_de_alunos(){
		return this.numero_de_alunos;
	}
	
	public void setNumero_de_professores(Integer numero_de_professores){
		this.numero_de_professores = numero_de_professores;
	}
	public Integer getNumero_de_professores(){
		return this.numero_de_professores;
	}
	
	public void setArea_util(Integer area_util){
		this.area_util = area_util;
	}
	public Integer getArea_util(){
		return this.area_util;
	}
	
	public void setDivisoes_principais(Integer divisoes_principais){
		this.divisoes_principais = divisoes_principais;
	}
	public Integer getDivisoes_principais(){
		return this.divisoes_principais;
	}
	
	public void setCozinheiras(Integer cozinheiras){
		this.cozinheiras = cozinheiras;
	}
	public Integer getCozinheiras(){
		return this.cozinheiras;
	}
	
	public void setGuardas(Integer guardas){
		this.guardas = guardas;
	}
	public Integer getGuardas(){
		return this.guardas;
	}
	
	public void setPessoal_de_limpeza(Integer pessoal_de_limpeza){
		this.pessoal_de_limpeza = pessoal_de_limpeza;
	}
	public Integer getPessoal_de_limpeza(){
		return this.pessoal_de_limpeza;
	}
	
	public void setContinuos(Integer continuos){
		this.continuos = continuos;
	}
	public Integer getContinuos(){
		return this.continuos;
	}
	
	public void setPessoal_manutencao(Integer pessoal_manutencao){
		this.pessoal_manutencao = pessoal_manutencao;
	}
	public Integer getPessoal_manutencao(){
		return this.pessoal_manutencao;
	}
	
	public void setFormas_de_acesso_a_escola(String formas_de_acesso_a_escola){
		this.formas_de_acesso_a_escola = formas_de_acesso_a_escola;
	}
	public String getFormas_de_acesso_a_escola(){
		return this.formas_de_acesso_a_escola;
	}
	
	public void setAreas_administrativas(String areas_administrativas){
		this.areas_administrativas = areas_administrativas;
	}
	public String getAreas_administrativas(){
		return this.areas_administrativas;
	}
	
	public void setSecretaria_carat_funcional(String secretaria_carat_funcional){
		this.secretaria_carat_funcional = secretaria_carat_funcional;
	}
	public String getSecretaria_carat_funcional(){
		return this.secretaria_carat_funcional;
	}
	
	public void setConselho_executivo_(String conselho_executivo_){
		this.conselho_executivo_ = conselho_executivo_;
	}
	public String getConselho_executivo_(){
		return this.conselho_executivo_;
	}
	
	public void setAreas_didaticas(String areas_didaticas){
		this.areas_didaticas = areas_didaticas;
	}
	public String getAreas_didaticas(){
		return this.areas_didaticas;
	}
	
	public void setNumero_de_sala_de_aulas(Integer numero_de_sala_de_aulas){
		this.numero_de_sala_de_aulas = numero_de_sala_de_aulas;
	}
	public Integer getNumero_de_sala_de_aulas(){
		return this.numero_de_sala_de_aulas;
	}
	
	public void setBiblioteca_carat_funcional(String biblioteca_carat_funcional){
		this.biblioteca_carat_funcional = biblioteca_carat_funcional;
	}
	public String getBiblioteca_carat_funcional(){
		return this.biblioteca_carat_funcional;
	}
	
	public void setClub_ecologico_carat_funcional(String club_ecologico_carat_funcional){
		this.club_ecologico_carat_funcional = club_ecologico_carat_funcional;
	}
	public String getClub_ecologico_carat_funcional(){
		return this.club_ecologico_carat_funcional;
	}
	
	public void setAuditorio(String auditorio){
		this.auditorio = auditorio;
	}
	public String getAuditorio(){
		return this.auditorio;
	}
	
	public void setSala_polivalente(String sala_polivalente){
		this.sala_polivalente = sala_polivalente;
	}
	public String getSala_polivalente(){
		return this.sala_polivalente;
	}
	
	public void setGinasio_carat_funcional(String ginasio_carat_funcional){
		this.ginasio_carat_funcional = ginasio_carat_funcional;
	}
	public String getGinasio_carat_funcional(){
		return this.ginasio_carat_funcional;
	}
	
	public void setSala_de_musica(String sala_de_musica){
		this.sala_de_musica = sala_de_musica;
	}
	public String getSala_de_musica(){
		return this.sala_de_musica;
	}
	
	public void setLudoteca(String ludoteca){
		this.ludoteca = ludoteca;
	}
	public String getLudoteca(){
		return this.ludoteca;
	}
	
	public void setSala_de_informatica(String sala_de_informatica){
		this.sala_de_informatica = sala_de_informatica;
	}
	public String getSala_de_informatica(){
		return this.sala_de_informatica;
	}
	
	public void setSala_de_professores(String sala_de_professores){
		this.sala_de_professores = sala_de_professores;
	}
	public String getSala_de_professores(){
		return this.sala_de_professores;
	}
	
	public void setSala_de_pais_(String sala_de_pais_){
		this.sala_de_pais_ = sala_de_pais_;
	}
	public String getSala_de_pais_(){
		return this.sala_de_pais_;
	}
	
	public void setSala_auxiliares(String sala_auxiliares){
		this.sala_auxiliares = sala_auxiliares;
	}
	public String getSala_auxiliares(){
		return this.sala_auxiliares;
	}
	
	public void setVestiario_de_alunos(String vestiario_de_alunos){
		this.vestiario_de_alunos = vestiario_de_alunos;
	}
	public String getVestiario_de_alunos(){
		return this.vestiario_de_alunos;
	}
	
	public void setSala_de_atl(String sala_de_atl){
		this.sala_de_atl = sala_de_atl;
	}
	public String getSala_de_atl(){
		return this.sala_de_atl;
	}
	
	public void setGabinete_de_apoio_(String gabinete_de_apoio_){
		this.gabinete_de_apoio_ = gabinete_de_apoio_;
	}
	public String getGabinete_de_apoio_(){
		return this.gabinete_de_apoio_;
	}
	
	public void setRecreio_interior(String recreio_interior){
		this.recreio_interior = recreio_interior;
	}
	public String getRecreio_interior(){
		return this.recreio_interior;
	}
	
	public void setAreas_de_servico(String areas_de_servico){
		this.areas_de_servico = areas_de_servico;
	}
	public String getAreas_de_servico(){
		return this.areas_de_servico;
	}
	
	public void setRefeitorio(String refeitorio){
		this.refeitorio = refeitorio;
	}
	public String getRefeitorio(){
		return this.refeitorio;
	}
	
	public void setCozinha_carat_funcional(String cozinha_carat_funcional){
		this.cozinha_carat_funcional = cozinha_carat_funcional;
	}
	public String getCozinha_carat_funcional(){
		return this.cozinha_carat_funcional;
	}
	
	public void setCozinha_equipada(String cozinha_equipada){
		this.cozinha_equipada = cozinha_equipada;
	}
	public String getCozinha_equipada(){
		return this.cozinha_equipada;
	}
	
	public void setCozinha_confeciona(String cozinha_confeciona){
		this.cozinha_confeciona = cozinha_confeciona;
	}
	public String getCozinha_confeciona(){
		return this.cozinha_confeciona;
	}
	
	public void setArmazemdispensa_carat_funcional(String armazemdispensa_carat_funcional){
		this.armazemdispensa_carat_funcional = armazemdispensa_carat_funcional;
	}
	public String getArmazemdispensa_carat_funcional(){
		return this.armazemdispensa_carat_funcional;
	}
	
	public void setAnexos(String anexos){
		this.anexos = anexos;
	}
	public String getAnexos(){
		return this.anexos;
	}
	
	public void setArrecadacao(String arrecadacao){
		this.arrecadacao = arrecadacao;
	}
	public String getArrecadacao(){
		return this.arrecadacao;
	}
	
	public void setOutras(String outras){
		this.outras = outras;
	}
	public String getOutras(){
		return this.outras;
	}
	
	public void setCasa_banhos_para_meninos(String casa_banhos_para_meninos){
		this.casa_banhos_para_meninos = casa_banhos_para_meninos;
	}
	public String getCasa_banhos_para_meninos(){
		return this.casa_banhos_para_meninos;
	}
	
	public void setCasa_de_banho_para_meninas(String casa_de_banho_para_meninas){
		this.casa_de_banho_para_meninas = casa_de_banho_para_meninas;
	}
	public String getCasa_de_banho_para_meninas(){
		return this.casa_de_banho_para_meninas;
	}
	
	public void setCasa_de_banho_para_professores(String casa_de_banho_para_professores){
		this.casa_de_banho_para_professores = casa_de_banho_para_professores;
	}
	public String getCasa_de_banho_para_professores(){
		return this.casa_de_banho_para_professores;
	}
	
	public void setCasa_de_banho_para_professoras(String casa_de_banho_para_professoras){
		this.casa_de_banho_para_professoras = casa_de_banho_para_professoras;
	}
	public String getCasa_de_banho_para_professoras(){
		return this.casa_de_banho_para_professoras;
	}
	
	public void setCasa_de_banho_adaptado_para_criancas_com_nee(String casa_de_banho_adaptado_para_criancas_com_nee){
		this.casa_de_banho_adaptado_para_criancas_com_nee = casa_de_banho_adaptado_para_criancas_com_nee;
	}
	public String getCasa_de_banho_adaptado_para_criancas_com_nee(){
		return this.casa_de_banho_adaptado_para_criancas_com_nee;
	}
	
	public void setO_estabelecimento_possui_instalacao_eletrica(String o_estabelecimento_possui_instalacao_eletrica){
		this.o_estabelecimento_possui_instalacao_eletrica = o_estabelecimento_possui_instalacao_eletrica;
	}
	public String getO_estabelecimento_possui_instalacao_eletrica(){
		return this.o_estabelecimento_possui_instalacao_eletrica;
	}
	
	public void setEsc_id(String esc_id){
		this.esc_id = esc_id;
	}
	public String getEsc_id(){
		return this.esc_id;
	}



}
