package nosi.webapps.sgie.pages.dados_infra_carater_exterior;

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
import nosi.webapps.sgie.dao.TblAuxAnomalias; //block import
import nosi.webapps.sgie.dao.TblCaraterizacaoEspExterior; //block import
import nosi.webapps.sgie.dao.TblAuxSimNao; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Dados_infra_carater_exteriorController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_exterior model = new Dados_infra_carater_exterior();
		model.load();
		Dados_infra_carater_exteriorView view = new Dados_infra_carater_exteriorView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.acesso_automovel.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sistema_de_rega.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.lugares_de_estacionamento.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.manual.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.arvores_de_folha_perene.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.arvores_de_folha_caduca.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.arvores_de_fruto.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.arbustos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.canteiros_floridos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campos_de_futebol.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campos_de_basquetebol.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campos_de_voleibol.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.recreio_coberto_exterior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.pavilhao_polivalente_exterior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.pavilhao_interior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.outras_instalacoes_exteriores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblCaraterizacaoEspExterior tblcaraterizacaoespexteriorfilter = new TblCaraterizacaoEspExterior().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id_tbl"))){
		tblcaraterizacaoespexteriorfilter.andWhere("escId.id","=",Core.getParamInt("p_esc_id_tbl"));
	}
		TblCaraterizacaoEspExterior tblcaraterizacaoespexterior = tblcaraterizacaoespexteriorfilter.one();
		if (tblcaraterizacaoespexterior!=null && !tblcaraterizacaoespexterior.hasError()) {
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> acesso_automovel = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		acesso_automovel.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setAcesso_automovel(tblcaraterizacaoespexterior.getAcessoAuto().getId().toString());
	}
	view.acesso_automovel.setValue(acesso_automovel);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> sistema_de_rega = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		sistema_de_rega.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setSistema_de_rega(tblcaraterizacaoespexterior.getSistemaRega().getId().toString());
	}
	view.sistema_de_rega.setValue(sistema_de_rega);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> lugares_de_estacionamento = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		lugares_de_estacionamento.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setLugares_de_estacionamento(tblcaraterizacaoespexterior.getLugaEstacionamento().getId().toString());
	}
	view.lugares_de_estacionamento.setValue(lugares_de_estacionamento);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> manual = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		manual.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setManual(tblcaraterizacaoespexterior.getManual().getId().toString());
	}
	view.manual.setValue(manual);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> arvores_de_folha_perene = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		arvores_de_folha_perene.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getId().toString()));
			model.setArvores_de_folha_perene(tblcaraterizacaoespexterior.getArvoresFolhaPerene().getId().toString());
	}
	view.arvores_de_folha_perene.setValue(arvores_de_folha_perene);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> arvores_de_folha_caduca = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		arvores_de_folha_caduca.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getId().toString()));
			model.setArvores_de_folha_caduca(tblcaraterizacaoespexterior.getArvoresFolhaCaduca().getId().toString());
	}
	view.arvores_de_folha_caduca.setValue(arvores_de_folha_caduca);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> arvores_de_fruto = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		arvores_de_fruto.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getId().toString()));
			model.setArvores_de_fruto(tblcaraterizacaoespexterior.getArvoresFruta().getId().toString());
	}
	view.arvores_de_fruto.setValue(arvores_de_fruto);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> arbustos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		arbustos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getId().toString()));
			model.setArbustos(tblcaraterizacaoespexterior.getArbustos().getId().toString());
	}
	view.arbustos.setValue(arbustos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> canteiros_floridos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		canteiros_floridos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getId().toString()));
			model.setCanteiros_floridos(tblcaraterizacaoespexterior.getCanteirosFloridos().getId().toString());
	}
	view.canteiros_floridos.setValue(canteiros_floridos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setQuantidade_canteiros_floridos(tblcaraterizacaoespexterior.getQuantCantFloridos());
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> campos_de_futebol = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		campos_de_futebol.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setCampos_de_futebol(tblcaraterizacaoespexterior.getCampoFutebol().getId().toString());
	}
	view.campos_de_futebol.setValue(campos_de_futebol);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> campos_de_basquetebol = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		campos_de_basquetebol.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setCampos_de_basquetebol(tblcaraterizacaoespexterior.getCampoBasquete().getId().toString());
	}
	view.campos_de_basquetebol.setValue(campos_de_basquetebol);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> campos_de_voleibol = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		campos_de_voleibol.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setCampos_de_voleibol(tblcaraterizacaoespexterior.getCampoVoley().getId().toString());
	}
	view.campos_de_voleibol.setValue(campos_de_voleibol);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> recreio_coberto_exterior = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		recreio_coberto_exterior.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setRecreio_coberto_exterior(tblcaraterizacaoespexterior.getRecreioCobExterior().getId().toString());
	}
	view.recreio_coberto_exterior.setValue(recreio_coberto_exterior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> pavilhao_polivalente_exterior = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		pavilhao_polivalente_exterior.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setPavilhao_polivalente_exterior(tblcaraterizacaoespexterior.getOutrasInstalExterior().getId().toString());
	}
	view.pavilhao_polivalente_exterior.setValue(pavilhao_polivalente_exterior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> pavilhao_interior = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		pavilhao_interior.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setPavilhao_interior(tblcaraterizacaoespexterior.getPaviliaoPoliExterior().getId().toString());
	}
	view.pavilhao_interior.setValue(pavilhao_interior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> outras_instalacoes_exteriores = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		outras_instalacoes_exteriores.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setOutras_instalacoes_exteriores(tblcaraterizacaoespexterior.getOutrasInstalExterior().getId().toString());
	}
	view.outras_instalacoes_exteriores.setValue(outras_instalacoes_exteriores);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	view.btn_atualizar_dados_carat_esp_exterior.addParameter("isEdit", "true");
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
	
	public Response actionAtualizar_dados_carat_esp_exterior() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_exterior model = new Dados_infra_carater_exterior();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (atualizar_dados_carat_esp_exterior)  */
	return this.forward("sgie","Dados_infra_carater_exterior","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(atualizar_dados_carat_esp_exterior)----*/
		
		
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
