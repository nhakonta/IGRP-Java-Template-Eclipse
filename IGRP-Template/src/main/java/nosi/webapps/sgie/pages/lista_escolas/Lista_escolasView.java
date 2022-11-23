package nosi.webapps.sgie.pages.lista_escolas;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Lista_escolasView extends View {

	public Field nome_escola;
	public Field esc_id;
	public Field codigo;
	public Field nome;
	public Field morada;
	public Field nivel_ensino;
	public Field telefone;
	public Field esc_id_tbl;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_pesquisar;
	public IGRPButton btn_detalhes;

	public Lista_escolasView(){

		this.setPageTitle("Lista Escolas");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		nome_escola = new ListField(model,"nome_escola");
		nome_escola.setLabel(gt("Nome Escola"));
		nome_escola.propertie().add("name","p_nome_escola").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		esc_id = new HiddenField(model,"esc_id");
		esc_id.setLabel(gt(""));
		esc_id.propertie().add("name","p_esc_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","esc_id");
		
		codigo = new NumberField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","30").add("showLabel","true").add("total_footer","false").add("group_in","").add("java-type","");
		
		nome = new TextAreaField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","textarea").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		morada = new TextField(model,"morada");
		morada.setLabel(gt("Morada"));
		morada.propertie().add("name","p_morada").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nivel_ensino = new TextField(model,"nivel_ensino");
		nivel_ensino.setLabel(gt("Nível Ensino"));
		nivel_ensino.propertie().add("name","p_nivel_ensino").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		telefone = new TextField(model,"telefone");
		telefone.setLabel(gt("Telefone"));
		telefone.propertie().add("name","p_telefone").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		esc_id_tbl = new HiddenField(model,"esc_id_tbl");
		esc_id_tbl.setLabel(gt(""));
		esc_id_tbl.propertie().add("name","p_esc_id_tbl").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","esc_id_tbl");
		


		btn_pesquisar = new IGRPButton("Pesquisar","sgie","Lista_escolas","pesquisar","submit_ajax","primary|fa-search","","");
		btn_pesquisar.propertie.add("id","button_371b_477d").add("type","form").add("class","primary").add("rel","pesquisar").add("refresh_components","table_1");

		btn_detalhes = new IGRPButton("Detalhes","sgie","Lista_escolas","detalhes","mpsubmit|refresh_submit","primary|fa-file-text-o","","");
		btn_detalhes.propertie.add("id","button_b7e9_c8b5").add("type","specific").add("class","primary").add("rel","detalhes").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(nome_escola);
		form_1.addField(esc_id);

		table_1.addField(codigo);
		table_1.addField(nome);
		table_1.addField(morada);
		table_1.addField(nivel_ensino);
		table_1.addField(telefone);
		table_1.addField(esc_id_tbl);

		form_1.addButton(btn_pesquisar);
		table_1.addButton(btn_detalhes);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_escola.setValue(model);
		esc_id.setValue(model);
		codigo.setValue(model);
		nome.setValue(model);
		morada.setValue(model);
		nivel_ensino.setValue(model);
		telefone.setValue(model);
		esc_id_tbl.setValue(model);	

		table_1.loadModel(((Lista_escolas) model).getTable_1());
		}
}
