package nosi.webapps.sgie.pages.param_portao_pedonal_e_automovel;

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
import nosi.webapps.sgie.dao.TblAuxPortaoPedAut; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_portao_pedonal_e_automovelController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_portao_pedonal_e_automovel model = new Param_portao_pedonal_e_automovel();
		model.load();
		Param_portao_pedonal_e_automovelView view = new Param_portao_pedonal_e_automovelView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Dolor ut unde magna adipiscing' as lista,'hidden-26c6_fc7a' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxPortaoPedAut tblauxportaopedaut = new TblAuxPortaoPedAut().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxportaopedaut!=null && !tblauxportaopedaut.hasError()) {
			model.setDescricao(tblauxportaopedaut.getDescricao());
			model.setId(tblauxportaopedaut.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxPortaoPedAut tblauxportaopedautfilter = new TblAuxPortaoPedAut().find();
	List<TblAuxPortaoPedAut> tblauxportaopedautList = tblauxportaopedautfilter.all();
	List<Param_portao_pedonal_e_automovel.Table_1> tblauxportaopedautTable = new ArrayList<>();
	if(Core.isNotNull(tblauxportaopedautList)){
		for(TblAuxPortaoPedAut tblauxportaopedaut : tblauxportaopedautList){
			Param_portao_pedonal_e_automovel.Table_1 row  = new Param_portao_pedonal_e_automovel.Table_1();
			row.setLista(tblauxportaopedaut.getDescricao());
			row.setId_tbl(tblauxportaopedaut.getId().toString());
			tblauxportaopedautTable.add(row);
		}
		model.setTable_1(tblauxportaopedautTable);
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
		Param_portao_pedonal_e_automovel model = new Param_portao_pedonal_e_automovel();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_portao_pedonal_e_automovel","index",this.queryString()); //if submit, loads the values
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
		TblAuxPortaoPedAut tblauxportaopedaut  = new TblAuxPortaoPedAut();
		if(Core.isNotNull(isEdit)) {
			 tblauxportaopedaut = session.find(TblAuxPortaoPedAut.class, Core.toInt(model.getId()));
		}
		if (tblauxportaopedaut != null){
			tblauxportaopedaut.setDescricao(model.getDescricao());
		}
		session.persist(tblauxportaopedaut);
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
		return this.forward("sgie","Param_portao_pedonal_e_automovel","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_portao_pedonal_e_automovel","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_portao_pedonal_e_automovel model = new Param_portao_pedonal_e_automovel();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_portao_pedonal_e_automovel","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_portao_pedonal_e_automovel","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_portao_pedonal_e_automovel model = new Param_portao_pedonal_e_automovel();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_portao_pedonal_e_automovel","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxPortaoPedAut tblauxportaopedaut = new TblAuxPortaoPedAut().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxportaopedaut != null && !tblauxportaopedaut.hasError()) {
		boolean del = tblauxportaopedaut.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_portao_pedonal_e_automovel","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
