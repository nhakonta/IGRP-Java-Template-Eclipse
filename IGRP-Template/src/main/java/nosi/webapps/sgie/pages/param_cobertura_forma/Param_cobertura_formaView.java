package nosi.webapps.sgie.pages.param_cobertura_forma;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Param_cobertura_formaView extends View {

	public Field descricao;
	public Field id_cobertura_forma;
	public Field lista;
	public Field id_cobertura_forma_tbl;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_guardar;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public Param_cobertura_formaView(){

		this.setPageTitle("Param Cobertura Forma");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		id_cobertura_forma = new HiddenField(model,"id_cobertura_forma");
		id_cobertura_forma.setLabel(gt(""));
		id_cobertura_forma.propertie().add("name","p_id_cobertura_forma").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","id_cobertura_forma");
		
		lista = new TextField(model,"lista");
		lista.setLabel(gt("Lista"));
		lista.propertie().add("name","p_lista").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_cobertura_forma_tbl = new HiddenField(model,"id_cobertura_forma_tbl");
		id_cobertura_forma_tbl.setLabel(gt(""));
		id_cobertura_forma_tbl.propertie().add("name","p_id_cobertura_forma_tbl").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_cobertura_forma_tbl");
		


		btn_guardar = new IGRPButton("Guardar","sgie","Param_cobertura_forma","guardar","submit_form","primary|fa-check","","");
		btn_guardar.propertie.add("id","button_ee14_e1f8").add("type","form").add("class","primary").add("rel","guardar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sgie","Param_cobertura_forma","editar","mpsubmit","warning|fa-edit","","");
		btn_editar.propertie.add("id","button_342c_fa1a").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","sgie","Param_cobertura_forma","eliminar","confirm","danger|fa-trash-o","","");
		btn_eliminar.propertie.add("id","button_78c0_fb75").add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(descricao);
		form_1.addField(id_cobertura_forma);

		table_1.addField(lista);
		table_1.addField(id_cobertura_forma_tbl);

		form_1.addButton(btn_guardar);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		descricao.setValue(model);
		id_cobertura_forma.setValue(model);
		lista.setValue(model);
		id_cobertura_forma_tbl.setValue(model);	

		table_1.loadModel(((Param_cobertura_forma) model).getTable_1());
		}
}
