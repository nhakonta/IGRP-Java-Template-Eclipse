package nosi.webapps.sgie.pages.param_fundacoes;

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
import nosi.webapps.sgie.dao.TblAuxFundacoes; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_fundacoesController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_fundacoes model = new Param_fundacoes();
		model.load();
		Param_fundacoesView view = new Param_fundacoesView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Natus aliqua accusantium conse' as lista,'hidden-e53e_85aa' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxFundacoes tblauxfundacoes = new TblAuxFundacoes().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxfundacoes!=null && !tblauxfundacoes.hasError()) {
			model.setDescricao(tblauxfundacoes.getDescricao());
			model.setId(tblauxfundacoes.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxFundacoes tblauxfundacoesfilter = new TblAuxFundacoes().find();
	List<TblAuxFundacoes> tblauxfundacoesList = tblauxfundacoesfilter.all();
	List<Param_fundacoes.Table_1> tblauxfundacoesTable = new ArrayList<>();
	if(Core.isNotNull(tblauxfundacoesList)){
		for(TblAuxFundacoes tblauxfundacoes : tblauxfundacoesList){
			Param_fundacoes.Table_1 row  = new Param_fundacoes.Table_1();
			row.setLista(tblauxfundacoes.getDescricao());
			row.setId_tbl(tblauxfundacoes.getId().toString());
			tblauxfundacoesTable.add(row);
		}
		model.setTable_1(tblauxfundacoesTable);
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
		Param_fundacoes model = new Param_fundacoes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_fundacoes","index",this.queryString()); //if submit, loads the values
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
		TblAuxFundacoes tblauxfundacoes  = new TblAuxFundacoes();
		if(Core.isNotNull(isEdit)) {
			 tblauxfundacoes = session.find(TblAuxFundacoes.class, Core.toInt(model.getId()));
		}
		if (tblauxfundacoes != null){
			tblauxfundacoes.setDescricao(model.getDescricao());
		}
		session.persist(tblauxfundacoes);
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
		return this.forward("sgie","Param_fundacoes","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_fundacoes","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_fundacoes model = new Param_fundacoes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_fundacoes","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_fundacoes","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_fundacoes model = new Param_fundacoes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_fundacoes","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxFundacoes tblauxfundacoes = new TblAuxFundacoes().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxfundacoes != null && !tblauxfundacoes.hasError()) {
		boolean del = tblauxfundacoes.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_fundacoes","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
