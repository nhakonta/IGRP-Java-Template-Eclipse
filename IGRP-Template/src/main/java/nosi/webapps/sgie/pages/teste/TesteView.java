package nosi.webapps.sgie.pages.teste;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class TesteView extends View {

	public Field form_1_text_1;
	public Field form_1_hidden_1;
	public Field table_1_text_1;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_form_1_button_1;
	public IGRPButton btn_table_1_button_1;

	public TesteView(){

		this.setPageTitle("teste");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		form_1_text_1 = new TextField(model,"form_1_text_1");
		form_1_text_1.setLabel(gt("Text"));
		form_1_text_1.propertie().add("name","p_form_1_text_1").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		form_1_hidden_1 = new HiddenField(model,"form_1_hidden_1");
		form_1_hidden_1.setLabel(gt(""));
		form_1_hidden_1.propertie().add("name","p_form_1_hidden_1").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","form_1_hidden_1");
		
		table_1_text_1 = new TextField(model,"table_1_text_1");
		table_1_text_1.setLabel(gt("Text"));
		table_1_text_1.propertie().add("name","p_table_1_text_1").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		


		btn_form_1_button_1 = new IGRPButton("Button","sgie","Teste","form_1_button_1","mpsubmit","primary|fa-angle-right","","");
		btn_form_1_button_1.propertie.add("id","button_b9af_81e1").add("type","form").add("class","primary").add("rel","form_1_button_1").add("refresh_components","");

		btn_table_1_button_1 = new IGRPButton("Button","sgie","Teste","table_1_button_1","mpsubmit|refresh_submit","primary|fa-file-text-o","","");
		btn_table_1_button_1.propertie.add("id","button_27b2_78a1").add("type","specific").add("class","primary").add("rel","table_1_button_1").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(form_1_text_1);
		form_1.addField(form_1_hidden_1);

		table_1.addField(table_1_text_1);

		form_1.addButton(btn_form_1_button_1);
		table_1.addButton(btn_table_1_button_1);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		form_1_text_1.setValue(model);
		form_1_hidden_1.setValue(model);
		table_1_text_1.setValue(model);	

		table_1.loadModel(((Teste) model).getTable_1());
		}
}
