package nosi.webapps.sgie.pages.folha_avaliacao_escadas;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.List; //block import
import java.util.LinkedHashMap; //block import
import static nosi.core.i18n.Translator.gt; //block import
import nosi.webapps.sgie.dao.TblAuxSimNao; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Folha_avaliacao_escadasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Folha_avaliacao_escadas model = new Folha_avaliacao_escadas();
		model.load();
		Folha_avaliacao_escadasView view = new Folha_avaliacao_escadasView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.insuficiencia_dos_elementos_estrutural_escadas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.alteracao_na_geometria_escadas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.extensiva_deterioracao_dos_degraus.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.ausencia_de_guardas_ou_corrimao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.anomalias_indicadores_de_graves_deterioracao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> insuficiencia_dos_elementos_estrutural_escadas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		insuficiencia_dos_elementos_estrutural_escadas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.insuficiencia_dos_elementos_estrutural_escadas.setValue(insuficiencia_dos_elementos_estrutural_escadas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> alteracao_na_geometria_escadas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		alteracao_na_geometria_escadas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.alteracao_na_geometria_escadas.setValue(alteracao_na_geometria_escadas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> extensiva_deterioracao_dos_degraus = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		extensiva_deterioracao_dos_degraus.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.extensiva_deterioracao_dos_degraus.setValue(extensiva_deterioracao_dos_degraus);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> ausencia_de_guardas_ou_corrimao = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		ausencia_de_guardas_ou_corrimao.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.ausencia_de_guardas_ou_corrimao.setValue(ausencia_de_guardas_ou_corrimao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> anomalias_indicadores_de_graves_deterioracao = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		anomalias_indicadores_de_graves_deterioracao.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.anomalias_indicadores_de_graves_deterioracao.setValue(anomalias_indicadores_de_graves_deterioracao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}/* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGuardar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Folha_avaliacao_escadas model = new Folha_avaliacao_escadas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Seguimento_e_avaliacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (guardar)  *//* End-Code-Block  */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Seguimento_e_avaliacao","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
