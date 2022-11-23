package nosi.webapps.sgie.pages.teste;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class TesteController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Teste model = new Teste();
		model.load();
		TesteView view = new TesteView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Magna ipsum adipiscing mollit' as table_1_text_1 "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionForm_1_button_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		Teste model = new Teste();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (form_1_button_1)  *//* End-Code-Block  */
		/*----#start-code(form_1_button_1)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index", this.queryString());	
	}
	
	public Response actionTable_1_button_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		Teste model = new Teste();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (table_1_button_1)  *//* End-Code-Block  */
		/*----#start-code(table_1_button_1)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_rampa_escada_corrim_interiro_e_exterior","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
