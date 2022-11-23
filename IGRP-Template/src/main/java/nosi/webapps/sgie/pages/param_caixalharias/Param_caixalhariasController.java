package nosi.webapps.sgie.pages.param_caixalharias;

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
import nosi.webapps.sgie.dao.TblAuxCaixalhariasMaterial; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_caixalhariasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_caixalharias model = new Param_caixalharias();
		model.load();
		Param_caixalhariasView view = new Param_caixalhariasView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Perspiciatis aperiam elit aper' as lista,'hidden-0221_5f5f' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxCaixalhariasMaterial tblauxcaixalhariasmaterial = new TblAuxCaixalhariasMaterial().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxcaixalhariasmaterial!=null && !tblauxcaixalhariasmaterial.hasError()) {
			model.setDescricao(tblauxcaixalhariasmaterial.getDescricao());
			model.setId(tblauxcaixalhariasmaterial.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxCaixalhariasMaterial tblauxcaixalhariasmaterialfilter = new TblAuxCaixalhariasMaterial().find();
	List<TblAuxCaixalhariasMaterial> tblauxcaixalhariasmaterialList = tblauxcaixalhariasmaterialfilter.all();
	List<Param_caixalharias.Table_1> tblauxcaixalhariasmaterialTable = new ArrayList<>();
	if(Core.isNotNull(tblauxcaixalhariasmaterialList)){
		for(TblAuxCaixalhariasMaterial tblauxcaixalhariasmaterial : tblauxcaixalhariasmaterialList){
			Param_caixalharias.Table_1 row  = new Param_caixalharias.Table_1();
			row.setLista(tblauxcaixalhariasmaterial.getDescricao());
			row.setId_tbl(tblauxcaixalhariasmaterial.getId().toString());
			tblauxcaixalhariasmaterialTable.add(row);
		}
		model.setTable_1(tblauxcaixalhariasmaterialTable);
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
		Param_caixalharias model = new Param_caixalharias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_caixalharias","index",this.queryString()); //if submit, loads the values
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
		TblAuxCaixalhariasMaterial tblauxcaixalhariasmaterial  = new TblAuxCaixalhariasMaterial();
		if(Core.isNotNull(isEdit)) {
			 tblauxcaixalhariasmaterial = session.find(TblAuxCaixalhariasMaterial.class, Core.toInt(model.getId()));
		}
		if (tblauxcaixalhariasmaterial != null){
			tblauxcaixalhariasmaterial.setDescricao(model.getDescricao());
		}
		session.persist(tblauxcaixalhariasmaterial);
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
		return this.forward("sgie","Param_caixalharias","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_caixalharias","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_caixalharias model = new Param_caixalharias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_caixalharias","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_caixalharias","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_caixalharias model = new Param_caixalharias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_caixalharias","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxCaixalhariasMaterial tblauxcaixalhariasmaterial = new TblAuxCaixalhariasMaterial().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxcaixalhariasmaterial != null && !tblauxcaixalhariasmaterial.hasError()) {
		boolean del = tblauxcaixalhariasmaterial.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_caixalharias","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
