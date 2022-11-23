package nosi.webapps.sgie.pages.param_cobertura_estrutura_suporte;

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
import nosi.webapps.sgie.dao.TblAuxCoberturaEstSuporte; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_cobertura_estrutura_suporteController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_cobertura_estrutura_suporte model = new Param_cobertura_estrutura_suporte();
		model.load();
		Param_cobertura_estrutura_suporteView view = new Param_cobertura_estrutura_suporteView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Voluptatem deserunt anim volup' as lista,'hidden-cdb4_c41c' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxCoberturaEstSuporte tblauxcoberturaestsuporte = new TblAuxCoberturaEstSuporte().findOne(Core.getParamInt("p_"));
		if (tblauxcoberturaestsuporte!=null && !tblauxcoberturaestsuporte.hasError()) {
			model.setDescricao(tblauxcoberturaestsuporte.getDescricao());
			model.setId(tblauxcoberturaestsuporte.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxCoberturaEstSuporte tblauxcoberturaestsuportefilter = new TblAuxCoberturaEstSuporte().find();
	List<TblAuxCoberturaEstSuporte> tblauxcoberturaestsuporteList = tblauxcoberturaestsuportefilter.all();
	List<Param_cobertura_estrutura_suporte.Table_1> tblauxcoberturaestsuporteTable = new ArrayList<>();
	if(Core.isNotNull(tblauxcoberturaestsuporteList)){
		for(TblAuxCoberturaEstSuporte tblauxcoberturaestsuporte : tblauxcoberturaestsuporteList){
			Param_cobertura_estrutura_suporte.Table_1 row  = new Param_cobertura_estrutura_suporte.Table_1();
			row.setLista(tblauxcoberturaestsuporte.getDescricao());
			row.setId_tbl(tblauxcoberturaestsuporte.getId().toString());
			tblauxcoberturaestsuporteTable.add(row);
		}
		model.setTable_1(tblauxcoberturaestsuporteTable);
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
		Param_cobertura_estrutura_suporte model = new Param_cobertura_estrutura_suporte();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_cobertura_estrutura_suporte","index",this.queryString()); //if submit, loads the values
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
		TblAuxCoberturaEstSuporte tblauxcoberturaestsuporte  = new TblAuxCoberturaEstSuporte();
		if(Core.isNotNull(isEdit)) {
			 tblauxcoberturaestsuporte = session.find(TblAuxCoberturaEstSuporte.class, Core.toInt(model.getId()));
		}
		if (tblauxcoberturaestsuporte != null){
			tblauxcoberturaestsuporte.setDescricao(model.getDescricao());
		}
		session.persist(tblauxcoberturaestsuporte);
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
		return this.forward("sgie","Param_cobertura_estrutura_suporte","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura_estrutura_suporte","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_cobertura_estrutura_suporte model = new Param_cobertura_estrutura_suporte();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_cobertura_estrutura_suporte","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura_estrutura_suporte","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_cobertura_estrutura_suporte model = new Param_cobertura_estrutura_suporte();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_cobertura_estrutura_suporte","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxCoberturaEstSuporte tblauxcoberturaestsuporte = new TblAuxCoberturaEstSuporte().findOne(Core.getParamInt("p_"));
	if (tblauxcoberturaestsuporte != null && !tblauxcoberturaestsuporte.hasError()) {
		boolean del = tblauxcoberturaestsuporte.delete(Core.getParamInt("p_"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura_estrutura_suporte","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
