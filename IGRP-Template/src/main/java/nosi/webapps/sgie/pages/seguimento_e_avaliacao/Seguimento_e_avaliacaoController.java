package nosi.webapps.sgie.pages.seguimento_e_avaliacao;

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
import nosi.webapps.sgie.dao.TblSeguimentoAvaliacao; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Seguimento_e_avaliacaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Seguimento_e_avaliacao model = new Seguimento_e_avaliacao();
		model.load();
		Seguimento_e_avaliacaoView view = new Seguimento_e_avaliacaoView();
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
		view.form_1_select_5.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.insuficiencia_dos_elementos_estrutural_escadas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.alteracao_na_geometria_escadas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.extensiva_deterioracao_dos_degraus.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.ausencia_de_guardas_ou_corrimao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.anomalias_indicadores_de_graves_deterioracao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.portas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.portas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.os_elementos_que_as_constituem_estao_deterioradas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.asseguram_a_estanquidade_das_aguas_das_chuvas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.tem_uma_lava_louca.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.tem_bancada_com_extensao_nao_inferior_a_60_cm.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.local_exterior_para_colocacao_de_gas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.tem_instalacao_para_evacuacao_de_ar_exaustor.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.ventilacao_direta_com_exterior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.janelas_com_rede.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.equipada_com_lavatorio.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.equipada_com_sanita_e_autoclismo.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.ventilacao_natural.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.ventilacao_mecanica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.equipada_com_mictorios.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.abastecimento_direta_da_rede_publica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.abastecimento_por_privados.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.dispositivos_de_seguranca.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.torneiras_funcionais.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.valvulas_funcionais.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.rede_publica_de_esgoto.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.fossa_septica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.tem_reaproveitamento_de_agua_para_rega.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.fossa_rudimentar.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.evacuacao_de_aguas_residuais_na_natureza.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.lixo_enterradoqueimado.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.lixo_jogado_na_natureza.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.lixo_jogado_ao_redor_da_escola.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.lixo_recolhido_pelo_carro_de_lixo.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.lixo_colocado_em_contentores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.evacuacao_de_aguas_residuais_em_valas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.quadro_tem_disjuntores_e_diferencial_de_protecao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.degradacao_dos_condutores_eletricos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.aparelhos_em_bom_estado_tomadas_e_interruptores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.risco_de_eletrocussao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblSeguimentoAvaliacao tblseguimentoavaliacaofilter = new TblSeguimentoAvaliacao().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id_tbl"))){
		tblseguimentoavaliacaofilter.andWhere("escId.id","=",Core.getParamInt("p_esc_id_tbl"));
	}
		TblSeguimentoAvaliacao tblseguimentoavaliacao = tblseguimentoavaliacaofilter.one();
		if (tblseguimentoavaliacao!=null && !tblseguimentoavaliacao.hasError()) {
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> insuficiencia_dos_elementos_estruturais = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		insuficiencia_dos_elementos_estruturais.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setInsuficiencia_dos_elementos_estruturais(tblseguimentoavaliacao.getInsufElementosEstruturaisEstrutura().getId().toString());
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
			model.setAlteracao_na_geometria(tblseguimentoavaliacao.getAlteracaoGeometriaEstrutura().getId().toString());
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
			model.setFendilhacao_nas_zonas_criticas(tblseguimentoavaliacao.getFendilhacaoEstrutura().getId().toString());
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
			model.setArmaduras_a_vista(tblseguimentoavaliacao.getArmadurasVistaEstrutura().getId().toString());
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
			model.setElementos_corroidos(tblseguimentoavaliacao.getArmadurasVistaEstrutura().getId().toString());
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
			model.setFalta_de_condicoes_de_seguranca(tblseguimentoavaliacao.getFaltaCondSegurancaEstrutura().getId().toString());
	}
	view.falta_de_condicoes_de_seguranca.setValue(falta_de_condicoes_de_seguranca);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> falta_dos_elementos_resistentes_fundamentais = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		falta_dos_elementos_resistentes_fundamentais.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setFalta_dos_elementos_resistentes_fundamentais(tblseguimentoavaliacao.getFaltaElemFundamentaisCobert().getId().toString());
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
			model.setAlteracao_na_geometria_cobertura(tblseguimentoavaliacao.getAlteracaoGeometriaCobert().getId().toString());
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
			model.setExtensiva_deterioracao_dos_revestimentos(tblseguimentoavaliacao.getExtensDeteoracaoRevistCobert().getId().toString());
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
			model.setDanos_significativos_em_partes_singulares(tblseguimentoavaliacao.getDanosSigPartesSingCobert().getId().toString());
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
			model.setSistema_de_drenagem(tblseguimentoavaliacao.getSistemaDrenagem().getId().toString());
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
			model.setAnomalias_indicadores_de_deterioracao(tblseguimentoavaliacao.getAnomaliasIndicDeteoracaoCobert().getId().toString());
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
			model.setBuracos_ou_aberturas_nas_paredes(tblseguimentoavaliacao.getBuracosAberturas().getId().toString());
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
			model.setAlteracao_na_geometria_de_paredes(tblseguimentoavaliacao.getAlteracaoGeometriaParedes().getId().toString());
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
			model.setExtensiva_deterioracao_dos_revestimentos_nas_paredes(tblseguimentoavaliacao.getExtensDeteoracaoRevistParedes().getId().toString());
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
			model.setDanos_significativos_em_partes_singulares_nas_paredes(tblseguimentoavaliacao.getDanosSigPartesSingParedes().getId().toString());
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
			model.setAnomalias_indicadores_de_deterioracao_nas_paredes(tblseguimentoavaliacao.getAnomaliasIndicDeteoracaoParedes().getId().toString());
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
			model.setSinais_de_presenca_de_agua(tblseguimentoavaliacao.getSinaisPresencaAgua().getId().toString());
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
			model.setBuracos_no_piso(tblseguimentoavaliacao.getBuracosPisos().getId().toString());
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
			model.setFissurasrachaduras(tblseguimentoavaliacao.getFissurasRachaduras().getId().toString());
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
			model.setAlteracao_na_geometria_no_pavimento(tblseguimentoavaliacao.getAlteracaoGeometriaPavimento().getId().toString());
	}
	view.alteracao_na_geometria_no_pavimento.setValue(alteracao_na_geometria_no_pavimento);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> insuficiencia_dos_elementos_estrutural_escadas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		insuficiencia_dos_elementos_estrutural_escadas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setInsuficiencia_dos_elementos_estrutural_escadas(tblseguimentoavaliacao.getInsufElementosEstruturaisEscadas().getId().toString());
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
			model.setAlteracao_na_geometria_escadas(tblseguimentoavaliacao.getAlteracaoGeometriaEscadas().getId().toString());
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
			model.setExtensiva_deterioracao_dos_degraus(tblseguimentoavaliacao.getExtensDeteoracaoRevistEscadas().getId().toString());
	}
	view.extensiva_deterioracao_dos_degraus.setValue(extensiva_deterioracao_dos_degraus);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> anomalias_indicadores_de_graves_deterioracao = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		anomalias_indicadores_de_graves_deterioracao.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setAnomalias_indicadores_de_graves_deterioracao(tblseguimentoavaliacao.getAnomaliasIndicDeteoracaoEscadas().getId().toString());
	}
	view.anomalias_indicadores_de_graves_deterioracao.setValue(anomalias_indicadores_de_graves_deterioracao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> portas_abrem_e_fecham_sem_recursos_a_forca_excessiva = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		portas_abrem_e_fecham_sem_recursos_a_forca_excessiva.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setPortas_abrem_e_fecham_sem_recursos_a_forca_excessiva(tblseguimentoavaliacao.getPortasAbremFechamSemForca().getId().toString());
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
			model.setPortas_tem_fechaduras_que_asseguram_o_encerramento_seguro(tblseguimentoavaliacao.getPortasTemFechaduras().getId().toString());
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
			model.setJanelas_abrem_e_fecham_sem_recursos_a_forca_excessiva(tblseguimentoavaliacao.getJanelasAbremFechamSemForca().getId().toString());
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
			model.setJanelas_tem_fechaduras_que_asseguram_o_encerramento_seguro(tblseguimentoavaliacao.getJanelasTemFechaduras().getId().toString());
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
			model.setOs_elementos_que_as_constituem_estao_deterioradas(tblseguimentoavaliacao.getElementosConstituientesDeterioradas().getId().toString());
	}
	view.os_elementos_que_as_constituem_estao_deterioradas.setValue(os_elementos_que_as_constituem_estao_deterioradas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> tem_uma_lava_louca = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		tem_uma_lava_louca.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setTem_uma_lava_louca(tblseguimentoavaliacao.getTemLavaLoica().getId().toString());
	}
	view.tem_uma_lava_louca.setValue(tem_uma_lava_louca);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> tem_bancada_com_extensao_nao_inferior_a_60_cm = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		tem_bancada_com_extensao_nao_inferior_a_60_cm.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setTem_bancada_com_extensao_nao_inferior_a_60_cm(tblseguimentoavaliacao.getTemBancada().getId().toString());
	}
	view.tem_bancada_com_extensao_nao_inferior_a_60_cm.setValue(tem_bancada_com_extensao_nao_inferior_a_60_cm);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> local_exterior_para_colocacao_de_gas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		local_exterior_para_colocacao_de_gas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setLocal_exterior_para_colocacao_de_gas(tblseguimentoavaliacao.getLocalExtColocacaoGas().getId().toString());
	}
	view.local_exterior_para_colocacao_de_gas.setValue(local_exterior_para_colocacao_de_gas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> tem_instalacao_para_evacuacao_de_ar_exaustor = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		tem_instalacao_para_evacuacao_de_ar_exaustor.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setTem_instalacao_para_evacuacao_de_ar_exaustor(tblseguimentoavaliacao.getEvacuacaoAr().getId().toString());
	}
	view.tem_instalacao_para_evacuacao_de_ar_exaustor.setValue(tem_instalacao_para_evacuacao_de_ar_exaustor);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> ventilacao_direta_com_exterior = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		ventilacao_direta_com_exterior.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setVentilacao_direta_com_exterior(tblseguimentoavaliacao.getVentilacaoComExterior().getId().toString());
	}
	view.ventilacao_direta_com_exterior.setValue(ventilacao_direta_com_exterior);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> janelas_com_rede = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		janelas_com_rede.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setJanelas_com_rede(tblseguimentoavaliacao.getJanelasComRedes().getId().toString());
	}
	view.janelas_com_rede.setValue(janelas_com_rede);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setNumero_de_vezes_que_se_realiza_desinfestacao_na_cozinha_por_ano(tblseguimentoavaliacao.getNumDesinfestacao());
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> equipada_com_lavatorio = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		equipada_com_lavatorio.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setEquipada_com_lavatorio(tblseguimentoavaliacao.getEquipadaComLavatorio().getId().toString());
	}
	view.equipada_com_lavatorio.setValue(equipada_com_lavatorio);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> equipada_com_sanita_e_autoclismo = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		equipada_com_sanita_e_autoclismo.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setEquipada_com_sanita_e_autoclismo(tblseguimentoavaliacao.getEquipadaSanitaAutoclismo().getId().toString());
	}
	view.equipada_com_sanita_e_autoclismo.setValue(equipada_com_sanita_e_autoclismo);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setNumero_de_sanitas(tblseguimentoavaliacao.getNumSanitas());
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> ventilacao_natural = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		ventilacao_natural.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setVentilacao_natural(tblseguimentoavaliacao.getVentilacaoNatural().getId().toString());
	}
	view.ventilacao_natural.setValue(ventilacao_natural);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> ventilacao_mecanica = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		ventilacao_mecanica.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setVentilacao_mecanica(tblseguimentoavaliacao.getVentilacaoMecanica().getId().toString());
	}
	view.ventilacao_mecanica.setValue(ventilacao_mecanica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> equipada_com_mictorios = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		equipada_com_mictorios.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setEquipada_com_mictorios(tblseguimentoavaliacao.getEquipadaMictorios().getId().toString());
	}
	view.equipada_com_mictorios.setValue(equipada_com_mictorios);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setNumero_de_mictorios(tblseguimentoavaliacao.getNumMictorio());
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> abastecimento_direta_da_rede_publica = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		abastecimento_direta_da_rede_publica.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setAbastecimento_direta_da_rede_publica(tblseguimentoavaliacao.getRedePublicaEsgoto().getId().toString());
	}
	view.abastecimento_direta_da_rede_publica.setValue(abastecimento_direta_da_rede_publica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> rede_publica_de_esgoto = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		rede_publica_de_esgoto.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setRede_publica_de_esgoto(tblseguimentoavaliacao.getRedePublicaEsgoto().getId().toString());
	}
	view.rede_publica_de_esgoto.setValue(rede_publica_de_esgoto);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> fossa_septica = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		fossa_septica.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setFossa_septica(tblseguimentoavaliacao.getFossaSeptica().getId().toString());
	}
	view.fossa_septica.setValue(fossa_septica);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> tem_reaproveitamento_de_agua_para_rega = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		tem_reaproveitamento_de_agua_para_rega.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setTem_reaproveitamento_de_agua_para_rega(tblseguimentoavaliacao.getReaproveitamentoAguaResidualParaRega().getId().toString());
	}
	view.tem_reaproveitamento_de_agua_para_rega.setValue(tem_reaproveitamento_de_agua_para_rega);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> fossa_rudimentar = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		fossa_rudimentar.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setFossa_rudimentar(tblseguimentoavaliacao.getFossaRudimentar().getId().toString());
	}
	view.fossa_rudimentar.setValue(fossa_rudimentar);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> evacuacao_de_aguas_residuais_na_natureza = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		evacuacao_de_aguas_residuais_na_natureza.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setEvacuacao_de_aguas_residuais_na_natureza(tblseguimentoavaliacao.getEvacucaoAguaResidualNatureza().getId().toString());
	}
	view.evacuacao_de_aguas_residuais_na_natureza.setValue(evacuacao_de_aguas_residuais_na_natureza);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> lixo_enterradoqueimado = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		lixo_enterradoqueimado.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setLixo_enterradoqueimado(tblseguimentoavaliacao.getLixoEnterradoQueimado().getId().toString());
	}
	view.lixo_enterradoqueimado.setValue(lixo_enterradoqueimado);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> lixo_jogado_na_natureza = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		lixo_jogado_na_natureza.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setLixo_jogado_na_natureza(tblseguimentoavaliacao.getLixoJogadoNaturaza().getId().toString());
	}
	view.lixo_jogado_na_natureza.setValue(lixo_jogado_na_natureza);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> lixo_jogado_ao_redor_da_escola = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		lixo_jogado_ao_redor_da_escola.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setLixo_jogado_ao_redor_da_escola(tblseguimentoavaliacao.getLixoJogadoRedorEscola().getId().toString());
	}
	view.lixo_jogado_ao_redor_da_escola.setValue(lixo_jogado_ao_redor_da_escola);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> lixo_recolhido_pelo_carro_de_lixo = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		lixo_recolhido_pelo_carro_de_lixo.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setLixo_recolhido_pelo_carro_de_lixo(tblseguimentoavaliacao.getRecolhaLixoPeloCarro().getId().toString());
	}
	view.lixo_recolhido_pelo_carro_de_lixo.setValue(lixo_recolhido_pelo_carro_de_lixo);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> lixo_colocado_em_contentores = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		lixo_colocado_em_contentores.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setLixo_colocado_em_contentores(tblseguimentoavaliacao.getLixoColocadoContentores().getId().toString());
	}
	view.lixo_colocado_em_contentores.setValue(lixo_colocado_em_contentores);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> evacuacao_de_aguas_residuais_em_valas = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		evacuacao_de_aguas_residuais_em_valas.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setEvacuacao_de_aguas_residuais_em_valas(tblseguimentoavaliacao.getEvacucaoAguaResidualVala().getId().toString());
	}
	view.evacuacao_de_aguas_residuais_em_valas.setValue(evacuacao_de_aguas_residuais_em_valas);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> quadro_tem_disjuntores_e_diferencial_de_protecao = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		quadro_tem_disjuntores_e_diferencial_de_protecao.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setQuadro_tem_disjuntores_e_diferencial_de_protecao(tblseguimentoavaliacao.getTemDisjuntoresDiferencial().getId().toString());
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
			model.setDegradacao_dos_condutores_eletricos(tblseguimentoavaliacao.getDegradacaoCondutoresEletricos().getId().toString());
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
			model.setAparelhos_em_bom_estado_tomadas_e_interruptores(tblseguimentoavaliacao.getAparelhagemBomEstado().getId().toString());
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
			model.setRisco_de_eletrocussao(tblseguimentoavaliacao.getRiscoEletrocursao().getId().toString());
	}
	view.risco_de_eletrocussao.setValue(risco_de_eletrocussao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	view.btn_guardar.addParameter("isEdit", "true");
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
	
	public Response actionGuardar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Seguimento_e_avaliacao model = new Seguimento_e_avaliacao();
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
