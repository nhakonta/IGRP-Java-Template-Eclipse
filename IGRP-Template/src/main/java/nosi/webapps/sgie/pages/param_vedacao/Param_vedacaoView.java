package nosi.webapps.sgie.pages.param_vedacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Param_vedacaoView extends View {

	public Field descricao;
	public Field id;
	public Field lista;
	public Field id_tbl;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_guardar;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public Param_vedacaoView(){

		this.setPageTitle("Param Vedação");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","id");
		
		lista = new TextField(model,"lista");
		lista.setLabel(gt("Lista"));
		lista.propertie().add("name","p_lista").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_tbl = new HiddenField(model,"id_tbl");
		id_tbl.setLabel(gt(""));
		id_tbl.propertie().add("name","p_id_tbl").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_tbl");
		


		btn_guardar = new IGRPButton("Guardar","sgie","Param_vedacao","guardar","submit_form","primary|fa-check","","");
		btn_guardar.propertie.add("id","button_56fb_53b9").add("type","form").add("class","primary").add("rel","guardar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sgie","Param_vedacao","editar","mpsubmit","warning|fa-edit","","");
		btn_editar.propertie.add("id","button_85ab_1571").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","sgie","Param_vedacao","eliminar","confirm","primary|fa-trash-o","","");
		btn_eliminar.propertie.add("id","button_04b8_ca7e").add("type","specific").add("class","primary").add("rel","eliminar").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(descricao);
		form_1.addField(id);

		table_1.addField(lista);
		table_1.addField(id_tbl);

		form_1.addButton(btn_guardar);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		descricao.setValue(model);
		id.setValue(model);
		lista.setValue(model);
		id_tbl.setValue(model);	

		table_1.loadModel(((Param_vedacao) model).getTable_1());
		}
}
