package nosi.webapps.sgie.pages.dados_escolas;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
import nosi.webapps.sgie.dao.TblSeguimentoEscolas; //block import
import java.time.LocalDate; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Dados_escolasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		Dados_escolasView view = new Dados_escolasView();
		view.esc_id_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Amet laudantium accusantium ip' as id_seguimento,'Aliqua totam natus aperiam des' as data_avaliacao,'Iste sit deserunt labore aperi' as utilizador,'hidden-42e8_3807' as esc_id_tbl "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	
		TblAuxEscolas tblauxescolas = new TblAuxEscolas().findOne(Core.getParamInt("p_esc_id_tbl"));
		if (tblauxescolas!=null && !tblauxescolas.hasError()) {
			model.setCodigo_sige(tblauxescolas.getId().toString());
			model.setNivel_de_ensino(tblauxescolas.getNivelEnsino());
			model.setDiretora(tblauxescolas.getNome());
			model.setMorada(tblauxescolas.getZona());
			model.setLugar(tblauxescolas.getLugar());
			model.setEsc_id(tblauxescolas.getId().toString());
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	
		TblAuxEscolas tblauxescolas = new TblAuxEscolas().findOne(Core.getParamInt("p_esc_id_tbl"));
		if (tblauxescolas!=null && !tblauxescolas.hasError()) {
			model.setTelefone(tblauxescolas.getTelefone());
			model.setE_mail(tblauxescolas.getEmail());
			model.setConcelho(tblauxescolas.getConcelho());
			model.setCoordenadas_gps(tblauxescolas.getGps());
			model.setNumero_de_alunos(tblauxescolas.getNumAlunos().toString());
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	
		TblAuxEscolas tblauxescolas = new TblAuxEscolas().findOne(Core.getParamInt("p_esc_id_tbl"));
		if (tblauxescolas!=null && !tblauxescolas.hasError()) {
			model.setView_cabecalho_escola(tblauxescolas.getNome().concat(" @ 33").concat(" no Ranking Perigosidade "));
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TblSeguimentoEscolas tblseguimentoescolasfilter = new TblSeguimentoEscolas().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id_tbl"))){
		tblseguimentoescolasfilter.andWhere("escId.id","=",Core.getParamInt("p_esc_id_tbl"));
	}
	List<TblSeguimentoEscolas> tblseguimentoescolasList = tblseguimentoescolasfilter.all();
	List<Dados_escolas.Table_1> tblseguimentoescolasTable = new ArrayList<>();
	if(Core.isNotNull(tblseguimentoescolasList)){
		for(TblSeguimentoEscolas tblseguimentoescolas : tblseguimentoescolasList){
			Dados_escolas.Table_1 row  = new Dados_escolas.Table_1();
			row.setId_seguimento(tblseguimentoescolas.getId().toString());
			row.setData_avaliacao(Core.convertLocalDateToString(tblseguimentoescolas.getData(), Core.DD_MM_YYYY));
			row.setUtilizador(tblseguimentoescolas.getUserId().toString());
			tblseguimentoescolasTable.add(row);
		}
		model.setTable_1(tblseguimentoescolasTable);
	}
	}catch(Exception e){
		e.printStackTrace();
	}/* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionEstado_geral_de_conservacao() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Dados_infra_estado_conservacao_geral","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (estado_geral_de_conservacao)  */
	this.addQueryString("p_esc_id",model.getEsc_id());
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(estado_geral_de_conservacao)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Dados_infra_estado_conservacao_geral","index", this.queryString());	
	}
	
	public Response actionCaraterizacao_de_edificios() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Dados_infra_carater_edificio","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (caraterizacao_de_edificios)  */
	this.addQueryString("p_esc_id",model.getEsc_id());
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(caraterizacao_de_edificios)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Dados_infra_carater_edificio","index", this.queryString());	
	}
	
	public Response actionCaraterizacao_construtiva() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Dados_infra_carater_construtivo","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (caraterizacao_construtiva)  */
	this.addQueryString("p_esc_id",model.getEsc_id());
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(caraterizacao_construtiva)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Dados_infra_carater_construtivo","index", this.queryString());	
	}
	
	public Response actionCaraterizacao_funcional() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Dados_infra_carater_funcional","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (caraterizacao_funcional)  */
	this.addQueryString("p_esc_id",model.getEsc_id());
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(caraterizacao_funcional)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Dados_infra_carater_funcional","index", this.queryString());	
	}
	
	public Response actionServicos_basicos_e_de_internet() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Dados_infra_carater_servico_basico","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (servicos_basicos_e_de_internet)  */
	this.addQueryString("p_esc_id",model.getEsc_id());
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(servicos_basicos_e_de_internet)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Dados_infra_carater_servico_basico","index", this.queryString());	
	}
	
	public Response actionDescricao_morfologica() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Dados_infra_carater_morfo","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (descricao_morfologica)  */
	this.addQueryString("p_esc_id",model.getEsc_id());
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(descricao_morfologica)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Dados_infra_carater_morfo","index", this.queryString());	
	}
	
	public Response actionCaraterizacao_espacos_interior() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Dados_infra_carater_interior","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (caraterizacao_espacos_interior)  */
	this.addQueryString("p_esc_id",model.getEsc_id());
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(caraterizacao_espacos_interior)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Dados_infra_carater_interior","index", this.queryString());	
	}
	
	public Response actionCaraterizacao_exterior() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Dados_infra_carater_exterior","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (caraterizacao_exterior)  */
	this.addQueryString("p_esc_id",model.getEsc_id());
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(caraterizacao_exterior)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Dados_infra_carater_exterior","index", this.queryString());	
	}
	
	public Response actionNova_avaliacao() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Novo_seguimento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (nova_avaliacao)  */
	this.addQueryString("p_esc_id",model.getEsc_id());
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(nova_avaliacao)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Novo_seguimento","index", this.queryString());	
	}
	
	public Response actionDetalhes() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_escolas model = new Dados_escolas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_esc_id_tbl",Core.getParam("p_esc_id_tbl"));
		  return this.forward("sgie","Novo_seguimento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (detalhes)  *//* End-Code-Block  */
		/*----#start-code(detalhes)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sgie","Novo_seguimento","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
