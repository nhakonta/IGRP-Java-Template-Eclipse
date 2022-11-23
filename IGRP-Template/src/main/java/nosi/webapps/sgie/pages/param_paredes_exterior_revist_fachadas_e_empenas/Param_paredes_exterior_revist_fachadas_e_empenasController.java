package nosi.webapps.sgie.pages.param_paredes_exterior_revist_fachadas_e_empenas;

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
import nosi.webapps.sgie.dao.TblAuxParedeExtRevestimFachadaEmpena; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_paredes_exterior_revist_fachadas_e_empenasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_paredes_exterior_revist_fachadas_e_empenas model = new Param_paredes_exterior_revist_fachadas_e_empenas();
		model.load();
		Param_paredes_exterior_revist_fachadas_e_empenasView view = new Param_paredes_exterior_revist_fachadas_e_empenasView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Voluptatem perspiciatis elit o' as table_1_text_1,'hidden-187a_077a' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxParedeExtRevestimFachadaEmpena tblauxparedeextrevestimfachadaempena = new TblAuxParedeExtRevestimFachadaEmpena().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxparedeextrevestimfachadaempena!=null && !tblauxparedeextrevestimfachadaempena.hasError()) {
			model.setDescricao(tblauxparedeextrevestimfachadaempena.getDescricao());
			model.setId(tblauxparedeextrevestimfachadaempena.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxParedeExtRevestimFachadaEmpena tblauxparedeextrevestimfachadaempenafilter = new TblAuxParedeExtRevestimFachadaEmpena().find();
	List<TblAuxParedeExtRevestimFachadaEmpena> tblauxparedeextrevestimfachadaempenaList = tblauxparedeextrevestimfachadaempenafilter.all();
	List<Param_paredes_exterior_revist_fachadas_e_empenas.Table_1> tblauxparedeextrevestimfachadaempenaTable = new ArrayList<>();
	if(Core.isNotNull(tblauxparedeextrevestimfachadaempenaList)){
		for(TblAuxParedeExtRevestimFachadaEmpena tblauxparedeextrevestimfachadaempena : tblauxparedeextrevestimfachadaempenaList){
			Param_paredes_exterior_revist_fachadas_e_empenas.Table_1 row  = new Param_paredes_exterior_revist_fachadas_e_empenas.Table_1();
			row.setTable_1_text_1(tblauxparedeextrevestimfachadaempena.getDescricao());
			row.setId_tbl(tblauxparedeextrevestimfachadaempena.getId().toString());
			tblauxparedeextrevestimfachadaempenaTable.add(row);
		}
		model.setTable_1(tblauxparedeextrevestimfachadaempenaTable);
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
		Param_paredes_exterior_revist_fachadas_e_empenas model = new Param_paredes_exterior_revist_fachadas_e_empenas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_paredes_exterior_revist_fachadas_e_empenas","index",this.queryString()); //if submit, loads the values
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
		TblAuxParedeExtRevestimFachadaEmpena tblauxparedeextrevestimfachadaempena  = new TblAuxParedeExtRevestimFachadaEmpena();
		if(Core.isNotNull(isEdit)) {
			 tblauxparedeextrevestimfachadaempena = session.find(TblAuxParedeExtRevestimFachadaEmpena.class, Core.toInt(model.getId()));
		}
		if (tblauxparedeextrevestimfachadaempena != null){
			tblauxparedeextrevestimfachadaempena.setDescricao(model.getDescricao());
		}
		session.persist(tblauxparedeextrevestimfachadaempena);
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
		return this.forward("sgie","Param_paredes_exterior_revist_fachadas_e_empenas","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_paredes_exterior_revist_fachadas_e_empenas","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_paredes_exterior_revist_fachadas_e_empenas model = new Param_paredes_exterior_revist_fachadas_e_empenas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_paredes_exterior_revist_fachadas_e_empenas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_paredes_exterior_revist_fachadas_e_empenas","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_paredes_exterior_revist_fachadas_e_empenas model = new Param_paredes_exterior_revist_fachadas_e_empenas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_paredes_exterior_revist_fachadas_e_empenas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxParedeExtRevestimFachadaEmpena tblauxparedeextrevestimfachadaempena = new TblAuxParedeExtRevestimFachadaEmpena().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxparedeextrevestimfachadaempena != null && !tblauxparedeextrevestimfachadaempena.hasError()) {
		boolean del = tblauxparedeextrevestimfachadaempena.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_paredes_exterior_revist_fachadas_e_empenas","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
