package nosi.webapps.sgie.pages.dados_infra_carater_edificio;

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
import nosi.webapps.sgie.dao.TblCaraterizacaoEdificio; //block import
import nosi.webapps.sgie.dao.TblAuxSimNao; //block import
import nosi.webapps.sgie.dao.TblAuxEscolas; //block import
import java.time.LocalDate; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Dados_infra_carater_edificioController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_edificio model = new Dados_infra_carater_edificio();
		model.load();
		Dados_infra_carater_edificioView view = new Dados_infra_carater_edificioView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.guarita_de_porteiro.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblCaraterizacaoEdificio tblcaraterizacaoedificiofilter = new TblCaraterizacaoEdificio().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_esc_id"))){
		tblcaraterizacaoedificiofilter.andWhere("escId.id","=",Core.getParamInt("p_esc_id"));
	}
	tblcaraterizacaoedificiofilter.andWhere("estado","=","A");
		TblCaraterizacaoEdificio tblcaraterizacaoedificio = tblcaraterizacaoedificiofilter.one();
		if (tblcaraterizacaoedificio!=null && !tblcaraterizacaoedificio.hasError()) {
			model.setAltura_total_do_edificio(tblcaraterizacaoedificio.getAlturaTotalEdificio());
			model.setArea_bruta(tblcaraterizacaoedificio.getAreaBruta());
			model.setDecada_de_construcao(tblcaraterizacaoedificio.getDecada());
	
	try{
	TblAuxSimNao tblauxsimnaofilter = new TblAuxSimNao().find();
	List<TblAuxSimNao> tblauxsimnaoList = tblauxsimnaofilter.all();
	LinkedHashMap<String, String> guarita_de_porteiro = new LinkedHashMap<>();
	for(TblAuxSimNao tblauxsimnao : tblauxsimnaoList){
		guarita_de_porteiro.put(tblauxsimnao.getId().toString(), gt(tblauxsimnao.getDescricao()));
			model.setGuarita_de_porteiro(tblcaraterizacaoedificio.getGuarita().getId().toString());
	}
	view.guarita_de_porteiro.setValue(guarita_de_porteiro);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
			model.setAno_de_construcao_(tblcaraterizacaoedificio.getAnoConstroi());
			model.setPisos_abaixo_do_solo(tblcaraterizacaoedificio.getPisosAbaixoSolo());
			model.setPisos_acima_do_solo(tblcaraterizacaoedificio.getPisosAcimaSolo());
			model.setAno_da_ultima_restruturacao(Core.toInt(tblcaraterizacaoedificio.getAnoReconstroi()));
			model.setNome_da_empresaconsorcio_executor_obra(tblcaraterizacaoedificio.getNomeEmpresa());
			model.setTelefone_da_empresaconsorcio_(tblcaraterizacaoedificio.getMoradaEmpresa());
			model.setMorada_da_empresaconsorcio(tblcaraterizacaoedificio.getContactoEmpresa());
			model.setEmail_da_empresaconsorcio(tblcaraterizacaoedificio.getEmailEmpresa());
			model.setVolumetria(tblcaraterizacaoedificio.getVolumetria());
			model.setArea_total_de_lote(tblcaraterizacaoedificio.getAreaLote());
			model.setNumero_de_lugares_estacionamento(tblcaraterizacaoedificio.getNumLugaresEstaciona());
			model.setEsc_id(Core.getParamInt("p_esc_id").toString());
	
	view.btn_atualizar_dados_carat_edificio.addParameter("isEdit", "true");
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
	
	public Response actionAtualizar_dados_carat_edificio() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dados_infra_carater_edificio model = new Dados_infra_carater_edificio();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sgie","Param_cobertura","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (atualizar_dados_carat_edificio)  */
	Session session = null;
	Transaction transaction = null;
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		if(!transaction.isActive())
			transaction.begin();
		TblCaraterizacaoEdificio tblcaraterizacaoedificio  = new TblCaraterizacaoEdificio();
			tblcaraterizacaoedificio.setDecada(model.getDecada_de_construcao());
			tblcaraterizacaoedificio.setAnoConstroi(model.getAno_de_construcao_());
	TblAuxSimNao tblauxsimnaoForeign = session.find(TblAuxSimNao.class, Core.toInt(model.getGuarita_de_porteiro()));
	tblcaraterizacaoedificio.setGuarita(tblauxsimnaoForeign);
			tblcaraterizacaoedificio.setAlturaTotalEdificio(model.getAltura_total_do_edificio());
			tblcaraterizacaoedificio.setPisosAcimaSolo(model.getPisos_acima_do_solo());
			tblcaraterizacaoedificio.setPisosAbaixoSolo(model.getPisos_abaixo_do_solo());
			tblcaraterizacaoedificio.setAreaBruta(model.getArea_bruta());
			tblcaraterizacaoedificio.setAreaLote(model.getArea_total_de_lote());
			tblcaraterizacaoedificio.setVolumetria(model.getVolumetria());
			tblcaraterizacaoedificio.setNumLugaresEstaciona(model.getNumero_de_lugares_estacionamento());
			tblcaraterizacaoedificio.setAnoReconstroi(model.getAno_da_ultima_restruturacao().toString());
			tblcaraterizacaoedificio.setNomeEmpresa(model.getNome_da_empresaconsorcio_executor_obra());
			tblcaraterizacaoedificio.setMoradaEmpresa(model.getMorada_da_empresaconsorcio());
			tblcaraterizacaoedificio.setContactoEmpresa(model.getTelefone_da_empresaconsorcio_());
			tblcaraterizacaoedificio.setEmailEmpresa(model.getEmail_da_empresaconsorcio());
	TblAuxEscolas tblauxescolasForeign = session.find(TblAuxEscolas.class, Core.toInt(model.getEsc_id()));
	tblcaraterizacaoedificio.setEscId(tblauxescolasForeign);
			tblcaraterizacaoedificio.setData(LocalDate.now());
			tblcaraterizacaoedificio.setUserId(Core.getCurrentUser().getId());
			tblcaraterizacaoedificio.setEstado("A");
		session.persist(tblcaraterizacaoedificio);
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
	
	
	return this.forward("sgie","Dados_infra_carater_edificio","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(atualizar_dados_carat_edificio)----*/
		
		
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
