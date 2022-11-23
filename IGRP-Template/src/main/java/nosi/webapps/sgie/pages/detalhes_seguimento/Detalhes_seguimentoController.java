package nosi.webapps.sgie.pages.detalhes_seguimento;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Detalhes_seguimentoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Detalhes_seguimento model = new Detalhes_seguimento();
		model.load();
		Detalhes_seguimentoView view = new Detalhes_seguimentoView();
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
		view.oficina_de_mecanica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_informatica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.papelaria.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.anfiteatroauditorio.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_soldaduraconstrucao_metalica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.sala_de_associacao_de_alunos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.salas_especificas.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.oficina_de_construcao_civil.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.outros_espacos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campos_de_voleibol.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campos_de_futebol.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campos_de_basquetebol.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.pavilhao_polivalente_exterior.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
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
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGuardar_seguimento() throws IOException, IllegalArgumentException, IllegalAccessException{
		Detalhes_seguimento model = new Detalhes_seguimento();
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
