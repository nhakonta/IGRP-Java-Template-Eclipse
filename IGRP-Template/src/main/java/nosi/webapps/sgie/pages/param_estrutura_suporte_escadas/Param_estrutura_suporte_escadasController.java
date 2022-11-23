package nosi.webapps.sgie.pages.param_estrutura_suporte_escadas;

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
import nosi.webapps.sgie.dao.TblAuxEscadasEstrutSuporte; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_estrutura_suporte_escadasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_estrutura_suporte_escadas model = new Param_estrutura_suporte_escadas();
		model.load();
		Param_estrutura_suporte_escadasView view = new Param_estrutura_suporte_escadasView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Ipsum iste aliqua anim sit' as lista,'hidden-ba19_43eb' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxEscadasEstrutSuporte tblauxescadasestrutsuporte = new TblAuxEscadasEstrutSuporte().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxescadasestrutsuporte!=null && !tblauxescadasestrutsuporte.hasError()) {
			model.setDescricao(tblauxescadasestrutsuporte.getDescricao());
			model.setId(tblauxescadasestrutsuporte.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxEscadasEstrutSuporte tblauxescadasestrutsuportefilter = new TblAuxEscadasEstrutSuporte().find();
	List<TblAuxEscadasEstrutSuporte> tblauxescadasestrutsuporteList = tblauxescadasestrutsuportefilter.all();
	List<Param_estrutura_suporte_escadas.Table_1> tblauxescadasestrutsuporteTable = new ArrayList<>();
	if(Core.isNotNull(tblauxescadasestrutsuporteList)){
		for(TblAuxEscadasEstrutSuporte tblauxescadasestrutsuporte : tblauxescadasestrutsuporteList){
			Param_estrutura_suporte_escadas.Table_1 row  = new Param_estrutura_suporte_escadas.Table_1();
			row.setLista(tblauxescadasestrutsuporte.getDescricao());
			row.setId_tbl(tblauxescadasestrutsuporte.getId().toString());
			tblauxescadasestrutsuporteTable.add(row);
		}
		model.setTable_1(tblauxescadasestrutsuporteTable);
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
		Param_estrutura_suporte_escadas model = new Param_estrutura_suporte_escadas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_estrutura_suporte_escadas","index",this.queryString()); //if submit, loads the values
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
		TblAuxEscadasEstrutSuporte tblauxescadasestrutsuporte  = new TblAuxEscadasEstrutSuporte();
		if(Core.isNotNull(isEdit)) {
			 tblauxescadasestrutsuporte = session.find(TblAuxEscadasEstrutSuporte.class, Core.toInt(model.getId()));
		}
		if (tblauxescadasestrutsuporte != null){
			tblauxescadasestrutsuporte.setDescricao(model.getDescricao());
		}
		session.persist(tblauxescadasestrutsuporte);
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
		return this.forward("sgie","Param_estrutura_suporte_escadas","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_estrutura_suporte_escadas","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_estrutura_suporte_escadas model = new Param_estrutura_suporte_escadas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_estrutura_suporte_escadas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_estrutura_suporte_escadas","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_estrutura_suporte_escadas model = new Param_estrutura_suporte_escadas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_estrutura_suporte_escadas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxEscadasEstrutSuporte tblauxescadasestrutsuporte = new TblAuxEscadasEstrutSuporte().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxescadasestrutsuporte != null && !tblauxescadasestrutsuporte.hasError()) {
		boolean del = tblauxescadasestrutsuporte.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_estrutura_suporte_escadas","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
