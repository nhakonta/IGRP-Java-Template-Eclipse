package nosi.webapps.sgie.pages.dados_infra_carater_morfo;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dados_infra_carater_morfoView extends View {

	public Field numero_de_corpos;
	public Field simetria_entre_corpos;
	public Field numero_de_compartimentos;
	public Field numero_de_instalacoes_sanitarias;
	public Field forma;
	public Field entrada_;
	public Field esc_id;
	public IGRPForm form_descricao_morfologica;

	public IGRPButton btn_atualizar_dados_morfo;

	public Dados_infra_carater_morfoView(){

		this.setPageTitle("Dados infra descricao morfo");
			
		form_descricao_morfologica = new IGRPForm("form_descricao_morfologica","");

		numero_de_corpos = new NumberField(model,"numero_de_corpos");
		numero_de_corpos.setLabel(gt("Número de Corpos"));
		numero_de_corpos.propertie().add("name","p_numero_de_corpos").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		simetria_entre_corpos = new ListField(model,"simetria_entre_corpos");
		simetria_entre_corpos.setLabel(gt("Simetria entre Corpos"));
		simetria_entre_corpos.propertie().add("name","p_simetria_entre_corpos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_de_compartimentos = new NumberField(model,"numero_de_compartimentos");
		numero_de_compartimentos.setLabel(gt("Número de Compartimentos"));
		numero_de_compartimentos.propertie().add("name","p_numero_de_compartimentos").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_de_instalacoes_sanitarias = new NumberField(model,"numero_de_instalacoes_sanitarias");
		numero_de_instalacoes_sanitarias.setLabel(gt("Número de Instalações Sanitárias"));
		numero_de_instalacoes_sanitarias.propertie().add("name","p_numero_de_instalacoes_sanitarias").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		forma = new ListField(model,"forma");
		forma.setLabel(gt("Forma"));
		forma.propertie().add("name","p_forma").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		entrada_ = new ListField(model,"entrada_");
		entrada_.setLabel(gt("Entrada "));
		entrada_.propertie().add("name","p_entrada_").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		esc_id = new HiddenField(model,"esc_id");
		esc_id.setLabel(gt(""));
		esc_id.propertie().add("name","p_esc_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","esc_id");
		


		btn_atualizar_dados_morfo = new IGRPButton("Atualizar Dados","sgie","Dados_infra_carater_morfo","atualizar_dados_morfo","submit_ajax","primary|fa-refresh","","");
		btn_atualizar_dados_morfo.propertie.add("id","button_85a7_71cc").add("type","form").add("class","primary").add("rel","atualizar_dados_morfo").add("refresh_components","form_descricao_morfologica");

		
	}
		
	@Override
	public void render(){
		
		form_descricao_morfologica.addField(numero_de_corpos);
		form_descricao_morfologica.addField(simetria_entre_corpos);
		form_descricao_morfologica.addField(numero_de_compartimentos);
		form_descricao_morfologica.addField(numero_de_instalacoes_sanitarias);
		form_descricao_morfologica.addField(forma);
		form_descricao_morfologica.addField(entrada_);
		form_descricao_morfologica.addField(esc_id);

		form_descricao_morfologica.addButton(btn_atualizar_dados_morfo);
		this.addToPage(form_descricao_morfologica);
	}
		
	@Override
	public void setModel(Model model) {
		
		numero_de_corpos.setValue(model);
		simetria_entre_corpos.setValue(model);
		numero_de_compartimentos.setValue(model);
		numero_de_instalacoes_sanitarias.setValue(model);
		forma.setValue(model);
		entrada_.setValue(model);
		esc_id.setValue(model);	

		}
}
