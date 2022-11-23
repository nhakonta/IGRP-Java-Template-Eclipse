package nosi.webapps.sgie.pages.param_rampa_escada_corrim_interiro_e_exterior;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Param_rampa_escada_corrim_interiro_e_exteriorView extends View {

	public Field descricao;
	public Field id_rampa;
	public Field table_1_text_1;
	public Field id_rampa_tbl;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_guardar;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public Param_rampa_escada_corrim_interiro_e_exteriorView(){

		this.setPageTitle("Param Rampa Escada Corrim Interiro e Exterior");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		id_rampa = new HiddenField(model,"id_rampa");
		id_rampa.setLabel(gt(""));
		id_rampa.propertie().add("name","p_id_rampa").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","id_rampa");
		
		table_1_text_1 = new TextField(model,"table_1_text_1");
		table_1_text_1.setLabel(gt("Text"));
		table_1_text_1.propertie().add("name","p_table_1_text_1").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_rampa_tbl = new HiddenField(model,"id_rampa_tbl");
		id_rampa_tbl.setLabel(gt(""));
		id_rampa_tbl.propertie().add("name","p_id_rampa_tbl").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_rampa_tbl");
		


		btn_guardar = new IGRPButton("Guardar","sgie","Param_rampa_escada_corrim_interiro_e_exterior","guardar","submit_form","primary|fa-check","","");
		btn_guardar.propertie.add("id","button_36d1_5aab").add("type","form").add("class","primary").add("rel","guardar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sgie","Param_rampa_escada_corrim_interiro_e_exterior","editar","mpsubmit","warning|fa-edit","","");
		btn_editar.propertie.add("id","button_cff6_1323").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","sgie","Param_rampa_escada_corrim_interiro_e_exterior","eliminar","confirm","danger|fa-trash-o","","");
		btn_eliminar.propertie.add("id","button_cad5_2844").add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(descricao);
		form_1.addField(id_rampa);

		table_1.addField(table_1_text_1);
		table_1.addField(id_rampa_tbl);

		form_1.addButton(btn_guardar);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		descricao.setValue(model);
		id_rampa.setValue(model);
		table_1_text_1.setValue(model);
		id_rampa_tbl.setValue(model);	

		table_1.loadModel(((Param_rampa_escada_corrim_interiro_e_exterior) model).getTable_1());
		}
}
