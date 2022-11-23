package nosi.webapps.sgie.pages.param_razao_salas_inoperantes;

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
import nosi.webapps.sgie.dao.TblAuxRazaoSalasInoperantes; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_razao_salas_inoperantesController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_razao_salas_inoperantes model = new Param_razao_salas_inoperantes();
		model.load();
		Param_razao_salas_inoperantesView view = new Param_razao_salas_inoperantesView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Stract ipsum laudantium aliqua' as lista,'hidden-a8ee_df34' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxRazaoSalasInoperantes tblauxrazaosalasinoperantes = new TblAuxRazaoSalasInoperantes().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxrazaosalasinoperantes!=null && !tblauxrazaosalasinoperantes.hasError()) {
			model.setDescricao(tblauxrazaosalasinoperantes.getDescricao());
			model.setId(tblauxrazaosalasinoperantes.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxRazaoSalasInoperantes tblauxrazaosalasinoperantesfilter = new TblAuxRazaoSalasInoperantes().find();
	List<TblAuxRazaoSalasInoperantes> tblauxrazaosalasinoperantesList = tblauxrazaosalasinoperantesfilter.all();
	List<Param_razao_salas_inoperantes.Table_1> tblauxrazaosalasinoperantesTable = new ArrayList<>();
	if(Core.isNotNull(tblauxrazaosalasinoperantesList)){
		for(TblAuxRazaoSalasInoperantes tblauxrazaosalasinoperantes : tblauxrazaosalasinoperantesList){
			Param_razao_salas_inoperantes.Table_1 row  = new Param_razao_salas_inoperantes.Table_1();
			row.setLista(tblauxrazaosalasinoperantes.getDescricao());
			row.setId_tbl(tblauxrazaosalasinoperantes.getId().toString());
			tblauxrazaosalasinoperantesTable.add(row);
		}
		model.setTable_1(tblauxrazaosalasinoperantesTable);
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
		Param_razao_salas_inoperantes model = new Param_razao_salas_inoperantes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_razao_salas_inoperantes","index",this.queryString()); //if submit, loads the values
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
		TblAuxRazaoSalasInoperantes tblauxrazaosalasinoperantes  = new TblAuxRazaoSalasInoperantes();
		if(Core.isNotNull(isEdit)) {
			 tblauxrazaosalasinoperantes = session.find(TblAuxRazaoSalasInoperantes.class, Core.toInt(model.getId()));
		}
		if (tblauxrazaosalasinoperantes != null){
			tblauxrazaosalasinoperantes.setDescricao(model.getDescricao());
		}
		session.persist(tblauxrazaosalasinoperantes);
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
		return this.forward("sgie","Param_razao_salas_inoperantes","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_razao_salas_inoperantes","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_razao_salas_inoperantes model = new Param_razao_salas_inoperantes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_razao_salas_inoperantes","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_razao_salas_inoperantes","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_razao_salas_inoperantes model = new Param_razao_salas_inoperantes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_razao_salas_inoperantes","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxRazaoSalasInoperantes tblauxrazaosalasinoperantes = new TblAuxRazaoSalasInoperantes().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxrazaosalasinoperantes != null && !tblauxrazaosalasinoperantes.hasError()) {
		boolean del = tblauxrazaosalasinoperantes.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_razao_salas_inoperantes","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
