package nosi.webapps.sgie.pages.param_paredes_interior_revistimento;

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
import nosi.webapps.sgie.dao.TblAuxParedeIntRevestimFachada; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_paredes_interior_revistimentoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_paredes_interior_revistimento model = new Param_paredes_interior_revistimento();
		model.load();
		Param_paredes_interior_revistimentoView view = new Param_paredes_interior_revistimentoView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Sit aliqua deserunt magna dese' as lista,'hidden-6948_6ec5' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxParedeIntRevestimFachada tblauxparedeintrevestimfachada = new TblAuxParedeIntRevestimFachada().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxparedeintrevestimfachada!=null && !tblauxparedeintrevestimfachada.hasError()) {
			model.setDescricao(tblauxparedeintrevestimfachada.getDescricao());
			model.setId(tblauxparedeintrevestimfachada.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxParedeIntRevestimFachada tblauxparedeintrevestimfachadafilter = new TblAuxParedeIntRevestimFachada().find();
	List<TblAuxParedeIntRevestimFachada> tblauxparedeintrevestimfachadaList = tblauxparedeintrevestimfachadafilter.all();
	List<Param_paredes_interior_revistimento.Table_1> tblauxparedeintrevestimfachadaTable = new ArrayList<>();
	if(Core.isNotNull(tblauxparedeintrevestimfachadaList)){
		for(TblAuxParedeIntRevestimFachada tblauxparedeintrevestimfachada : tblauxparedeintrevestimfachadaList){
			Param_paredes_interior_revistimento.Table_1 row  = new Param_paredes_interior_revistimento.Table_1();
			row.setLista(tblauxparedeintrevestimfachada.getDescricao());
			row.setId_tbl(tblauxparedeintrevestimfachada.getId().toString());
			tblauxparedeintrevestimfachadaTable.add(row);
		}
		model.setTable_1(tblauxparedeintrevestimfachadaTable);
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
		Param_paredes_interior_revistimento model = new Param_paredes_interior_revistimento();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_paredes_interior_revistimento","index",this.queryString()); //if submit, loads the values
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
		TblAuxParedeIntRevestimFachada tblauxparedeintrevestimfachada  = new TblAuxParedeIntRevestimFachada();
		if(Core.isNotNull(isEdit)) {
			 tblauxparedeintrevestimfachada = session.find(TblAuxParedeIntRevestimFachada.class, Core.toInt(model.getId()));
		}
		if (tblauxparedeintrevestimfachada != null){
			tblauxparedeintrevestimfachada.setDescricao(model.getDescricao());
		}
		session.persist(tblauxparedeintrevestimfachada);
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
		return this.forward("sgie","Param_paredes_interior_revistimento","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_paredes_interior_revistimento","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_paredes_interior_revistimento model = new Param_paredes_interior_revistimento();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_paredes_interior_revistimento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_paredes_interior_revistimento","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_paredes_interior_revistimento model = new Param_paredes_interior_revistimento();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_paredes_interior_revistimento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxParedeIntRevestimFachada tblauxparedeintrevestimfachada = new TblAuxParedeIntRevestimFachada().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxparedeintrevestimfachada != null && !tblauxparedeintrevestimfachada.hasError()) {
		boolean del = tblauxparedeintrevestimfachada.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_paredes_interior_revistimento","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
