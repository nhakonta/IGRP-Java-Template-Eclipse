package nosi.webapps.sgie.pages.param_formas_acesso_escola;

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
import nosi.webapps.sgie.dao.TblAuxFormaAcessoEscola; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_formas_acesso_escolaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_formas_acesso_escola model = new Param_formas_acesso_escola();
		model.load();
		Param_formas_acesso_escolaView view = new Param_formas_acesso_escolaView();
		view.id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Aperiam sit unde totam accusan' as lista,'hidden-0f76_3fca' as id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxFormaAcessoEscola tblauxformaacessoescola = new TblAuxFormaAcessoEscola().findOne(Core.getParamInt("p_id_tbl"));
		if (tblauxformaacessoescola!=null && !tblauxformaacessoescola.hasError()) {
			model.setDescricao(tblauxformaacessoescola.getDescricao());
			model.setId(tblauxformaacessoescola.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxFormaAcessoEscola tblauxformaacessoescolafilter = new TblAuxFormaAcessoEscola().find();
	List<TblAuxFormaAcessoEscola> tblauxformaacessoescolaList = tblauxformaacessoescolafilter.all();
	List<Param_formas_acesso_escola.Table_1> tblauxformaacessoescolaTable = new ArrayList<>();
	if(Core.isNotNull(tblauxformaacessoescolaList)){
		for(TblAuxFormaAcessoEscola tblauxformaacessoescola : tblauxformaacessoescolaList){
			Param_formas_acesso_escola.Table_1 row  = new Param_formas_acesso_escola.Table_1();
			row.setLista(tblauxformaacessoescola.getDescricao());
			row.setId_tbl(tblauxformaacessoescola.getId().toString());
			tblauxformaacessoescolaTable.add(row);
		}
		model.setTable_1(tblauxformaacessoescolaTable);
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
		Param_formas_acesso_escola model = new Param_formas_acesso_escola();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_formas_acesso_escola","index",this.queryString()); //if submit, loads the values
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
		TblAuxFormaAcessoEscola tblauxformaacessoescola  = new TblAuxFormaAcessoEscola();
		if(Core.isNotNull(isEdit)) {
			 tblauxformaacessoescola = session.find(TblAuxFormaAcessoEscola.class, Core.toInt(model.getId()));
		}
		if (tblauxformaacessoescola != null){
			tblauxformaacessoescola.setDescricao(model.getDescricao());
		}
		session.persist(tblauxformaacessoescola);
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
		return this.forward("sgie","Param_formas_acesso_escola","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_formas_acesso_escola","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_formas_acesso_escola model = new Param_formas_acesso_escola();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_formas_acesso_escola","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_tbl", Core.getParam("p_id_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_formas_acesso_escola","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_formas_acesso_escola model = new Param_formas_acesso_escola();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_tbl",Core.getParam("p_id_tbl"));
		  return this.forward("sgie","Param_formas_acesso_escola","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxFormaAcessoEscola tblauxformaacessoescola = new TblAuxFormaAcessoEscola().findOne(Core.getParamInt("p_id_tbl"));
	if (tblauxformaacessoescola != null && !tblauxformaacessoescola.hasError()) {
		boolean del = tblauxformaacessoescola.delete(Core.getParamInt("p_id_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_formas_acesso_escola","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
