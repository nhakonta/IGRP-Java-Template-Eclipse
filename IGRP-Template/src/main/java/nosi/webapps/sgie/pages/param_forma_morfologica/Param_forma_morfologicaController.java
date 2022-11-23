package nosi.webapps.sgie.pages.param_forma_morfologica;

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
import nosi.webapps.sgie.dao.TblAuxMorfaMorfo; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_forma_morfologicaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_forma_morfologica model = new Param_forma_morfologica();
		model.load();
		Param_forma_morfologicaView view = new Param_forma_morfologicaView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Accusantium sed rem accusantiu' as lista,'hidden-9aac_a39c' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxMorfaMorfo tblauxmorfamorfo = new TblAuxMorfaMorfo().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxmorfamorfo!=null && !tblauxmorfamorfo.hasError()) {
			model.setDescricao(tblauxmorfamorfo.getDescricao());
			model.setId(tblauxmorfamorfo.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxMorfaMorfo tblauxmorfamorfofilter = new TblAuxMorfaMorfo().find();
	List<TblAuxMorfaMorfo> tblauxmorfamorfoList = tblauxmorfamorfofilter.all();
	List<Param_forma_morfologica.Table_1> tblauxmorfamorfoTable = new ArrayList<>();
	if(Core.isNotNull(tblauxmorfamorfoList)){
		for(TblAuxMorfaMorfo tblauxmorfamorfo : tblauxmorfamorfoList){
			Param_forma_morfologica.Table_1 row  = new Param_forma_morfologica.Table_1();
			row.setLista(tblauxmorfamorfo.getDescricao());
			row.setId_tbl(tblauxmorfamorfo.getId().toString());
			tblauxmorfamorfoTable.add(row);
		}
		model.setTable_1(tblauxmorfamorfoTable);
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
		Param_forma_morfologica model = new Param_forma_morfologica();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_forma_morfologica","index",this.queryString()); //if submit, loads the values
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
		TblAuxMorfaMorfo tblauxmorfamorfo  = new TblAuxMorfaMorfo();
		if(Core.isNotNull(isEdit)) {
			 tblauxmorfamorfo = session.find(TblAuxMorfaMorfo.class, Core.toInt(model.getId()));
		}
		if (tblauxmorfamorfo != null){
			tblauxmorfamorfo.setDescricao(model.getDescricao());
		}
		session.persist(tblauxmorfamorfo);
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
		return this.forward("sgie","Param_forma_morfologica","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_forma_morfologica","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_forma_morfologica model = new Param_forma_morfologica();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_forma_morfologica","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_forma_morfologica","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_forma_morfologica model = new Param_forma_morfologica();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_forma_morfologica","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxMorfaMorfo tblauxmorfamorfo = new TblAuxMorfaMorfo().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxmorfamorfo != null && !tblauxmorfamorfo.hasError()) {
		boolean del = tblauxmorfamorfo.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_forma_morfologica","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
