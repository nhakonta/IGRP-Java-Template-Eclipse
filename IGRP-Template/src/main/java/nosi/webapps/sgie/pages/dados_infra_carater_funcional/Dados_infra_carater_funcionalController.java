package nosi.webapps.sgie.pages.dados_infra_carater_funcional;

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
import nosi.webapps.sgie.dao.TblCaraterizacaoFuncional; //block import
import nosi.webapps.sgie.dao.TblAuxFormaAcessoEscola; //block import
import nosi.webapps.sgie.dao.TblAuxSimNao; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
import java.time.LocalDate; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Dados_infra_carater_funcionalController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_funcional model = new Dados_infra_carater_funcional();
		model.load();
		Dados_infra_carater_funcionalView view = new Dados_infra_carater_funcionalView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.formas_de_acesso_a_escola.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.secretaria_carat_funcional.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.conselho_executivo_.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.areas_didaticas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.biblioteca_carat_funcional.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.club_ecologico_carat_funcional.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.auditorio.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_polivalente.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.ginasio_carat_funcional.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_musica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.ludoteca.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_informatica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_professores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_pais_.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_auxiliares.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.vestiario_de_alunos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_atl.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.gabinete_de_apoio_.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.recreio_interior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.refeitorio.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.cozinha_carat_funcional.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.cozinha_equipada.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.cozinha_confeciona.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.armazemdispensa_carat_funcional.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.anexos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.arrecadacao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.outras.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_banhos_para_meninos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_de_banho_para_meninas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_de_banho_para_professores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_de_banho_para_professoras.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_de_banho_adaptado_para_criancas_com_nee.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.o_estabelecimento_possui_instalacao_eletrica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblCaraterizacaoFuncional tblcaraterizacaofuncionalfilter = new TblCaraterizacaoFuncional().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id"))){
		tblcaraterizacaofuncionalfilter.where("escId.id","=",Core.getParamInt("p_esc_id"));
	}
		TblCaraterizacaoFuncional tblcaraterizacaofuncional = tblcaraterizacaofuncionalfilter.one();
		if (tblcaraterizacaofuncional!=null && !tblcaraterizacaofuncional.hasError()) {
			model.setNumero_de_alunos(tblcaraterizacaofuncional.getNumAlunos());
			model.setNumero_de_professores(tblcaraterizacaofuncional.getNumProfs());
			model.setArea_util(tblcaraterizacaofuncional.getAreaUtil());
			model.setDivisoes_principais(tblcaraterizacaofuncional.getDivisoesPrincipais());
			model.setCozinheiras(tblcaraterizacaofuncional.getCozinheiras());
			model.setGuardas(tblcaraterizacaofuncional.getGuardas());
			model.setPessoal_de_limpeza(tblcaraterizacaofuncional.getPessoalLimpeza());
			model.setContinuos(tblcaraterizacaofuncional.getContinos());
			model.setPessoal_manutencao(tblcaraterizacaofuncional.getPessoalManutencao());
	
	try{
	TblAuxFormaAcessoEscola tblauxformaacessoescolafilter = new TblAuxFormaAcessoEscola().find();
	List<TblAuxFormaAcessoEscola> tblauxformaacessoescolaList = tblauxformaacessoescolafilter.all();
	LinkedHashMap<String, String> formas_de_acesso_a_escola = new LinkedHashMap<>();
	for(TblAuxFormaAcessoEscola tblauxformaacessoescola : tblauxformaacessoescolaList){
		formas_de_acesso_a_escola.put(tblauxformaacessoescola.getId().toString(), gt(tblauxformaacessoescola.getDescricao()));
			model.setFormas_de_acesso_a_escola(tblcaraterizacaofuncional.getFormasAcesso().getId().toString());
	}
	view.formas_de_acesso_a_escola.setValue(formas_de_acesso_a_escola);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> secretaria_carat_funcional = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		secretaria_carat_funcional.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setSecretaria_carat_funcional(tblcaraterizacaofuncional.getFormasAcesso().getId().toString());
	}
	view.secretaria_carat_funcional.setValue(secretaria_carat_funcional);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> conselho_executivo_ = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		conselho_executivo_.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setConselho_executivo_(tblcaraterizacaofuncional.getConselhoExecutivo().getId().toString());
	}
	view.conselho_executivo_.setValue(conselho_executivo_);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> areas_didaticas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		areas_didaticas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setAreas_didaticas(tblcaraterizacaofuncional.getAreaDidaticas().getId().toString());
	}
	view.areas_didaticas.setValue(areas_didaticas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> biblioteca_carat_funcional = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		biblioteca_carat_funcional.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setBiblioteca_carat_funcional(tblcaraterizacaofuncional.getBiblioteca().getId().toString());
	}
	view.biblioteca_carat_funcional.setValue(biblioteca_carat_funcional);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setNumero_de_sala_de_aulas(tblcaraterizacaofuncional.getSalasAula());
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> club_ecologico_carat_funcional = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		club_ecologico_carat_funcional.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setClub_ecologico_carat_funcional(tblcaraterizacaofuncional.getClubEco().getId().toString());
	}
	view.club_ecologico_carat_funcional.setValue(club_ecologico_carat_funcional);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> auditorio = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		auditorio.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setAuditorio(tblcaraterizacaofuncional.getAuditorio().getId().toString());
	}
	view.auditorio.setValue(auditorio);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> sala_polivalente = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		sala_polivalente.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setSala_polivalente(tblcaraterizacaofuncional.getSalaPolivalente().getId().toString());
	}
	view.sala_polivalente.setValue(sala_polivalente);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> ginasio_carat_funcional = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		ginasio_carat_funcional.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setGinasio_carat_funcional(tblcaraterizacaofuncional.getGinasio().getId().toString());
	}
	view.ginasio_carat_funcional.setValue(ginasio_carat_funcional);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> sala_de_musica = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		sala_de_musica.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setSala_de_musica(tblcaraterizacaofuncional.getSalaMusica().getId().toString());
	}
	view.sala_de_musica.setValue(sala_de_musica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> ludoteca = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		ludoteca.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setLudoteca(tblcaraterizacaofuncional.getLudoteca().getId().toString());
	}
	view.ludoteca.setValue(ludoteca);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> sala_de_informatica = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		sala_de_informatica.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setSala_de_informatica(tblcaraterizacaofuncional.getSalaInformatica().getId().toString());
	}
	view.sala_de_informatica.setValue(sala_de_informatica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> sala_de_professores = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		sala_de_professores.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setSala_de_professores(tblcaraterizacaofuncional.getSalaProfs().getId().toString());
	}
	view.sala_de_professores.setValue(sala_de_professores);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> sala_de_pais_ = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		sala_de_pais_.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setSala_de_pais_(tblcaraterizacaofuncional.getSalaPais().getId().toString());
	}
	view.sala_de_pais_.setValue(sala_de_pais_);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> sala_auxiliares = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		sala_auxiliares.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setSala_auxiliares(tblcaraterizacaofuncional.getSalasAuxiliares().getId().toString());
	}
	view.sala_auxiliares.setValue(sala_auxiliares);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> vestiario_de_alunos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		vestiario_de_alunos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setVestiario_de_alunos(tblcaraterizacaofuncional.getVestiarioAlunos().getId().toString());
	}
	view.vestiario_de_alunos.setValue(vestiario_de_alunos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> sala_de_atl = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		sala_de_atl.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setSala_de_atl(tblcaraterizacaofuncional.getSalaAtl().getId().toString());
	}
	view.sala_de_atl.setValue(sala_de_atl);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> gabinete_de_apoio_ = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		gabinete_de_apoio_.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setGabinete_de_apoio_(tblcaraterizacaofuncional.getGabineteApoio().getId().toString());
	}
	view.gabinete_de_apoio_.setValue(gabinete_de_apoio_);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> recreio_interior = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		recreio_interior.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setRecreio_interior(tblcaraterizacaofuncional.getRecreioInterior().getId().toString());
	}
	view.recreio_interior.setValue(recreio_interior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> refeitorio = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		refeitorio.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setRefeitorio(tblcaraterizacaofuncional.getRefeitorio().getId().toString());
	}
	view.refeitorio.setValue(refeitorio);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> cozinha_carat_funcional = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		cozinha_carat_funcional.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setCozinha_carat_funcional(tblcaraterizacaofuncional.getCozinha().getId().toString());
	}
	view.cozinha_carat_funcional.setValue(cozinha_carat_funcional);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> cozinha_equipada = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		cozinha_equipada.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setCozinha_equipada(tblcaraterizacaofuncional.getCozinhaEquipada().getId().toString());
	}
	view.cozinha_equipada.setValue(cozinha_equipada);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> cozinha_confeciona = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		cozinha_confeciona.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setCozinha_confeciona(tblcaraterizacaofuncional.getCozinhaConfeciona().getId().toString());
	}
	view.cozinha_confeciona.setValue(cozinha_confeciona);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> armazemdispensa_carat_funcional = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		armazemdispensa_carat_funcional.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setArmazemdispensa_carat_funcional(tblcaraterizacaofuncional.getDispensa().getId().toString());
	}
	view.armazemdispensa_carat_funcional.setValue(armazemdispensa_carat_funcional);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> anexos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		anexos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setAnexos(tblcaraterizacaofuncional.getAnexos().getId().toString());
	}
	view.anexos.setValue(anexos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> arrecadacao = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		arrecadacao.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setArrecadacao(tblcaraterizacaofuncional.getArrecadacao().getId().toString());
	}
	view.arrecadacao.setValue(arrecadacao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> outras = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		outras.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setOutras(tblcaraterizacaofuncional.getOutras().getId().toString());
	}
	view.outras.setValue(outras);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> casa_banhos_para_meninos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		casa_banhos_para_meninos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setCasa_banhos_para_meninos(tblcaraterizacaofuncional.getCasaBanhosRapazes().getId().toString());
	}
	view.casa_banhos_para_meninos.setValue(casa_banhos_para_meninos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> casa_de_banho_para_meninas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		casa_de_banho_para_meninas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setCasa_de_banho_para_meninas(tblcaraterizacaofuncional.getCasaBanhoRaparigas().getId().toString());
	}
	view.casa_de_banho_para_meninas.setValue(casa_de_banho_para_meninas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> casa_de_banho_para_professores = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		casa_de_banho_para_professores.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setCasa_de_banho_para_professores(tblcaraterizacaofuncional.getCasaBanhoProfs().getId().toString());
	}
	view.casa_de_banho_para_professores.setValue(casa_de_banho_para_professores);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> casa_de_banho_para_professoras = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		casa_de_banho_para_professoras.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setCasa_de_banho_para_professoras(tblcaraterizacaofuncional.getCasaBanhoProfessoras().getId().toString());
	}
	view.casa_de_banho_para_professoras.setValue(casa_de_banho_para_professoras);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> casa_de_banho_adaptado_para_criancas_com_nee = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		casa_de_banho_adaptado_para_criancas_com_nee.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setCasa_de_banho_adaptado_para_criancas_com_nee(tblcaraterizacaofuncional.getCasaBanhoNne().getId().toString());
	}
	view.casa_de_banho_adaptado_para_criancas_com_nee.setValue(casa_de_banho_adaptado_para_criancas_com_nee);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> o_estabelecimento_possui_instalacao_eletrica = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		o_estabelecimento_possui_instalacao_eletrica.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setO_estabelecimento_possui_instalacao_eletrica(tblcaraterizacaofuncional.getPossuiInstacaoEletrica().getId().toString());
	}
	view.o_estabelecimento_possui_instalacao_eletrica.setValue(o_estabelecimento_possui_instalacao_eletrica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setEsc_id(Core.getParamInt("p_esc_id").toString());
	
	view.btn_atualizar_dados_carat_funcional.addParameter("isEdit", "true");
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
	
	public Response actionAtualizar_dados_carat_funcional() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_funcional model = new Dados_infra_carater_funcional();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (atualizar_dados_carat_funcional)  */
	return this.forward("sgie","Dados_infra_carater_funcional","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(atualizar_dados_carat_funcional)----*/
		
		
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
