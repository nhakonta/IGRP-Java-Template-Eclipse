package nosi.webapps.sgie.pages.dados_infra_carater_interior;

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
import nosi.webapps.sgie.dao.TblCaraterizacaoAspInterior; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Dados_infra_carater_interiorController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_interior model = new Dados_infra_carater_interior();
		model.load();
		Dados_infra_carater_interiorView view = new Dados_infra_carater_interiorView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.muro_de_vedacao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.patio_da_escola.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.rampa_de_acesso.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.cozinha.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.dispensa_armazem.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.placa_desportiva.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.ginasio.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_de_banho.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_informatico.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_biologia.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_quimicafisica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_multimedia.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.biblioteca.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.cantina.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.club_ecologico.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.centros_de_recursos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_de_lingua.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_professores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.secretaria.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.anfiteatro.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.direcao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.reprografia.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_leitura.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_mecanica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_eletrotecnica_eletronica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_construcao_civil.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_artes_graficas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_informatica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_soldaduraconstrucao_metalica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_associacao_de_alunos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.papelaria.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.salas_especificas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.outros_espacos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblCaraterizacaoAspInterior tblcaraterizacaoaspinteriorfilter = new TblCaraterizacaoAspInterior().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id"))){
		tblcaraterizacaoaspinteriorfilter.andWhere("escId.id","=",Core.getParamInt("p_esc_id"));
	}
		TblCaraterizacaoAspInterior tblcaraterizacaoaspinterior = tblcaraterizacaoaspinteriorfilter.one();
		if (tblcaraterizacaoaspinterior!=null && !tblcaraterizacaoaspinterior.hasError()) {
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> muro_de_vedacao = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		muro_de_vedacao.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setMuro_de_vedacao(tblcaraterizacaoaspinterior.getMuroVedacao().getId().toString());
	}
	view.muro_de_vedacao.setValue(muro_de_vedacao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> patio_da_escola = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		patio_da_escola.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setPatio_da_escola(tblcaraterizacaoaspinterior.getPatioEscola().getId().toString());
	}
	view.patio_da_escola.setValue(patio_da_escola);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> rampa_de_acesso = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		rampa_de_acesso.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setRampa_de_acesso(tblcaraterizacaoaspinterior.getRampaAcesso().getId().toString());
	}
	view.rampa_de_acesso.setValue(rampa_de_acesso);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> cozinha = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		cozinha.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setCozinha(tblcaraterizacaoaspinterior.getCozinha().getId().toString());
	}
	view.cozinha.setValue(cozinha);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> dispensa_armazem = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		dispensa_armazem.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setDispensa_armazem(tblcaraterizacaoaspinterior.getDispensaArmazem().getId().toString());
	}
	view.dispensa_armazem.setValue(dispensa_armazem);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> placa_desportiva = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		placa_desportiva.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setPlaca_desportiva(tblcaraterizacaoaspinterior.getPlacaDesportiva().getId().toString());
	}
	view.placa_desportiva.setValue(placa_desportiva);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> ginasio = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		ginasio.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setGinasio(tblcaraterizacaoaspinterior.getGinasio().getId().toString());
	}
	view.ginasio.setValue(ginasio);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> casa_de_banho = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		casa_de_banho.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setCasa_de_banho(tblcaraterizacaoaspinterior.getCasaBanho().getId().toString());
	}
	view.casa_de_banho.setValue(casa_de_banho);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> laboratorio_informatico = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		laboratorio_informatico.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setLaboratorio_informatico(tblcaraterizacaoaspinterior.getLabInformatica().getId().toString());
	}
	view.laboratorio_informatico.setValue(laboratorio_informatico);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> laboratorio_biologia = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		laboratorio_biologia.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setLaboratorio_biologia(tblcaraterizacaoaspinterior.getLabBiologia().getId().toString());
	}
	view.laboratorio_biologia.setValue(laboratorio_biologia);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> laboratorio_quimicafisica = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		laboratorio_quimicafisica.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setLaboratorio_quimicafisica(tblcaraterizacaoaspinterior.getLabQuimicaFisica().getId().toString());
	}
	view.laboratorio_quimicafisica.setValue(laboratorio_quimicafisica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> sala_multimedia = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		sala_multimedia.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setSala_multimedia(tblcaraterizacaoaspinterior.getSalaMultimedia().getId().toString());
	}
	view.sala_multimedia.setValue(sala_multimedia);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> biblioteca = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		biblioteca.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setBiblioteca(tblcaraterizacaoaspinterior.getBiblioteca().getId().toString());
	}
	view.biblioteca.setValue(biblioteca);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> cantina = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		cantina.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setCantina(tblcaraterizacaoaspinterior.getCantina().getId().toString());
	}
	view.cantina.setValue(cantina);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> club_ecologico = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		club_ecologico.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setClub_ecologico(tblcaraterizacaoaspinterior.getClubeEco().getId().toString());
	}
	view.club_ecologico.setValue(club_ecologico);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> centros_de_recursos = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		centros_de_recursos.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setCentros_de_recursos(tblcaraterizacaoaspinterior.getCentroRecursos().getId().toString());
	}
	view.centros_de_recursos.setValue(centros_de_recursos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> laboratorio_de_lingua = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		laboratorio_de_lingua.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setLaboratorio_de_lingua(tblcaraterizacaoaspinterior.getLabLingua().getId().toString());
	}
	view.laboratorio_de_lingua.setValue(laboratorio_de_lingua);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> sala_de_professores = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		sala_de_professores.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setSala_de_professores(tblcaraterizacaoaspinterior.getSalaProfs().getId().toString());
	}
	view.sala_de_professores.setValue(sala_de_professores);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> secretaria = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		secretaria.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setSecretaria(tblcaraterizacaoaspinterior.getSecretaria().getId().toString());
	}
	view.secretaria.setValue(secretaria);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> anfiteatro = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		anfiteatro.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setAnfiteatro(tblcaraterizacaoaspinterior.getAnfiteatro().getId().toString());
	}
	view.anfiteatro.setValue(anfiteatro);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> direcao = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		direcao.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setDirecao(tblcaraterizacaoaspinterior.getDirecao().getId().toString());
	}
	view.direcao.setValue(direcao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> reprografia = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		reprografia.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setReprografia(tblcaraterizacaoaspinterior.getReprografia().getId().toString());
	}
	view.reprografia.setValue(reprografia);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> sala_de_leitura = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		sala_de_leitura.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setSala_de_leitura(tblcaraterizacaoaspinterior.getSalaLeitura().getId().toString());
	}
	view.sala_de_leitura.setValue(sala_de_leitura);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_mecanica = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_mecanica.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setOficina_de_mecanica(tblcaraterizacaoaspinterior.getOficinaMecanica().getId().toString());
	}
	view.oficina_de_mecanica.setValue(oficina_de_mecanica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_eletrotecnica_eletronica = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_eletrotecnica_eletronica.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setOficina_de_eletrotecnica_eletronica(tblcaraterizacaoaspinterior.getOficinaElectro().getId().toString());
	}
	view.oficina_de_eletrotecnica_eletronica.setValue(oficina_de_eletrotecnica_eletronica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_construcao_civil = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_construcao_civil.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setOficina_de_construcao_civil(tblcaraterizacaoaspinterior.getOficinaConstCivil().getId().toString());
	}
	view.oficina_de_construcao_civil.setValue(oficina_de_construcao_civil);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_artes_graficas = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_artes_graficas.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setOficina_de_artes_graficas(tblcaraterizacaoaspinterior.getOficinaArtesGraficas().getId().toString());
	}
	view.oficina_de_artes_graficas.setValue(oficina_de_artes_graficas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_informatica = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_informatica.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setOficina_de_informatica(tblcaraterizacaoaspinterior.getOficinaInformatica().getId().toString());
	}
	view.oficina_de_informatica.setValue(oficina_de_informatica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_soldaduraconstrucao_metalica = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_soldaduraconstrucao_metalica.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setOficina_de_soldaduraconstrucao_metalica(tblcaraterizacaoaspinterior.getOficinaSoldadura().getId().toString());
	}
	view.oficina_de_soldaduraconstrucao_metalica.setValue(oficina_de_soldaduraconstrucao_metalica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> sala_de_associacao_de_alunos = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		sala_de_associacao_de_alunos.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setSala_de_associacao_de_alunos(tblcaraterizacaoaspinterior.getSalaAssociaAlunos().getId().toString());
	}
	view.sala_de_associacao_de_alunos.setValue(sala_de_associacao_de_alunos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> papelaria = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		papelaria.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setPapelaria(tblcaraterizacaoaspinterior.getPapelaria().getId().toString());
	}
	view.papelaria.setValue(papelaria);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> salas_especificas = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		salas_especificas.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setSalas_especificas(tblcaraterizacaoaspinterior.getSalaEspecifica().getId().toString());
	}
	view.salas_especificas.setValue(salas_especificas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> outros_espacos = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		outros_espacos.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
			model.setOutros_espacos(tblcaraterizacaoaspinterior.getOutosEspacos().getId().toString());
	}
	view.outros_espacos.setValue(outros_espacos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setEsc_id(Core.getParamInt("p_esc_id").toString());
	
	view.btn_atualizar_dados_carat_esp_interior.addParameter("isEdit", "true");
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
	
	public Response actionAtualizar_dados_carat_esp_interior() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_interior model = new Dados_infra_carater_interior();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (atualizar_dados_carat_esp_interior)  */
	return this.forward("sgie","Dados_infra_carater_interior","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(atualizar_dados_carat_esp_interior)----*/
		
		
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
