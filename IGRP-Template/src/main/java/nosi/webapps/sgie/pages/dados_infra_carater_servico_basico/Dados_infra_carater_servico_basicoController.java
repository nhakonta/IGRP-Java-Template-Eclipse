package nosi.webapps.sgie.pages.dados_infra_carater_servico_basico;

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
import nosi.webapps.sgie.dao.TblAuxAbastecimentoAgua; //block import
import nosi.webapps.sgie.dao.TblServicosBasicosInternet; //block import
import nosi.webapps.sgie.dao.TblAuxFonteEnergia; //block import
import nosi.webapps.sgie.dao.TblAuxArmazenamentoAgua; //block import
import nosi.webapps.sgie.dao.TblAuxAcessoInternet; //block import
import nosi.webapps.sgie.dao.TblAuxRazaoSalasInoperantes; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
import java.time.LocalDate; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Dados_infra_carater_servico_basicoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_servico_basico model = new Dados_infra_carater_servico_basico();
		model.load();
		Dados_infra_carater_servico_basicoView view = new Dados_infra_carater_servico_basicoView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.formas_abastecimento_agua_.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.fonte_energia_eletrica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.formas_armazenamento_agua.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.acesso_a_internet.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.porque_razao_as_salas_nao_funcionam.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblServicosBasicosInternet tblservicosbasicosinternetfilter = new TblServicosBasicosInternet().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id"))){
		tblservicosbasicosinternetfilter.andWhere("escId.id","=",Core.getParamInt("p_esc_id"));
	}
	tblservicosbasicosinternetfilter.andWhere("estado","=","A");
		TblServicosBasicosInternet tblservicosbasicosinternet = tblservicosbasicosinternetfilter.one();
		if (tblservicosbasicosinternet!=null && !tblservicosbasicosinternet.hasError()) {
	
	try{
	TblAuxAbastecimentoAgua tblauxabastecimentoaguafilter = new TblAuxAbastecimentoAgua().find();
	List<TblAuxAbastecimentoAgua> tblauxabastecimentoaguaList = tblauxabastecimentoaguafilter.all();
	LinkedHashMap<String, String> formas_abastecimento_agua_ = new LinkedHashMap<>();
	formas_abastecimento_agua_.put(null, gt("-- Selecionar --"));
	for(TblAuxAbastecimentoAgua tblauxabastecimentoagua : tblauxabastecimentoaguaList){
		formas_abastecimento_agua_.put(tblauxabastecimentoagua.getId().toString(), gt(tblauxabastecimentoagua.getDescricao()));
			model.setFormas_abastecimento_agua_(tblservicosbasicosinternet.getFormasAbastecimentoAguaId().getId().toString());
	}
	view.formas_abastecimento_agua_.setValue(formas_abastecimento_agua_);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxFonteEnergia tblauxfonteenergiafilter = new TblAuxFonteEnergia().find();
	List<TblAuxFonteEnergia> tblauxfonteenergiaList = tblauxfonteenergiafilter.all();
	LinkedHashMap<String, String> fonte_energia_eletrica = new LinkedHashMap<>();
	fonte_energia_eletrica.put(null, gt("-- Selecionar --"));
	for(TblAuxFonteEnergia tblauxfonteenergia : tblauxfonteenergiaList){
		fonte_energia_eletrica.put(tblauxfonteenergia.getId().toString(), gt(tblauxfonteenergia.getDescricao()));
			model.setFonte_energia_eletrica(tblservicosbasicosinternet.getFormasAbastecimentoAguaId().getId().toString());
	}
	view.fonte_energia_eletrica.setValue(fonte_energia_eletrica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxArmazenamentoAgua tblauxarmazenamentoaguafilter = new TblAuxArmazenamentoAgua().find();
	List<TblAuxArmazenamentoAgua> tblauxarmazenamentoaguaList = tblauxarmazenamentoaguafilter.all();
	LinkedHashMap<String, String> formas_armazenamento_agua = new LinkedHashMap<>();
	formas_armazenamento_agua.put(null, gt("-- Selecionar --"));
	for(TblAuxArmazenamentoAgua tblauxarmazenamentoagua : tblauxarmazenamentoaguaList){
		formas_armazenamento_agua.put(tblauxarmazenamentoagua.getId().toString(), gt(tblauxarmazenamentoagua.getDescricao()));
			model.setFormas_armazenamento_agua(tblservicosbasicosinternet.getFormasAbastecimentoAguaId().getId().toString());
	}
	view.formas_armazenamento_agua.setValue(formas_armazenamento_agua);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAcessoInternet tblauxacessointernetfilter = new TblAuxAcessoInternet().find();
	List<TblAuxAcessoInternet> tblauxacessointernetList = tblauxacessointernetfilter.all();
	LinkedHashMap<String, String> acesso_a_internet = new LinkedHashMap<>();
	acesso_a_internet.put(null, gt("-- Selecionar --"));
	for(TblAuxAcessoInternet tblauxacessointernet : tblauxacessointernetList){
		acesso_a_internet.put(tblauxacessointernet.getId().toString(), gt(tblauxacessointernet.getDescricao()));
			model.setAcesso_a_internet(tblservicosbasicosinternet.getFormasAbastecimentoAguaId().getId().toString());
	}
	view.acesso_a_internet.setValue(acesso_a_internet);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setData_utima_atualizacao(Core.convertLocalDateToString(tblservicosbasicosinternet.getData(), Core.DD_MM_YYYY));
			model.setNumero_de_salas_inoperantes(tblservicosbasicosinternet.getNumSalaInoperante());
	
	try{
	TblAuxRazaoSalasInoperantes tblauxrazaosalasinoperantesfilter = new TblAuxRazaoSalasInoperantes().find();
	List<TblAuxRazaoSalasInoperantes> tblauxrazaosalasinoperantesList = tblauxrazaosalasinoperantesfilter.all();
	LinkedHashMap<String, String> porque_razao_as_salas_nao_funcionam = new LinkedHashMap<>();
	porque_razao_as_salas_nao_funcionam.put(null, gt("-- Selecionar --"));
	for(TblAuxRazaoSalasInoperantes tblauxrazaosalasinoperantes : tblauxrazaosalasinoperantesList){
		porque_razao_as_salas_nao_funcionam.put(tblauxrazaosalasinoperantes.getId().toString(), gt(tblauxrazaosalasinoperantes.getDescricao()));
			model.setPorque_razao_as_salas_nao_funcionam(tblservicosbasicosinternet.getFormasAbastecimentoAguaId().getId().toString());
	}
	view.porque_razao_as_salas_nao_funcionam.setValue(porque_razao_as_salas_nao_funcionam);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setId(tblservicosbasicosinternet.getId().toString());
			model.setEsc_id(tblservicosbasicosinternet.getEscId().getId().toString());
	
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
		Dados_infra_carater_servico_basico model = new Dados_infra_carater_servico_basico();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
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
		TblServicosBasicosInternet tblservicosbasicosinternet  = new TblServicosBasicosInternet();
	TblAuxAbastecimentoAgua tblauxabastecimentoaguaForeign = session.find(TblAuxAbastecimentoAgua.class, Core.toInt(model.getFormas_abastecimento_agua_()));
	tblservicosbasicosinternet.setFormasAbastecimentoAguaId(tblauxabastecimentoaguaForeign);
	TblAuxFonteEnergia tblauxfonteenergiaForeign = session.find(TblAuxFonteEnergia.class, Core.toInt(model.getFonte_energia_eletrica()));
	tblservicosbasicosinternet.setFonteEnergiaId(tblauxfonteenergiaForeign);
	TblAuxArmazenamentoAgua tblauxarmazenamentoaguaForeign = session.find(TblAuxArmazenamentoAgua.class, Core.toInt(model.getFormas_armazenamento_agua()));
	tblservicosbasicosinternet.setFormasArmazenaAguaId(tblauxarmazenamentoaguaForeign);
	TblAuxAcessoInternet tblauxacessointernetForeign = session.find(TblAuxAcessoInternet.class, Core.toInt(model.getAcesso_a_internet()));
	tblservicosbasicosinternet.setAcessoInternetId(tblauxacessointernetForeign);
			tblservicosbasicosinternet.setNumSalaInoperante(model.getNumero_de_salas_inoperantes());
	TblAuxRazaoSalasInoperantes tblauxrazaosalasinoperantesForeign = session.find(TblAuxRazaoSalasInoperantes.class, Core.toInt(model.getPorque_razao_as_salas_nao_funcionam()));
	tblservicosbasicosinternet.setRazaoSalasInopId(tblauxrazaosalasinoperantesForeign);
	TblAuxEscolas tblauxescolasForeign = session.find(TblAuxEscolas.class, Core.toInt(model.getEsc_id()));
	tblservicosbasicosinternet.setEscId(tblauxescolasForeign);
			tblservicosbasicosinternet.setUserId(Core.getCurrentUser().getId());
			tblservicosbasicosinternet.setData(LocalDate.now());
			tblservicosbasicosinternet.setEstado("A");
		session.persist(tblservicosbasicosinternet);
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
	
	
	return this.forward("sgie","Dados_infra_carater_servico_basico","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(atualizar_dados)----*/
		
		
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
