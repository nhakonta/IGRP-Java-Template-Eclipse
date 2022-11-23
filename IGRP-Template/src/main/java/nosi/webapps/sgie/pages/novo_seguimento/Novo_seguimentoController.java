package nosi.webapps.sgie.pages.novo_seguimento;

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
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Novo_seguimentoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Novo_seguimento model = new Novo_seguimento();
		model.load();
		model.setLink_1("sgie","Folha_avaliacao_salas","index");
		model.setLink_secretaria("sgie","Folha_avaliacao_salas","index");
		model.setLink_biblioteca("sgie","Folha_avaliacao_salas","index");
		model.setLink_ginasio("sgie","Folha_avaliacao_salas","index");
		model.setLink_lab_info("sgie","Folha_avaliacao_salas","index");
		model.setLink_11("sgie","Folha_avaliacao_salas","index");
		model.setLink_lab_quim("sgie","Folha_avaliacao_salas","index");
		model.setLink_multime("sgie","Folha_avaliacao_salas","index");
		model.setLink_reprografia("sgie","Folha_avaliacao_salas","index");
		model.setLink_club_eco("sgie","Folha_avaliacao_salas","index");
		model.setLink_sala_leitura("sgie","Folha_avaliacao_salas","index");
		model.setLink_oficina_agraf("sgie","Folha_avaliacao_salas","index");
		model.setLink_centro_rec("sgie","Folha_avaliacao_salas","index");
		model.setLink_lab_pt("sgie","Folha_avaliacao_salas","index");
		model.setLink_lab_ing("sgie","Folha_avaliacao_salas","index");
		model.setLink_lab_fran("sgie","Folha_avaliacao_salas","index");
		model.setLink_ofic_eletro("sgie","Folha_avaliacao_salas","index");
		model.setLink_ofic_inform("sgie","Folha_avaliacao_salas","index");
		model.setLink_papelaria("sgie","Folha_avaliacao_salas","index");
		model.setLink_ofic_mec("sgie","Folha_avaliacao_salas","index");
		model.setLink_anfiteatro("sgie","Folha_avaliacao_salas","index");
		model.setLink_ofic_solda("sgie","Folha_avaliacao_salas","index");
		model.setLink_sala_alunos("sgie","Folha_avaliacao_salas","index");
		model.setLink_sala_espec("sgie","Folha_avaliacao_salas","index");
		model.setLink_ofic_cc("sgie","Folha_avaliacao_salas","index");
		model.setLink_pavil_exterior("sgie","Folha_avaliacao_salas","index");
		model.setLink_outros_espacos("sgie","Folha_avaliacao_salas","index");
		model.setLink_campo_voley("sgie","Folha_avaliacao_campos","index");
		model.setLink_campo_fute("sgie","Folha_avaliacao_campos","index");
		model.setLink_campo_basq("sgie","Folha_avaliacao_campos","index");
		model.setLink_pav_interior("sgie","Folha_avaliacao_salas","index");
		model.setLink_placa_desport("sgie","Folha_avaliacao_campos","index");
		model.setLink_2("sgie","Folha_avaliacao_salas","index");
		model.setLink_sala_profs("sgie","Folha_avaliacao_salas","index");
		model.setLink_refeitorio("sgie","Folha_avaliacao_salas","index");
		model.setLink_dispensa("sgie","Folha_avaliacao_salas","index");
		model.setLink_anexo("sgie","Folha_avaliacao_salas","index");
		model.setLink_escadas("sgie","Folha_avaliacao_escadas","index");
		model.setLink_wc_meninos("sgie","Folha_avaliacao_wc","index");
		model.setLink_wc_meninas("sgie","Folha_avaliacao_wc","index");
		model.setLink_wc_defic("sgie","Folha_avaliacao_wc","index");
		model.setLink_wc_profs("sgie","Folha_avaliacao_wc","index");
		model.setLink_wc_profsra("sgie","Folha_avaliacao_wc","index");
		model.setLink_cantina("sgie","Folha_avaliacao_salas","index");
		model.setLink_cozinha("sgie","Folha_avaliacao_salas","index");
		model.setLink_rampa("sgie","Folha_avaliacao_escadas","index");
		model.setLink_auto("sgie","Folha_avaliacao_escadas","index");
		model.setLink_pedonal("sgie","Folha_avaliacao_escadas","index");
		model.setRega("sgie","Folha_avaliacao_escadas","index");
		model.setLink_vedacao("sgie","Folha_avaliacao_escadas","index");
		model.setLink_patio("sgie","Folha_avaliacao_escadas","index");
		model.setLink_canteiros("sgie","Folha_avaliacao_escadas","index");
		model.setLink_parque_auto("sgie","Folha_avaliacao_escadas","index");
		model.setLink_seneamento("sgie","Folha_avaliacao_portas","index");
		Novo_seguimentoView view = new Novo_seguimentoView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.direcao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.secretaria.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.biblioteca.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.ginasio.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_informatico.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_biologia.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_quimicafisica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_multimedia.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.reprografia.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.club_ecologico.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_leitura.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_artes_graficas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.centros_de_recursos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_de_lingua_portuguesa.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_de_lingua_inglesa.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.laboratorio_de_lingua_francesa.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_eletrotecnica_eletronica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_informatica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.papelaria.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_mecanica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.anfiteatroauditorio.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_soldaduraconstrucao_metalica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_associacao_de_alunos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.salas_especificas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_construcao_civil.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.pavilhao_polivalente_exterior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.outros_espacos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campos_de_voleibol.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campos_de_futebol.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campos_de_basquetebol.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.pavilhao_interior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.placa_desportiva.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.outras_instalacoes_exteriores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_professores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.refeitorio.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.armazemdispensa.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.anexosarrecadacao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.escadas_e_corredores_internos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_banhos_para_meninos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_banhos_para_meninas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_banhos_para_criancas_com_deficiencias.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_de_banho_para_professores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.casa_de_banho_para_professoras.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.cantina.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.cozinha.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.rampa_de_acesso.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.acesso_automovel.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.acesso_pedonal.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sistema_de_rega.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.muro_de_vedacao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.patio_da_escola.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.canteiros_floridos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.parque_automovel.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.saneamento_basico.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> direcao = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		direcao.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.direcao.setValue(direcao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> secretaria = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		secretaria.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.secretaria.setValue(secretaria);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> biblioteca = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		biblioteca.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.biblioteca.setValue(biblioteca);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> ginasio = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		ginasio.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.ginasio.setValue(ginasio);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> laboratorio_informatico = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		laboratorio_informatico.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
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
	}
	view.sala_multimedia.setValue(sala_multimedia);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> reprografia = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		reprografia.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.reprografia.setValue(reprografia);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> club_ecologico = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		club_ecologico.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.club_ecologico.setValue(club_ecologico);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> sala_de_leitura = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		sala_de_leitura.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.sala_de_leitura.setValue(sala_de_leitura);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_artes_graficas = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_artes_graficas.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.oficina_de_artes_graficas.setValue(oficina_de_artes_graficas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> centros_de_recursos = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		centros_de_recursos.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.centros_de_recursos.setValue(centros_de_recursos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> laboratorio_de_lingua_portuguesa = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		laboratorio_de_lingua_portuguesa.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.laboratorio_de_lingua_portuguesa.setValue(laboratorio_de_lingua_portuguesa);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> laboratorio_de_lingua_inglesa = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		laboratorio_de_lingua_inglesa.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.laboratorio_de_lingua_inglesa.setValue(laboratorio_de_lingua_inglesa);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> laboratorio_de_lingua_francesa = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		laboratorio_de_lingua_francesa.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.laboratorio_de_lingua_francesa.setValue(laboratorio_de_lingua_francesa);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_eletrotecnica_eletronica = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_eletrotecnica_eletronica.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.oficina_de_eletrotecnica_eletronica.setValue(oficina_de_eletrotecnica_eletronica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_informatica = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_informatica.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.oficina_de_informatica.setValue(oficina_de_informatica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> papelaria = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		papelaria.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.papelaria.setValue(papelaria);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_mecanica = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_mecanica.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.oficina_de_mecanica.setValue(oficina_de_mecanica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> anfiteatroauditorio = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		anfiteatroauditorio.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.anfiteatroauditorio.setValue(anfiteatroauditorio);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_soldaduraconstrucao_metalica = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_soldaduraconstrucao_metalica.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
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
	}
	view.sala_de_associacao_de_alunos.setValue(sala_de_associacao_de_alunos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> salas_especificas = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		salas_especificas.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.salas_especificas.setValue(salas_especificas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> oficina_de_construcao_civil = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		oficina_de_construcao_civil.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.oficina_de_construcao_civil.setValue(oficina_de_construcao_civil);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> pavilhao_polivalente_exterior = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		pavilhao_polivalente_exterior.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.pavilhao_polivalente_exterior.setValue(pavilhao_polivalente_exterior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> outros_espacos = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		outros_espacos.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.outros_espacos.setValue(outros_espacos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> campos_de_voleibol = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		campos_de_voleibol.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.campos_de_voleibol.setValue(campos_de_voleibol);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> campos_de_futebol = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		campos_de_futebol.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
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
	}
	view.campos_de_basquetebol.setValue(campos_de_basquetebol);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> pavilhao_interior = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		pavilhao_interior.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.pavilhao_interior.setValue(pavilhao_interior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> placa_desportiva = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		placa_desportiva.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.placa_desportiva.setValue(placa_desportiva);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> outras_instalacoes_exteriores = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		outras_instalacoes_exteriores.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.outras_instalacoes_exteriores.setValue(outras_instalacoes_exteriores);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> sala_de_professores = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		sala_de_professores.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.sala_de_professores.setValue(sala_de_professores);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> refeitorio = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		refeitorio.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.refeitorio.setValue(refeitorio);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> armazemdispensa = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		armazemdispensa.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.armazemdispensa.setValue(armazemdispensa);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> anexosarrecadacao = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		anexosarrecadacao.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.anexosarrecadacao.setValue(anexosarrecadacao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> escadas_e_corredores_internos = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		escadas_e_corredores_internos.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.escadas_e_corredores_internos.setValue(escadas_e_corredores_internos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> casa_banhos_para_meninos = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		casa_banhos_para_meninos.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.casa_banhos_para_meninos.setValue(casa_banhos_para_meninos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> casa_banhos_para_meninas = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		casa_banhos_para_meninas.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.casa_banhos_para_meninas.setValue(casa_banhos_para_meninas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> casa_banhos_para_criancas_com_deficiencias = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		casa_banhos_para_criancas_com_deficiencias.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.casa_banhos_para_criancas_com_deficiencias.setValue(casa_banhos_para_criancas_com_deficiencias);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> casa_de_banho_para_professores = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		casa_de_banho_para_professores.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.casa_de_banho_para_professores.setValue(casa_de_banho_para_professores);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> casa_de_banho_para_professoras = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		casa_de_banho_para_professoras.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.casa_de_banho_para_professoras.setValue(casa_de_banho_para_professoras);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> cantina = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		cantina.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.cantina.setValue(cantina);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> cozinha = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		cozinha.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.cozinha.setValue(cozinha);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> rampa_de_acesso = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		rampa_de_acesso.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.rampa_de_acesso.setValue(rampa_de_acesso);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> acesso_automovel = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		acesso_automovel.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.acesso_automovel.setValue(acesso_automovel);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> acesso_pedonal = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		acesso_pedonal.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.acesso_pedonal.setValue(acesso_pedonal);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> sistema_de_rega = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		sistema_de_rega.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.sistema_de_rega.setValue(sistema_de_rega);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> muro_de_vedacao = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		muro_de_vedacao.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
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
	}
	view.patio_da_escola.setValue(patio_da_escola);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> canteiros_floridos = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		canteiros_floridos.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.canteiros_floridos.setValue(canteiros_floridos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> parque_automovel = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		parque_automovel.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.parque_automovel.setValue(parque_automovel);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxAnomalias tblauxanomaliasfilter = new TblAuxAnomalias().find();
	List<TblAuxAnomalias> tblauxanomaliasList = tblauxanomaliasfilter.all();
	LinkedHashMap<String, String> saneamento_basico = new LinkedHashMap<>();
	for(TblAuxAnomalias tblauxanomalias : tblauxanomaliasList){
		saneamento_basico.put(tblauxanomalias.getId().toString(), gt(tblauxanomalias.getDescricao()));
	}
	view.saneamento_basico.setValue(saneamento_basico);
	}catch ( Exception e ) {
		e.printStackTrace();
	}/* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGuardar_seguimento() throws IOException, IllegalArgumentException, IllegalAccessException{
		Novo_seguimento model = new Novo_seguimento();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (guardar_seguimento)  *//* End-Code-Block  */
		/*----#start-code(guardar_seguimento)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Param_cobertura","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
