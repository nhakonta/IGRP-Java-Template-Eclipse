package nosi.webapps.sgie.pages.param_rampa_escada_corrim_interiro_e_exterior;

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
import nosi.webapps.sgie.dao.TblAuxEscadaCorrimIntExtRampa; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Param_rampa_escada_corrim_interiro_e_exteriorController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_rampa_escada_corrim_interiro_e_exterior model = new Param_rampa_escada_corrim_interiro_e_exterior();
		model.load();
		Param_rampa_escada_corrim_interiro_e_exteriorView view = new Param_rampa_escada_corrim_interiro_e_exteriorView();
		view.id_rampa_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Laudantium labore officia pers' as table_1_text_1,'hidden-f4b5_3bc8' as id_rampa_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampa = new TblAuxEscadaCorrimIntExtRampa().findOne(Core.getParamInt("p_id_rampa_tbl"));
		if (tblauxescadacorrimintextrampa!=null && !tblauxescadacorrimintextrampa.hasError()) {
			model.setDescricao(tblauxescadacorrimintextrampa.getDescricao());
			model.setId_rampa(tblauxescadacorrimintextrampa.getId().toString());
	
	view.btn_guardar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampafilter = new TblAuxEscadaCorrimIntExtRampa().find();
	List<TblAuxEscadaCorrimIntExtRampa> tblauxescadacorrimintextrampaList = tblauxescadacorrimintextrampafilter.all();
	List<Param_rampa_escada_corrim_interiro_e_exterior.Table_1> tblauxescadacorrimintextrampaTable = new ArrayList<>();
	if(Core.isNotNull(tblauxescadacorrimintextrampaList)){
		for(TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampa : tblauxescadacorrimintextrampaList){
			Param_rampa_escada_corrim_interiro_e_exterior.Table_1 row  = new Param_rampa_escada_corrim_interiro_e_exterior.Table_1();
			row.setTable_1_text_1(tblauxescadacorrimintextrampa.getDescricao());
			row.setId_rampa_tbl(tblauxescadacorrimintextrampa.getId().toString());
			tblauxescadacorrimintextrampaTable.add(row);
		}
		model.setTable_1(tblauxescadacorrimintextrampaTable);
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
		Param_rampa_escada_corrim_interiro_e_exterior model = new Param_rampa_escada_corrim_interiro_e_exterior();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_rampa_tbl",Core.getParam("p_id_rampa_tbl"));
		  return this.forward("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index",this.queryString()); //if submit, loads the values
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
		TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampa  = new TblAuxEscadaCorrimIntExtRampa();
		if(Core.isNotNull(isEdit)) {
			 tblauxescadacorrimintextrampa = session.find(TblAuxEscadaCorrimIntExtRampa.class, Core.toInt(model.getId_rampa()));
		}
		if (tblauxescadacorrimintextrampa != null){
			tblauxescadacorrimintextrampa.setDescricao(model.getDescricao());
		}
		session.persist(tblauxescadacorrimintextrampa);
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
		return this.forward("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_rampa_escada_corrim_interiro_e_exterior model = new Param_rampa_escada_corrim_interiro_e_exterior();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_rampa_tbl",Core.getParam("p_id_rampa_tbl"));
		  return this.forward("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id_rampa_tbl", Core.getParam("p_id_rampa_tbl"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Param_rampa_escada_corrim_interiro_e_exterior model = new Param_rampa_escada_corrim_interiro_e_exterior();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_rampa_tbl",Core.getParam("p_id_rampa_tbl"));
		  return this.forward("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */
		TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampa = new TblAuxEscadaCorrimIntExtRampa().findOne(Core.getParamInt("p_id_rampa_tbl"));
	if (tblauxescadacorrimintextrampa != null && !tblauxescadacorrimintextrampa.hasError()) {
		boolean del = tblauxescadacorrimintextrampa.delete(Core.getParamInt("p_id_rampa_tbl"));
		if (del)
			Core.setMessageSuccess();
		else
			Core.setMessageError();
	} 
	/* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
