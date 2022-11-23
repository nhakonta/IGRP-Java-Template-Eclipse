package nosi.webapps.sgie.pages.param_elementos_vert_suporte_estruturas;

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
import nosi.webapps.sgie.dao.TblAuxEstrElemVerticaisSuporte; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_elementos_vert_suporte_estruturasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_elementos_vert_suporte_estruturas model = new Param_elementos_vert_suporte_estruturas();
		model.load();
		Param_elementos_vert_suporte_estruturasView view = new Param_elementos_vert_suporte_estruturasView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Rem stract labore ipsum volupt' as table_1_text_1,'hidden-cd62_1c30' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxEstrElemVerticaisSuporte tblauxestrelemverticaissuporte = new TblAuxEstrElemVerticaisSuporte().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxestrelemverticaissuporte!=null && !tblauxestrelemverticaissuporte.hasError()) {
			model.setDescricao(tblauxestrelemverticaissuporte.getDescricao());
			model.setId(tblauxestrelemverticaissuporte.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxEstrElemVerticaisSuporte tblauxestrelemverticaissuportefilter = new TblAuxEstrElemVerticaisSuporte().find();
	List<TblAuxEstrElemVerticaisSuporte> tblauxestrelemverticaissuporteList = tblauxestrelemverticaissuportefilter.all();
	List<Param_elementos_vert_suporte_estruturas.Table_1> tblauxestrelemverticaissuporteTable = new ArrayList<>();
	if(Core.isNotNull(tblauxestrelemverticaissuporteList)){
		for(TblAuxEstrElemVerticaisSuporte tblauxestrelemverticaissuporte : tblauxestrelemverticaissuporteList){
			Param_elementos_vert_suporte_estruturas.Table_1 row  = new Param_elementos_vert_suporte_estruturas.Table_1();
			row.setTable_1_text_1(tblauxestrelemverticaissuporte.getDescricao());
			row.setId_tbl(tblauxestrelemverticaissuporte.getId().toString());
			tblauxestrelemverticaissuporteTable.add(row);
		}
		model.setTable_1(tblauxestrelemverticaissuporteTable);
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
		Param_elementos_vert_suporte_estruturas model = new Param_elementos_vert_suporte_estruturas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_elementos_vert_suporte_estruturas","index",this.queryString()); //if submit, loads the values
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
		TblAuxEstrElemVerticaisSuporte tblauxestrelemverticaissuporte  = new TblAuxEstrElemVerticaisSuporte();
		if(Core.isNotNull(isEdit)) {
			 tblauxestrelemverticaissuporte = session.find(TblAuxEstrElemVerticaisSuporte.class, Core.toInt(model.getId()));
		}
		if (tblauxestrelemverticaissuporte != null){
			tblauxestrelemverticaissuporte.setDescricao(model.getDescricao());
		}
		session.persist(tblauxestrelemverticaissuporte);
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
		return this.forward("sgie","Param_elementos_vert_suporte_estruturas","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_elementos_vert_suporte_estruturas","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_elementos_vert_suporte_estruturas model = new Param_elementos_vert_suporte_estruturas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_elementos_vert_suporte_estruturas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_elementos_vert_suporte_estruturas","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_elementos_vert_suporte_estruturas model = new Param_elementos_vert_suporte_estruturas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_elementos_vert_suporte_estruturas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxEstrElemVerticaisSuporte tblauxestrelemverticaissuporte = new TblAuxEstrElemVerticaisSuporte().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxestrelemverticaissuporte != null && !tblauxestrelemverticaissuporte.hasError()) {
		boolean del = tblauxestrelemverticaissuporte.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_elementos_vert_suporte_estruturas","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
