package nosi.webapps.sgie.pages.dados_escolas;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dados_escolasView extends View {

	public Field view_cabecalho_escola;
	public Field codigo_sige;
	public Field nivel_de_ensino;
	public Field diretora;
	public Field morada;
	public Field lugar;
	public Field esc_id;
	public Field view_1_img;
	public Field telefone;
	public Field e_mail;
	public Field concelho;
	public Field coordenadas_gps;
	public Field numero_de_alunos;
	public Field sectionheader_1_text;
	public Field id_seguimento;
	public Field data_avaliacao;
	public Field utilizador;
	public Field esc_id_tbl;
	public IGRPView view_3;
	public IGRPView view_1;
	public IGRPView view_2;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_novo_seguimento;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPToolsBar toolsbar_2;
	public IGRPButton btn_estado_geral_de_conservacao;
	public IGRPButton btn_caraterizacao_de_edificios;
	public IGRPButton btn_caraterizacao_construtiva;
	public IGRPButton btn_caraterizacao_funcional;
	public IGRPButton btn_servicos_basicos_e_de_internet;
	public IGRPButton btn_descricao_morfologica;
	public IGRPButton btn_caraterizacao_espacos_interior;
	public IGRPButton btn_caraterizacao_exterior;
	public IGRPButton btn_nova_avaliacao;
	public IGRPButton btn_detalhes;

	public Dados_escolasView(){

		this.setPageTitle("dados escolas");
			
		view_3 = new IGRPView("view_3","");

		view_1 = new IGRPView("view_1","");

		view_2 = new IGRPView("view_2","");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_novo_seguimento = new IGRPForm("form_novo_seguimento","");

		table_1 = new IGRPTable("table_1","");

		view_cabecalho_escola = new TextField(model,"view_cabecalho_escola");
		view_cabecalho_escola.setLabel(gt(""));
		view_cabecalho_escola.propertie().add("name","p_view_cabecalho_escola").add("type","text").add("maxlength","250").add("class","default").add("img","fa-university").add("showlabel","true");
		
		codigo_sige = new TextField(model,"codigo_sige");
		codigo_sige.setLabel(gt("Código SIGE"));
		codigo_sige.propertie().add("name","p_codigo_sige").add("type","text").add("maxlength","250").add("class","default").add("img","fa-copyright").add("showlabel","true");
		
		nivel_de_ensino = new TextField(model,"nivel_de_ensino");
		nivel_de_ensino.setLabel(gt("Nível de Ensino"));
		nivel_de_ensino.propertie().add("name","p_nivel_de_ensino").add("type","text").add("maxlength","250").add("class","default").add("img","fa-university").add("showlabel","true");
		
		diretora = new TextField(model,"diretora");
		diretora.setLabel(gt("Diretor(a)"));
		diretora.propertie().add("name","p_diretora").add("type","text").add("maxlength","250").add("class","default").add("img","fa-user").add("showlabel","true");
		
		morada = new TextField(model,"morada");
		morada.setLabel(gt("Morada"));
		morada.propertie().add("name","p_morada").add("type","text").add("maxlength","250").add("class","default").add("img","fa-bullseye").add("showlabel","true");
		
		lugar = new TextField(model,"lugar");
		lugar.setLabel(gt("Lugar"));
		lugar.propertie().add("name","p_lugar").add("type","text").add("maxlength","250").add("class","default").add("img","fa-podcast").add("showlabel","true");
		
		esc_id = new HiddenField(model,"esc_id");
		esc_id.setLabel(gt(""));
		esc_id.propertie().add("name","p_esc_id").add("type","hidden").add("maxlength","250").add("class","default").add("img","").add("showlabel","true").add("tag","esc_id");
		
		view_1_img = new TextField(model,"view_1_img");
		view_1_img.setLabel(gt(""));
		view_1_img.propertie().add("type","text").add("name","p_view_1_img").add("maxlength","300");
		
		telefone = new TextField(model,"telefone");
		telefone.setLabel(gt("Telefone"));
		telefone.propertie().add("name","p_telefone").add("type","text").add("maxlength","250").add("class","default").add("img","fa-phone").add("showlabel","true");
		
		e_mail = new TextField(model,"e_mail");
		e_mail.setLabel(gt("E-mail"));
		e_mail.propertie().add("name","p_e_mail").add("type","text").add("maxlength","250").add("class","default").add("img","fa-envelope").add("showlabel","true");
		
		concelho = new TextField(model,"concelho");
		concelho.setLabel(gt("Concelho"));
		concelho.propertie().add("name","p_concelho").add("type","text").add("maxlength","250").add("class","default").add("img","fa-map-marker").add("showlabel","true");
		
		coordenadas_gps = new TextField(model,"coordenadas_gps");
		coordenadas_gps.setLabel(gt("Coordenadas GPS"));
		coordenadas_gps.propertie().add("name","p_coordenadas_gps").add("type","text").add("maxlength","250").add("class","default").add("img","fa-street-view").add("showlabel","true");
		
		numero_de_alunos = new TextField(model,"numero_de_alunos");
		numero_de_alunos.setLabel(gt("Número de Alunos"));
		numero_de_alunos.propertie().add("name","p_numero_de_alunos").add("type","text").add("maxlength","250").add("class","default").add("img","fa-mortar-board").add("showlabel","true");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Seguimento &amp; Avalia&ccedil;&atilde;o</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		id_seguimento = new TextField(model,"id_seguimento");
		id_seguimento.setLabel(gt("ID Seguimento"));
		id_seguimento.propertie().add("name","p_id_seguimento").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		data_avaliacao = new TextField(model,"data_avaliacao");
		data_avaliacao.setLabel(gt("Data avaliação"));
		data_avaliacao.propertie().add("name","p_data_avaliacao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		utilizador = new TextField(model,"utilizador");
		utilizador.setLabel(gt("Utilizador"));
		utilizador.propertie().add("name","p_utilizador").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		esc_id_tbl = new HiddenField(model,"esc_id_tbl");
		esc_id_tbl.setLabel(gt(""));
		esc_id_tbl.propertie().add("name","p_esc_id_tbl").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","esc_id_tbl");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");
		toolsbar_2 = new IGRPToolsBar("toolsbar_2");

		btn_estado_geral_de_conservacao = new IGRPButton("Estado Geral de Conservação","sgie","Dados_escolas","estado_geral_de_conservacao","mpsubmit","primary|fa-heartbeat","","");
		btn_estado_geral_de_conservacao.propertie.add("type","specific").add("rel","estado_geral_de_conservacao").add("refresh_components","");

		btn_caraterizacao_de_edificios = new IGRPButton("Caraterização de Edifícios","sgie","Dados_escolas","caraterizacao_de_edificios","mpsubmit","primary|fa-home","","");
		btn_caraterizacao_de_edificios.propertie.add("type","specific").add("rel","caraterizacao_de_edificios").add("refresh_components","");

		btn_caraterizacao_construtiva = new IGRPButton("Caraterização Construtiva","sgie","Dados_escolas","caraterizacao_construtiva","mpsubmit","primary|fa-puzzle-piece","","");
		btn_caraterizacao_construtiva.propertie.add("type","specific").add("rel","caraterizacao_construtiva").add("refresh_components","");

		btn_caraterizacao_funcional = new IGRPButton("Caraterização Funcional","sgie","Dados_escolas","caraterizacao_funcional","mpsubmit","primary|fa-thumbs-o-up","","");
		btn_caraterizacao_funcional.propertie.add("type","specific").add("rel","caraterizacao_funcional").add("refresh_components","");

		btn_servicos_basicos_e_de_internet = new IGRPButton("Serviços Básicos e de Internet","sgie","Dados_escolas","servicos_basicos_e_de_internet","mpsubmit","primary|fa-rss","","");
		btn_servicos_basicos_e_de_internet.propertie.add("type","specific").add("rel","servicos_basicos_e_de_internet").add("refresh_components","");

		btn_descricao_morfologica = new IGRPButton("Descrição Morfológica","sgie","Dados_escolas","descricao_morfologica","mpsubmit","primary|fa-bank","","");
		btn_descricao_morfologica.propertie.add("type","specific").add("rel","descricao_morfologica").add("refresh_components","");

		btn_caraterizacao_espacos_interior = new IGRPButton("Caraterização espaços Interior","sgie","Dados_escolas","caraterizacao_espacos_interior","mpsubmit","primary|fa-tag","","");
		btn_caraterizacao_espacos_interior.propertie.add("type","specific").add("rel","caraterizacao_espacos_interior").add("refresh_components","");

		btn_caraterizacao_exterior = new IGRPButton("Caraterização Exterior","sgie","Dados_escolas","caraterizacao_exterior","mpsubmit","primary|fa-tags","","");
		btn_caraterizacao_exterior.propertie.add("type","specific").add("rel","caraterizacao_exterior").add("refresh_components","");

		btn_nova_avaliacao = new IGRPButton("Nova Avaliação","sgie","Dados_escolas","nova_avaliacao","mpsubmit","success|fa-heartbeat","","");
		btn_nova_avaliacao.propertie.add("id","button_8ef1_022c").add("type","form").add("class","success").add("rel","nova_avaliacao").add("refresh_components","");

		btn_detalhes = new IGRPButton("Detalhes","sgie","Dados_escolas","detalhes","mpsubmit","success|fa-hand-o-right","","");
		btn_detalhes.propertie.add("id","button_52de_343b").add("type","specific").add("class","success").add("rel","detalhes").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		view_3.addField(view_cabecalho_escola);

		view_1.addField(codigo_sige);
		view_1.addField(nivel_de_ensino);
		view_1.addField(diretora);
		view_1.addField(morada);
		view_1.addField(lugar);
		view_1.addField(esc_id);
		view_1.addField(view_1_img);

		view_2.addField(telefone);
		view_2.addField(e_mail);
		view_2.addField(concelho);
		view_2.addField(coordenadas_gps);
		view_2.addField(numero_de_alunos);



		sectionheader_1.addField(sectionheader_1_text);


		table_1.addField(id_seguimento);
		table_1.addField(data_avaliacao);
		table_1.addField(utilizador);
		table_1.addField(esc_id_tbl);

		toolsbar_1.addButton(btn_estado_geral_de_conservacao);
		toolsbar_1.addButton(btn_caraterizacao_de_edificios);
		toolsbar_1.addButton(btn_caraterizacao_construtiva);
		toolsbar_1.addButton(btn_caraterizacao_funcional);
		toolsbar_2.addButton(btn_servicos_basicos_e_de_internet);
		toolsbar_2.addButton(btn_descricao_morfologica);
		toolsbar_2.addButton(btn_caraterizacao_espacos_interior);
		toolsbar_2.addButton(btn_caraterizacao_exterior);
		form_novo_seguimento.addButton(btn_nova_avaliacao);
		table_1.addButton(btn_detalhes);
		this.addToPage(view_3);
		this.addToPage(view_1);
		this.addToPage(view_2);
		this.addToPage(sectionheader_1);
		this.addToPage(form_novo_seguimento);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
		this.addToPage(toolsbar_2);
	}
		
	@Override
	public void setModel(Model model) {
		
		view_cabecalho_escola.setValue(model);
		codigo_sige.setValue(model);
		nivel_de_ensino.setValue(model);
		diretora.setValue(model);
		morada.setValue(model);
		lugar.setValue(model);
		esc_id.setValue(model);
		view_1_img.setValue(model);
		telefone.setValue(model);
		e_mail.setValue(model);
		concelho.setValue(model);
		coordenadas_gps.setValue(model);
		numero_de_alunos.setValue(model);
		id_seguimento.setValue(model);
		data_avaliacao.setValue(model);
		utilizador.setValue(model);
		esc_id_tbl.setValue(model);	

		table_1.loadModel(((Dados_escolas) model).getTable_1());
		}
}
