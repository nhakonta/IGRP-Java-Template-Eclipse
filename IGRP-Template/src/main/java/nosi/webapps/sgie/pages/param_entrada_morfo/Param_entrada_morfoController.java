package nosi.webapps.sgie.pages.param_entrada_morfo;

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
import nosi.webapps.sgie.dao.TblAuxEntradaMorfo; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_entrada_morfoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_entrada_morfo model = new Param_entrada_morfo();
		model.load();
		Param_entrada_morfoView view = new Param_entrada_morfoView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Iste mollit adipiscing dolor o' as lista,'hidden-94ef_4203' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxEntradaMorfo tblauxentradamorfo = new TblAuxEntradaMorfo().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxentradamorfo!=null && !tblauxentradamorfo.hasError()) {
			model.setDescricao(tblauxentradamorfo.getDescricao());
			model.setId(tblauxentradamorfo.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxEntradaMorfo tblauxentradamorfofilter = new TblAuxEntradaMorfo().find();
	List<TblAuxEntradaMorfo> tblauxentradamorfoList = tblauxentradamorfofilter.all();
	List<Param_entrada_morfo.Table_1> tblauxentradamorfoTable = new ArrayList<>();
	if(Core.isNotNull(tblauxentradamorfoList)){
		for(TblAuxEntradaMorfo tblauxentradamorfo : tblauxentradamorfoList){
			Param_entrada_morfo.Table_1 row  = new Param_entrada_morfo.Table_1();
			row.setLista(tblauxentradamorfo.getDescricao());
			row.setId_tbl(tblauxentradamorfo.getId().toString());
			tblauxentradamorfoTable.add(row);
		}
		model.setTable_1(tblauxentradamorfoTable);
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
		Param_entrada_morfo model = new Param_entrada_morfo();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_entrada_morfo","index",this.queryString()); //if submit, loads the values
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
		TblAuxEntradaMorfo tblauxentradamorfo  = new TblAuxEntradaMorfo();
		if(Core.isNotNull(isEdit)) {
			 tblauxentradamorfo = session.find(TblAuxEntradaMorfo.class, Core.toInt(model.getId()));
		}
		if (tblauxentradamorfo != null){
			tblauxentradamorfo.setDescricao(model.getDescricao());
		}
		session.persist(tblauxentradamorfo);
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
		return this.forward("sgie","Param_entrada_morfo","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_entrada_morfo","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_entrada_morfo model = new Param_entrada_morfo();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_entrada_morfo","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_entrada_morfo","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_entrada_morfo model = new Param_entrada_morfo();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_entrada_morfo","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxEntradaMorfo tblauxentradamorfo = new TblAuxEntradaMorfo().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxentradamorfo != null && !tblauxentradamorfo.hasError()) {
		boolean del = tblauxentradamorfo.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_entrada_morfo","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
