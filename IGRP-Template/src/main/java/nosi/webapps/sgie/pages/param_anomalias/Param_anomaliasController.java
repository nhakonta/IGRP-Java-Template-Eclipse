package nosi.webapps.sgie.pages.param_anomalias;

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
import nosi.webapps.sgie.dao.TblAuxAnomalias; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_anomaliasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_anomalias model = new Param_anomalias();
		model.load();
		Param_anomaliasView view = new Param_anomaliasView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Dolor elit stract dolor elit' as lista,'hidden-34a2_92f7' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxAnomalias tblauxanomalias = new TblAuxAnomalias().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxanomalias!=null && !tblauxanomalias.hasError()) {
			model.setDescricao(tblauxanomalias.getDescricao());
			model.setId(tblauxanomalias.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	List<Param_anomalias.Table_1> tblauxanomaliasTable = new ArrayList<>();
	if(Core.isNotNull(tblauxanomaliasList)){
		for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
			Param_anomalias.Table_1 row  = new Param_anomalias.Table_1();
			row.setLista(tblauxanomalias.getDescricao());
			row.setId_tbl(tblauxanomalias.getId().toString());
			tblauxanomaliasTable.add(row);
		}
		model.setTable_1(tblauxanomaliasTable);
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
		Param_anomalias model = new Param_anomalias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_anomalias","index",this.queryString()); //if submit, loads the values
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
		TblAuxAnomalias tblauxanomalias  = new TblAuxAnomalias();
		if(Core.isNotNull(isEdit)) {
			 tblauxanomalias = session.find(TblAuxAnomalias.class, Core.toInt(model.getId()));
		}
		if (tblauxanomalias != null){
			tblauxanomalias.setDescricao(model.getDescricao());
		}
		session.persist(tblauxanomalias);
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
		return this.forward("sgie","Param_anomalias","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_anomalias","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_anomalias model = new Param_anomalias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_anomalias","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_anomalias","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_anomalias model = new Param_anomalias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_anomalias","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxAnomalias tblauxanomalias = new TblAuxAnomalias().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxanomalias != null && !tblauxanomalias.hasError()) {
		boolean del = tblauxanomalias.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_anomalias","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
