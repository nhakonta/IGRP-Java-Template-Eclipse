package nosi.webapps.sgie.pages.param_cobertura_forma;

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
import nosi.webapps.sgie.dao.TblAuxCobertForma; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_cobertura_formaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_cobertura_forma model = new Param_cobertura_forma();
		model.load();
		Param_cobertura_formaView view = new Param_cobertura_formaView();
		view.id_cobertura_forma_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Natus sit natus sit amet' as lista,'hidden-74c7_66b3' as id_cobertura_forma_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxCobertForma tblauxcobertforma = new TblAuxCobertForma().findOne(Core.getParamInt("p_id_cobertura_forma_tbl"));
		if (tblauxcobertforma!=null && !tblauxcobertforma.hasError()) {
			model.setDescricao(tblauxcobertforma.getDescricao());
			model.setId_cobertura_forma(tblauxcobertforma.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxCobertForma tblauxcobertformafilter = new TblAuxCobertForma().find();
	List<TblAuxCobertForma> tblauxcobertformaList = tblauxcobertformafilter.all();
	List<Param_cobertura_forma.Table_1> tblauxcobertformaTable = new ArrayList<>();
	if(Core.isNotNull(tblauxcobertformaList)){
		for(TblAuxCobertForma tblauxcobertforma : tblauxcobertformaList){
			Param_cobertura_forma.Table_1 row  = new Param_cobertura_forma.Table_1();
			row.setLista(tblauxcobertforma.getDescricao());
			row.setId_cobertura_forma_tbl(tblauxcobertforma.getId().toString());
			tblauxcobertformaTable.add(row);
		}
		model.setTable_1(tblauxcobertformaTable);
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
		Param_cobertura_forma model = new Param_cobertura_forma();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_cobertura_forma_tbl",Core.getParam("p_id_cobertura_forma_tbl"));
		  return this.forward("sgie","Param_cobertura_forma","index",this.queryString()); //if submit, loads the values
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
		TblAuxCobertForma tblauxcobertforma  = new TblAuxCobertForma();
		if(Core.isNotNull(isEdit)) {
			 tblauxcobertforma = session.find(TblAuxCobertForma.class, Core.toInt(model.getId_cobertura_forma()));
		}
		if (tblauxcobertforma != null){
			tblauxcobertforma.setDescricao(model.getDescricao());
		}
		session.persist(tblauxcobertforma);
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
		return this.forward("sgie","Param_cobertura_forma","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura_forma","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_cobertura_forma model = new Param_cobertura_forma();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_cobertura_forma_tbl",Core.getParam("p_id_cobertura_forma_tbl"));
		  return this.forward("sgie","Param_cobertura_forma","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_cobertura_forma_tbl", Core.getParam("p_id_cobertura_forma_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura_forma","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_cobertura_forma model = new Param_cobertura_forma();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_cobertura_forma_tbl",Core.getParam("p_id_cobertura_forma_tbl"));
		  return this.forward("sgie","Param_cobertura_forma","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxCobertForma tblauxcobertforma = new TblAuxCobertForma().findOne(Core.getParamInt("p_id_cobertura_forma_tbl"));
	if (tblauxcobertforma != null && !tblauxcobertforma.hasError()) {
		boolean del = tblauxcobertforma.delete(Core.getParamInt("p_id_cobertura_forma_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura_forma","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
