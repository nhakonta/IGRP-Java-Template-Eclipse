package nosi.webapps.sgie.pages.param_estrutura_vertical;

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
import nosi.webapps.sgie.dao.TblAuxEstruturaVertical; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_estrutura_verticalController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_estrutura_vertical model = new Param_estrutura_vertical();
		model.load();
		Param_estrutura_verticalView view = new Param_estrutura_verticalView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Sed ut anim ipsum amet' as lista,'hidden-c1e9_e9bb' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxEstruturaVertical tblauxestruturavertical = new TblAuxEstruturaVertical().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxestruturavertical!=null && !tblauxestruturavertical.hasError()) {
			model.setDescricao(tblauxestruturavertical.getDescricao());
			model.setId(tblauxestruturavertical.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxEstruturaVertical tblauxestruturaverticalfilter = new TblAuxEstruturaVertical().find();
	List<TblAuxEstruturaVertical> tblauxestruturaverticalList = tblauxestruturaverticalfilter.all();
	List<Param_estrutura_vertical.Table_1> tblauxestruturaverticalTable = new ArrayList<>();
	if(Core.isNotNull(tblauxestruturaverticalList)){
		for(TblAuxEstruturaVertical tblauxestruturavertical : tblauxestruturaverticalList){
			Param_estrutura_vertical.Table_1 row  = new Param_estrutura_vertical.Table_1();
			row.setLista(tblauxestruturavertical.getDescricao());
			row.setId_tbl(tblauxestruturavertical.getId().toString());
			tblauxestruturaverticalTable.add(row);
		}
		model.setTable_1(tblauxestruturaverticalTable);
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
		Param_estrutura_vertical model = new Param_estrutura_vertical();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_estrutura_vertical","index",this.queryString()); //if submit, loads the values
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
		TblAuxEstruturaVertical tblauxestruturavertical  = new TblAuxEstruturaVertical();
		if(Core.isNotNull(isEdit)) {
			 tblauxestruturavertical = session.find(TblAuxEstruturaVertical.class, Core.toInt(model.getId()));
		}
		if (tblauxestruturavertical != null){
			tblauxestruturavertical.setDescricao(model.getDescricao());
		}
		session.persist(tblauxestruturavertical);
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
		return this.forward("sgie","Param_estrutura_vertical","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_estrutura_vertical","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_estrutura_vertical model = new Param_estrutura_vertical();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_estrutura_vertical","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_estrutura_vertical","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_estrutura_vertical model = new Param_estrutura_vertical();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_estrutura_vertical","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxEstruturaVertical tblauxestruturavertical = new TblAuxEstruturaVertical().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxestruturavertical != null && !tblauxestruturavertical.hasError()) {
		boolean del = tblauxestruturavertical.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_estrutura_vertical","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
