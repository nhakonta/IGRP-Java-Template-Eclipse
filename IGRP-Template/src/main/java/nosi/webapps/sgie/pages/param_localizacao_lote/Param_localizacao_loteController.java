package nosi.webapps.sgie.pages.param_localizacao_lote;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import org.hibernate.Session; //block import
import org.hibernate.Transaction; //block import
import nosi.webapps.sgie.dao.TblAuxLocalizacaoLote; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_localizacao_loteController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_localizacao_lote model = new Param_localizacao_lote();
		model.load();
		Param_localizacao_loteView view = new Param_localizacao_loteView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Labore iste ut ipsum totam' as lista,'hidden-7d6b_66cd' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxLocalizacaoLote tblauxlocalizacaolote = new TblAuxLocalizacaoLote().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxlocalizacaolote!=null && !tblauxlocalizacaolote.hasError()) {
			model.setDescricao(tblauxlocalizacaolote.getDescricao());
			model.setId(tblauxlocalizacaolote.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxLocalizacaoLote tblauxlocalizacaolotefilter = new TblAuxLocalizacaoLote().find();
	List<TblAuxLocalizacaoLote> tblauxlocalizacaoloteList = tblauxlocalizacaolotefilter.all();
	List<Param_localizacao_lote.Table_1> tblauxlocalizacaoloteTable = new ArrayList<>();
	if(Core.isNotNull(tblauxlocalizacaoloteList)){
		for(TblAuxLocalizacaoLote tblauxlocalizacaolote : tblauxlocalizacaoloteList){
			Param_localizacao_lote.Table_1 row  = new Param_localizacao_lote.Table_1();
			row.setLista(tblauxlocalizacaolote.getDescricao());
			row.setId_tbl(tblauxlocalizacaolote.getId().toString());
			tblauxlocalizacaoloteTable.add(row);
		}
		model.setTable_1(tblauxlocalizacaoloteTable);
	}
	}catch(Exception e){
		e.printStackTrace();
	}/* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGuardar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_localizacao_lote model = new Param_localizacao_lote();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_localizacao_lote","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (guardar)  */
	Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		if(!transaction.isActive())
			transaction.begin();
		TblAuxLocalizacaoLote tblauxlocalizacaolote  = new TblAuxLocalizacaoLote();
		if(Core.isNotNull(isEdit)) {
			 tblauxlocalizacaolote = session.find(TblAuxLocalizacaoLote.class, Core.toInt(model.getId()));
		}
		if (tblauxlocalizacaolote != null){
			tblauxlocalizacaolote.setDescricao(model.getDescricao());
		}
		session.persist(tblauxlocalizacaolote);
		transaction.commit();
		Core.setMessageSuccess();
	}
	else
		Core.setMessageError();
	}catch ( Exception e ) {
		e.printStackTrace();
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
	if(Core.isNotNull(isEdit)) {
		this.addQueryString("isEdit", "true");
		return this.forward("sgie","Param_localizacao_lote","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_localizacao_lote","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_localizacao_lote model = new Param_localizacao_lote();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_localizacao_lote","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_localizacao_lote","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_localizacao_lote model = new Param_localizacao_lote();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_localizacao_lote","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxLocalizacaoLote tblauxlocalizacaolote = new TblAuxLocalizacaoLote().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxlocalizacaolote != null && !tblauxlocalizacaolote.hasError()) {
		boolean del = tblauxlocalizacaolote.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_localizacao_lote","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
