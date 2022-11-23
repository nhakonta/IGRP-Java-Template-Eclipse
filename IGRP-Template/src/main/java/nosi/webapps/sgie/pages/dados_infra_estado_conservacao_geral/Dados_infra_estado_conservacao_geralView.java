package nosi.webapps.sgie.pages.dados_infra_estado_conservacao_geral;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dados_infra_estado_conservacao_geralView extends View {

	public Field form_estado_conserva_geral_separator_1;
	public Field estado_conservacao;
	public Field localizacao_do_lote;
	public Field aspeto_exterior_do_edificio;
	public Field esc_id;
	public IGRPForm form_estado_conserva_geral;

	public IGRPButton btn_atualizar_dados;

	public Dados_infra_estado_conservacao_geralView(){

		this.setPageTitle("Dados infra estado conservacao geral");
			
		form_estado_conserva_geral = new IGRPForm("form_estado_conserva_geral","");

		form_estado_conserva_geral_separator_1 = new SeparatorField(model,"form_estado_conserva_geral_separator_1");
		form_estado_conserva_geral_separator_1.setLabel(gt("Separator"));
		form_estado_conserva_geral_separator_1.propertie().add("name","p_form_estado_conserva_geral_separator_1").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		estado_conservacao = new ListField(model,"estado_conservacao");
		estado_conservacao.setLabel(gt("Estado Conservação"));
		estado_conservacao.propertie().add("name","p_estado_conservacao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		localizacao_do_lote = new ListField(model,"localizacao_do_lote");
		localizacao_do_lote.setLabel(gt("Localização do lote"));
		localizacao_do_lote.propertie().add("name","p_localizacao_do_lote").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		aspeto_exterior_do_edificio = new TextAreaField(model,"aspeto_exterior_do_edificio");
		aspeto_exterior_do_edificio.setLabel(gt("Aspeto exterior do edifício"));
		aspeto_exterior_do_edificio.propertie().add("name","p_aspeto_exterior_do_edificio").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		esc_id = new HiddenField(model,"esc_id");
		esc_id.setLabel(gt(""));
		esc_id.propertie().add("name","p_esc_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","esc_id");
		


		btn_atualizar_dados = new IGRPButton("Atualizar dados","sgie","Dados_infra_estado_conservacao_geral","atualizar_dados","submit_form","primary|fa-refresh","","");
		btn_atualizar_dados.propertie.add("id","button_9cf5_4023").add("type","form").add("class","primary").add("rel","atualizar_dados").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_estado_conserva_geral.addField(form_estado_conserva_geral_separator_1);
		form_estado_conserva_geral.addField(estado_conservacao);
		form_estado_conserva_geral.addField(localizacao_do_lote);
		form_estado_conserva_geral.addField(aspeto_exterior_do_edificio);
		form_estado_conserva_geral.addField(esc_id);

		form_estado_conserva_geral.addButton(btn_atualizar_dados);
		this.addToPage(form_estado_conserva_geral);
	}
		
	@Override
	public void setModel(Model model) {
		
		form_estado_conserva_geral_separator_1.setValue(model);
		estado_conservacao.setValue(model);
		localizacao_do_lote.setValue(model);
		aspeto_exterior_do_edificio.setValue(model);
		esc_id.setValue(model);	

		}
}
