package nosi.webapps.sgie.pages.dados_infra_carater_construtivo;

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
import nosi.webapps.sgie.dao.TblAuxEstruturaHorizontal; //block import
import nosi.webapps.sgie.dao.TblCaraterizacaoConstrutiva; //block import
import nosi.webapps.sgie.dao.TblAuxEstruturaVertical; //block import
import nosi.webapps.sgie.dao.TblAuxFundacoes; //block import
import nosi.webapps.sgie.dao.TblAuxEstrElemVerticaisSuporte; //block import
import nosi.webapps.sgie.dao.TblAuxPavimentos; //block import
import nosi.webapps.sgie.dao.TblAuxVedacao; //block import
import nosi.webapps.sgie.dao.TblAuxCobertura; //block import
import nosi.webapps.sgie.dao.TblAuxCobertForma; //block import
import nosi.webapps.sgie.dao.TblAuxCoberturaEstSuporte; //block import
import nosi.webapps.sgie.dao.TblAuxRevestCoberturaTerraco; //block import
import nosi.webapps.sgie.dao.TblAuxRevestCoberturaInclinada; //block import
import nosi.webapps.sgie.dao.TblAuxRevestExterior; //block import
import nosi.webapps.sgie.dao.TblAuxParedeExterior; //block import
import nosi.webapps.sgie.dao.TblAuxParedeExtTosco; //block import
import nosi.webapps.sgie.dao.TblAuxParedeExtRevestimFachadaEmpena; //block import
import nosi.webapps.sgie.dao.TblAuxParedeIntTosco; //block import
import nosi.webapps.sgie.dao.TblAuxParedeIntRevestimFachada; //block import
import nosi.webapps.sgie.dao.TblAuxCaixalhariasMaterial; //block import
import nosi.webapps.sgie.dao.TblAuxPortaoPedAut; //block import
import nosi.webapps.sgie.dao.TblAuxEscadaCorrimIntExtRampa; //block import
import nosi.webapps.sgie.dao.TblAuxEscadasEstrutSuporte; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Dados_infra_carater_construtivoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_construtivo model = new Dados_infra_carater_construtivo();
		model.load();
		Dados_infra_carater_construtivoView view = new Dados_infra_carater_construtivoView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.estrutura_horizontal.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.estrutura_vertical.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.fundacoes.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.elementos_verticais_de_suporte.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.pavimentos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.vedacao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.cobertura.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.forma_cobertura_carat_construt.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.estrutura_de_suporte.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.revestimento_da_cobertura_em_terraco.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.revestimento_da_cobertura_inclinada.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.revestimento_exterior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.paredes_exterior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.tosco_parede_exterior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.revestimento_do_paramento_exterior_das_fachadas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.revestimento_do_paramento_exterior_das_empenas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.tosco_parade_interior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.revestimento_do_paramento_interior_das_fachadas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.material.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.portao_pedonal.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.portao_automovel.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.escadas_externas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.rampa_externas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.corrimaos_escadas_internas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.escadas_interior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.estrutura_de_suporte_escadas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.corrimaos_escadas_externas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblCaraterizacaoConstrutiva tblcaraterizacaoconstrutivafilter = new TblCaraterizacaoConstrutiva().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id"))){
		tblcaraterizacaoconstrutivafilter.andWhere("escId.id","=",Core.getParamInt("p_esc_id"));
	}
		TblCaraterizacaoConstrutiva tblcaraterizacaoconstrutiva = tblcaraterizacaoconstrutivafilter.one();
		if (tblcaraterizacaoconstrutiva!=null && !tblcaraterizacaoconstrutiva.hasError()) {
	
	try{
	TblAuxEstruturaHorizontal tblauxestruturahorizontalfilter = new TblAuxEstruturaHorizontal().find();
	List<TblAuxEstruturaHorizontal> tblauxestruturahorizontalList = tblauxestruturahorizontalfilter.all();
	LinkedHashMap<String, String> estrutura_horizontal = new LinkedHashMap<>();
	for(TblAuxEstruturaHorizontal tblauxestruturahorizontal : tblauxestruturahorizontalList){
		estrutura_horizontal.put(tblauxestruturahorizontal.getId().toString(), gt(tblauxestruturahorizontal.getDescricao()));
			model.setEstrutura_horizontal(tblcaraterizacaoconstrutiva.getEstruturaHorizontal().getId().toString());
	}
	view.estrutura_horizontal.setValue(estrutura_horizontal);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxEstruturaVertical tblauxestruturaverticalfilter = new TblAuxEstruturaVertical().find();
	List<TblAuxEstruturaVertical> tblauxestruturaverticalList = tblauxestruturaverticalfilter.all();
	LinkedHashMap<String, String> estrutura_vertical = new LinkedHashMap<>();
	for(TblAuxEstruturaVertical tblauxestruturavertical : tblauxestruturaverticalList){
		estrutura_vertical.put(tblauxestruturavertical.getId().toString(), gt(tblauxestruturavertical.getDescricao()));
			model.setEstrutura_vertical(tblcaraterizacaoconstrutiva.getEstruturaVertical().getId().toString());
	}
	view.estrutura_vertical.setValue(estrutura_vertical);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxFundacoes tblauxfundacoesfilter = new TblAuxFundacoes().find();
	List<TblAuxFundacoes> tblauxfundacoesList = tblauxfundacoesfilter.all();
	LinkedHashMap<String, String> fundacoes = new LinkedHashMap<>();
	for(TblAuxFundacoes tblauxfundacoes : tblauxfundacoesList){
		fundacoes.put(tblauxfundacoes.getId().toString(), gt(tblauxfundacoes.getDescricao()));
			model.setFundacoes(tblcaraterizacaoconstrutiva.getEstrFundacoes().getId().toString());
	}
	view.fundacoes.setValue(fundacoes);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxEstrElemVerticaisSuporte tblauxestrelemverticaissuportefilter = new TblAuxEstrElemVerticaisSuporte().find();
	List<TblAuxEstrElemVerticaisSuporte> tblauxestrelemverticaissuporteList = tblauxestrelemverticaissuportefilter.all();
	LinkedHashMap<String, String> elementos_verticais_de_suporte = new LinkedHashMap<>();
	for(TblAuxEstrElemVerticaisSuporte tblauxestrelemverticaissuporte : tblauxestrelemverticaissuporteList){
		elementos_verticais_de_suporte.put(tblauxestrelemverticaissuporte.getId().toString(), gt(tblauxestrelemverticaissuporte.getDescricao()));
			model.setElementos_verticais_de_suporte(tblcaraterizacaoconstrutiva.getEstrElemVerticaisSuporte().getId().toString());
	}
	view.elementos_verticais_de_suporte.setValue(elementos_verticais_de_suporte);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxPavimentos tblauxpavimentosfilter = new TblAuxPavimentos().find();
	List<TblAuxPavimentos> tblauxpavimentosList = tblauxpavimentosfilter.all();
	LinkedHashMap<String, String> pavimentos = new LinkedHashMap<>();
	for(TblAuxPavimentos tblauxpavimentos : tblauxpavimentosList){
		pavimentos.put(tblauxpavimentos.getId().toString(), gt(tblauxpavimentos.getDescricao()));
			model.setPavimentos(tblcaraterizacaoconstrutiva.getEstrPavimentos().getId().toString());
	}
	view.pavimentos.setValue(pavimentos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxVedacao tblauxvedacaofilter = new TblAuxVedacao().find();
	List<TblAuxVedacao> tblauxvedacaoList = tblauxvedacaofilter.all();
	LinkedHashMap<String, String> vedacao = new LinkedHashMap<>();
	for(TblAuxVedacao tblauxvedacao : tblauxvedacaoList){
		vedacao.put(tblauxvedacao.getId().toString(), gt(tblauxvedacao.getDescricao()));
			model.setVedacao(tblcaraterizacaoconstrutiva.getVedacao().getId().toString());
	}
	view.vedacao.setValue(vedacao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxCobertura tblauxcoberturafilter = new TblAuxCobertura().find();
	List<TblAuxCobertura> tblauxcoberturaList = tblauxcoberturafilter.all();
	LinkedHashMap<String, String> cobertura = new LinkedHashMap<>();
	for(TblAuxCobertura tblauxcobertura : tblauxcoberturaList){
		cobertura.put(tblauxcobertura.getId().toString(), gt(tblauxcobertura.getDescricao()));
			model.setCobertura(tblcaraterizacaoconstrutiva.getCobertura().getId().toString());
	}
	view.cobertura.setValue(cobertura);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxCobertForma tblauxcobertformafilter = new TblAuxCobertForma().find();
	List<TblAuxCobertForma> tblauxcobertformaList = tblauxcobertformafilter.all();
	LinkedHashMap<String, String> forma_cobertura_carat_construt = new LinkedHashMap<>();
	for(TblAuxCobertForma tblauxcobertforma : tblauxcobertformaList){
		forma_cobertura_carat_construt.put(tblauxcobertforma.getId().toString(), gt(tblauxcobertforma.getDescricao()));
			model.setForma_cobertura_carat_construt(tblcaraterizacaoconstrutiva.getCoberForma().getId().toString());
	}
	view.forma_cobertura_carat_construt.setValue(forma_cobertura_carat_construt);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxCoberturaEstSuporte tblauxcoberturaestsuportefilter = new TblAuxCoberturaEstSuporte().find();
	List<TblAuxCoberturaEstSuporte> tblauxcoberturaestsuporteList = tblauxcoberturaestsuportefilter.all();
	LinkedHashMap<String, String> estrutura_de_suporte = new LinkedHashMap<>();
	for(TblAuxCoberturaEstSuporte tblauxcoberturaestsuporte : tblauxcoberturaestsuporteList){
		estrutura_de_suporte.put(tblauxcoberturaestsuporte.getId().toString(), gt(tblauxcoberturaestsuporte.getDescricao()));
			model.setEstrutura_de_suporte(tblcaraterizacaoconstrutiva.getCoberEstruturaSuporte().getId().toString());
	}
	view.estrutura_de_suporte.setValue(estrutura_de_suporte);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxRevestCoberturaTerraco tblauxrevestcoberturaterracofilter = new TblAuxRevestCoberturaTerraco().find();
	List<TblAuxRevestCoberturaTerraco> tblauxrevestcoberturaterracoList = tblauxrevestcoberturaterracofilter.all();
	LinkedHashMap<String, String> revestimento_da_cobertura_em_terraco = new LinkedHashMap<>();
	for(TblAuxRevestCoberturaTerraco tblauxrevestcoberturaterraco : tblauxrevestcoberturaterracoList){
		revestimento_da_cobertura_em_terraco.put(tblauxrevestcoberturaterraco.getId().toString(), gt(tblauxrevestcoberturaterraco.getDescricao()));
			model.setRevestimento_da_cobertura_em_terraco(tblcaraterizacaoconstrutiva.getCoberRevistTerraco().getId().toString());
	}
	view.revestimento_da_cobertura_em_terraco.setValue(revestimento_da_cobertura_em_terraco);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxRevestCoberturaInclinada tblauxrevestcoberturainclinadafilter = new TblAuxRevestCoberturaInclinada().find();
	List<TblAuxRevestCoberturaInclinada> tblauxrevestcoberturainclinadaList = tblauxrevestcoberturainclinadafilter.all();
	LinkedHashMap<String, String> revestimento_da_cobertura_inclinada = new LinkedHashMap<>();
	for(TblAuxRevestCoberturaInclinada tblauxrevestcoberturainclinada : tblauxrevestcoberturainclinadaList){
		revestimento_da_cobertura_inclinada.put(tblauxrevestcoberturainclinada.getId().toString(), gt(tblauxrevestcoberturainclinada.getDescricao()));
			model.setRevestimento_da_cobertura_inclinada(tblcaraterizacaoconstrutiva.getCoberRevistInclinada().getId().toString());
	}
	view.revestimento_da_cobertura_inclinada.setValue(revestimento_da_cobertura_inclinada);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxRevestExterior tblauxrevestexteriorfilter = new TblAuxRevestExterior().find();
	List<TblAuxRevestExterior> tblauxrevestexteriorList = tblauxrevestexteriorfilter.all();
	LinkedHashMap<String, String> revestimento_exterior = new LinkedHashMap<>();
	for(TblAuxRevestExterior tblauxrevestexterior : tblauxrevestexteriorList){
		revestimento_exterior.put(tblauxrevestexterior.getId().toString(), gt(tblauxrevestexterior.getDescricao()));
			model.setRevestimento_exterior(tblcaraterizacaoconstrutiva.getRevestimentoExterior().getId().toString());
	}
	view.revestimento_exterior.setValue(revestimento_exterior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxParedeExterior tblauxparedeexteriorfilter = new TblAuxParedeExterior().find();
	List<TblAuxParedeExterior> tblauxparedeexteriorList = tblauxparedeexteriorfilter.all();
	LinkedHashMap<String, String> paredes_exterior = new LinkedHashMap<>();
	for(TblAuxParedeExterior tblauxparedeexterior : tblauxparedeexteriorList){
		paredes_exterior.put(tblauxparedeexterior.getId().toString(), gt(tblauxparedeexterior.getDescricao()));
			model.setParedes_exterior(tblcaraterizacaoconstrutiva.getParedesExteriores().getId().toString());
	}
	view.paredes_exterior.setValue(paredes_exterior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxParedeExtTosco tblauxparedeexttoscofilter = new TblAuxParedeExtTosco().find();
	List<TblAuxParedeExtTosco> tblauxparedeexttoscoList = tblauxparedeexttoscofilter.all();
	LinkedHashMap<String, String> tosco_parede_exterior = new LinkedHashMap<>();
	for(TblAuxParedeExtTosco tblauxparedeexttosco : tblauxparedeexttoscoList){
		tosco_parede_exterior.put(tblauxparedeexttosco.getId().toString(), gt(tblauxparedeexttosco.getDescricao()));
			model.setTosco_parede_exterior(tblcaraterizacaoconstrutiva.getParExtTosco().getId().toString());
	}
	view.tosco_parede_exterior.setValue(tosco_parede_exterior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxParedeExtRevestimFachadaEmpena tblauxparedeextrevestimfachadaempenafilter = new TblAuxParedeExtRevestimFachadaEmpena().find();
	List<TblAuxParedeExtRevestimFachadaEmpena> tblauxparedeextrevestimfachadaempenaList = tblauxparedeextrevestimfachadaempenafilter.all();
	LinkedHashMap<String, String> revestimento_do_paramento_exterior_das_fachadas = new LinkedHashMap<>();
	for(TblAuxParedeExtRevestimFachadaEmpena tblauxparedeextrevestimfachadaempena : tblauxparedeextrevestimfachadaempenaList){
		revestimento_do_paramento_exterior_das_fachadas.put(tblauxparedeextrevestimfachadaempena.getId().toString(), gt(tblauxparedeextrevestimfachadaempena.getId().toString()));
			model.setRevestimento_do_paramento_exterior_das_fachadas(tblcaraterizacaoconstrutiva.getParExtRevestFachada().getId().toString());
	}
	view.revestimento_do_paramento_exterior_das_fachadas.setValue(revestimento_do_paramento_exterior_das_fachadas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxParedeExtRevestimFachadaEmpena tblauxparedeextrevestimfachadaempenafilter = new TblAuxParedeExtRevestimFachadaEmpena().find();
	List<TblAuxParedeExtRevestimFachadaEmpena> tblauxparedeextrevestimfachadaempenaList = tblauxparedeextrevestimfachadaempenafilter.all();
	LinkedHashMap<String, String> revestimento_do_paramento_exterior_das_empenas = new LinkedHashMap<>();
	for(TblAuxParedeExtRevestimFachadaEmpena tblauxparedeextrevestimfachadaempena : tblauxparedeextrevestimfachadaempenaList){
		revestimento_do_paramento_exterior_das_empenas.put(tblauxparedeextrevestimfachadaempena.getId().toString(), gt(tblauxparedeextrevestimfachadaempena.getId().toString()));
			model.setRevestimento_do_paramento_exterior_das_empenas(tblcaraterizacaoconstrutiva.getParExtRevestEmpena().getId().toString());
	}
	view.revestimento_do_paramento_exterior_das_empenas.setValue(revestimento_do_paramento_exterior_das_empenas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxParedeIntTosco tblauxparedeinttoscofilter = new TblAuxParedeIntTosco().find();
	List<TblAuxParedeIntTosco> tblauxparedeinttoscoList = tblauxparedeinttoscofilter.all();
	LinkedHashMap<String, String> tosco_parade_interior = new LinkedHashMap<>();
	for(TblAuxParedeIntTosco tblauxparedeinttosco : tblauxparedeinttoscoList){
		tosco_parade_interior.put(tblauxparedeinttosco.getId().toString(), gt(tblauxparedeinttosco.getDescricao()));
			model.setTosco_parade_interior(tblcaraterizacaoconstrutiva.getParIntTosco().getId().toString());
	}
	view.tosco_parade_interior.setValue(tosco_parade_interior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxParedeIntRevestimFachada tblauxparedeintrevestimfachadafilter = new TblAuxParedeIntRevestimFachada().find();
	List<TblAuxParedeIntRevestimFachada> tblauxparedeintrevestimfachadaList = tblauxparedeintrevestimfachadafilter.all();
	LinkedHashMap<String, String> revestimento_do_paramento_interior_das_fachadas = new LinkedHashMap<>();
	for(TblAuxParedeIntRevestimFachada tblauxparedeintrevestimfachada : tblauxparedeintrevestimfachadaList){
		revestimento_do_paramento_interior_das_fachadas.put(tblauxparedeintrevestimfachada.getId().toString(), gt(tblauxparedeintrevestimfachada.getDescricao()));
			model.setRevestimento_do_paramento_interior_das_fachadas(tblcaraterizacaoconstrutiva.getParIntRevestFachada().getId().toString());
	}
	view.revestimento_do_paramento_interior_das_fachadas.setValue(revestimento_do_paramento_interior_das_fachadas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxCaixalhariasMaterial tblauxcaixalhariasmaterialfilter = new TblAuxCaixalhariasMaterial().find();
	List<TblAuxCaixalhariasMaterial> tblauxcaixalhariasmaterialList = tblauxcaixalhariasmaterialfilter.all();
	LinkedHashMap<String, String> material = new LinkedHashMap<>();
	for(TblAuxCaixalhariasMaterial tblauxcaixalhariasmaterial : tblauxcaixalhariasmaterialList){
		material.put(tblauxcaixalhariasmaterial.getId().toString(), gt(tblauxcaixalhariasmaterial.getDescricao()));
			model.setMaterial(tblcaraterizacaoconstrutiva.getCaixalhariaMaterial().getId().toString());
	}
	view.material.setValue(material);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxPortaoPedAut tblauxportaopedautfilter = new TblAuxPortaoPedAut().find();
	List<TblAuxPortaoPedAut> tblauxportaopedautList = tblauxportaopedautfilter.all();
	LinkedHashMap<String, String> portao_pedonal = new LinkedHashMap<>();
	for(TblAuxPortaoPedAut tblauxportaopedaut : tblauxportaopedautList){
		portao_pedonal.put(tblauxportaopedaut.getId().toString(), gt(tblauxportaopedaut.getDescricao()));
			model.setPortao_pedonal(tblcaraterizacaoconstrutiva.getPortaoPedonal().getId().toString());
	}
	view.portao_pedonal.setValue(portao_pedonal);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxPortaoPedAut tblauxportaopedautfilter = new TblAuxPortaoPedAut().find();
	List<TblAuxPortaoPedAut> tblauxportaopedautList = tblauxportaopedautfilter.all();
	LinkedHashMap<String, String> portao_automovel = new LinkedHashMap<>();
	for(TblAuxPortaoPedAut tblauxportaopedaut : tblauxportaopedautList){
		portao_automovel.put(tblauxportaopedaut.getId().toString(), gt(tblauxportaopedaut.getDescricao()));
			model.setPortao_automovel(tblcaraterizacaoconstrutiva.getPortaoAutomovel().getId().toString());
	}
	view.portao_automovel.setValue(portao_automovel);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampafilter = new TblAuxEscadaCorrimIntExtRampa().find();
	List<TblAuxEscadaCorrimIntExtRampa> tblauxescadacorrimintextrampaList = tblauxescadacorrimintextrampafilter.all();
	LinkedHashMap<String, String> escadas_externas = new LinkedHashMap<>();
	for(TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampa : tblauxescadacorrimintextrampaList){
		escadas_externas.put(tblauxescadacorrimintextrampa.getId().toString(), gt(tblauxescadacorrimintextrampa.getDescricao()));
			model.setEscadas_externas(tblcaraterizacaoconstrutiva.getEscadasExt().getId().toString());
	}
	view.escadas_externas.setValue(escadas_externas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampafilter = new TblAuxEscadaCorrimIntExtRampa().find();
	List<TblAuxEscadaCorrimIntExtRampa> tblauxescadacorrimintextrampaList = tblauxescadacorrimintextrampafilter.all();
	LinkedHashMap<String, String> rampa_externas = new LinkedHashMap<>();
	for(TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampa : tblauxescadacorrimintextrampaList){
		rampa_externas.put(tblauxescadacorrimintextrampa.getId().toString(), gt(tblauxescadacorrimintextrampa.getDescricao()));
			model.setRampa_externas(tblcaraterizacaoconstrutiva.getRampasExternas().getId().toString());
	}
	view.rampa_externas.setValue(rampa_externas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampafilter = new TblAuxEscadaCorrimIntExtRampa().find();
	List<TblAuxEscadaCorrimIntExtRampa> tblauxescadacorrimintextrampaList = tblauxescadacorrimintextrampafilter.all();
	LinkedHashMap<String, String> corrimaos_escadas_internas = new LinkedHashMap<>();
	for(TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampa : tblauxescadacorrimintextrampaList){
		corrimaos_escadas_internas.put(tblauxescadacorrimintextrampa.getId().toString(), gt(tblauxescadacorrimintextrampa.getDescricao()));
			model.setCorrimaos_escadas_internas(tblcaraterizacaoconstrutiva.getCorrimaosEscInter().getId().toString());
	}
	view.corrimaos_escadas_internas.setValue(corrimaos_escadas_internas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampafilter = new TblAuxEscadaCorrimIntExtRampa().find();
	List<TblAuxEscadaCorrimIntExtRampa> tblauxescadacorrimintextrampaList = tblauxescadacorrimintextrampafilter.all();
	LinkedHashMap<String, String> escadas_interior = new LinkedHashMap<>();
	for(TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampa : tblauxescadacorrimintextrampaList){
		escadas_interior.put(tblauxescadacorrimintextrampa.getId().toString(), gt(tblauxescadacorrimintextrampa.getDescricao()));
			model.setEscadas_interior(tblcaraterizacaoconstrutiva.getEscadasInteriores().getId().toString());
	}
	view.escadas_interior.setValue(escadas_interior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxEscadasEstrutSuporte tblauxescadasestrutsuportefilter = new TblAuxEscadasEstrutSuporte().find();
	List<TblAuxEscadasEstrutSuporte> tblauxescadasestrutsuporteList = tblauxescadasestrutsuportefilter.all();
	LinkedHashMap<String, String> estrutura_de_suporte_escadas = new LinkedHashMap<>();
	for(TblAuxEscadasEstrutSuporte tblauxescadasestrutsuporte : tblauxescadasestrutsuporteList){
		estrutura_de_suporte_escadas.put(tblauxescadasestrutsuporte.getId().toString(), gt(tblauxescadasestrutsuporte.getDescricao()));
			model.setEstrutura_de_suporte_escadas(tblcaraterizacaoconstrutiva.getEscadaEstrutSuporte().getId().toString());
	}
	view.estrutura_de_suporte_escadas.setValue(estrutura_de_suporte_escadas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampafilter = new TblAuxEscadaCorrimIntExtRampa().find();
	List<TblAuxEscadaCorrimIntExtRampa> tblauxescadacorrimintextrampaList = tblauxescadacorrimintextrampafilter.all();
	LinkedHashMap<String, String> corrimaos_escadas_externas = new LinkedHashMap<>();
	for(TblAuxEscadaCorrimIntExtRampa tblauxescadacorrimintextrampa : tblauxescadacorrimintextrampaList){
		corrimaos_escadas_externas.put(tblauxescadacorrimintextrampa.getId().toString(), gt(tblauxescadacorrimintextrampa.getDescricao()));
			model.setCorrimaos_escadas_externas(tblcaraterizacaoconstrutiva.getCorrimaosEscExt().getId().toString());
	}
	view.corrimaos_escadas_externas.setValue(corrimaos_escadas_externas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setEsc_id(Core.getParamInt("p_esc_id").toString());
	
	view.btn_atualizar_dados_carat_construtiva.addParameter("isEdit", "true");
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
	
	public Response actionAtualizar_dados_carat_construtiva() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_construtivo model = new Dados_infra_carater_construtivo();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (atualizar_dados_carat_construtiva)  */
	return this.forward("sgie","Dados_infra_carater_construtivo","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(atualizar_dados_carat_construtiva)----*/
		
		
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
