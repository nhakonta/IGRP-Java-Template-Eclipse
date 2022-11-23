package nosi.webapps.sgie.pages.dados_infra_estado_conservacao_geral;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import org.hibernate.Session; //block import
import org.hibernate.Transaction; //block import
import java.util.List; //block import
import java.util.LinkedHashMap; //block import
import static nosi.core.i18n.Translator.gt; //block import
import nosi.webapps.sgie.dao.TblAuxAnomalias; //block import
import nosi.webapps.sgie.dao.TblEstadoConservaGeral; //block import
import nosi.webapps.sgie.dao.TblAuxLocalizacaoLote; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
import java.time.LocalDate; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Dados_infra_estado_conservacao_geralController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_estado_conservacao_geral model = new Dados_infra_estado_conservacao_geral();
		model.load();
		Dados_infra_estado_conservacao_geralView view = new Dados_infra_estado_conservacao_geralView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.estado_conservacao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.localizacao_do_lote.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblEstadoConservaGeral tblestadoconservageralfilter = new TblEstadoConservaGeral().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id"))){
		tblestadoconservageralfilter.where("escId.id","=",Core.getParamInt("p_esc_id"));
	}
	tblestadoconservageralfilter.andWhere("estado","=","A");
		TblEstadoConservaGeral tblestadoconservageral = tblestadoconservageralfilter.one();
		if (tblestadoconservageral!=null && !tblestadoconservageral.hasError()) {
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> estado_conservacao = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		estado_conservacao.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setEstado_conservacao(tblestadoconservageral.getEstadoConserva().getId().toString());
	}
	view.estado_conservacao.setValue(estado_conservacao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxLocalizacaoLote tblauxlocalizacaolotefilter = new TblAuxLocalizacaoLote().find();
	List<TblAuxLocalizacaoLote> tblauxlocalizacaoloteList = tblauxlocalizacaolotefilter.all();
	LinkedHashMap<String, String> localizacao_do_lote = new LinkedHashMap<>();
	for(TblAuxLocalizacaoLote tblauxlocalizacaolote : tblauxlocalizacaoloteList){
		localizacao_do_lote.put(tblauxlocalizacaolote.getId().toString(), gt(tblauxlocalizacaolote.getDescricao()));
			model.setLocalizacao_do_lote(tblestadoconservageral.getLocalizacaoLote().getId().toString());
	}
	view.localizacao_do_lote.setValue(localizacao_do_lote);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setAspeto_exterior_do_edificio(tblestadoconservageral.getAspetoExteriorEdificio());
			model.setEsc_id(Core.getParamInt("p_esc_id").toString());
	
	view.btn_atualizar_dados.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}/* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionAtualizar_dados() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_estado_conservacao_geral model = new Dados_infra_estado_conservacao_geral();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Dados_infra_estado_conservacao_geral","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (atualizar_dados)  */
	Session session = null;
	Transaction transaction = null;
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		if(!transaction.isActive())
			transaction.begin();
		TblEstadoConservaGeral tblestadoconservageral  = new TblEstadoConservaGeral();
	TblAuxAnomalias tblauxanomaliasForeign = session.find(TblAuxAnomalias.class, Core.toInt(model.getEstado_conservacao()));
	tblestadoconservageral.setEstadoConserva(tblauxanomaliasForeign);
	TblAuxLocalizacaoLote tblauxlocalizacaoloteForeign = session.find(TblAuxLocalizacaoLote.class, Core.toInt(model.getLocalizacao_do_lote()));
	tblestadoconservageral.setLocalizacaoLote(tblauxlocalizacaoloteForeign);
			tblestadoconservageral.setAspetoExteriorEdificio(model.getAspeto_exterior_do_edificio());
	TblAuxEscolas tblauxescolasForeign = session.find(TblAuxEscolas.class, Core.toInt(model.getEsc_id()));
	tblestadoconservageral.setEscId(tblauxescolasForeign);
			tblestadoconservageral.setData(LocalDate.now());
			tblestadoconservageral.setUserId(Core.getCurrentUser().getId());
			tblestadoconservageral.setEstado("A");
		session.persist(tblestadoconservageral);
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
	
	
	return this.forward("sgie","Dados_infra_estado_conservacao_geral","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(atualizar_dados)----*/
		
		
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
