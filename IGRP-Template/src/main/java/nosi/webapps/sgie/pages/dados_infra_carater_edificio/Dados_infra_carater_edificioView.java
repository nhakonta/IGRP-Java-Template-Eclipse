package nosi.webapps.sgie.pages.dados_infra_carater_edificio;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dados_infra_carater_edificioView extends View {

	public Field altura_total_do_edificio;
	public Field area_bruta;
	public Field decada_de_construcao;
	public Field guarita_de_porteiro;
	public Field ano_de_construcao_;
	public Field pisos_abaixo_do_solo;
	public Field pisos_acima_do_solo;
	public Field ano_da_ultima_restruturacao;
	public Field nome_da_empresaconsorcio_executor_obra;
	public Field telefone_da_empresaconsorcio_;
	public Field morada_da_empresaconsorcio;
	public Field email_da_empresaconsorcio;
	public Field volumetria;
	public Field area_total_de_lote;
	public Field numero_de_lugares_estacionamento;
	public Field esc_id;
	public IGRPForm form_caraterizacao_edificios;

	public IGRPButton btn_atualizar_dados_carat_edificio;

	public Dados_infra_carater_edificioView(){

		this.setPageTitle("Dados infra carater edificio");
			
		form_caraterizacao_edificios = new IGRPForm("form_caraterizacao_edificios","");

		altura_total_do_edificio = new NumberField(model,"altura_total_do_edificio");
		altura_total_do_edificio.setLabel(gt("Altura Total do Edifício"));
		altura_total_do_edificio.propertie().add("name","p_altura_total_do_edificio").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		area_bruta = new NumberField(model,"area_bruta");
		area_bruta.setLabel(gt("Área Bruta"));
		area_bruta.propertie().add("name","p_area_bruta").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		decada_de_construcao = new NumberField(model,"decada_de_construcao");
		decada_de_construcao.setLabel(gt("Década de construção"));
		decada_de_construcao.propertie().add("name","p_decada_de_construcao").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		guarita_de_porteiro = new ListField(model,"guarita_de_porteiro");
		guarita_de_porteiro.setLabel(gt("Guarita de Porteiro"));
		guarita_de_porteiro.propertie().add("name","p_guarita_de_porteiro").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		ano_de_construcao_ = new NumberField(model,"ano_de_construcao_");
		ano_de_construcao_.setLabel(gt("Ano de Construção "));
		ano_de_construcao_.propertie().add("name","p_ano_de_construcao_").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		pisos_abaixo_do_solo = new NumberField(model,"pisos_abaixo_do_solo");
		pisos_abaixo_do_solo.setLabel(gt("Pisos Abaixo do Solo"));
		pisos_abaixo_do_solo.propertie().add("name","p_pisos_abaixo_do_solo").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		pisos_acima_do_solo = new NumberField(model,"pisos_acima_do_solo");
		pisos_acima_do_solo.setLabel(gt("Pisos Acima do Solo"));
		pisos_acima_do_solo.propertie().add("name","p_pisos_acima_do_solo").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		ano_da_ultima_restruturacao = new NumberField(model,"ano_da_ultima_restruturacao");
		ano_da_ultima_restruturacao.setLabel(gt("Ano da última restruturação"));
		ano_da_ultima_restruturacao.propertie().add("name","p_ano_da_ultima_restruturacao").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		nome_da_empresaconsorcio_executor_obra = new TextField(model,"nome_da_empresaconsorcio_executor_obra");
		nome_da_empresaconsorcio_executor_obra.setLabel(gt("Nome da empresa/consórcio executor obra"));
		nome_da_empresaconsorcio_executor_obra.propertie().add("name","p_nome_da_empresaconsorcio_executor_obra").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		telefone_da_empresaconsorcio_ = new TextField(model,"telefone_da_empresaconsorcio_");
		telefone_da_empresaconsorcio_.setLabel(gt("Telefone da empresa/consórcio "));
		telefone_da_empresaconsorcio_.propertie().add("name","p_telefone_da_empresaconsorcio_").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		morada_da_empresaconsorcio = new TextField(model,"morada_da_empresaconsorcio");
		morada_da_empresaconsorcio.setLabel(gt("Morada da empresa/consórcio"));
		morada_da_empresaconsorcio.propertie().add("name","p_morada_da_empresaconsorcio").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		email_da_empresaconsorcio = new EmailField(model,"email_da_empresaconsorcio");
		email_da_empresaconsorcio.setLabel(gt("Email da empresa/consórcio"));
		email_da_empresaconsorcio.propertie().add("name","p_email_da_empresaconsorcio").add("type","email").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		volumetria = new NumberField(model,"volumetria");
		volumetria.setLabel(gt("Volumetria"));
		volumetria.propertie().add("name","p_volumetria").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		area_total_de_lote = new NumberField(model,"area_total_de_lote");
		area_total_de_lote.setLabel(gt("Área Total de Lote"));
		area_total_de_lote.propertie().add("name","p_area_total_de_lote").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_de_lugares_estacionamento = new NumberField(model,"numero_de_lugares_estacionamento");
		numero_de_lugares_estacionamento.setLabel(gt("Número de Lugares Estacionamento"));
		numero_de_lugares_estacionamento.propertie().add("name","p_numero_de_lugares_estacionamento").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		esc_id = new HiddenField(model,"esc_id");
		esc_id.setLabel(gt(""));
		esc_id.propertie().add("name","p_esc_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","esc_id");
		


		btn_atualizar_dados_carat_edificio = new IGRPButton("Atualizar Dados","sgie","Dados_infra_carater_edificio","atualizar_dados_carat_edificio","submit_ajax","primary|fa-refresh","","");
		btn_atualizar_dados_carat_edificio.propertie.add("id","button_7475_2270").add("type","form").add("class","primary").add("rel","atualizar_dados_carat_edificio").add("refresh_components","form_caraterizacao_edificios");

		
	}
		
	@Override
	public void render(){
		
		form_caraterizacao_edificios.addField(altura_total_do_edificio);
		form_caraterizacao_edificios.addField(area_bruta);
		form_caraterizacao_edificios.addField(decada_de_construcao);
		form_caraterizacao_edificios.addField(guarita_de_porteiro);
		form_caraterizacao_edificios.addField(ano_de_construcao_);
		form_caraterizacao_edificios.addField(pisos_abaixo_do_solo);
		form_caraterizacao_edificios.addField(pisos_acima_do_solo);
		form_caraterizacao_edificios.addField(ano_da_ultima_restruturacao);
		form_caraterizacao_edificios.addField(nome_da_empresaconsorcio_executor_obra);
		form_caraterizacao_edificios.addField(telefone_da_empresaconsorcio_);
		form_caraterizacao_edificios.addField(morada_da_empresaconsorcio);
		form_caraterizacao_edificios.addField(email_da_empresaconsorcio);
		form_caraterizacao_edificios.addField(volumetria);
		form_caraterizacao_edificios.addField(area_total_de_lote);
		form_caraterizacao_edificios.addField(numero_de_lugares_estacionamento);
		form_caraterizacao_edificios.addField(esc_id);

		form_caraterizacao_edificios.addButton(btn_atualizar_dados_carat_edificio);
		this.addToPage(form_caraterizacao_edificios);
	}
		
	@Override
	public void setModel(Model model) {
		
		altura_total_do_edificio.setValue(model);
		area_bruta.setValue(model);
		decada_de_construcao.setValue(model);
		guarita_de_porteiro.setValue(model);
		ano_de_construcao_.setValue(model);
		pisos_abaixo_do_solo.setValue(model);
		pisos_acima_do_solo.setValue(model);
		ano_da_ultima_restruturacao.setValue(model);
		nome_da_empresaconsorcio_executor_obra.setValue(model);
		telefone_da_empresaconsorcio_.setValue(model);
		morada_da_empresaconsorcio.setValue(model);
		email_da_empresaconsorcio.setValue(model);
		volumetria.setValue(model);
		area_total_de_lote.setValue(model);
		numero_de_lugares_estacionamento.setValue(model);
		esc_id.setValue(model);	

		}
}
