package nosi.webapps.sgie.pages.param_cobertura;

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
import nosi.webapps.sgie.dao.TblAuxCobertura; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_coberturaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_cobertura model = new Param_cobertura();
		model.load();
		Param_coberturaView view = new Param_coberturaView();
		view.id_cobertura_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Perspiciatis consectetur persp' as table_1_text_1,'hidden-7533_ebf4' as id_cobertura_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxCobertura tblauxcobertura = new TblAuxCobertura().findOne(Core.getParamInt("p_id_cobertura_tbl"));
		if (tblauxcobertura!=null && !tblauxcobertura.hasError()) {
			model.setDescricao(tblauxcobertura.getDescricao());
			model.setId_cobertura(tblauxcobertura.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxCobertura tblauxcoberturafilter = new TblAuxCobertura().find();
	List<TblAuxCobertura> tblauxcoberturaList = tblauxcoberturafilter.all();
	List<Param_cobertura.Table_1> tblauxcoberturaTable = new ArrayList<>();
	if(Core.isNotNull(tblauxcoberturaList)){
		for(TblAuxCobertura tblauxcobertura : tblauxcoberturaList){
			Param_cobertura.Table_1 row  = new Param_cobertura.Table_1();
			row.setTable_1_text_1(tblauxcobertura.getDescricao());
			row.setId_cobertura_tbl(tblauxcobertura.getId().toString());
			tblauxcoberturaTable.add(row);
		}
		model.setTable_1(tblauxcoberturaTable);
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
		Param_cobertura model = new Param_cobertura();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_cobertura_tbl",Core.getParam("p_id_cobertura_tbl"));
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
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
		TblAuxCobertura tblauxcobertura  = new TblAuxCobertura();
		if(Core.isNotNull(isEdit)) {
			 tblauxcobertura = session.find(TblAuxCobertura.class, Core.toInt(model.getId_cobertura()));
		}
		if (tblauxcobertura != null){
			tblauxcobertura.setDescricao(model.getDescricao());
		}
		session.persist(tblauxcobertura);
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
		return this.forward("sgie","Param_cobertura","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_cobertura model = new Param_cobertura();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_cobertura_tbl",Core.getParam("p_id_cobertura_tbl"));
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_cobertura_tbl", Core.getParam("p_id_cobertura_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_cobertura model = new Param_cobertura();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_cobertura_tbl",Core.getParam("p_id_cobertura_tbl"));
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxCobertura tblauxcobertura = new TblAuxCobertura().findOne(Core.getParamInt("p_id_cobertura_tbl"));
	if (tblauxcobertura != null && !tblauxcobertura.hasError()) {
		boolean del = tblauxcobertura.delete(Core.getParamInt("p_id_cobertura_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
