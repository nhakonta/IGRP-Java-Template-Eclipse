package nosi.webapps.sgie.pages.novo_seguimento;

import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Novo_seguimento extends Model{		

	@RParam(rParamName = "p_areas_adminstrativas_e_didaticas")
	private String areas_adminstrativas_e_didaticas;

	@RParam(rParamName = "p_direcao")
	private String direcao;

	@RParam(rParamName = "p_link_1")
	private IGRPLink link_1;
	@RParam(rParamName = "p_link_1_desc")
	private String link_1_desc;

	@RParam(rParamName = "p_secretaria")
	private String secretaria;

	@RParam(rParamName = "p_link_secretaria")
	private IGRPLink link_secretaria;
	@RParam(rParamName = "p_link_secretaria_desc")
	private String link_secretaria_desc;

	@RParam(rParamName = "p_biblioteca")
	private String biblioteca;

	@RParam(rParamName = "p_link_biblioteca")
	private IGRPLink link_biblioteca;
	@RParam(rParamName = "p_link_biblioteca_desc")
	private String link_biblioteca_desc;

	@RParam(rParamName = "p_ginasio")
	private String ginasio;

	@RParam(rParamName = "p_link_ginasio")
	private IGRPLink link_ginasio;
	@RParam(rParamName = "p_link_ginasio_desc")
	private String link_ginasio_desc;

	@RParam(rParamName = "p_laboratorio_informatico")
	private String laboratorio_informatico;

	@RParam(rParamName = "p_link_lab_info")
	private IGRPLink link_lab_info;
	@RParam(rParamName = "p_link_lab_info_desc")
	private String link_lab_info_desc;

	@RParam(rParamName = "p_laboratorio_biologia")
	private String laboratorio_biologia;

	@RParam(rParamName = "p_link_11")
	private IGRPLink link_11;
	@RParam(rParamName = "p_link_11_desc")
	private String link_11_desc;

	@RParam(rParamName = "p_laboratorio_quimicafisica")
	private String laboratorio_quimicafisica;

	@RParam(rParamName = "p_link_lab_quim")
	private IGRPLink link_lab_quim;
	@RParam(rParamName = "p_link_lab_quim_desc")
	private String link_lab_quim_desc;

	@RParam(rParamName = "p_sala_multimedia")
	private String sala_multimedia;

	@RParam(rParamName = "p_link_multime")
	private IGRPLink link_multime;
	@RParam(rParamName = "p_link_multime_desc")
	private String link_multime_desc;

	@RParam(rParamName = "p_reprografia")
	private String reprografia;

	@RParam(rParamName = "p_link_reprografia")
	private IGRPLink link_reprografia;
	@RParam(rParamName = "p_link_reprografia_desc")
	private String link_reprografia_desc;

	@RParam(rParamName = "p_club_ecologico")
	private String club_ecologico;

	@RParam(rParamName = "p_link_club_eco")
	private IGRPLink link_club_eco;
	@RParam(rParamName = "p_link_club_eco_desc")
	private String link_club_eco_desc;

	@RParam(rParamName = "p_sala_de_leitura")
	private String sala_de_leitura;

	@RParam(rParamName = "p_link_sala_leitura")
	private IGRPLink link_sala_leitura;
	@RParam(rParamName = "p_link_sala_leitura_desc")
	private String link_sala_leitura_desc;

	@RParam(rParamName = "p_oficina_de_artes_graficas")
	private String oficina_de_artes_graficas;

	@RParam(rParamName = "p_link_oficina_agraf")
	private IGRPLink link_oficina_agraf;
	@RParam(rParamName = "p_link_oficina_agraf_desc")
	private String link_oficina_agraf_desc;

	@RParam(rParamName = "p_centros_de_recursos")
	private String centros_de_recursos;

	@RParam(rParamName = "p_link_centro_rec")
	private IGRPLink link_centro_rec;
	@RParam(rParamName = "p_link_centro_rec_desc")
	private String link_centro_rec_desc;

	@RParam(rParamName = "p_laboratorio_de_lingua_portuguesa")
	private String laboratorio_de_lingua_portuguesa;

	@RParam(rParamName = "p_link_lab_pt")
	private IGRPLink link_lab_pt;
	@RParam(rParamName = "p_link_lab_pt_desc")
	private String link_lab_pt_desc;

	@RParam(rParamName = "p_laboratorio_de_lingua_inglesa")
	private String laboratorio_de_lingua_inglesa;

	@RParam(rParamName = "p_link_lab_ing")
	private IGRPLink link_lab_ing;
	@RParam(rParamName = "p_link_lab_ing_desc")
	private String link_lab_ing_desc;

	@RParam(rParamName = "p_laboratorio_de_lingua_francesa")
	private String laboratorio_de_lingua_francesa;

	@RParam(rParamName = "p_link_lab_fran")
	private IGRPLink link_lab_fran;
	@RParam(rParamName = "p_link_lab_fran_desc")
	private String link_lab_fran_desc;

	@RParam(rParamName = "p_oficina_de_eletrotecnica_eletronica")
	private String oficina_de_eletrotecnica_eletronica;

	@RParam(rParamName = "p_link_ofic_eletro")
	private IGRPLink link_ofic_eletro;
	@RParam(rParamName = "p_link_ofic_eletro_desc")
	private String link_ofic_eletro_desc;

	@RParam(rParamName = "p_oficina_de_informatica")
	private String oficina_de_informatica;

	@RParam(rParamName = "p_link_ofic_inform")
	private IGRPLink link_ofic_inform;
	@RParam(rParamName = "p_link_ofic_inform_desc")
	private String link_ofic_inform_desc;

	@RParam(rParamName = "p_papelaria")
	private String papelaria;

	@RParam(rParamName = "p_link_papelaria")
	private IGRPLink link_papelaria;
	@RParam(rParamName = "p_link_papelaria_desc")
	private String link_papelaria_desc;

	@RParam(rParamName = "p_oficina_de_mecanica")
	private String oficina_de_mecanica;

	@RParam(rParamName = "p_link_ofic_mec")
	private IGRPLink link_ofic_mec;
	@RParam(rParamName = "p_link_ofic_mec_desc")
	private String link_ofic_mec_desc;

	@RParam(rParamName = "p_anfiteatroauditorio")
	private String anfiteatroauditorio;

	@RParam(rParamName = "p_link_anfiteatro")
	private IGRPLink link_anfiteatro;
	@RParam(rParamName = "p_link_anfiteatro_desc")
	private String link_anfiteatro_desc;

	@RParam(rParamName = "p_oficina_de_soldaduraconstrucao_metalica")
	private String oficina_de_soldaduraconstrucao_metalica;

	@RParam(rParamName = "p_link_ofic_solda")
	private IGRPLink link_ofic_solda;
	@RParam(rParamName = "p_link_ofic_solda_desc")
	private String link_ofic_solda_desc;

	@RParam(rParamName = "p_sala_de_associacao_de_alunos")
	private String sala_de_associacao_de_alunos;

	@RParam(rParamName = "p_link_sala_alunos")
	private IGRPLink link_sala_alunos;
	@RParam(rParamName = "p_link_sala_alunos_desc")
	private String link_sala_alunos_desc;

	@RParam(rParamName = "p_salas_especificas")
	private String salas_especificas;

	@RParam(rParamName = "p_link_sala_espec")
	private IGRPLink link_sala_espec;
	@RParam(rParamName = "p_link_sala_espec_desc")
	private String link_sala_espec_desc;

	@RParam(rParamName = "p_oficina_de_construcao_civil")
	private String oficina_de_construcao_civil;

	@RParam(rParamName = "p_link_ofic_cc")
	private IGRPLink link_ofic_cc;
	@RParam(rParamName = "p_link_ofic_cc_desc")
	private String link_ofic_cc_desc;

	@RParam(rParamName = "p_pavilhao_polivalente_exterior")
	private String pavilhao_polivalente_exterior;

	@RParam(rParamName = "p_link_pavil_exterior")
	private IGRPLink link_pavil_exterior;
	@RParam(rParamName = "p_link_pavil_exterior_desc")
	private String link_pavil_exterior_desc;

	@RParam(rParamName = "p_outros_espacos")
	private String outros_espacos;

	@RParam(rParamName = "p_link_outros_espacos")
	private IGRPLink link_outros_espacos;
	@RParam(rParamName = "p_link_outros_espacos_desc")
	private String link_outros_espacos_desc;

	@RParam(rParamName = "p_campos_de_voleibol")
	private String campos_de_voleibol;

	@RParam(rParamName = "p_link_campo_voley")
	private IGRPLink link_campo_voley;
	@RParam(rParamName = "p_link_campo_voley_desc")
	private String link_campo_voley_desc;

	@RParam(rParamName = "p_campos_de_futebol")
	private String campos_de_futebol;

	@RParam(rParamName = "p_link_campo_fute")
	private IGRPLink link_campo_fute;
	@RParam(rParamName = "p_link_campo_fute_desc")
	private String link_campo_fute_desc;

	@RParam(rParamName = "p_campos_de_basquetebol")
	private String campos_de_basquetebol;

	@RParam(rParamName = "p_link_campo_basq")
	private IGRPLink link_campo_basq;
	@RParam(rParamName = "p_link_campo_basq_desc")
	private String link_campo_basq_desc;

	@RParam(rParamName = "p_pavilhao_interior")
	private String pavilhao_interior;

	@RParam(rParamName = "p_link_pav_interior")
	private IGRPLink link_pav_interior;
	@RParam(rParamName = "p_link_pav_interior_desc")
	private String link_pav_interior_desc;

	@RParam(rParamName = "p_placa_desportiva")
	private String placa_desportiva;

	@RParam(rParamName = "p_link_placa_desport")
	private IGRPLink link_placa_desport;
	@RParam(rParamName = "p_link_placa_desport_desc")
	private String link_placa_desport_desc;

	@RParam(rParamName = "p_outras_instalacoes_exteriores")
	private String outras_instalacoes_exteriores;

	@RParam(rParamName = "p_link_2")
	private IGRPLink link_2;
	@RParam(rParamName = "p_link_2_desc")
	private String link_2_desc;

	@RParam(rParamName = "p_sala_de_professores")
	private String sala_de_professores;

	@RParam(rParamName = "p_link_sala_profs")
	private IGRPLink link_sala_profs;
	@RParam(rParamName = "p_link_sala_profs_desc")
	private String link_sala_profs_desc;

	@RParam(rParamName = "p_areas_de_servico")
	private String areas_de_servico;

	@RParam(rParamName = "p_refeitorio")
	private String refeitorio;

	@RParam(rParamName = "p_link_refeitorio")
	private IGRPLink link_refeitorio;
	@RParam(rParamName = "p_link_refeitorio_desc")
	private String link_refeitorio_desc;

	@RParam(rParamName = "p_armazemdispensa")
	private String armazemdispensa;

	@RParam(rParamName = "p_link_dispensa")
	private IGRPLink link_dispensa;
	@RParam(rParamName = "p_link_dispensa_desc")
	private String link_dispensa_desc;

	@RParam(rParamName = "p_anexosarrecadacao")
	private String anexosarrecadacao;

	@RParam(rParamName = "p_link_anexo")
	private IGRPLink link_anexo;
	@RParam(rParamName = "p_link_anexo_desc")
	private String link_anexo_desc;

	@RParam(rParamName = "p_escadas_e_corredores_internos")
	private String escadas_e_corredores_internos;

	@RParam(rParamName = "p_link_escadas")
	private IGRPLink link_escadas;
	@RParam(rParamName = "p_link_escadas_desc")
	private String link_escadas_desc;

	@RParam(rParamName = "p_casa_banhos_para_meninos")
	private String casa_banhos_para_meninos;

	@RParam(rParamName = "p_link_wc_meninos")
	private IGRPLink link_wc_meninos;
	@RParam(rParamName = "p_link_wc_meninos_desc")
	private String link_wc_meninos_desc;

	@RParam(rParamName = "p_casa_banhos_para_meninas")
	private String casa_banhos_para_meninas;

	@RParam(rParamName = "p_link_wc_meninas")
	private IGRPLink link_wc_meninas;
	@RParam(rParamName = "p_link_wc_meninas_desc")
	private String link_wc_meninas_desc;

	@RParam(rParamName = "p_casa_banhos_para_criancas_com_deficiencias")
	private String casa_banhos_para_criancas_com_deficiencias;

	@RParam(rParamName = "p_link_wc_defic")
	private IGRPLink link_wc_defic;
	@RParam(rParamName = "p_link_wc_defic_desc")
	private String link_wc_defic_desc;

	@RParam(rParamName = "p_casa_de_banho_para_professores")
	private String casa_de_banho_para_professores;

	@RParam(rParamName = "p_link_wc_profs")
	private IGRPLink link_wc_profs;
	@RParam(rParamName = "p_link_wc_profs_desc")
	private String link_wc_profs_desc;

	@RParam(rParamName = "p_casa_de_banho_para_professoras")
	private String casa_de_banho_para_professoras;

	@RParam(rParamName = "p_link_wc_profsra")
	private IGRPLink link_wc_profsra;
	@RParam(rParamName = "p_link_wc_profsra_desc")
	private String link_wc_profsra_desc;

	@RParam(rParamName = "p_cantina")
	private String cantina;

	@RParam(rParamName = "p_link_cantina")
	private IGRPLink link_cantina;
	@RParam(rParamName = "p_link_cantina_desc")
	private String link_cantina_desc;

	@RParam(rParamName = "p_cozinha")
	private String cozinha;

	@RParam(rParamName = "p_link_cozinha")
	private IGRPLink link_cozinha;
	@RParam(rParamName = "p_link_cozinha_desc")
	private String link_cozinha_desc;

	@RParam(rParamName = "p_areas_diversas")
	private String areas_diversas;

	@RParam(rParamName = "p_rampa_de_acesso")
	private String rampa_de_acesso;

	@RParam(rParamName = "p_link_rampa")
	private IGRPLink link_rampa;
	@RParam(rParamName = "p_link_rampa_desc")
	private String link_rampa_desc;

	@RParam(rParamName = "p_acesso_automovel")
	private String acesso_automovel;

	@RParam(rParamName = "p_link_auto")
	private IGRPLink link_auto;
	@RParam(rParamName = "p_link_auto_desc")
	private String link_auto_desc;

	@RParam(rParamName = "p_acesso_pedonal")
	private String acesso_pedonal;

	@RParam(rParamName = "p_link_pedonal")
	private IGRPLink link_pedonal;
	@RParam(rParamName = "p_link_pedonal_desc")
	private String link_pedonal_desc;

	@RParam(rParamName = "p_sistema_de_rega")
	private String sistema_de_rega;

	@RParam(rParamName = "p_rega")
	private IGRPLink rega;
	@RParam(rParamName = "p_rega_desc")
	private String rega_desc;

	@RParam(rParamName = "p_muro_de_vedacao")
	private String muro_de_vedacao;

	@RParam(rParamName = "p_link_vedacao")
	private IGRPLink link_vedacao;
	@RParam(rParamName = "p_link_vedacao_desc")
	private String link_vedacao_desc;

	@RParam(rParamName = "p_patio_da_escola")
	private String patio_da_escola;

	@RParam(rParamName = "p_link_patio")
	private IGRPLink link_patio;
	@RParam(rParamName = "p_link_patio_desc")
	private String link_patio_desc;

	@RParam(rParamName = "p_canteiros_floridos")
	private String canteiros_floridos;

	@RParam(rParamName = "p_link_canteiros")
	private IGRPLink link_canteiros;
	@RParam(rParamName = "p_link_canteiros_desc")
	private String link_canteiros_desc;

	@RParam(rParamName = "p_parque_automovel")
	private String parque_automovel;

	@RParam(rParamName = "p_link_parque_auto")
	private IGRPLink link_parque_auto;
	@RParam(rParamName = "p_link_parque_auto_desc")
	private String link_parque_auto_desc;

	@RParam(rParamName = "p_saneamento_basico")
	private String saneamento_basico;

	@RParam(rParamName = "p_link_seneamento")
	private IGRPLink link_seneamento;
	@RParam(rParamName = "p_link_seneamento_desc")
	private String link_seneamento_desc;
	
	public void setAreas_adminstrativas_e_didaticas(String areas_adminstrativas_e_didaticas){
		this.areas_adminstrativas_e_didaticas = areas_adminstrativas_e_didaticas;
	}
	public String getAreas_adminstrativas_e_didaticas(){
		return this.areas_adminstrativas_e_didaticas;
	}
	
	public void setDirecao(String direcao){
		this.direcao = direcao;
	}
	public String getDirecao(){
		return this.direcao;
	}
	
	public IGRPLink setLink_1(String app,String page,String action){
		this.link_1 = new IGRPLink(app,page,action);
		return this.link_1;
	}
	public IGRPLink getLink_1(){
		return this.link_1;
	}
	public void setLink_1_desc(String link_1_desc){
		this.link_1_desc = link_1_desc;
	}
	public String getLink_1_desc(){
		return this.link_1_desc;
	}
	public IGRPLink setLink_1(String link){
		this.link_1 = new IGRPLink(link);
		return this.link_1;
	}
	public IGRPLink setLink_1(Report link){
		this.link_1 = new IGRPLink(link);
		return this.link_1;
	}
	
	public void setSecretaria(String secretaria){
		this.secretaria = secretaria;
	}
	public String getSecretaria(){
		return this.secretaria;
	}
	
	public IGRPLink setLink_secretaria(String app,String page,String action){
		this.link_secretaria = new IGRPLink(app,page,action);
		return this.link_secretaria;
	}
	public IGRPLink getLink_secretaria(){
		return this.link_secretaria;
	}
	public void setLink_secretaria_desc(String link_secretaria_desc){
		this.link_secretaria_desc = link_secretaria_desc;
	}
	public String getLink_secretaria_desc(){
		return this.link_secretaria_desc;
	}
	public IGRPLink setLink_secretaria(String link){
		this.link_secretaria = new IGRPLink(link);
		return this.link_secretaria;
	}
	public IGRPLink setLink_secretaria(Report link){
		this.link_secretaria = new IGRPLink(link);
		return this.link_secretaria;
	}
	
	public void setBiblioteca(String biblioteca){
		this.biblioteca = biblioteca;
	}
	public String getBiblioteca(){
		return this.biblioteca;
	}
	
	public IGRPLink setLink_biblioteca(String app,String page,String action){
		this.link_biblioteca = new IGRPLink(app,page,action);
		return this.link_biblioteca;
	}
	public IGRPLink getLink_biblioteca(){
		return this.link_biblioteca;
	}
	public void setLink_biblioteca_desc(String link_biblioteca_desc){
		this.link_biblioteca_desc = link_biblioteca_desc;
	}
	public String getLink_biblioteca_desc(){
		return this.link_biblioteca_desc;
	}
	public IGRPLink setLink_biblioteca(String link){
		this.link_biblioteca = new IGRPLink(link);
		return this.link_biblioteca;
	}
	public IGRPLink setLink_biblioteca(Report link){
		this.link_biblioteca = new IGRPLink(link);
		return this.link_biblioteca;
	}
	
	public void setGinasio(String ginasio){
		this.ginasio = ginasio;
	}
	public String getGinasio(){
		return this.ginasio;
	}
	
	public IGRPLink setLink_ginasio(String app,String page,String action){
		this.link_ginasio = new IGRPLink(app,page,action);
		return this.link_ginasio;
	}
	public IGRPLink getLink_ginasio(){
		return this.link_ginasio;
	}
	public void setLink_ginasio_desc(String link_ginasio_desc){
		this.link_ginasio_desc = link_ginasio_desc;
	}
	public String getLink_ginasio_desc(){
		return this.link_ginasio_desc;
	}
	public IGRPLink setLink_ginasio(String link){
		this.link_ginasio = new IGRPLink(link);
		return this.link_ginasio;
	}
	public IGRPLink setLink_ginasio(Report link){
		this.link_ginasio = new IGRPLink(link);
		return this.link_ginasio;
	}
	
	public void setLaboratorio_informatico(String laboratorio_informatico){
		this.laboratorio_informatico = laboratorio_informatico;
	}
	public String getLaboratorio_informatico(){
		return this.laboratorio_informatico;
	}
	
	public IGRPLink setLink_lab_info(String app,String page,String action){
		this.link_lab_info = new IGRPLink(app,page,action);
		return this.link_lab_info;
	}
	public IGRPLink getLink_lab_info(){
		return this.link_lab_info;
	}
	public void setLink_lab_info_desc(String link_lab_info_desc){
		this.link_lab_info_desc = link_lab_info_desc;
	}
	public String getLink_lab_info_desc(){
		return this.link_lab_info_desc;
	}
	public IGRPLink setLink_lab_info(String link){
		this.link_lab_info = new IGRPLink(link);
		return this.link_lab_info;
	}
	public IGRPLink setLink_lab_info(Report link){
		this.link_lab_info = new IGRPLink(link);
		return this.link_lab_info;
	}
	
	public void setLaboratorio_biologia(String laboratorio_biologia){
		this.laboratorio_biologia = laboratorio_biologia;
	}
	public String getLaboratorio_biologia(){
		return this.laboratorio_biologia;
	}
	
	public IGRPLink setLink_11(String app,String page,String action){
		this.link_11 = new IGRPLink(app,page,action);
		return this.link_11;
	}
	public IGRPLink getLink_11(){
		return this.link_11;
	}
	public void setLink_11_desc(String link_11_desc){
		this.link_11_desc = link_11_desc;
	}
	public String getLink_11_desc(){
		return this.link_11_desc;
	}
	public IGRPLink setLink_11(String link){
		this.link_11 = new IGRPLink(link);
		return this.link_11;
	}
	public IGRPLink setLink_11(Report link){
		this.link_11 = new IGRPLink(link);
		return this.link_11;
	}
	
	public void setLaboratorio_quimicafisica(String laboratorio_quimicafisica){
		this.laboratorio_quimicafisica = laboratorio_quimicafisica;
	}
	public String getLaboratorio_quimicafisica(){
		return this.laboratorio_quimicafisica;
	}
	
	public IGRPLink setLink_lab_quim(String app,String page,String action){
		this.link_lab_quim = new IGRPLink(app,page,action);
		return this.link_lab_quim;
	}
	public IGRPLink getLink_lab_quim(){
		return this.link_lab_quim;
	}
	public void setLink_lab_quim_desc(String link_lab_quim_desc){
		this.link_lab_quim_desc = link_lab_quim_desc;
	}
	public String getLink_lab_quim_desc(){
		return this.link_lab_quim_desc;
	}
	public IGRPLink setLink_lab_quim(String link){
		this.link_lab_quim = new IGRPLink(link);
		return this.link_lab_quim;
	}
	public IGRPLink setLink_lab_quim(Report link){
		this.link_lab_quim = new IGRPLink(link);
		return this.link_lab_quim;
	}
	
	public void setSala_multimedia(String sala_multimedia){
		this.sala_multimedia = sala_multimedia;
	}
	public String getSala_multimedia(){
		return this.sala_multimedia;
	}
	
	public IGRPLink setLink_multime(String app,String page,String action){
		this.link_multime = new IGRPLink(app,page,action);
		return this.link_multime;
	}
	public IGRPLink getLink_multime(){
		return this.link_multime;
	}
	public void setLink_multime_desc(String link_multime_desc){
		this.link_multime_desc = link_multime_desc;
	}
	public String getLink_multime_desc(){
		return this.link_multime_desc;
	}
	public IGRPLink setLink_multime(String link){
		this.link_multime = new IGRPLink(link);
		return this.link_multime;
	}
	public IGRPLink setLink_multime(Report link){
		this.link_multime = new IGRPLink(link);
		return this.link_multime;
	}
	
	public void setReprografia(String reprografia){
		this.reprografia = reprografia;
	}
	public String getReprografia(){
		return this.reprografia;
	}
	
	public IGRPLink setLink_reprografia(String app,String page,String action){
		this.link_reprografia = new IGRPLink(app,page,action);
		return this.link_reprografia;
	}
	public IGRPLink getLink_reprografia(){
		return this.link_reprografia;
	}
	public void setLink_reprografia_desc(String link_reprografia_desc){
		this.link_reprografia_desc = link_reprografia_desc;
	}
	public String getLink_reprografia_desc(){
		return this.link_reprografia_desc;
	}
	public IGRPLink setLink_reprografia(String link){
		this.link_reprografia = new IGRPLink(link);
		return this.link_reprografia;
	}
	public IGRPLink setLink_reprografia(Report link){
		this.link_reprografia = new IGRPLink(link);
		return this.link_reprografia;
	}
	
	public void setClub_ecologico(String club_ecologico){
		this.club_ecologico = club_ecologico;
	}
	public String getClub_ecologico(){
		return this.club_ecologico;
	}
	
	public IGRPLink setLink_club_eco(String app,String page,String action){
		this.link_club_eco = new IGRPLink(app,page,action);
		return this.link_club_eco;
	}
	public IGRPLink getLink_club_eco(){
		return this.link_club_eco;
	}
	public void setLink_club_eco_desc(String link_club_eco_desc){
		this.link_club_eco_desc = link_club_eco_desc;
	}
	public String getLink_club_eco_desc(){
		return this.link_club_eco_desc;
	}
	public IGRPLink setLink_club_eco(String link){
		this.link_club_eco = new IGRPLink(link);
		return this.link_club_eco;
	}
	public IGRPLink setLink_club_eco(Report link){
		this.link_club_eco = new IGRPLink(link);
		return this.link_club_eco;
	}
	
	public void setSala_de_leitura(String sala_de_leitura){
		this.sala_de_leitura = sala_de_leitura;
	}
	public String getSala_de_leitura(){
		return this.sala_de_leitura;
	}
	
	public IGRPLink setLink_sala_leitura(String app,String page,String action){
		this.link_sala_leitura = new IGRPLink(app,page,action);
		return this.link_sala_leitura;
	}
	public IGRPLink getLink_sala_leitura(){
		return this.link_sala_leitura;
	}
	public void setLink_sala_leitura_desc(String link_sala_leitura_desc){
		this.link_sala_leitura_desc = link_sala_leitura_desc;
	}
	public String getLink_sala_leitura_desc(){
		return this.link_sala_leitura_desc;
	}
	public IGRPLink setLink_sala_leitura(String link){
		this.link_sala_leitura = new IGRPLink(link);
		return this.link_sala_leitura;
	}
	public IGRPLink setLink_sala_leitura(Report link){
		this.link_sala_leitura = new IGRPLink(link);
		return this.link_sala_leitura;
	}
	
	public void setOficina_de_artes_graficas(String oficina_de_artes_graficas){
		this.oficina_de_artes_graficas = oficina_de_artes_graficas;
	}
	public String getOficina_de_artes_graficas(){
		return this.oficina_de_artes_graficas;
	}
	
	public IGRPLink setLink_oficina_agraf(String app,String page,String action){
		this.link_oficina_agraf = new IGRPLink(app,page,action);
		return this.link_oficina_agraf;
	}
	public IGRPLink getLink_oficina_agraf(){
		return this.link_oficina_agraf;
	}
	public void setLink_oficina_agraf_desc(String link_oficina_agraf_desc){
		this.link_oficina_agraf_desc = link_oficina_agraf_desc;
	}
	public String getLink_oficina_agraf_desc(){
		return this.link_oficina_agraf_desc;
	}
	public IGRPLink setLink_oficina_agraf(String link){
		this.link_oficina_agraf = new IGRPLink(link);
		return this.link_oficina_agraf;
	}
	public IGRPLink setLink_oficina_agraf(Report link){
		this.link_oficina_agraf = new IGRPLink(link);
		return this.link_oficina_agraf;
	}
	
	public void setCentros_de_recursos(String centros_de_recursos){
		this.centros_de_recursos = centros_de_recursos;
	}
	public String getCentros_de_recursos(){
		return this.centros_de_recursos;
	}
	
	public IGRPLink setLink_centro_rec(String app,String page,String action){
		this.link_centro_rec = new IGRPLink(app,page,action);
		return this.link_centro_rec;
	}
	public IGRPLink getLink_centro_rec(){
		return this.link_centro_rec;
	}
	public void setLink_centro_rec_desc(String link_centro_rec_desc){
		this.link_centro_rec_desc = link_centro_rec_desc;
	}
	public String getLink_centro_rec_desc(){
		return this.link_centro_rec_desc;
	}
	public IGRPLink setLink_centro_rec(String link){
		this.link_centro_rec = new IGRPLink(link);
		return this.link_centro_rec;
	}
	public IGRPLink setLink_centro_rec(Report link){
		this.link_centro_rec = new IGRPLink(link);
		return this.link_centro_rec;
	}
	
	public void setLaboratorio_de_lingua_portuguesa(String laboratorio_de_lingua_portuguesa){
		this.laboratorio_de_lingua_portuguesa = laboratorio_de_lingua_portuguesa;
	}
	public String getLaboratorio_de_lingua_portuguesa(){
		return this.laboratorio_de_lingua_portuguesa;
	}
	
	public IGRPLink setLink_lab_pt(String app,String page,String action){
		this.link_lab_pt = new IGRPLink(app,page,action);
		return this.link_lab_pt;
	}
	public IGRPLink getLink_lab_pt(){
		return this.link_lab_pt;
	}
	public void setLink_lab_pt_desc(String link_lab_pt_desc){
		this.link_lab_pt_desc = link_lab_pt_desc;
	}
	public String getLink_lab_pt_desc(){
		return this.link_lab_pt_desc;
	}
	public IGRPLink setLink_lab_pt(String link){
		this.link_lab_pt = new IGRPLink(link);
		return this.link_lab_pt;
	}
	public IGRPLink setLink_lab_pt(Report link){
		this.link_lab_pt = new IGRPLink(link);
		return this.link_lab_pt;
	}
	
	public void setLaboratorio_de_lingua_inglesa(String laboratorio_de_lingua_inglesa){
		this.laboratorio_de_lingua_inglesa = laboratorio_de_lingua_inglesa;
	}
	public String getLaboratorio_de_lingua_inglesa(){
		return this.laboratorio_de_lingua_inglesa;
	}
	
	public IGRPLink setLink_lab_ing(String app,String page,String action){
		this.link_lab_ing = new IGRPLink(app,page,action);
		return this.link_lab_ing;
	}
	public IGRPLink getLink_lab_ing(){
		return this.link_lab_ing;
	}
	public void setLink_lab_ing_desc(String link_lab_ing_desc){
		this.link_lab_ing_desc = link_lab_ing_desc;
	}
	public String getLink_lab_ing_desc(){
		return this.link_lab_ing_desc;
	}
	public IGRPLink setLink_lab_ing(String link){
		this.link_lab_ing = new IGRPLink(link);
		return this.link_lab_ing;
	}
	public IGRPLink setLink_lab_ing(Report link){
		this.link_lab_ing = new IGRPLink(link);
		return this.link_lab_ing;
	}
	
	public void setLaboratorio_de_lingua_francesa(String laboratorio_de_lingua_francesa){
		this.laboratorio_de_lingua_francesa = laboratorio_de_lingua_francesa;
	}
	public String getLaboratorio_de_lingua_francesa(){
		return this.laboratorio_de_lingua_francesa;
	}
	
	public IGRPLink setLink_lab_fran(String app,String page,String action){
		this.link_lab_fran = new IGRPLink(app,page,action);
		return this.link_lab_fran;
	}
	public IGRPLink getLink_lab_fran(){
		return this.link_lab_fran;
	}
	public void setLink_lab_fran_desc(String link_lab_fran_desc){
		this.link_lab_fran_desc = link_lab_fran_desc;
	}
	public String getLink_lab_fran_desc(){
		return this.link_lab_fran_desc;
	}
	public IGRPLink setLink_lab_fran(String link){
		this.link_lab_fran = new IGRPLink(link);
		return this.link_lab_fran;
	}
	public IGRPLink setLink_lab_fran(Report link){
		this.link_lab_fran = new IGRPLink(link);
		return this.link_lab_fran;
	}
	
	public void setOficina_de_eletrotecnica_eletronica(String oficina_de_eletrotecnica_eletronica){
		this.oficina_de_eletrotecnica_eletronica = oficina_de_eletrotecnica_eletronica;
	}
	public String getOficina_de_eletrotecnica_eletronica(){
		return this.oficina_de_eletrotecnica_eletronica;
	}
	
	public IGRPLink setLink_ofic_eletro(String app,String page,String action){
		this.link_ofic_eletro = new IGRPLink(app,page,action);
		return this.link_ofic_eletro;
	}
	public IGRPLink getLink_ofic_eletro(){
		return this.link_ofic_eletro;
	}
	public void setLink_ofic_eletro_desc(String link_ofic_eletro_desc){
		this.link_ofic_eletro_desc = link_ofic_eletro_desc;
	}
	public String getLink_ofic_eletro_desc(){
		return this.link_ofic_eletro_desc;
	}
	public IGRPLink setLink_ofic_eletro(String link){
		this.link_ofic_eletro = new IGRPLink(link);
		return this.link_ofic_eletro;
	}
	public IGRPLink setLink_ofic_eletro(Report link){
		this.link_ofic_eletro = new IGRPLink(link);
		return this.link_ofic_eletro;
	}
	
	public void setOficina_de_informatica(String oficina_de_informatica){
		this.oficina_de_informatica = oficina_de_informatica;
	}
	public String getOficina_de_informatica(){
		return this.oficina_de_informatica;
	}
	
	public IGRPLink setLink_ofic_inform(String app,String page,String action){
		this.link_ofic_inform = new IGRPLink(app,page,action);
		return this.link_ofic_inform;
	}
	public IGRPLink getLink_ofic_inform(){
		return this.link_ofic_inform;
	}
	public void setLink_ofic_inform_desc(String link_ofic_inform_desc){
		this.link_ofic_inform_desc = link_ofic_inform_desc;
	}
	public String getLink_ofic_inform_desc(){
		return this.link_ofic_inform_desc;
	}
	public IGRPLink setLink_ofic_inform(String link){
		this.link_ofic_inform = new IGRPLink(link);
		return this.link_ofic_inform;
	}
	public IGRPLink setLink_ofic_inform(Report link){
		this.link_ofic_inform = new IGRPLink(link);
		return this.link_ofic_inform;
	}
	
	public void setPapelaria(String papelaria){
		this.papelaria = papelaria;
	}
	public String getPapelaria(){
		return this.papelaria;
	}
	
	public IGRPLink setLink_papelaria(String app,String page,String action){
		this.link_papelaria = new IGRPLink(app,page,action);
		return this.link_papelaria;
	}
	public IGRPLink getLink_papelaria(){
		return this.link_papelaria;
	}
	public void setLink_papelaria_desc(String link_papelaria_desc){
		this.link_papelaria_desc = link_papelaria_desc;
	}
	public String getLink_papelaria_desc(){
		return this.link_papelaria_desc;
	}
	public IGRPLink setLink_papelaria(String link){
		this.link_papelaria = new IGRPLink(link);
		return this.link_papelaria;
	}
	public IGRPLink setLink_papelaria(Report link){
		this.link_papelaria = new IGRPLink(link);
		return this.link_papelaria;
	}
	
	public void setOficina_de_mecanica(String oficina_de_mecanica){
		this.oficina_de_mecanica = oficina_de_mecanica;
	}
	public String getOficina_de_mecanica(){
		return this.oficina_de_mecanica;
	}
	
	public IGRPLink setLink_ofic_mec(String app,String page,String action){
		this.link_ofic_mec = new IGRPLink(app,page,action);
		return this.link_ofic_mec;
	}
	public IGRPLink getLink_ofic_mec(){
		return this.link_ofic_mec;
	}
	public void setLink_ofic_mec_desc(String link_ofic_mec_desc){
		this.link_ofic_mec_desc = link_ofic_mec_desc;
	}
	public String getLink_ofic_mec_desc(){
		return this.link_ofic_mec_desc;
	}
	public IGRPLink setLink_ofic_mec(String link){
		this.link_ofic_mec = new IGRPLink(link);
		return this.link_ofic_mec;
	}
	public IGRPLink setLink_ofic_mec(Report link){
		this.link_ofic_mec = new IGRPLink(link);
		return this.link_ofic_mec;
	}
	
	public void setAnfiteatroauditorio(String anfiteatroauditorio){
		this.anfiteatroauditorio = anfiteatroauditorio;
	}
	public String getAnfiteatroauditorio(){
		return this.anfiteatroauditorio;
	}
	
	public IGRPLink setLink_anfiteatro(String app,String page,String action){
		this.link_anfiteatro = new IGRPLink(app,page,action);
		return this.link_anfiteatro;
	}
	public IGRPLink getLink_anfiteatro(){
		return this.link_anfiteatro;
	}
	public void setLink_anfiteatro_desc(String link_anfiteatro_desc){
		this.link_anfiteatro_desc = link_anfiteatro_desc;
	}
	public String getLink_anfiteatro_desc(){
		return this.link_anfiteatro_desc;
	}
	public IGRPLink setLink_anfiteatro(String link){
		this.link_anfiteatro = new IGRPLink(link);
		return this.link_anfiteatro;
	}
	public IGRPLink setLink_anfiteatro(Report link){
		this.link_anfiteatro = new IGRPLink(link);
		return this.link_anfiteatro;
	}
	
	public void setOficina_de_soldaduraconstrucao_metalica(String oficina_de_soldaduraconstrucao_metalica){
		this.oficina_de_soldaduraconstrucao_metalica = oficina_de_soldaduraconstrucao_metalica;
	}
	public String getOficina_de_soldaduraconstrucao_metalica(){
		return this.oficina_de_soldaduraconstrucao_metalica;
	}
	
	public IGRPLink setLink_ofic_solda(String app,String page,String action){
		this.link_ofic_solda = new IGRPLink(app,page,action);
		return this.link_ofic_solda;
	}
	public IGRPLink getLink_ofic_solda(){
		return this.link_ofic_solda;
	}
	public void setLink_ofic_solda_desc(String link_ofic_solda_desc){
		this.link_ofic_solda_desc = link_ofic_solda_desc;
	}
	public String getLink_ofic_solda_desc(){
		return this.link_ofic_solda_desc;
	}
	public IGRPLink setLink_ofic_solda(String link){
		this.link_ofic_solda = new IGRPLink(link);
		return this.link_ofic_solda;
	}
	public IGRPLink setLink_ofic_solda(Report link){
		this.link_ofic_solda = new IGRPLink(link);
		return this.link_ofic_solda;
	}
	
	public void setSala_de_associacao_de_alunos(String sala_de_associacao_de_alunos){
		this.sala_de_associacao_de_alunos = sala_de_associacao_de_alunos;
	}
	public String getSala_de_associacao_de_alunos(){
		return this.sala_de_associacao_de_alunos;
	}
	
	public IGRPLink setLink_sala_alunos(String app,String page,String action){
		this.link_sala_alunos = new IGRPLink(app,page,action);
		return this.link_sala_alunos;
	}
	public IGRPLink getLink_sala_alunos(){
		return this.link_sala_alunos;
	}
	public void setLink_sala_alunos_desc(String link_sala_alunos_desc){
		this.link_sala_alunos_desc = link_sala_alunos_desc;
	}
	public String getLink_sala_alunos_desc(){
		return this.link_sala_alunos_desc;
	}
	public IGRPLink setLink_sala_alunos(String link){
		this.link_sala_alunos = new IGRPLink(link);
		return this.link_sala_alunos;
	}
	public IGRPLink setLink_sala_alunos(Report link){
		this.link_sala_alunos = new IGRPLink(link);
		return this.link_sala_alunos;
	}
	
	public void setSalas_especificas(String salas_especificas){
		this.salas_especificas = salas_especificas;
	}
	public String getSalas_especificas(){
		return this.salas_especificas;
	}
	
	public IGRPLink setLink_sala_espec(String app,String page,String action){
		this.link_sala_espec = new IGRPLink(app,page,action);
		return this.link_sala_espec;
	}
	public IGRPLink getLink_sala_espec(){
		return this.link_sala_espec;
	}
	public void setLink_sala_espec_desc(String link_sala_espec_desc){
		this.link_sala_espec_desc = link_sala_espec_desc;
	}
	public String getLink_sala_espec_desc(){
		return this.link_sala_espec_desc;
	}
	public IGRPLink setLink_sala_espec(String link){
		this.link_sala_espec = new IGRPLink(link);
		return this.link_sala_espec;
	}
	public IGRPLink setLink_sala_espec(Report link){
		this.link_sala_espec = new IGRPLink(link);
		return this.link_sala_espec;
	}
	
	public void setOficina_de_construcao_civil(String oficina_de_construcao_civil){
		this.oficina_de_construcao_civil = oficina_de_construcao_civil;
	}
	public String getOficina_de_construcao_civil(){
		return this.oficina_de_construcao_civil;
	}
	
	public IGRPLink setLink_ofic_cc(String app,String page,String action){
		this.link_ofic_cc = new IGRPLink(app,page,action);
		return this.link_ofic_cc;
	}
	public IGRPLink getLink_ofic_cc(){
		return this.link_ofic_cc;
	}
	public void setLink_ofic_cc_desc(String link_ofic_cc_desc){
		this.link_ofic_cc_desc = link_ofic_cc_desc;
	}
	public String getLink_ofic_cc_desc(){
		return this.link_ofic_cc_desc;
	}
	public IGRPLink setLink_ofic_cc(String link){
		this.link_ofic_cc = new IGRPLink(link);
		return this.link_ofic_cc;
	}
	public IGRPLink setLink_ofic_cc(Report link){
		this.link_ofic_cc = new IGRPLink(link);
		return this.link_ofic_cc;
	}
	
	public void setPavilhao_polivalente_exterior(String pavilhao_polivalente_exterior){
		this.pavilhao_polivalente_exterior = pavilhao_polivalente_exterior;
	}
	public String getPavilhao_polivalente_exterior(){
		return this.pavilhao_polivalente_exterior;
	}
	
	public IGRPLink setLink_pavil_exterior(String app,String page,String action){
		this.link_pavil_exterior = new IGRPLink(app,page,action);
		return this.link_pavil_exterior;
	}
	public IGRPLink getLink_pavil_exterior(){
		return this.link_pavil_exterior;
	}
	public void setLink_pavil_exterior_desc(String link_pavil_exterior_desc){
		this.link_pavil_exterior_desc = link_pavil_exterior_desc;
	}
	public String getLink_pavil_exterior_desc(){
		return this.link_pavil_exterior_desc;
	}
	public IGRPLink setLink_pavil_exterior(String link){
		this.link_pavil_exterior = new IGRPLink(link);
		return this.link_pavil_exterior;
	}
	public IGRPLink setLink_pavil_exterior(Report link){
		this.link_pavil_exterior = new IGRPLink(link);
		return this.link_pavil_exterior;
	}
	
	public void setOutros_espacos(String outros_espacos){
		this.outros_espacos = outros_espacos;
	}
	public String getOutros_espacos(){
		return this.outros_espacos;
	}
	
	public IGRPLink setLink_outros_espacos(String app,String page,String action){
		this.link_outros_espacos = new IGRPLink(app,page,action);
		return this.link_outros_espacos;
	}
	public IGRPLink getLink_outros_espacos(){
		return this.link_outros_espacos;
	}
	public void setLink_outros_espacos_desc(String link_outros_espacos_desc){
		this.link_outros_espacos_desc = link_outros_espacos_desc;
	}
	public String getLink_outros_espacos_desc(){
		return this.link_outros_espacos_desc;
	}
	public IGRPLink setLink_outros_espacos(String link){
		this.link_outros_espacos = new IGRPLink(link);
		return this.link_outros_espacos;
	}
	public IGRPLink setLink_outros_espacos(Report link){
		this.link_outros_espacos = new IGRPLink(link);
		return this.link_outros_espacos;
	}
	
	public void setCampos_de_voleibol(String campos_de_voleibol){
		this.campos_de_voleibol = campos_de_voleibol;
	}
	public String getCampos_de_voleibol(){
		return this.campos_de_voleibol;
	}
	
	public IGRPLink setLink_campo_voley(String app,String page,String action){
		this.link_campo_voley = new IGRPLink(app,page,action);
		return this.link_campo_voley;
	}
	public IGRPLink getLink_campo_voley(){
		return this.link_campo_voley;
	}
	public void setLink_campo_voley_desc(String link_campo_voley_desc){
		this.link_campo_voley_desc = link_campo_voley_desc;
	}
	public String getLink_campo_voley_desc(){
		return this.link_campo_voley_desc;
	}
	public IGRPLink setLink_campo_voley(String link){
		this.link_campo_voley = new IGRPLink(link);
		return this.link_campo_voley;
	}
	public IGRPLink setLink_campo_voley(Report link){
		this.link_campo_voley = new IGRPLink(link);
		return this.link_campo_voley;
	}
	
	public void setCampos_de_futebol(String campos_de_futebol){
		this.campos_de_futebol = campos_de_futebol;
	}
	public String getCampos_de_futebol(){
		return this.campos_de_futebol;
	}
	
	public IGRPLink setLink_campo_fute(String app,String page,String action){
		this.link_campo_fute = new IGRPLink(app,page,action);
		return this.link_campo_fute;
	}
	public IGRPLink getLink_campo_fute(){
		return this.link_campo_fute;
	}
	public void setLink_campo_fute_desc(String link_campo_fute_desc){
		this.link_campo_fute_desc = link_campo_fute_desc;
	}
	public String getLink_campo_fute_desc(){
		return this.link_campo_fute_desc;
	}
	public IGRPLink setLink_campo_fute(String link){
		this.link_campo_fute = new IGRPLink(link);
		return this.link_campo_fute;
	}
	public IGRPLink setLink_campo_fute(Report link){
		this.link_campo_fute = new IGRPLink(link);
		return this.link_campo_fute;
	}
	
	public void setCampos_de_basquetebol(String campos_de_basquetebol){
		this.campos_de_basquetebol = campos_de_basquetebol;
	}
	public String getCampos_de_basquetebol(){
		return this.campos_de_basquetebol;
	}
	
	public IGRPLink setLink_campo_basq(String app,String page,String action){
		this.link_campo_basq = new IGRPLink(app,page,action);
		return this.link_campo_basq;
	}
	public IGRPLink getLink_campo_basq(){
		return this.link_campo_basq;
	}
	public void setLink_campo_basq_desc(String link_campo_basq_desc){
		this.link_campo_basq_desc = link_campo_basq_desc;
	}
	public String getLink_campo_basq_desc(){
		return this.link_campo_basq_desc;
	}
	public IGRPLink setLink_campo_basq(String link){
		this.link_campo_basq = new IGRPLink(link);
		return this.link_campo_basq;
	}
	public IGRPLink setLink_campo_basq(Report link){
		this.link_campo_basq = new IGRPLink(link);
		return this.link_campo_basq;
	}
	
	public void setPavilhao_interior(String pavilhao_interior){
		this.pavilhao_interior = pavilhao_interior;
	}
	public String getPavilhao_interior(){
		return this.pavilhao_interior;
	}
	
	public IGRPLink setLink_pav_interior(String app,String page,String action){
		this.link_pav_interior = new IGRPLink(app,page,action);
		return this.link_pav_interior;
	}
	public IGRPLink getLink_pav_interior(){
		return this.link_pav_interior;
	}
	public void setLink_pav_interior_desc(String link_pav_interior_desc){
		this.link_pav_interior_desc = link_pav_interior_desc;
	}
	public String getLink_pav_interior_desc(){
		return this.link_pav_interior_desc;
	}
	public IGRPLink setLink_pav_interior(String link){
		this.link_pav_interior = new IGRPLink(link);
		return this.link_pav_interior;
	}
	public IGRPLink setLink_pav_interior(Report link){
		this.link_pav_interior = new IGRPLink(link);
		return this.link_pav_interior;
	}
	
	public void setPlaca_desportiva(String placa_desportiva){
		this.placa_desportiva = placa_desportiva;
	}
	public String getPlaca_desportiva(){
		return this.placa_desportiva;
	}
	
	public IGRPLink setLink_placa_desport(String app,String page,String action){
		this.link_placa_desport = new IGRPLink(app,page,action);
		return this.link_placa_desport;
	}
	public IGRPLink getLink_placa_desport(){
		return this.link_placa_desport;
	}
	public void setLink_placa_desport_desc(String link_placa_desport_desc){
		this.link_placa_desport_desc = link_placa_desport_desc;
	}
	public String getLink_placa_desport_desc(){
		return this.link_placa_desport_desc;
	}
	public IGRPLink setLink_placa_desport(String link){
		this.link_placa_desport = new IGRPLink(link);
		return this.link_placa_desport;
	}
	public IGRPLink setLink_placa_desport(Report link){
		this.link_placa_desport = new IGRPLink(link);
		return this.link_placa_desport;
	}
	
	public void setOutras_instalacoes_exteriores(String outras_instalacoes_exteriores){
		this.outras_instalacoes_exteriores = outras_instalacoes_exteriores;
	}
	public String getOutras_instalacoes_exteriores(){
		return this.outras_instalacoes_exteriores;
	}
	
	public IGRPLink setLink_2(String app,String page,String action){
		this.link_2 = new IGRPLink(app,page,action);
		return this.link_2;
	}
	public IGRPLink getLink_2(){
		return this.link_2;
	}
	public void setLink_2_desc(String link_2_desc){
		this.link_2_desc = link_2_desc;
	}
	public String getLink_2_desc(){
		return this.link_2_desc;
	}
	public IGRPLink setLink_2(String link){
		this.link_2 = new IGRPLink(link);
		return this.link_2;
	}
	public IGRPLink setLink_2(Report link){
		this.link_2 = new IGRPLink(link);
		return this.link_2;
	}
	
	public void setSala_de_professores(String sala_de_professores){
		this.sala_de_professores = sala_de_professores;
	}
	public String getSala_de_professores(){
		return this.sala_de_professores;
	}
	
	public IGRPLink setLink_sala_profs(String app,String page,String action){
		this.link_sala_profs = new IGRPLink(app,page,action);
		return this.link_sala_profs;
	}
	public IGRPLink getLink_sala_profs(){
		return this.link_sala_profs;
	}
	public void setLink_sala_profs_desc(String link_sala_profs_desc){
		this.link_sala_profs_desc = link_sala_profs_desc;
	}
	public String getLink_sala_profs_desc(){
		return this.link_sala_profs_desc;
	}
	public IGRPLink setLink_sala_profs(String link){
		this.link_sala_profs = new IGRPLink(link);
		return this.link_sala_profs;
	}
	public IGRPLink setLink_sala_profs(Report link){
		this.link_sala_profs = new IGRPLink(link);
		return this.link_sala_profs;
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
	
	public IGRPLink setLink_refeitorio(String app,String page,String action){
		this.link_refeitorio = new IGRPLink(app,page,action);
		return this.link_refeitorio;
	}
	public IGRPLink getLink_refeitorio(){
		return this.link_refeitorio;
	}
	public void setLink_refeitorio_desc(String link_refeitorio_desc){
		this.link_refeitorio_desc = link_refeitorio_desc;
	}
	public String getLink_refeitorio_desc(){
		return this.link_refeitorio_desc;
	}
	public IGRPLink setLink_refeitorio(String link){
		this.link_refeitorio = new IGRPLink(link);
		return this.link_refeitorio;
	}
	public IGRPLink setLink_refeitorio(Report link){
		this.link_refeitorio = new IGRPLink(link);
		return this.link_refeitorio;
	}
	
	public void setArmazemdispensa(String armazemdispensa){
		this.armazemdispensa = armazemdispensa;
	}
	public String getArmazemdispensa(){
		return this.armazemdispensa;
	}
	
	public IGRPLink setLink_dispensa(String app,String page,String action){
		this.link_dispensa = new IGRPLink(app,page,action);
		return this.link_dispensa;
	}
	public IGRPLink getLink_dispensa(){
		return this.link_dispensa;
	}
	public void setLink_dispensa_desc(String link_dispensa_desc){
		this.link_dispensa_desc = link_dispensa_desc;
	}
	public String getLink_dispensa_desc(){
		return this.link_dispensa_desc;
	}
	public IGRPLink setLink_dispensa(String link){
		this.link_dispensa = new IGRPLink(link);
		return this.link_dispensa;
	}
	public IGRPLink setLink_dispensa(Report link){
		this.link_dispensa = new IGRPLink(link);
		return this.link_dispensa;
	}
	
	public void setAnexosarrecadacao(String anexosarrecadacao){
		this.anexosarrecadacao = anexosarrecadacao;
	}
	public String getAnexosarrecadacao(){
		return this.anexosarrecadacao;
	}
	
	public IGRPLink setLink_anexo(String app,String page,String action){
		this.link_anexo = new IGRPLink(app,page,action);
		return this.link_anexo;
	}
	public IGRPLink getLink_anexo(){
		return this.link_anexo;
	}
	public void setLink_anexo_desc(String link_anexo_desc){
		this.link_anexo_desc = link_anexo_desc;
	}
	public String getLink_anexo_desc(){
		return this.link_anexo_desc;
	}
	public IGRPLink setLink_anexo(String link){
		this.link_anexo = new IGRPLink(link);
		return this.link_anexo;
	}
	public IGRPLink setLink_anexo(Report link){
		this.link_anexo = new IGRPLink(link);
		return this.link_anexo;
	}
	
	public void setEscadas_e_corredores_internos(String escadas_e_corredores_internos){
		this.escadas_e_corredores_internos = escadas_e_corredores_internos;
	}
	public String getEscadas_e_corredores_internos(){
		return this.escadas_e_corredores_internos;
	}
	
	public IGRPLink setLink_escadas(String app,String page,String action){
		this.link_escadas = new IGRPLink(app,page,action);
		return this.link_escadas;
	}
	public IGRPLink getLink_escadas(){
		return this.link_escadas;
	}
	public void setLink_escadas_desc(String link_escadas_desc){
		this.link_escadas_desc = link_escadas_desc;
	}
	public String getLink_escadas_desc(){
		return this.link_escadas_desc;
	}
	public IGRPLink setLink_escadas(String link){
		this.link_escadas = new IGRPLink(link);
		return this.link_escadas;
	}
	public IGRPLink setLink_escadas(Report link){
		this.link_escadas = new IGRPLink(link);
		return this.link_escadas;
	}
	
	public void setCasa_banhos_para_meninos(String casa_banhos_para_meninos){
		this.casa_banhos_para_meninos = casa_banhos_para_meninos;
	}
	public String getCasa_banhos_para_meninos(){
		return this.casa_banhos_para_meninos;
	}
	
	public IGRPLink setLink_wc_meninos(String app,String page,String action){
		this.link_wc_meninos = new IGRPLink(app,page,action);
		return this.link_wc_meninos;
	}
	public IGRPLink getLink_wc_meninos(){
		return this.link_wc_meninos;
	}
	public void setLink_wc_meninos_desc(String link_wc_meninos_desc){
		this.link_wc_meninos_desc = link_wc_meninos_desc;
	}
	public String getLink_wc_meninos_desc(){
		return this.link_wc_meninos_desc;
	}
	public IGRPLink setLink_wc_meninos(String link){
		this.link_wc_meninos = new IGRPLink(link);
		return this.link_wc_meninos;
	}
	public IGRPLink setLink_wc_meninos(Report link){
		this.link_wc_meninos = new IGRPLink(link);
		return this.link_wc_meninos;
	}
	
	public void setCasa_banhos_para_meninas(String casa_banhos_para_meninas){
		this.casa_banhos_para_meninas = casa_banhos_para_meninas;
	}
	public String getCasa_banhos_para_meninas(){
		return this.casa_banhos_para_meninas;
	}
	
	public IGRPLink setLink_wc_meninas(String app,String page,String action){
		this.link_wc_meninas = new IGRPLink(app,page,action);
		return this.link_wc_meninas;
	}
	public IGRPLink getLink_wc_meninas(){
		return this.link_wc_meninas;
	}
	public void setLink_wc_meninas_desc(String link_wc_meninas_desc){
		this.link_wc_meninas_desc = link_wc_meninas_desc;
	}
	public String getLink_wc_meninas_desc(){
		return this.link_wc_meninas_desc;
	}
	public IGRPLink setLink_wc_meninas(String link){
		this.link_wc_meninas = new IGRPLink(link);
		return this.link_wc_meninas;
	}
	public IGRPLink setLink_wc_meninas(Report link){
		this.link_wc_meninas = new IGRPLink(link);
		return this.link_wc_meninas;
	}
	
	public void setCasa_banhos_para_criancas_com_deficiencias(String casa_banhos_para_criancas_com_deficiencias){
		this.casa_banhos_para_criancas_com_deficiencias = casa_banhos_para_criancas_com_deficiencias;
	}
	public String getCasa_banhos_para_criancas_com_deficiencias(){
		return this.casa_banhos_para_criancas_com_deficiencias;
	}
	
	public IGRPLink setLink_wc_defic(String app,String page,String action){
		this.link_wc_defic = new IGRPLink(app,page,action);
		return this.link_wc_defic;
	}
	public IGRPLink getLink_wc_defic(){
		return this.link_wc_defic;
	}
	public void setLink_wc_defic_desc(String link_wc_defic_desc){
		this.link_wc_defic_desc = link_wc_defic_desc;
	}
	public String getLink_wc_defic_desc(){
		return this.link_wc_defic_desc;
	}
	public IGRPLink setLink_wc_defic(String link){
		this.link_wc_defic = new IGRPLink(link);
		return this.link_wc_defic;
	}
	public IGRPLink setLink_wc_defic(Report link){
		this.link_wc_defic = new IGRPLink(link);
		return this.link_wc_defic;
	}
	
	public void setCasa_de_banho_para_professores(String casa_de_banho_para_professores){
		this.casa_de_banho_para_professores = casa_de_banho_para_professores;
	}
	public String getCasa_de_banho_para_professores(){
		return this.casa_de_banho_para_professores;
	}
	
	public IGRPLink setLink_wc_profs(String app,String page,String action){
		this.link_wc_profs = new IGRPLink(app,page,action);
		return this.link_wc_profs;
	}
	public IGRPLink getLink_wc_profs(){
		return this.link_wc_profs;
	}
	public void setLink_wc_profs_desc(String link_wc_profs_desc){
		this.link_wc_profs_desc = link_wc_profs_desc;
	}
	public String getLink_wc_profs_desc(){
		return this.link_wc_profs_desc;
	}
	public IGRPLink setLink_wc_profs(String link){
		this.link_wc_profs = new IGRPLink(link);
		return this.link_wc_profs;
	}
	public IGRPLink setLink_wc_profs(Report link){
		this.link_wc_profs = new IGRPLink(link);
		return this.link_wc_profs;
	}
	
	public void setCasa_de_banho_para_professoras(String casa_de_banho_para_professoras){
		this.casa_de_banho_para_professoras = casa_de_banho_para_professoras;
	}
	public String getCasa_de_banho_para_professoras(){
		return this.casa_de_banho_para_professoras;
	}
	
	public IGRPLink setLink_wc_profsra(String app,String page,String action){
		this.link_wc_profsra = new IGRPLink(app,page,action);
		return this.link_wc_profsra;
	}
	public IGRPLink getLink_wc_profsra(){
		return this.link_wc_profsra;
	}
	public void setLink_wc_profsra_desc(String link_wc_profsra_desc){
		this.link_wc_profsra_desc = link_wc_profsra_desc;
	}
	public String getLink_wc_profsra_desc(){
		return this.link_wc_profsra_desc;
	}
	public IGRPLink setLink_wc_profsra(String link){
		this.link_wc_profsra = new IGRPLink(link);
		return this.link_wc_profsra;
	}
	public IGRPLink setLink_wc_profsra(Report link){
		this.link_wc_profsra = new IGRPLink(link);
		return this.link_wc_profsra;
	}
	
	public void setCantina(String cantina){
		this.cantina = cantina;
	}
	public String getCantina(){
		return this.cantina;
	}
	
	public IGRPLink setLink_cantina(String app,String page,String action){
		this.link_cantina = new IGRPLink(app,page,action);
		return this.link_cantina;
	}
	public IGRPLink getLink_cantina(){
		return this.link_cantina;
	}
	public void setLink_cantina_desc(String link_cantina_desc){
		this.link_cantina_desc = link_cantina_desc;
	}
	public String getLink_cantina_desc(){
		return this.link_cantina_desc;
	}
	public IGRPLink setLink_cantina(String link){
		this.link_cantina = new IGRPLink(link);
		return this.link_cantina;
	}
	public IGRPLink setLink_cantina(Report link){
		this.link_cantina = new IGRPLink(link);
		return this.link_cantina;
	}
	
	public void setCozinha(String cozinha){
		this.cozinha = cozinha;
	}
	public String getCozinha(){
		return this.cozinha;
	}
	
	public IGRPLink setLink_cozinha(String app,String page,String action){
		this.link_cozinha = new IGRPLink(app,page,action);
		return this.link_cozinha;
	}
	public IGRPLink getLink_cozinha(){
		return this.link_cozinha;
	}
	public void setLink_cozinha_desc(String link_cozinha_desc){
		this.link_cozinha_desc = link_cozinha_desc;
	}
	public String getLink_cozinha_desc(){
		return this.link_cozinha_desc;
	}
	public IGRPLink setLink_cozinha(String link){
		this.link_cozinha = new IGRPLink(link);
		return this.link_cozinha;
	}
	public IGRPLink setLink_cozinha(Report link){
		this.link_cozinha = new IGRPLink(link);
		return this.link_cozinha;
	}
	
	public void setAreas_diversas(String areas_diversas){
		this.areas_diversas = areas_diversas;
	}
	public String getAreas_diversas(){
		return this.areas_diversas;
	}
	
	public void setRampa_de_acesso(String rampa_de_acesso){
		this.rampa_de_acesso = rampa_de_acesso;
	}
	public String getRampa_de_acesso(){
		return this.rampa_de_acesso;
	}
	
	public IGRPLink setLink_rampa(String app,String page,String action){
		this.link_rampa = new IGRPLink(app,page,action);
		return this.link_rampa;
	}
	public IGRPLink getLink_rampa(){
		return this.link_rampa;
	}
	public void setLink_rampa_desc(String link_rampa_desc){
		this.link_rampa_desc = link_rampa_desc;
	}
	public String getLink_rampa_desc(){
		return this.link_rampa_desc;
	}
	public IGRPLink setLink_rampa(String link){
		this.link_rampa = new IGRPLink(link);
		return this.link_rampa;
	}
	public IGRPLink setLink_rampa(Report link){
		this.link_rampa = new IGRPLink(link);
		return this.link_rampa;
	}
	
	public void setAcesso_automovel(String acesso_automovel){
		this.acesso_automovel = acesso_automovel;
	}
	public String getAcesso_automovel(){
		return this.acesso_automovel;
	}
	
	public IGRPLink setLink_auto(String app,String page,String action){
		this.link_auto = new IGRPLink(app,page,action);
		return this.link_auto;
	}
	public IGRPLink getLink_auto(){
		return this.link_auto;
	}
	public void setLink_auto_desc(String link_auto_desc){
		this.link_auto_desc = link_auto_desc;
	}
	public String getLink_auto_desc(){
		return this.link_auto_desc;
	}
	public IGRPLink setLink_auto(String link){
		this.link_auto = new IGRPLink(link);
		return this.link_auto;
	}
	public IGRPLink setLink_auto(Report link){
		this.link_auto = new IGRPLink(link);
		return this.link_auto;
	}
	
	public void setAcesso_pedonal(String acesso_pedonal){
		this.acesso_pedonal = acesso_pedonal;
	}
	public String getAcesso_pedonal(){
		return this.acesso_pedonal;
	}
	
	public IGRPLink setLink_pedonal(String app,String page,String action){
		this.link_pedonal = new IGRPLink(app,page,action);
		return this.link_pedonal;
	}
	public IGRPLink getLink_pedonal(){
		return this.link_pedonal;
	}
	public void setLink_pedonal_desc(String link_pedonal_desc){
		this.link_pedonal_desc = link_pedonal_desc;
	}
	public String getLink_pedonal_desc(){
		return this.link_pedonal_desc;
	}
	public IGRPLink setLink_pedonal(String link){
		this.link_pedonal = new IGRPLink(link);
		return this.link_pedonal;
	}
	public IGRPLink setLink_pedonal(Report link){
		this.link_pedonal = new IGRPLink(link);
		return this.link_pedonal;
	}
	
	public void setSistema_de_rega(String sistema_de_rega){
		this.sistema_de_rega = sistema_de_rega;
	}
	public String getSistema_de_rega(){
		return this.sistema_de_rega;
	}
	
	public IGRPLink setRega(String app,String page,String action){
		this.rega = new IGRPLink(app,page,action);
		return this.rega;
	}
	public IGRPLink getRega(){
		return this.rega;
	}
	public void setRega_desc(String rega_desc){
		this.rega_desc = rega_desc;
	}
	public String getRega_desc(){
		return this.rega_desc;
	}
	public IGRPLink setRega(String link){
		this.rega = new IGRPLink(link);
		return this.rega;
	}
	public IGRPLink setRega(Report link){
		this.rega = new IGRPLink(link);
		return this.rega;
	}
	
	public void setMuro_de_vedacao(String muro_de_vedacao){
		this.muro_de_vedacao = muro_de_vedacao;
	}
	public String getMuro_de_vedacao(){
		return this.muro_de_vedacao;
	}
	
	public IGRPLink setLink_vedacao(String app,String page,String action){
		this.link_vedacao = new IGRPLink(app,page,action);
		return this.link_vedacao;
	}
	public IGRPLink getLink_vedacao(){
		return this.link_vedacao;
	}
	public void setLink_vedacao_desc(String link_vedacao_desc){
		this.link_vedacao_desc = link_vedacao_desc;
	}
	public String getLink_vedacao_desc(){
		return this.link_vedacao_desc;
	}
	public IGRPLink setLink_vedacao(String link){
		this.link_vedacao = new IGRPLink(link);
		return this.link_vedacao;
	}
	public IGRPLink setLink_vedacao(Report link){
		this.link_vedacao = new IGRPLink(link);
		return this.link_vedacao;
	}
	
	public void setPatio_da_escola(String patio_da_escola){
		this.patio_da_escola = patio_da_escola;
	}
	public String getPatio_da_escola(){
		return this.patio_da_escola;
	}
	
	public IGRPLink setLink_patio(String app,String page,String action){
		this.link_patio = new IGRPLink(app,page,action);
		return this.link_patio;
	}
	public IGRPLink getLink_patio(){
		return this.link_patio;
	}
	public void setLink_patio_desc(String link_patio_desc){
		this.link_patio_desc = link_patio_desc;
	}
	public String getLink_patio_desc(){
		return this.link_patio_desc;
	}
	public IGRPLink setLink_patio(String link){
		this.link_patio = new IGRPLink(link);
		return this.link_patio;
	}
	public IGRPLink setLink_patio(Report link){
		this.link_patio = new IGRPLink(link);
		return this.link_patio;
	}
	
	public void setCanteiros_floridos(String canteiros_floridos){
		this.canteiros_floridos = canteiros_floridos;
	}
	public String getCanteiros_floridos(){
		return this.canteiros_floridos;
	}
	
	public IGRPLink setLink_canteiros(String app,String page,String action){
		this.link_canteiros = new IGRPLink(app,page,action);
		return this.link_canteiros;
	}
	public IGRPLink getLink_canteiros(){
		return this.link_canteiros;
	}
	public void setLink_canteiros_desc(String link_canteiros_desc){
		this.link_canteiros_desc = link_canteiros_desc;
	}
	public String getLink_canteiros_desc(){
		return this.link_canteiros_desc;
	}
	public IGRPLink setLink_canteiros(String link){
		this.link_canteiros = new IGRPLink(link);
		return this.link_canteiros;
	}
	public IGRPLink setLink_canteiros(Report link){
		this.link_canteiros = new IGRPLink(link);
		return this.link_canteiros;
	}
	
	public void setParque_automovel(String parque_automovel){
		this.parque_automovel = parque_automovel;
	}
	public String getParque_automovel(){
		return this.parque_automovel;
	}
	
	public IGRPLink setLink_parque_auto(String app,String page,String action){
		this.link_parque_auto = new IGRPLink(app,page,action);
		return this.link_parque_auto;
	}
	public IGRPLink getLink_parque_auto(){
		return this.link_parque_auto;
	}
	public void setLink_parque_auto_desc(String link_parque_auto_desc){
		this.link_parque_auto_desc = link_parque_auto_desc;
	}
	public String getLink_parque_auto_desc(){
		return this.link_parque_auto_desc;
	}
	public IGRPLink setLink_parque_auto(String link){
		this.link_parque_auto = new IGRPLink(link);
		return this.link_parque_auto;
	}
	public IGRPLink setLink_parque_auto(Report link){
		this.link_parque_auto = new IGRPLink(link);
		return this.link_parque_auto;
	}
	
	public void setSaneamento_basico(String saneamento_basico){
		this.saneamento_basico = saneamento_basico;
	}
	public String getSaneamento_basico(){
		return this.saneamento_basico;
	}
	
	public IGRPLink setLink_seneamento(String app,String page,String action){
		this.link_seneamento = new IGRPLink(app,page,action);
		return this.link_seneamento;
	}
	public IGRPLink getLink_seneamento(){
		return this.link_seneamento;
	}
	public void setLink_seneamento_desc(String link_seneamento_desc){
		this.link_seneamento_desc = link_seneamento_desc;
	}
	public String getLink_seneamento_desc(){
		return this.link_seneamento_desc;
	}
	public IGRPLink setLink_seneamento(String link){
		this.link_seneamento = new IGRPLink(link);
		return this.link_seneamento;
	}
	public IGRPLink setLink_seneamento(Report link){
		this.link_seneamento = new IGRPLink(link);
		return this.link_seneamento;
	}



}
