package nosi.webapps.sgie.pages.param_revistimento_cobertura_inclinada;

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
import nosi.webapps.sgie.dao.TblAuxRevestCoberturaInclinada; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_revistimento_cobertura_inclinadaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_revistimento_cobertura_inclinada model = new Param_revistimento_cobertura_inclinada();
		model.load();
		Param_revistimento_cobertura_inclinadaView view = new Param_revistimento_cobertura_inclinadaView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Sit doloremque unde elit sit' as lista,'hidden-1631_d818' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxRevestCoberturaInclinada tblauxrevestcoberturainclinada = new TblAuxRevestCoberturaInclinada().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxrevestcoberturainclinada!=null && !tblauxrevestcoberturainclinada.hasError()) {
			model.setDescricao(tblauxrevestcoberturainclinada.getDescricao());
			model.setId(tblauxrevestcoberturainclinada.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxRevestCoberturaInclinada tblauxrevestcoberturainclinadafilter = new TblAuxRevestCoberturaInclinada().find();
	List<TblAuxRevestCoberturaInclinada> tblauxrevestcoberturainclinadaList = tblauxrevestcoberturainclinadafilter.all();
	List<Param_revistimento_cobertura_inclinada.Table_1> tblauxrevestcoberturainclinadaTable = new ArrayList<>();
	if(Core.isNotNull(tblauxrevestcoberturainclinadaList)){
		for(TblAuxRevestCoberturaInclinada tblauxrevestcoberturainclinada : tblauxrevestcoberturainclinadaList){
			Param_revistimento_cobertura_inclinada.Table_1 row  = new Param_revistimento_cobertura_inclinada.Table_1();
			row.setLista(tblauxrevestcoberturainclinada.getDescricao());
			row.setId_tbl(tblauxrevestcoberturainclinada.getId().toString());
			tblauxrevestcoberturainclinadaTable.add(row);
		}
		model.setTable_1(tblauxrevestcoberturainclinadaTable);
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
		Param_revistimento_cobertura_inclinada model = new Param_revistimento_cobertura_inclinada();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_revistimento_cobertura_inclinada","index",this.queryString()); //if submit, loads the values
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
		TblAuxRevestCoberturaInclinada tblauxrevestcoberturainclinada  = new TblAuxRevestCoberturaInclinada();
		if(Core.isNotNull(isEdit)) {
			 tblauxrevestcoberturainclinada = session.find(TblAuxRevestCoberturaInclinada.class, Core.toInt(model.getId()));
		}
		if (tblauxrevestcoberturainclinada != null){
			tblauxrevestcoberturainclinada.setDescricao(model.getDescricao());
		}
		session.persist(tblauxrevestcoberturainclinada);
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
		return this.forward("sgie","Param_revistimento_cobertura_inclinada","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_revistimento_cobertura_inclinada","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_revistimento_cobertura_inclinada model = new Param_revistimento_cobertura_inclinada();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_revistimento_cobertura_inclinada","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_revistimento_cobertura_inclinada","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_revistimento_cobertura_inclinada model = new Param_revistimento_cobertura_inclinada();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_revistimento_cobertura_inclinada","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxRevestCoberturaInclinada tblauxrevestcoberturainclinada = new TblAuxRevestCoberturaInclinada().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxrevestcoberturainclinada != null && !tblauxrevestcoberturainclinada.hasError()) {
		boolean del = tblauxrevestcoberturainclinada.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_revistimento_cobertura_inclinada","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
