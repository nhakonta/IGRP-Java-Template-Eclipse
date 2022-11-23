package nosi.webapps.sgie.pages.folha_avaliacao_salas;

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
		
public class Folha_avaliacao_salasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Folha_avaliacao_salas model = new Folha_avaliacao_salas();
		model.load();
		Folha_avaliacao_salasView view = new Folha_avaliacao_salasView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.insuficiencia_dos_elementos_estruturais.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.alteracao_na_geometria.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.fendilhacao_nas_zonas_criticas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.armaduras_a_vista.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.elementos_corroidos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.falta_de_condicoes_de_seguranca.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.falta_dos_elementos_resistentes_fundamentais.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.alteracao_na_geometria_cobertura.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.extensiva_deterioracao_dos_revestimentos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.danos_significativos_em_partes_singulares.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sistema_de_drenagem.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.anomalias_indicadores_de_deterioracao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.buracos_ou_aberturas_nas_paredes.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.alteracao_na_geometria_de_paredes.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.extensiva_deterioracao_dos_revestimentos_nas_paredes.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.danos_significativos_em_partes_singulares_nas_paredes.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.anomalias_indicadores_de_deterioracao_nas_paredes.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sinais_de_presenca_de_agua.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.buracos_no_piso.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.fissurasrachaduras.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.alteracao_na_geometria_no_pavimento.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.portas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.portas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.os_elementos_que_as_constituem_estao_deterioradas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.asseguram_a_estanquidade_das_aguas_das_chuvas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.quadro_tem_disjuntores_e_diferencial_de_protecao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.degradacao_dos_condutores_eletricos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.aparelhos_em_bom_estado_tomadas_e_interruptores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.risco_de_eletrocussao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> insuficiencia_dos_elementos_estruturais = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		insuficiencia_dos_elementos_estruturais.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.insuficiencia_dos_elementos_estruturais.setValue(insuficiencia_dos_elementos_estruturais);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> alteracao_na_geometria = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		alteracao_na_geometria.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.alteracao_na_geometria.setValue(alteracao_na_geometria);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> fendilhacao_nas_zonas_criticas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		fendilhacao_nas_zonas_criticas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.fendilhacao_nas_zonas_criticas.setValue(fendilhacao_nas_zonas_criticas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> armaduras_a_vista = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		armaduras_a_vista.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.armaduras_a_vista.setValue(armaduras_a_vista);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> elementos_corroidos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		elementos_corroidos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.elementos_corroidos.setValue(elementos_corroidos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> falta_de_condicoes_de_seguranca = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		falta_de_condicoes_de_seguranca.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.falta_de_condicoes_de_seguranca.setValue(falta_de_condicoes_de_seguranca);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> insuficiencia_dos_elementos_estruturais = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		insuficiencia_dos_elementos_estruturais.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.insuficiencia_dos_elementos_estruturais.setValue(insuficiencia_dos_elementos_estruturais);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> falta_dos_elementos_resistentes_fundamentais = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		falta_dos_elementos_resistentes_fundamentais.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.falta_dos_elementos_resistentes_fundamentais.setValue(falta_dos_elementos_resistentes_fundamentais);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> alteracao_na_geometria_cobertura = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		alteracao_na_geometria_cobertura.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.alteracao_na_geometria_cobertura.setValue(alteracao_na_geometria_cobertura);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> extensiva_deterioracao_dos_revestimentos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		extensiva_deterioracao_dos_revestimentos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.extensiva_deterioracao_dos_revestimentos.setValue(extensiva_deterioracao_dos_revestimentos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> danos_significativos_em_partes_singulares = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		danos_significativos_em_partes_singulares.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.danos_significativos_em_partes_singulares.setValue(danos_significativos_em_partes_singulares);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> sistema_de_drenagem = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		sistema_de_drenagem.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.sistema_de_drenagem.setValue(sistema_de_drenagem);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> anomalias_indicadores_de_deterioracao = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		anomalias_indicadores_de_deterioracao.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.anomalias_indicadores_de_deterioracao.setValue(anomalias_indicadores_de_deterioracao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> buracos_ou_aberturas_nas_paredes = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		buracos_ou_aberturas_nas_paredes.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.buracos_ou_aberturas_nas_paredes.setValue(buracos_ou_aberturas_nas_paredes);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> alteracao_na_geometria_de_paredes = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		alteracao_na_geometria_de_paredes.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.alteracao_na_geometria_de_paredes.setValue(alteracao_na_geometria_de_paredes);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> extensiva_deterioracao_dos_revestimentos_nas_paredes = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		extensiva_deterioracao_dos_revestimentos_nas_paredes.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.extensiva_deterioracao_dos_revestimentos_nas_paredes.setValue(extensiva_deterioracao_dos_revestimentos_nas_paredes);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> danos_significativos_em_partes_singulares_nas_paredes = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		danos_significativos_em_partes_singulares_nas_paredes.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.danos_significativos_em_partes_singulares_nas_paredes.setValue(danos_significativos_em_partes_singulares_nas_paredes);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> anomalias_indicadores_de_deterioracao_nas_paredes = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		anomalias_indicadores_de_deterioracao_nas_paredes.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.anomalias_indicadores_de_deterioracao_nas_paredes.setValue(anomalias_indicadores_de_deterioracao_nas_paredes);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> sinais_de_presenca_de_agua = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		sinais_de_presenca_de_agua.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.sinais_de_presenca_de_agua.setValue(sinais_de_presenca_de_agua);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> buracos_no_piso = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		buracos_no_piso.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.buracos_no_piso.setValue(buracos_no_piso);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> fissurasrachaduras = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		fissurasrachaduras.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.fissurasrachaduras.setValue(fissurasrachaduras);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> alteracao_na_geometria_no_pavimento = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		alteracao_na_geometria_no_pavimento.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.alteracao_na_geometria_no_pavimento.setValue(alteracao_na_geometria_no_pavimento);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> portas_abrem_e_fecham_sem_recursos_a_forca_excessiva = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		portas_abrem_e_fecham_sem_recursos_a_forca_excessiva.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.portas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setValue(portas_abrem_e_fecham_sem_recursos_a_forca_excessiva);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> portas_tem_fechaduras_que_asseguram_o_encerramento_seguro = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		portas_tem_fechaduras_que_asseguram_o_encerramento_seguro.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.portas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setValue(portas_tem_fechaduras_que_asseguram_o_encerramento_seguro);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> portas_tem_fechaduras_que_asseguram_o_encerramento_seguro = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		portas_tem_fechaduras_que_asseguram_o_encerramento_seguro.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.portas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setValue(portas_tem_fechaduras_que_asseguram_o_encerramento_seguro);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setValue(janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setValue(janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> os_elementos_que_as_constituem_estao_deterioradas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		os_elementos_que_as_constituem_estao_deterioradas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.os_elementos_que_as_constituem_estao_deterioradas.setValue(os_elementos_que_as_constituem_estao_deterioradas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> asseguram_a_estanquidade_das_aguas_das_chuvas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		asseguram_a_estanquidade_das_aguas_das_chuvas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.asseguram_a_estanquidade_das_aguas_das_chuvas.setValue(asseguram_a_estanquidade_das_aguas_das_chuvas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> quadro_tem_disjuntores_e_diferencial_de_protecao = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		quadro_tem_disjuntores_e_diferencial_de_protecao.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.quadro_tem_disjuntores_e_diferencial_de_protecao.setValue(quadro_tem_disjuntores_e_diferencial_de_protecao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> degradacao_dos_condutores_eletricos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		degradacao_dos_condutores_eletricos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.degradacao_dos_condutores_eletricos.setValue(degradacao_dos_condutores_eletricos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> degradacao_dos_condutores_eletricos = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		degradacao_dos_condutores_eletricos.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.degradacao_dos_condutores_eletricos.setValue(degradacao_dos_condutores_eletricos);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> aparelhos_em_bom_estado_tomadas_e_interruptores = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		aparelhos_em_bom_estado_tomadas_e_interruptores.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.aparelhos_em_bom_estado_tomadas_e_interruptores.setValue(aparelhos_em_bom_estado_tomadas_e_interruptores);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> risco_de_eletrocussao = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		risco_de_eletrocussao.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
	}
	view.risco_de_eletrocussao.setValue(risco_de_eletrocussao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}/* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGuardar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Folha_avaliacao_salas model = new Folha_avaliacao_salas();
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
