package nosi.webapps.sgie.pages.dados_infra_carater_morfo;

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
import nosi.webapps.sgie.dao.TblDescricaoMorfo; //block import
import nosi.webapps.sgie.dao.TblAuxSimNao; //block import
import nosi.webapps.sgie.dao.TblAuxMorfaMorfo; //block import
import nosi.webapps.sgie.dao.TblAuxEntradaMorfo; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
import java.time.LocalDate; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Dados_infra_carater_morfoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_morfo model = new Dados_infra_carater_morfo();
		model.load();
		Dados_infra_carater_morfoView view = new Dados_infra_carater_morfoView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.simetria_entre_corpos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.forma.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.entrada_.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblDescricaoMorfo tbldescricaomorfofilter = new TblDescricaoMorfo().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id"))){
		tbldescricaomorfofilter.andWhere("escId.id","=",Core.getParamInt("p_esc_id"));
	}
		TblDescricaoMorfo tbldescricaomorfo = tbldescricaomorfofilter.one();
		if (tbldescricaomorfo!=null && !tbldescricaomorfo.hasError()) {
			model.setNumero_de_corpos(tbldescricaomorfo.getNumCorpos());
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> simetria_entre_corpos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		simetria_entre_corpos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setSimetria_entre_corpos(tbldescricaomorfo.getSimetria().getId().toString());
	}
	view.simetria_entre_corpos.setValue(simetria_entre_corpos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setNumero_de_compartimentos(tbldescricaomorfo.getNumCompartimentos());
			model.setNumero_de_instalacoes_sanitarias(tbldescricaomorfo.getNumInstalSanitaria());
	
	try{
	TblAuxMorfaMorfo tblauxmorfamorfofilter = new TblAuxMorfaMorfo().find();
	List<TblAuxMorfaMorfo> tblauxmorfamorfoList = tblauxmorfamorfofilter.all();
	LinkedHashMap<String, String> forma = new LinkedHashMap<>();
	for(TblAuxMorfaMorfo tblauxmorfamorfo : tblauxmorfamorfoList){
		forma.put(tblauxmorfamorfo.getId().toString(), gt(tblauxmorfamorfo.getDescricao()));
			model.setForma(tbldescricaomorfo.getForma().getId().toString());
	}
	view.forma.setValue(forma);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxEntradaMorfo tblauxentradamorfofilter = new TblAuxEntradaMorfo().find();
	List<TblAuxEntradaMorfo> tblauxentradamorfoList = tblauxentradamorfofilter.all();
	LinkedHashMap<String, String> entrada_ = new LinkedHashMap<>();
	for(TblAuxEntradaMorfo tblauxentradamorfo : tblauxentradamorfoList){
		entrada_.put(tblauxentradamorfo.getId().toString(), gt(tblauxentradamorfo.getDescricao()));
			model.setEntrada_(tbldescricaomorfo.getEntrada().getId().toString());
	}
	view.entrada_.setValue(entrada_);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setEsc_id(Core.getParamInt("p_esc_id").toString());
	
	view.btn_atualizar_dados_morfo.addParameter("isEdit", "true");
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
	
	public Response actionAtualizar_dados_morfo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_morfo model = new Dados_infra_carater_morfo();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (atualizar_dados_morfo)  */
	Session session = null;
	Transaction transaction = null;
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		if(!transaction.isActive())
			transaction.begin();
		TblDescricaoMorfo tbldescricaomorfo  = new TblDescricaoMorfo();
			tbldescricaomorfo.setNumCorpos(model.getNumero_de_corpos());
	TblAuxSimNao tblauxsimnaoForeign = session.find(TblAuxSimNao.class, Core.toInt(model.getSimetria_entre_corpos()));
	tbldescricaomorfo.setSimetria(tblauxsimnaoForeign);
			tbldescricaomorfo.setNumCompartimentos(model.getNumero_de_compartimentos());
			tbldescricaomorfo.setNumInstalSanitaria(model.getNumero_de_instalacoes_sanitarias());
	TblAuxMorfaMorfo tblauxmorfamorfoForeign = session.find(TblAuxMorfaMorfo.class, Core.toInt(model.getForma()));
	tbldescricaomorfo.setForma(tblauxmorfamorfoForeign);
	TblAuxEntradaMorfo tblauxentradamorfoForeign = session.find(TblAuxEntradaMorfo.class, Core.toInt(model.getEntrada_()));
	tbldescricaomorfo.setEntrada(tblauxentradamorfoForeign);
	TblAuxEscolas tblauxescolasForeign = session.find(TblAuxEscolas.class, Core.toInt(model.getEsc_id()));
	tbldescricaomorfo.setEscId(tblauxescolasForeign);
			tbldescricaomorfo.setDate(LocalDate.now());
			tbldescricaomorfo.setUserId(Core.getCurrentUser().getId());
			tbldescricaomorfo.setEstado("A");
		session.persist(tbldescricaomorfo);
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
	
	
	return this.forward("sgie","Dados_infra_carater_morfo","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(atualizar_dados_morfo)----*/
		
		
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
