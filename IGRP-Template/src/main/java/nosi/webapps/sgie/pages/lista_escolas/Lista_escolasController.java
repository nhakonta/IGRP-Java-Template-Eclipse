package nosi.webapps.sgie.pages.lista_escolas;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import java.util.List; //block import
import java.util.LinkedHashMap; //block import
import static nosi.core.i18n.Translator.gt; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Lista_escolasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_escolas model = new Lista_escolas();
		model.load();
		Lista_escolasView view = new Lista_escolasView();
		view.esc_id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT '1' as codigo,'Perspiciatis amet mollit persp' as nome,'Magna totam perspiciatis ipsum' as morada,'Totam elit totam unde laudanti' as nivel_ensino,'Voluptatem aperiam unde adipis' as telefone,'hidden-1c93_fbda' as esc_id_tbl "));
		view.nome_escola.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	TblAuxEscolas tblauxescolasfilter = new TblAuxEscolas().find();
	List<TblAuxEscolas> tblauxescolasList = tblauxescolasfilter.all();
	LinkedHashMap<String, String> nome_escola = new LinkedHashMap<>();
	nome_escola.put(null, gt("-- Selecionar --"));
	for(TblAuxEscolas tblauxescolas : tblauxescolasList){
		nome_escola.put(tblauxescolas.getId().toString(), gt(tblauxescolas.getNome()));
	}
	view.nome_escola.setValue(nome_escola);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxEscolas tblauxescolasfilter = new TblAuxEscolas().find();
	if(Core.isNotNullOrZero(model.getNome_escola())){
		tblauxescolasfilter.andWhere("id","=",Core.toInt(model.getNome_escola()));
	}
	List<TblAuxEscolas> tblauxescolasList = tblauxescolasfilter.all();
	List<Lista_escolas.Table_1> tblauxescolasTable = new ArrayList<>();
	if(Core.isNotNull(tblauxescolasList)){
		for(TblAuxEscolas tblauxescolas : tblauxescolasList){
			Lista_escolas.Table_1 row  = new Lista_escolas.Table_1();
			row.setCodigo(tblauxescolas.getId());
			row.setNome(tblauxescolas.getNome());
			row.setMorada(tblauxescolas.getZona());
			row.setNivel_ensino(tblauxescolas.getNivelEnsino());
			row.setTelefone(tblauxescolas.getTelefone());
			row.setEsc_id_tbl(tblauxescolas.getId().toString());
			tblauxescolasTable.add(row);
		}
		model.setTable_1(tblauxescolasTable);
	}
	}catch(Exception e){
		e.printStackTrace();
	}/* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_escolas model = new Lista_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Lista_escolas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (pesquisar)  */
	return this.forward("sgie","Lista_escolas","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(pesquisar)----*/
		
		
		/*----#end-code----*/
			
	}
	
	public Response actionDetalhes() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_escolas model = new Lista_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Dados_escolas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (detalhes)  */
	this.addQueryString("p_esc_id_tbl", Core.getParam("p_esc_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(detalhes)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Dados_escolas","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
