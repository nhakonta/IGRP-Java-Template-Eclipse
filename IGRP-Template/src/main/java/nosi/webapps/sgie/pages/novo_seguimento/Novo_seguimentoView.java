package nosi.webapps.sgie.pages.novo_seguimento;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.webapp.Core;

public class Novo_seguimentoView extends View {

	public Field areas_adminstrativas_e_didaticas;
	public Field direcao;
	public Field link_1;
	public Field secretaria;
	public Field link_secretaria;
	public Field biblioteca;
	public Field link_biblioteca;
	public Field ginasio;
	public Field link_ginasio;
	public Field laboratorio_informatico;
	public Field link_lab_info;
	public Field laboratorio_biologia;
	public Field link_11;
	public Field laboratorio_quimicafisica;
	public Field link_lab_quim;
	public Field sala_multimedia;
	public Field link_multime;
	public Field reprografia;
	public Field link_reprografia;
	public Field club_ecologico;
	public Field link_club_eco;
	public Field sala_de_leitura;
	public Field link_sala_leitura;
	public Field oficina_de_artes_graficas;
	public Field link_oficina_agraf;
	public Field centros_de_recursos;
	public Field link_centro_rec;
	public Field laboratorio_de_lingua_portuguesa;
	public Field link_lab_pt;
	public Field laboratorio_de_lingua_inglesa;
	public Field link_lab_ing;
	public Field laboratorio_de_lingua_francesa;
	public Field link_lab_fran;
	public Field oficina_de_eletrotecnica_eletronica;
	public Field link_ofic_eletro;
	public Field oficina_de_informatica;
	public Field link_ofic_inform;
	public Field papelaria;
	public Field link_papelaria;
	public Field oficina_de_mecanica;
	public Field link_ofic_mec;
	public Field anfiteatroauditorio;
	public Field link_anfiteatro;
	public Field oficina_de_soldaduraconstrucao_metalica;
	public Field link_ofic_solda;
	public Field sala_de_associacao_de_alunos;
	public Field link_sala_alunos;
	public Field salas_especificas;
	public Field link_sala_espec;
	public Field oficina_de_construcao_civil;
	public Field link_ofic_cc;
	public Field pavilhao_polivalente_exterior;
	public Field link_pavil_exterior;
	public Field outros_espacos;
	public Field link_outros_espacos;
	public Field campos_de_voleibol;
	public Field link_campo_voley;
	public Field campos_de_futebol;
	public Field link_campo_fute;
	public Field campos_de_basquetebol;
	public Field link_campo_basq;
	public Field pavilhao_interior;
	public Field link_pav_interior;
	public Field placa_desportiva;
	public Field link_placa_desport;
	public Field outras_instalacoes_exteriores;
	public Field link_2;
	public Field sala_de_professores;
	public Field link_sala_profs;
	public Field areas_de_servico;
	public Field refeitorio;
	public Field link_refeitorio;
	public Field armazemdispensa;
	public Field link_dispensa;
	public Field anexosarrecadacao;
	public Field link_anexo;
	public Field escadas_e_corredores_internos;
	public Field link_escadas;
	public Field casa_banhos_para_meninos;
	public Field link_wc_meninos;
	public Field casa_banhos_para_meninas;
	public Field link_wc_meninas;
	public Field casa_banhos_para_criancas_com_deficiencias;
	public Field link_wc_defic;
	public Field casa_de_banho_para_professores;
	public Field link_wc_profs;
	public Field casa_de_banho_para_professoras;
	public Field link_wc_profsra;
	public Field cantina;
	public Field link_cantina;
	public Field cozinha;
	public Field link_cozinha;
	public Field areas_diversas;
	public Field rampa_de_acesso;
	public Field link_rampa;
	public Field acesso_automovel;
	public Field link_auto;
	public Field acesso_pedonal;
	public Field link_pedonal;
	public Field sistema_de_rega;
	public Field rega;
	public Field muro_de_vedacao;
	public Field link_vedacao;
	public Field patio_da_escola;
	public Field link_patio;
	public Field canteiros_floridos;
	public Field link_canteiros;
	public Field parque_automovel;
	public Field link_parque_auto;
	public Field saneamento_basico;
	public Field link_seneamento;
	public IGRPForm form_seguimento;

	public IGRPButton btn_guardar_seguimento;

	public Novo_seguimentoView(){

		this.setPageTitle("novo seguimento");
			
		form_seguimento = new IGRPForm("form_seguimento","");

		areas_adminstrativas_e_didaticas = new SeparatorField(model,"areas_adminstrativas_e_didaticas");
		areas_adminstrativas_e_didaticas.setLabel(gt("Áreas adminstrativas e didáticas"));
		areas_adminstrativas_e_didaticas.propertie().add("name","p_areas_adminstrativas_e_didaticas").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		direcao = new ListField(model,"direcao");
		direcao.setLabel(gt("Direção"));
		direcao.propertie().add("name","p_direcao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_1 = new LinkField(model,"link_1");
		link_1.setLabel(gt(""));
		link_1.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_1.propertie().add("name","p_link_1").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-paste").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","true");
		
		secretaria = new ListField(model,"secretaria");
		secretaria.setLabel(gt("Secretaria"));
		secretaria.propertie().add("name","p_secretaria").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_secretaria = new LinkField(model,"link_secretaria");
		link_secretaria.setLabel(gt(""));
		link_secretaria.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_secretaria.propertie().add("name","p_link_secretaria").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		biblioteca = new ListField(model,"biblioteca");
		biblioteca.setLabel(gt("Biblioteca"));
		biblioteca.propertie().add("name","p_biblioteca").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_biblioteca = new LinkField(model,"link_biblioteca");
		link_biblioteca.setLabel(gt(""));
		link_biblioteca.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_biblioteca.propertie().add("name","p_link_biblioteca").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		ginasio = new ListField(model,"ginasio");
		ginasio.setLabel(gt("Ginásio"));
		ginasio.propertie().add("name","p_ginasio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_ginasio = new LinkField(model,"link_ginasio");
		link_ginasio.setLabel(gt(""));
		link_ginasio.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_ginasio.propertie().add("name","p_link_ginasio").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_informatico = new ListField(model,"laboratorio_informatico");
		laboratorio_informatico.setLabel(gt("Laboratório informático"));
		laboratorio_informatico.propertie().add("name","p_laboratorio_informatico").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_lab_info = new LinkField(model,"link_lab_info");
		link_lab_info.setLabel(gt(""));
		link_lab_info.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_lab_info.propertie().add("name","p_link_lab_info").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_biologia = new ListField(model,"laboratorio_biologia");
		laboratorio_biologia.setLabel(gt("Laboratório Biologia"));
		laboratorio_biologia.propertie().add("name","p_laboratorio_biologia").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_11 = new LinkField(model,"link_11");
		link_11.setLabel(gt(""));
		link_11.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_11.propertie().add("name","p_link_11").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_quimicafisica = new ListField(model,"laboratorio_quimicafisica");
		laboratorio_quimicafisica.setLabel(gt("Laboratório Química/Física"));
		laboratorio_quimicafisica.propertie().add("name","p_laboratorio_quimicafisica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_lab_quim = new LinkField(model,"link_lab_quim");
		link_lab_quim.setLabel(gt(""));
		link_lab_quim.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_lab_quim.propertie().add("name","p_link_lab_quim").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_multimedia = new ListField(model,"sala_multimedia");
		sala_multimedia.setLabel(gt("Sala multimédia"));
		sala_multimedia.propertie().add("name","p_sala_multimedia").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_multime = new LinkField(model,"link_multime");
		link_multime.setLabel(gt(""));
		link_multime.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_multime.propertie().add("name","p_link_multime").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		reprografia = new ListField(model,"reprografia");
		reprografia.setLabel(gt("Reprografia"));
		reprografia.propertie().add("name","p_reprografia").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_reprografia = new LinkField(model,"link_reprografia");
		link_reprografia.setLabel(gt(""));
		link_reprografia.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_reprografia.propertie().add("name","p_link_reprografia").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		club_ecologico = new ListField(model,"club_ecologico");
		club_ecologico.setLabel(gt("Club ecológico"));
		club_ecologico.propertie().add("name","p_club_ecologico").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_club_eco = new LinkField(model,"link_club_eco");
		link_club_eco.setLabel(gt(""));
		link_club_eco.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_club_eco.propertie().add("name","p_link_club_eco").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_leitura = new ListField(model,"sala_de_leitura");
		sala_de_leitura.setLabel(gt("Sala de leitura"));
		sala_de_leitura.propertie().add("name","p_sala_de_leitura").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_sala_leitura = new LinkField(model,"link_sala_leitura");
		link_sala_leitura.setLabel(gt(""));
		link_sala_leitura.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_sala_leitura.propertie().add("name","p_link_sala_leitura").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_artes_graficas = new ListField(model,"oficina_de_artes_graficas");
		oficina_de_artes_graficas.setLabel(gt("Oficina de artes gráficas"));
		oficina_de_artes_graficas.propertie().add("name","p_oficina_de_artes_graficas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_oficina_agraf = new LinkField(model,"link_oficina_agraf");
		link_oficina_agraf.setLabel(gt(""));
		link_oficina_agraf.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_oficina_agraf.propertie().add("name","p_link_oficina_agraf").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		centros_de_recursos = new ListField(model,"centros_de_recursos");
		centros_de_recursos.setLabel(gt("Centros de recursos"));
		centros_de_recursos.propertie().add("name","p_centros_de_recursos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_centro_rec = new LinkField(model,"link_centro_rec");
		link_centro_rec.setLabel(gt(""));
		link_centro_rec.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_centro_rec.propertie().add("name","p_link_centro_rec").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_de_lingua_portuguesa = new ListField(model,"laboratorio_de_lingua_portuguesa");
		laboratorio_de_lingua_portuguesa.setLabel(gt("Laboratório de língua Portuguesa"));
		laboratorio_de_lingua_portuguesa.propertie().add("name","p_laboratorio_de_lingua_portuguesa").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_lab_pt = new LinkField(model,"link_lab_pt");
		link_lab_pt.setLabel(gt(""));
		link_lab_pt.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_lab_pt.propertie().add("name","p_link_lab_pt").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_de_lingua_inglesa = new ListField(model,"laboratorio_de_lingua_inglesa");
		laboratorio_de_lingua_inglesa.setLabel(gt("Laboratório de língua Inglesa"));
		laboratorio_de_lingua_inglesa.propertie().add("name","p_laboratorio_de_lingua_inglesa").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_lab_ing = new LinkField(model,"link_lab_ing");
		link_lab_ing.setLabel(gt(""));
		link_lab_ing.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_lab_ing.propertie().add("name","p_link_lab_ing").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_de_lingua_francesa = new ListField(model,"laboratorio_de_lingua_francesa");
		laboratorio_de_lingua_francesa.setLabel(gt("Laboratório de língua Francesa"));
		laboratorio_de_lingua_francesa.propertie().add("name","p_laboratorio_de_lingua_francesa").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_lab_fran = new LinkField(model,"link_lab_fran");
		link_lab_fran.setLabel(gt(""));
		link_lab_fran.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_lab_fran.propertie().add("name","p_link_lab_fran").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_eletrotecnica_eletronica = new ListField(model,"oficina_de_eletrotecnica_eletronica");
		oficina_de_eletrotecnica_eletronica.setLabel(gt("Oficina de eletrotécnica /eletrónica"));
		oficina_de_eletrotecnica_eletronica.propertie().add("name","p_oficina_de_eletrotecnica_eletronica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_ofic_eletro = new LinkField(model,"link_ofic_eletro");
		link_ofic_eletro.setLabel(gt(""));
		link_ofic_eletro.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_ofic_eletro.propertie().add("name","p_link_ofic_eletro").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_informatica = new ListField(model,"oficina_de_informatica");
		oficina_de_informatica.setLabel(gt("Oficina de informática"));
		oficina_de_informatica.propertie().add("name","p_oficina_de_informatica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_ofic_inform = new LinkField(model,"link_ofic_inform");
		link_ofic_inform.setLabel(gt(""));
		link_ofic_inform.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_ofic_inform.propertie().add("name","p_link_ofic_inform").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		papelaria = new ListField(model,"papelaria");
		papelaria.setLabel(gt("Papelaria"));
		papelaria.propertie().add("name","p_papelaria").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_papelaria = new LinkField(model,"link_papelaria");
		link_papelaria.setLabel(gt(""));
		link_papelaria.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_papelaria.propertie().add("name","p_link_papelaria").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_mecanica = new ListField(model,"oficina_de_mecanica");
		oficina_de_mecanica.setLabel(gt("Oficina de mecânica"));
		oficina_de_mecanica.propertie().add("name","p_oficina_de_mecanica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_ofic_mec = new LinkField(model,"link_ofic_mec");
		link_ofic_mec.setLabel(gt(""));
		link_ofic_mec.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_ofic_mec.propertie().add("name","p_link_ofic_mec").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		anfiteatroauditorio = new ListField(model,"anfiteatroauditorio");
		anfiteatroauditorio.setLabel(gt("Anfiteatro/Auditório"));
		anfiteatroauditorio.propertie().add("name","p_anfiteatroauditorio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_anfiteatro = new LinkField(model,"link_anfiteatro");
		link_anfiteatro.setLabel(gt(""));
		link_anfiteatro.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_anfiteatro.propertie().add("name","p_link_anfiteatro").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_soldaduraconstrucao_metalica = new ListField(model,"oficina_de_soldaduraconstrucao_metalica");
		oficina_de_soldaduraconstrucao_metalica.setLabel(gt("Oficina de soldadura/construção Metálica"));
		oficina_de_soldaduraconstrucao_metalica.propertie().add("name","p_oficina_de_soldaduraconstrucao_metalica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_ofic_solda = new LinkField(model,"link_ofic_solda");
		link_ofic_solda.setLabel(gt(""));
		link_ofic_solda.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_ofic_solda.propertie().add("name","p_link_ofic_solda").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_associacao_de_alunos = new ListField(model,"sala_de_associacao_de_alunos");
		sala_de_associacao_de_alunos.setLabel(gt("Sala de associação de alunos"));
		sala_de_associacao_de_alunos.propertie().add("name","p_sala_de_associacao_de_alunos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_sala_alunos = new LinkField(model,"link_sala_alunos");
		link_sala_alunos.setLabel(gt(""));
		link_sala_alunos.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_sala_alunos.propertie().add("name","p_link_sala_alunos").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		salas_especificas = new ListField(model,"salas_especificas");
		salas_especificas.setLabel(gt("Salas específicas"));
		salas_especificas.propertie().add("name","p_salas_especificas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_sala_espec = new LinkField(model,"link_sala_espec");
		link_sala_espec.setLabel(gt(""));
		link_sala_espec.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_sala_espec.propertie().add("name","p_link_sala_espec").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_construcao_civil = new ListField(model,"oficina_de_construcao_civil");
		oficina_de_construcao_civil.setLabel(gt("Oficina de construção civil"));
		oficina_de_construcao_civil.propertie().add("name","p_oficina_de_construcao_civil").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_ofic_cc = new LinkField(model,"link_ofic_cc");
		link_ofic_cc.setLabel(gt(""));
		link_ofic_cc.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_ofic_cc.propertie().add("name","p_link_ofic_cc").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		pavilhao_polivalente_exterior = new ListField(model,"pavilhao_polivalente_exterior");
		pavilhao_polivalente_exterior.setLabel(gt("Pavilhão Polivalente Exterior"));
		pavilhao_polivalente_exterior.propertie().add("name","p_pavilhao_polivalente_exterior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_pavil_exterior = new LinkField(model,"link_pavil_exterior");
		link_pavil_exterior.setLabel(gt(""));
		link_pavil_exterior.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_pavil_exterior.propertie().add("name","p_link_pavil_exterior").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		outros_espacos = new ListField(model,"outros_espacos");
		outros_espacos.setLabel(gt("Outros espaços"));
		outros_espacos.propertie().add("name","p_outros_espacos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_outros_espacos = new LinkField(model,"link_outros_espacos");
		link_outros_espacos.setLabel(gt(""));
		link_outros_espacos.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_outros_espacos.propertie().add("name","p_link_outros_espacos").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		campos_de_voleibol = new ListField(model,"campos_de_voleibol");
		campos_de_voleibol.setLabel(gt("Campos de Voleibol"));
		campos_de_voleibol.propertie().add("name","p_campos_de_voleibol").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_campo_voley = new LinkField(model,"link_campo_voley");
		link_campo_voley.setLabel(gt(""));
		link_campo_voley.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_campos","index"));

									link_campo_voley.propertie().add("name","p_link_campo_voley").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		campos_de_futebol = new ListField(model,"campos_de_futebol");
		campos_de_futebol.setLabel(gt("Campos de Futebol"));
		campos_de_futebol.propertie().add("name","p_campos_de_futebol").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_campo_fute = new LinkField(model,"link_campo_fute");
		link_campo_fute.setLabel(gt(""));
		link_campo_fute.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_campos","index"));

									link_campo_fute.propertie().add("name","p_link_campo_fute").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		campos_de_basquetebol = new ListField(model,"campos_de_basquetebol");
		campos_de_basquetebol.setLabel(gt("Campos de Basquetebol"));
		campos_de_basquetebol.propertie().add("name","p_campos_de_basquetebol").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_campo_basq = new LinkField(model,"link_campo_basq");
		link_campo_basq.setLabel(gt(""));
		link_campo_basq.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_campos","index"));

									link_campo_basq.propertie().add("name","p_link_campo_basq").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		pavilhao_interior = new ListField(model,"pavilhao_interior");
		pavilhao_interior.setLabel(gt("Pavilhão Interior"));
		pavilhao_interior.propertie().add("name","p_pavilhao_interior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_pav_interior = new LinkField(model,"link_pav_interior");
		link_pav_interior.setLabel(gt(""));
		link_pav_interior.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_pav_interior.propertie().add("name","p_link_pav_interior").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		placa_desportiva = new ListField(model,"placa_desportiva");
		placa_desportiva.setLabel(gt("Placa desportiva"));
		placa_desportiva.propertie().add("name","p_placa_desportiva").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_placa_desport = new LinkField(model,"link_placa_desport");
		link_placa_desport.setLabel(gt(""));
		link_placa_desport.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_campos","index"));

									link_placa_desport.propertie().add("name","p_link_placa_desport").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		outras_instalacoes_exteriores = new ListField(model,"outras_instalacoes_exteriores");
		outras_instalacoes_exteriores.setLabel(gt("Outras Instalações Exteriores"));
		outras_instalacoes_exteriores.propertie().add("name","p_outras_instalacoes_exteriores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_2 = new LinkField(model,"link_2");
		link_2.setLabel(gt(""));
		link_2.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_2.propertie().add("name","p_link_2").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_professores = new ListField(model,"sala_de_professores");
		sala_de_professores.setLabel(gt("Sala de professores"));
		sala_de_professores.propertie().add("name","p_sala_de_professores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_sala_profs = new LinkField(model,"link_sala_profs");
		link_sala_profs.setLabel(gt(""));
		link_sala_profs.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_sala_profs.propertie().add("name","p_link_sala_profs").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		areas_de_servico = new SeparatorField(model,"areas_de_servico");
		areas_de_servico.setLabel(gt("Áreas de serviço"));
		areas_de_servico.propertie().add("name","p_areas_de_servico").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		refeitorio = new ListField(model,"refeitorio");
		refeitorio.setLabel(gt("Refeitório"));
		refeitorio.propertie().add("name","p_refeitorio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_refeitorio = new LinkField(model,"link_refeitorio");
		link_refeitorio.setLabel(gt(""));
		link_refeitorio.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_refeitorio.propertie().add("name","p_link_refeitorio").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		armazemdispensa = new ListField(model,"armazemdispensa");
		armazemdispensa.setLabel(gt("Armazém/Dispensa"));
		armazemdispensa.propertie().add("name","p_armazemdispensa").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_dispensa = new LinkField(model,"link_dispensa");
		link_dispensa.setLabel(gt(""));
		link_dispensa.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_dispensa.propertie().add("name","p_link_dispensa").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		anexosarrecadacao = new ListField(model,"anexosarrecadacao");
		anexosarrecadacao.setLabel(gt("Anexos/Arrecadação"));
		anexosarrecadacao.propertie().add("name","p_anexosarrecadacao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_anexo = new LinkField(model,"link_anexo");
		link_anexo.setLabel(gt(""));
		link_anexo.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_anexo.propertie().add("name","p_link_anexo").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		escadas_e_corredores_internos = new ListField(model,"escadas_e_corredores_internos");
		escadas_e_corredores_internos.setLabel(gt("Escadas e corredores internos"));
		escadas_e_corredores_internos.propertie().add("name","p_escadas_e_corredores_internos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_escadas = new LinkField(model,"link_escadas");
		link_escadas.setLabel(gt(""));
		link_escadas.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_escadas","index"));

									link_escadas.propertie().add("name","p_link_escadas").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_banhos_para_meninos = new ListField(model,"casa_banhos_para_meninos");
		casa_banhos_para_meninos.setLabel(gt("Casa banhos para Meninos"));
		casa_banhos_para_meninos.propertie().add("name","p_casa_banhos_para_meninos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_wc_meninos = new LinkField(model,"link_wc_meninos");
		link_wc_meninos.setLabel(gt(""));
		link_wc_meninos.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_wc","index"));

									link_wc_meninos.propertie().add("name","p_link_wc_meninos").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_banhos_para_meninas = new ListField(model,"casa_banhos_para_meninas");
		casa_banhos_para_meninas.setLabel(gt("Casa banhos para Meninas"));
		casa_banhos_para_meninas.propertie().add("name","p_casa_banhos_para_meninas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_wc_meninas = new LinkField(model,"link_wc_meninas");
		link_wc_meninas.setLabel(gt(""));
		link_wc_meninas.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_wc","index"));

									link_wc_meninas.propertie().add("name","p_link_wc_meninas").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_banhos_para_criancas_com_deficiencias = new ListField(model,"casa_banhos_para_criancas_com_deficiencias");
		casa_banhos_para_criancas_com_deficiencias.setLabel(gt("Casa banhos para crianças com deficiências"));
		casa_banhos_para_criancas_com_deficiencias.propertie().add("name","p_casa_banhos_para_criancas_com_deficiencias").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_wc_defic = new LinkField(model,"link_wc_defic");
		link_wc_defic.setLabel(gt(""));
		link_wc_defic.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_wc","index"));

									link_wc_defic.propertie().add("name","p_link_wc_defic").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_de_banho_para_professores = new ListField(model,"casa_de_banho_para_professores");
		casa_de_banho_para_professores.setLabel(gt("Casa de banho para professores"));
		casa_de_banho_para_professores.propertie().add("name","p_casa_de_banho_para_professores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_wc_profs = new LinkField(model,"link_wc_profs");
		link_wc_profs.setLabel(gt(""));
		link_wc_profs.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_wc","index"));

									link_wc_profs.propertie().add("name","p_link_wc_profs").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_de_banho_para_professoras = new ListField(model,"casa_de_banho_para_professoras");
		casa_de_banho_para_professoras.setLabel(gt("Casa de banho para professoras"));
		casa_de_banho_para_professoras.propertie().add("name","p_casa_de_banho_para_professoras").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_wc_profsra = new LinkField(model,"link_wc_profsra");
		link_wc_profsra.setLabel(gt(""));
		link_wc_profsra.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_wc","index"));

									link_wc_profsra.propertie().add("name","p_link_wc_profsra").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		cantina = new ListField(model,"cantina");
		cantina.setLabel(gt("Cantina"));
		cantina.propertie().add("name","p_cantina").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_cantina = new LinkField(model,"link_cantina");
		link_cantina.setLabel(gt(""));
		link_cantina.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_cantina.propertie().add("name","p_link_cantina").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		cozinha = new ListField(model,"cozinha");
		cozinha.setLabel(gt("Cozinha"));
		cozinha.propertie().add("name","p_cozinha").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_cozinha = new LinkField(model,"link_cozinha");
		link_cozinha.setLabel(gt(""));
		link_cozinha.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_salas","index"));

									link_cozinha.propertie().add("name","p_link_cozinha").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		areas_diversas = new SeparatorField(model,"areas_diversas");
		areas_diversas.setLabel(gt("Áreas diversas"));
		areas_diversas.propertie().add("name","p_areas_diversas").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		rampa_de_acesso = new ListField(model,"rampa_de_acesso");
		rampa_de_acesso.setLabel(gt("Rampa de acesso"));
		rampa_de_acesso.propertie().add("name","p_rampa_de_acesso").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_rampa = new LinkField(model,"link_rampa");
		link_rampa.setLabel(gt(""));
		link_rampa.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_escadas","index"));

									link_rampa.propertie().add("name","p_link_rampa").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		acesso_automovel = new ListField(model,"acesso_automovel");
		acesso_automovel.setLabel(gt("Acesso Automóvel"));
		acesso_automovel.propertie().add("name","p_acesso_automovel").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_auto = new LinkField(model,"link_auto");
		link_auto.setLabel(gt(""));
		link_auto.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_escadas","index"));

									link_auto.propertie().add("name","p_link_auto").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		acesso_pedonal = new ListField(model,"acesso_pedonal");
		acesso_pedonal.setLabel(gt("Acesso pedonal"));
		acesso_pedonal.propertie().add("name","p_acesso_pedonal").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_pedonal = new LinkField(model,"link_pedonal");
		link_pedonal.setLabel(gt(""));
		link_pedonal.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_escadas","index"));

									link_pedonal.propertie().add("name","p_link_pedonal").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		sistema_de_rega = new ListField(model,"sistema_de_rega");
		sistema_de_rega.setLabel(gt("Sistema de Rega"));
		sistema_de_rega.propertie().add("name","p_sistema_de_rega").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		rega = new LinkField(model,"rega");
		rega.setLabel(gt(""));
		rega.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_escadas","index"));

									rega.propertie().add("name","p_rega").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		muro_de_vedacao = new ListField(model,"muro_de_vedacao");
		muro_de_vedacao.setLabel(gt("Muro de vedação"));
		muro_de_vedacao.propertie().add("name","p_muro_de_vedacao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_vedacao = new LinkField(model,"link_vedacao");
		link_vedacao.setLabel(gt(""));
		link_vedacao.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_escadas","index"));

									link_vedacao.propertie().add("name","p_link_vedacao").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		patio_da_escola = new ListField(model,"patio_da_escola");
		patio_da_escola.setLabel(gt("Pátio da escola"));
		patio_da_escola.propertie().add("name","p_patio_da_escola").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_patio = new LinkField(model,"link_patio");
		link_patio.setLabel(gt(""));
		link_patio.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_escadas","index"));

									link_patio.propertie().add("name","p_link_patio").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		canteiros_floridos = new ListField(model,"canteiros_floridos");
		canteiros_floridos.setLabel(gt("Canteiros floridos"));
		canteiros_floridos.propertie().add("name","p_canteiros_floridos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_canteiros = new LinkField(model,"link_canteiros");
		link_canteiros.setLabel(gt(""));
		link_canteiros.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_escadas","index"));

									link_canteiros.propertie().add("name","p_link_canteiros").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		parque_automovel = new ListField(model,"parque_automovel");
		parque_automovel.setLabel(gt("Parque automóvel"));
		parque_automovel.propertie().add("name","p_parque_automovel").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_parque_auto = new LinkField(model,"link_parque_auto");
		link_parque_auto.setLabel(gt(""));
		link_parque_auto.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_escadas","index"));

									link_parque_auto.propertie().add("name","p_link_parque_auto").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		saneamento_basico = new ListField(model,"saneamento_basico");
		saneamento_basico.setLabel(gt("Saneamento básico"));
		saneamento_basico.propertie().add("name","p_saneamento_basico").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		link_seneamento = new LinkField(model,"link_seneamento");
		link_seneamento.setLabel(gt(""));
		link_seneamento.setValue(Core.getIGRPLink("sgie","Folha_avaliacao_portas","index"));

									link_seneamento.propertie().add("name","p_link_seneamento").add("type","link").add("target","mpsubmit").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("class","link").add("img","fa-clipboard").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		


		btn_guardar_seguimento = new IGRPButton("Guardar","sgie","Novo_seguimento","guardar_seguimento","submit_ajax","primary|fa-check","","");
		btn_guardar_seguimento.propertie.add("id","button_e3e2_5574").add("type","form").add("class","primary").add("rel","guardar_seguimento").add("refresh_components","form_seguimento");

		
	}
		
	@Override
	public void render(){
		
		form_seguimento.addField(areas_adminstrativas_e_didaticas);
		form_seguimento.addField(direcao);
		form_seguimento.addField(link_1);
		form_seguimento.addField(secretaria);
		form_seguimento.addField(link_secretaria);
		form_seguimento.addField(biblioteca);
		form_seguimento.addField(link_biblioteca);
		form_seguimento.addField(ginasio);
		form_seguimento.addField(link_ginasio);
		form_seguimento.addField(laboratorio_informatico);
		form_seguimento.addField(link_lab_info);
		form_seguimento.addField(laboratorio_biologia);
		form_seguimento.addField(link_11);
		form_seguimento.addField(laboratorio_quimicafisica);
		form_seguimento.addField(link_lab_quim);
		form_seguimento.addField(sala_multimedia);
		form_seguimento.addField(link_multime);
		form_seguimento.addField(reprografia);
		form_seguimento.addField(link_reprografia);
		form_seguimento.addField(club_ecologico);
		form_seguimento.addField(link_club_eco);
		form_seguimento.addField(sala_de_leitura);
		form_seguimento.addField(link_sala_leitura);
		form_seguimento.addField(oficina_de_artes_graficas);
		form_seguimento.addField(link_oficina_agraf);
		form_seguimento.addField(centros_de_recursos);
		form_seguimento.addField(link_centro_rec);
		form_seguimento.addField(laboratorio_de_lingua_portuguesa);
		form_seguimento.addField(link_lab_pt);
		form_seguimento.addField(laboratorio_de_lingua_inglesa);
		form_seguimento.addField(link_lab_ing);
		form_seguimento.addField(laboratorio_de_lingua_francesa);
		form_seguimento.addField(link_lab_fran);
		form_seguimento.addField(oficina_de_eletrotecnica_eletronica);
		form_seguimento.addField(link_ofic_eletro);
		form_seguimento.addField(oficina_de_informatica);
		form_seguimento.addField(link_ofic_inform);
		form_seguimento.addField(papelaria);
		form_seguimento.addField(link_papelaria);
		form_seguimento.addField(oficina_de_mecanica);
		form_seguimento.addField(link_ofic_mec);
		form_seguimento.addField(anfiteatroauditorio);
		form_seguimento.addField(link_anfiteatro);
		form_seguimento.addField(oficina_de_soldaduraconstrucao_metalica);
		form_seguimento.addField(link_ofic_solda);
		form_seguimento.addField(sala_de_associacao_de_alunos);
		form_seguimento.addField(link_sala_alunos);
		form_seguimento.addField(salas_especificas);
		form_seguimento.addField(link_sala_espec);
		form_seguimento.addField(oficina_de_construcao_civil);
		form_seguimento.addField(link_ofic_cc);
		form_seguimento.addField(pavilhao_polivalente_exterior);
		form_seguimento.addField(link_pavil_exterior);
		form_seguimento.addField(outros_espacos);
		form_seguimento.addField(link_outros_espacos);
		form_seguimento.addField(campos_de_voleibol);
		form_seguimento.addField(link_campo_voley);
		form_seguimento.addField(campos_de_futebol);
		form_seguimento.addField(link_campo_fute);
		form_seguimento.addField(campos_de_basquetebol);
		form_seguimento.addField(link_campo_basq);
		form_seguimento.addField(pavilhao_interior);
		form_seguimento.addField(link_pav_interior);
		form_seguimento.addField(placa_desportiva);
		form_seguimento.addField(link_placa_desport);
		form_seguimento.addField(outras_instalacoes_exteriores);
		form_seguimento.addField(link_2);
		form_seguimento.addField(sala_de_professores);
		form_seguimento.addField(link_sala_profs);
		form_seguimento.addField(areas_de_servico);
		form_seguimento.addField(refeitorio);
		form_seguimento.addField(link_refeitorio);
		form_seguimento.addField(armazemdispensa);
		form_seguimento.addField(link_dispensa);
		form_seguimento.addField(anexosarrecadacao);
		form_seguimento.addField(link_anexo);
		form_seguimento.addField(escadas_e_corredores_internos);
		form_seguimento.addField(link_escadas);
		form_seguimento.addField(casa_banhos_para_meninos);
		form_seguimento.addField(link_wc_meninos);
		form_seguimento.addField(casa_banhos_para_meninas);
		form_seguimento.addField(link_wc_meninas);
		form_seguimento.addField(casa_banhos_para_criancas_com_deficiencias);
		form_seguimento.addField(link_wc_defic);
		form_seguimento.addField(casa_de_banho_para_professores);
		form_seguimento.addField(link_wc_profs);
		form_seguimento.addField(casa_de_banho_para_professoras);
		form_seguimento.addField(link_wc_profsra);
		form_seguimento.addField(cantina);
		form_seguimento.addField(link_cantina);
		form_seguimento.addField(cozinha);
		form_seguimento.addField(link_cozinha);
		form_seguimento.addField(areas_diversas);
		form_seguimento.addField(rampa_de_acesso);
		form_seguimento.addField(link_rampa);
		form_seguimento.addField(acesso_automovel);
		form_seguimento.addField(link_auto);
		form_seguimento.addField(acesso_pedonal);
		form_seguimento.addField(link_pedonal);
		form_seguimento.addField(sistema_de_rega);
		form_seguimento.addField(rega);
		form_seguimento.addField(muro_de_vedacao);
		form_seguimento.addField(link_vedacao);
		form_seguimento.addField(patio_da_escola);
		form_seguimento.addField(link_patio);
		form_seguimento.addField(canteiros_floridos);
		form_seguimento.addField(link_canteiros);
		form_seguimento.addField(parque_automovel);
		form_seguimento.addField(link_parque_auto);
		form_seguimento.addField(saneamento_basico);
		form_seguimento.addField(link_seneamento);

		form_seguimento.addButton(btn_guardar_seguimento);
		this.addToPage(form_seguimento);
	}
		
	@Override
	public void setModel(Model model) {
		
		areas_adminstrativas_e_didaticas.setValue(model);
		direcao.setValue(model);
		link_1.setValue(model);
		secretaria.setValue(model);
		link_secretaria.setValue(model);
		biblioteca.setValue(model);
		link_biblioteca.setValue(model);
		ginasio.setValue(model);
		link_ginasio.setValue(model);
		laboratorio_informatico.setValue(model);
		link_lab_info.setValue(model);
		laboratorio_biologia.setValue(model);
		link_11.setValue(model);
		laboratorio_quimicafisica.setValue(model);
		link_lab_quim.setValue(model);
		sala_multimedia.setValue(model);
		link_multime.setValue(model);
		reprografia.setValue(model);
		link_reprografia.setValue(model);
		club_ecologico.setValue(model);
		link_club_eco.setValue(model);
		sala_de_leitura.setValue(model);
		link_sala_leitura.setValue(model);
		oficina_de_artes_graficas.setValue(model);
		link_oficina_agraf.setValue(model);
		centros_de_recursos.setValue(model);
		link_centro_rec.setValue(model);
		laboratorio_de_lingua_portuguesa.setValue(model);
		link_lab_pt.setValue(model);
		laboratorio_de_lingua_inglesa.setValue(model);
		link_lab_ing.setValue(model);
		laboratorio_de_lingua_francesa.setValue(model);
		link_lab_fran.setValue(model);
		oficina_de_eletrotecnica_eletronica.setValue(model);
		link_ofic_eletro.setValue(model);
		oficina_de_informatica.setValue(model);
		link_ofic_inform.setValue(model);
		papelaria.setValue(model);
		link_papelaria.setValue(model);
		oficina_de_mecanica.setValue(model);
		link_ofic_mec.setValue(model);
		anfiteatroauditorio.setValue(model);
		link_anfiteatro.setValue(model);
		oficina_de_soldaduraconstrucao_metalica.setValue(model);
		link_ofic_solda.setValue(model);
		sala_de_associacao_de_alunos.setValue(model);
		link_sala_alunos.setValue(model);
		salas_especificas.setValue(model);
		link_sala_espec.setValue(model);
		oficina_de_construcao_civil.setValue(model);
		link_ofic_cc.setValue(model);
		pavilhao_polivalente_exterior.setValue(model);
		link_pavil_exterior.setValue(model);
		outros_espacos.setValue(model);
		link_outros_espacos.setValue(model);
		campos_de_voleibol.setValue(model);
		link_campo_voley.setValue(model);
		campos_de_futebol.setValue(model);
		link_campo_fute.setValue(model);
		campos_de_basquetebol.setValue(model);
		link_campo_basq.setValue(model);
		pavilhao_interior.setValue(model);
		link_pav_interior.setValue(model);
		placa_desportiva.setValue(model);
		link_placa_desport.setValue(model);
		outras_instalacoes_exteriores.setValue(model);
		link_2.setValue(model);
		sala_de_professores.setValue(model);
		link_sala_profs.setValue(model);
		areas_de_servico.setValue(model);
		refeitorio.setValue(model);
		link_refeitorio.setValue(model);
		armazemdispensa.setValue(model);
		link_dispensa.setValue(model);
		anexosarrecadacao.setValue(model);
		link_anexo.setValue(model);
		escadas_e_corredores_internos.setValue(model);
		link_escadas.setValue(model);
		casa_banhos_para_meninos.setValue(model);
		link_wc_meninos.setValue(model);
		casa_banhos_para_meninas.setValue(model);
		link_wc_meninas.setValue(model);
		casa_banhos_para_criancas_com_deficiencias.setValue(model);
		link_wc_defic.setValue(model);
		casa_de_banho_para_professores.setValue(model);
		link_wc_profs.setValue(model);
		casa_de_banho_para_professoras.setValue(model);
		link_wc_profsra.setValue(model);
		cantina.setValue(model);
		link_cantina.setValue(model);
		cozinha.setValue(model);
		link_cozinha.setValue(model);
		areas_diversas.setValue(model);
		rampa_de_acesso.setValue(model);
		link_rampa.setValue(model);
		acesso_automovel.setValue(model);
		link_auto.setValue(model);
		acesso_pedonal.setValue(model);
		link_pedonal.setValue(model);
		sistema_de_rega.setValue(model);
		rega.setValue(model);
		muro_de_vedacao.setValue(model);
		link_vedacao.setValue(model);
		patio_da_escola.setValue(model);
		link_patio.setValue(model);
		canteiros_floridos.setValue(model);
		link_canteiros.setValue(model);
		parque_automovel.setValue(model);
		link_parque_auto.setValue(model);
		saneamento_basico.setValue(model);
		link_seneamento.setValue(model);	

		}
}
