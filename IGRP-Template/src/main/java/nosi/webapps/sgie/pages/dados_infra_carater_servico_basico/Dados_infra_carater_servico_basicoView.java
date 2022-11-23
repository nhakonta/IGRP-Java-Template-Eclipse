package nosi.webapps.sgie.pages.dados_infra_carater_servico_basico;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dados_infra_carater_servico_basicoView extends View {

	public Field formas_abastecimento_agua_;
	public Field fonte_energia_eletrica;
	public Field formas_armazenamento_agua;
	public Field acesso_a_internet;
	public Field data_utima_atualizacao;
	public Field numero_de_salas_inoperantes;
	public Field porque_razao_as_salas_nao_funcionam;
	public Field id;
	public Field esc_id;
	public IGRPForm form_servicos_basicos_internet;

	public IGRPButton btn_atualizar_dados;

	public Dados_infra_carater_servico_basicoView(){

		this.setPageTitle("Dados infra carater servico basico");
			
		form_servicos_basicos_internet = new IGRPForm("form_servicos_basicos_internet","");

		formas_abastecimento_agua_ = new ListField(model,"formas_abastecimento_agua_");
		formas_abastecimento_agua_.setLabel(gt("Formas abastecimento água "));
		formas_abastecimento_agua_.propertie().add("name","p_formas_abastecimento_agua_").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		fonte_energia_eletrica = new ListField(model,"fonte_energia_eletrica");
		fonte_energia_eletrica.setLabel(gt("Fonte energia elétrica"));
		fonte_energia_eletrica.propertie().add("name","p_fonte_energia_eletrica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		formas_armazenamento_agua = new ListField(model,"formas_armazenamento_agua");
		formas_armazenamento_agua.setLabel(gt("Formas armazenamento água"));
		formas_armazenamento_agua.propertie().add("name","p_formas_armazenamento_agua").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		acesso_a_internet = new ListField(model,"acesso_a_internet");
		acesso_a_internet.setLabel(gt("Acesso à internet"));
		acesso_a_internet.propertie().add("name","p_acesso_a_internet").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		data_utima_atualizacao = new TextField(model,"data_utima_atualizacao");
		data_utima_atualizacao.setLabel(gt("Data útima atualização"));
		data_utima_atualizacao.propertie().add("name","p_data_utima_atualizacao").add("type","text").add("maxlength","250").add("required","false").add("readonly","true").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_de_salas_inoperantes = new NumberField(model,"numero_de_salas_inoperantes");
		numero_de_salas_inoperantes.setLabel(gt("Número de Salas Inoperantes"));
		numero_de_salas_inoperantes.propertie().add("name","p_numero_de_salas_inoperantes").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		porque_razao_as_salas_nao_funcionam = new ListField(model,"porque_razao_as_salas_nao_funcionam");
		porque_razao_as_salas_nao_funcionam.setLabel(gt("Porque razão as salas não funcionam"));
		porque_razao_as_salas_nao_funcionam.propertie().add("name","p_porque_razao_as_salas_nao_funcionam").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","id");
		
		esc_id = new HiddenField(model,"esc_id");
		esc_id.setLabel(gt(""));
		esc_id.propertie().add("name","p_esc_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","esc_id");
		


		btn_atualizar_dados = new IGRPButton("Atualizar Dados","sgie","Dados_infra_carater_servico_basico","atualizar_dados","submit_ajax","primary|fa-refresh","","");
		btn_atualizar_dados.propertie.add("id","button_8225_0e30").add("type","form").add("class","primary").add("rel","atualizar_dados").add("refresh_components","form_servicos_basicos_internet");

		
	}
		
	@Override
	public void render(){
		
		form_servicos_basicos_internet.addField(formas_abastecimento_agua_);
		form_servicos_basicos_internet.addField(fonte_energia_eletrica);
		form_servicos_basicos_internet.addField(formas_armazenamento_agua);
		form_servicos_basicos_internet.addField(acesso_a_internet);
		form_servicos_basicos_internet.addField(data_utima_atualizacao);
		form_servicos_basicos_internet.addField(numero_de_salas_inoperantes);
		form_servicos_basicos_internet.addField(porque_razao_as_salas_nao_funcionam);
		form_servicos_basicos_internet.addField(id);
		form_servicos_basicos_internet.addField(esc_id);

		form_servicos_basicos_internet.addButton(btn_atualizar_dados);
		this.addToPage(form_servicos_basicos_internet);
	}
		
	@Override
	public void setModel(Model model) {
		
		formas_abastecimento_agua_.setValue(model);
		fonte_energia_eletrica.setValue(model);
		formas_armazenamento_agua.setValue(model);
		acesso_a_internet.setValue(model);
		data_utima_atualizacao.setValue(model);
		numero_de_salas_inoperantes.setValue(model);
		porque_razao_as_salas_nao_funcionam.setValue(model);
		id.setValue(model);
		esc_id.setValue(model);	

		}
}
