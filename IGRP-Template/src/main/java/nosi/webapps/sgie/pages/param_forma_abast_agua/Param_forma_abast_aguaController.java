package nosi.webapps.sgie.pages.param_forma_abast_agua;

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
import nosi.webapps.sgie.dao.TblAuxAbastecimentoAgua; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_forma_abast_aguaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_forma_abast_agua model = new Param_forma_abast_agua();
		model.load();
		Param_forma_abast_aguaView view = new Param_forma_abast_aguaView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Omnis totam accusantium dolore' as lista,'hidden-8ae5_7051' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxAbastecimentoAgua tblauxabastecimentoagua = new TblAuxAbastecimentoAgua().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxabastecimentoagua!=null && !tblauxabastecimentoagua.hasError()) {
			model.setDescricao(tblauxabastecimentoagua.getDescricao());
			model.setId(tblauxabastecimentoagua.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxAbastecimentoAgua tblauxabastecimentoaguafilter = new TblAuxAbastecimentoAgua().find();
	List<TblAuxAbastecimentoAgua> tblauxabastecimentoaguaList = tblauxabastecimentoaguafilter.all();
	List<Param_forma_abast_agua.Table_1> tblauxabastecimentoaguaTable = new ArrayList<>();
	if(Core.isNotNull(tblauxabastecimentoaguaList)){
		for(TblAuxAbastecimentoAgua tblauxabastecimentoagua : tblauxabastecimentoaguaList){
			Param_forma_abast_agua.Table_1 row  = new Param_forma_abast_agua.Table_1();
			row.setLista(tblauxabastecimentoagua.getDescricao());
			row.setId_tbl(tblauxabastecimentoagua.getId().toString());
			tblauxabastecimentoaguaTable.add(row);
		}
		model.setTable_1(tblauxabastecimentoaguaTable);
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
		Param_forma_abast_agua model = new Param_forma_abast_agua();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_forma_abast_agua","index",this.queryString()); //if submit, loads the values
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
		TblAuxAbastecimentoAgua tblauxabastecimentoagua  = new TblAuxAbastecimentoAgua();
		if(Core.isNotNull(isEdit)) {
			 tblauxabastecimentoagua = session.find(TblAuxAbastecimentoAgua.class, Core.toInt(model.getId()));
		}
		if (tblauxabastecimentoagua != null){
			tblauxabastecimentoagua.setDescricao(model.getDescricao());
		}
		session.persist(tblauxabastecimentoagua);
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
		return this.forward("sgie","Param_forma_abast_agua","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_forma_abast_agua","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_forma_abast_agua model = new Param_forma_abast_agua();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_forma_abast_agua","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_forma_abast_agua","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_forma_abast_agua model = new Param_forma_abast_agua();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_forma_abast_agua","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxAbastecimentoAgua tblauxabastecimentoagua = new TblAuxAbastecimentoAgua().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxabastecimentoagua != null && !tblauxabastecimentoagua.hasError()) {
		boolean del = tblauxabastecimentoagua.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_forma_abast_agua","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
