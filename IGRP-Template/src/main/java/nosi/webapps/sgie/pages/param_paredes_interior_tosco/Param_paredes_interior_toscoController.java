package nosi.webapps.sgie.pages.param_paredes_interior_tosco;

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
import nosi.webapps.sgie.dao.TblAuxParedeIntTosco; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_paredes_interior_toscoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_paredes_interior_tosco model = new Param_paredes_interior_tosco();
		model.load();
		Param_paredes_interior_toscoView view = new Param_paredes_interior_toscoView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT '22' as id_lista,'Labore sit unde officia mollit' as descricao_lista,'hidden-29c0_0158' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxParedeIntTosco tblauxparedeinttosco = new TblAuxParedeIntTosco().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxparedeinttosco!=null && !tblauxparedeinttosco.hasError()) {
			model.setDescricao(tblauxparedeinttosco.getDescricao());
			model.setId(tblauxparedeinttosco.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxParedeIntTosco tblauxparedeinttoscofilter = new TblAuxParedeIntTosco().find();
	List<TblAuxParedeIntTosco> tblauxparedeinttoscoList = tblauxparedeinttoscofilter.all();
	List<Param_paredes_interior_tosco.Table_1> tblauxparedeinttoscoTable = new ArrayList<>();
	if(Core.isNotNull(tblauxparedeinttoscoList)){
		for(TblAuxParedeIntTosco tblauxparedeinttosco : tblauxparedeinttoscoList){
			Param_paredes_interior_tosco.Table_1 row  = new Param_paredes_interior_tosco.Table_1();
			row.setId_lista(tblauxparedeinttosco.getId());
			row.setDescricao_lista(tblauxparedeinttosco.getDescricao());
			row.setId_tbl(tblauxparedeinttosco.getId().toString());
			tblauxparedeinttoscoTable.add(row);
		}
		model.setTable_1(tblauxparedeinttoscoTable);
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
		Param_paredes_interior_tosco model = new Param_paredes_interior_tosco();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_paredes_interior_tosco","index",this.queryString()); //if submit, loads the values
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
		TblAuxParedeIntTosco tblauxparedeinttosco  = new TblAuxParedeIntTosco();
		if(Core.isNotNull(isEdit)) {
			 tblauxparedeinttosco = session.find(TblAuxParedeIntTosco.class, Core.toInt(model.getId()));
		}
		if (tblauxparedeinttosco != null){
			tblauxparedeinttosco.setDescricao(model.getDescricao());
		}
		session.persist(tblauxparedeinttosco);
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
		return this.forward("sgie","Param_paredes_interior_tosco","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_paredes_interior_tosco","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_paredes_interior_tosco model = new Param_paredes_interior_tosco();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_paredes_interior_tosco","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_paredes_interior_tosco","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_paredes_interior_tosco model = new Param_paredes_interior_tosco();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_paredes_interior_tosco","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxParedeIntTosco tblauxparedeinttosco = new TblAuxParedeIntTosco().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxparedeinttosco != null && !tblauxparedeinttosco.hasError()) {
		boolean del = tblauxparedeinttosco.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_paredes_interior_tosco","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
