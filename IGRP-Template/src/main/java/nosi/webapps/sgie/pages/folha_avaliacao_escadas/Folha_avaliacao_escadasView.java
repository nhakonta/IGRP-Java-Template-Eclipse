package nosi.webapps.sgie.pages.folha_avaliacao_escadas;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Folha_avaliacao_escadasView extends View {

	public Field escadas;
	public Field insuficiencia_dos_elementos_estrutural_escadas;
	public Field alteracao_na_geometria_escadas;
	public Field extensiva_deterioracao_dos_degraus;
	public Field ausencia_de_guardas_ou_corrimao;
	public Field anomalias_indicadores_de_graves_deterioracao;
	public IGRPForm form_1;

	public IGRPButton btn_guardar;

	public Folha_avaliacao_escadasView(){

		this.setPageTitle("folha avaliação escadas");
			
		form_1 = new IGRPForm("form_1","");

		escadas = new SeparatorField(model,"escadas");
		escadas.setLabel(gt("Escadas"));
		escadas.propertie().add("name","p_escadas").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		insuficiencia_dos_elementos_estrutural_escadas = new ListField(model,"insuficiencia_dos_elementos_estrutural_escadas");
		insuficiencia_dos_elementos_estrutural_escadas.setLabel(gt("Insuficiência dos elementos estrutural"));
		insuficiencia_dos_elementos_estrutural_escadas.propertie().add("name","p_insuficiencia_dos_elementos_estrutural_escadas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		alteracao_na_geometria_escadas = new ListField(model,"alteracao_na_geometria_escadas");
		alteracao_na_geometria_escadas.setLabel(gt("Alteração na geometria"));
		alteracao_na_geometria_escadas.propertie().add("name","p_alteracao_na_geometria_escadas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		extensiva_deterioracao_dos_degraus = new ListField(model,"extensiva_deterioracao_dos_degraus");
		extensiva_deterioracao_dos_degraus.setLabel(gt("Extensiva deterioração dos degraus"));
		extensiva_deterioracao_dos_degraus.propertie().add("name","p_extensiva_deterioracao_dos_degraus").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		ausencia_de_guardas_ou_corrimao = new ListField(model,"ausencia_de_guardas_ou_corrimao");
		ausencia_de_guardas_ou_corrimao.setLabel(gt("Ausência de guardas ou corrimão"));
		ausencia_de_guardas_ou_corrimao.propertie().add("name","p_ausencia_de_guardas_ou_corrimao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		anomalias_indicadores_de_graves_deterioracao = new ListField(model,"anomalias_indicadores_de_graves_deterioracao");
		anomalias_indicadores_de_graves_deterioracao.setLabel(gt("Anomalias indicadores de graves deterioração"));
		anomalias_indicadores_de_graves_deterioracao.propertie().add("name","p_anomalias_indicadores_de_graves_deterioracao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		


		btn_guardar = new IGRPButton("Guardar","sgie","Folha_avaliacao_escadas","guardar","submit_form","primary|fa-check","","");
		btn_guardar.propertie.add("id","button_52d3_a87d").add("type","form").add("class","primary").add("rel","guardar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(escadas);
		form_1.addField(insuficiencia_dos_elementos_estrutural_escadas);
		form_1.addField(alteracao_na_geometria_escadas);
		form_1.addField(extensiva_deterioracao_dos_degraus);
		form_1.addField(ausencia_de_guardas_ou_corrimao);
		form_1.addField(anomalias_indicadores_de_graves_deterioracao);

		form_1.addButton(btn_guardar);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		escadas.setValue(model);
		insuficiencia_dos_elementos_estrutural_escadas.setValue(model);
		alteracao_na_geometria_escadas.setValue(model);
		extensiva_deterioracao_dos_degraus.setValue(model);
		ausencia_de_guardas_ou_corrimao.setValue(model);
		anomalias_indicadores_de_graves_deterioracao.setValue(model);	

		}
}
