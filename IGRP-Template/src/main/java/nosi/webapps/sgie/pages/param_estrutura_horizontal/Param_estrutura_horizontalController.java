package nosi.webapps.sgie.pages.param_estrutura_horizontal;

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
import nosi.webapps.sgie.dao.TblAuxEstruturaHorizontal; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_estrutura_horizontalController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_estrutura_horizontal model = new Param_estrutura_horizontal();
		model.load();
		Param_estrutura_horizontalView view = new Param_estrutura_horizontalView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Natus accusantium aliqua labor' as lista,'hidden-aeab_2c6a' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxEstruturaHorizontal tblauxestruturahorizontal = new TblAuxEstruturaHorizontal().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxestruturahorizontal!=null && !tblauxestruturahorizontal.hasError()) {
			model.setDescricao(tblauxestruturahorizontal.getDescricao());
			model.setId(tblauxestruturahorizontal.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxEstruturaHorizontal tblauxestruturahorizontalfilter = new TblAuxEstruturaHorizontal().find();
	List<TblAuxEstruturaHorizontal> tblauxestruturahorizontalList = tblauxestruturahorizontalfilter.all();
	List<Param_estrutura_horizontal.Table_1> tblauxestruturahorizontalTable = new ArrayList<>();
	if(Core.isNotNull(tblauxestruturahorizontalList)){
		for(TblAuxEstruturaHorizontal tblauxestruturahorizontal : tblauxestruturahorizontalList){
			Param_estrutura_horizontal.Table_1 row  = new Param_estrutura_horizontal.Table_1();
			row.setLista(tblauxestruturahorizontal.getDescricao());
			row.setId_tbl(tblauxestruturahorizontal.getId().toString());
			tblauxestruturahorizontalTable.add(row);
		}
		model.setTable_1(tblauxestruturahorizontalTable);
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
		Param_estrutura_horizontal model = new Param_estrutura_horizontal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_estrutura_horizontal","index",this.queryString()); //if submit, loads the values
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
		TblAuxEstruturaHorizontal tblauxestruturahorizontal  = new TblAuxEstruturaHorizontal();
		if(Core.isNotNull(isEdit)) {
			 tblauxestruturahorizontal = session.find(TblAuxEstruturaHorizontal.class, Core.toInt(model.getId()));
		}
		if (tblauxestruturahorizontal != null){
			tblauxestruturahorizontal.setDescricao(model.getDescricao());
		}
		session.persist(tblauxestruturahorizontal);
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
		return this.forward("sgie","Param_estrutura_horizontal","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_estrutura_horizontal","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_estrutura_horizontal model = new Param_estrutura_horizontal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_estrutura_horizontal","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_estrutura_horizontal","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_estrutura_horizontal model = new Param_estrutura_horizontal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_estrutura_horizontal","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxEstruturaHorizontal tblauxestruturahorizontal = new TblAuxEstruturaHorizontal().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxestruturahorizontal != null && !tblauxestruturahorizontal.hasError()) {
		boolean del = tblauxestruturahorizontal.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_estrutura_horizontal","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
