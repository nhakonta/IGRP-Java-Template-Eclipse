package nosi.webapps.sgie.pages.dados_infra_carater_exterior;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dados_infra_carater_exteriorView extends View {

	public Field acesso_automovel;
	public Field sistema_de_rega;
	public Field lugares_de_estacionamento;
	public Field manual;
	public Field arvores_de_folha_perene;
	public Field arvores_de_folha_caduca;
	public Field arvores_de_fruto;
	public Field arbustos;
	public Field canteiros_floridos;
	public Field quantidade_canteiros_floridos;
	public Field campos_de_futebol;
	public Field campos_de_basquetebol;
	public Field campos_de_voleibol;
	public Field recreio_coberto_exterior;
	public Field pavilhao_polivalente_exterior;
	public Field pavilhao_interior;
	public Field outras_instalacoes_exteriores;
	public IGRPForm form_carat_espaco_exterior;

	public IGRPButton btn_atualizar_dados_carat_esp_exterior;

	public Dados_infra_carater_exteriorView(){

		this.setPageTitle("Dados infra carater exterior");
			
		form_carat_espaco_exterior = new IGRPForm("form_carat_espaco_exterior","");

		acesso_automovel = new ListField(model,"acesso_automovel");
		acesso_automovel.setLabel(gt("Acesso Automóvel"));
		acesso_automovel.propertie().add("name","p_acesso_automovel").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sistema_de_rega = new ListField(model,"sistema_de_rega");
		sistema_de_rega.setLabel(gt("Sistema de Rega"));
		sistema_de_rega.propertie().add("name","p_sistema_de_rega").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		lugares_de_estacionamento = new ListField(model,"lugares_de_estacionamento");
		lugares_de_estacionamento.setLabel(gt("Lugares de Estacionamento"));
		lugares_de_estacionamento.propertie().add("name","p_lugares_de_estacionamento").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		manual = new ListField(model,"manual");
		manual.setLabel(gt("Manual"));
		manual.propertie().add("name","p_manual").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		arvores_de_folha_perene = new ListField(model,"arvores_de_folha_perene");
		arvores_de_folha_perene.setLabel(gt("Árvores de folha Perene"));
		arvores_de_folha_perene.propertie().add("name","p_arvores_de_folha_perene").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		arvores_de_folha_caduca = new ListField(model,"arvores_de_folha_caduca");
		arvores_de_folha_caduca.setLabel(gt("Árvores de folha Caduca"));
		arvores_de_folha_caduca.propertie().add("name","p_arvores_de_folha_caduca").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		arvores_de_fruto = new ListField(model,"arvores_de_fruto");
		arvores_de_fruto.setLabel(gt("Árvores de Fruto"));
		arvores_de_fruto.propertie().add("name","p_arvores_de_fruto").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		arbustos = new ListField(model,"arbustos");
		arbustos.setLabel(gt("Arbustos"));
		arbustos.propertie().add("name","p_arbustos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		canteiros_floridos = new ListField(model,"canteiros_floridos");
		canteiros_floridos.setLabel(gt("Canteiros Floridos"));
		canteiros_floridos.propertie().add("name","p_canteiros_floridos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		quantidade_canteiros_floridos = new NumberField(model,"quantidade_canteiros_floridos");
		quantidade_canteiros_floridos.setLabel(gt("Quantidade Canteiros floridos"));
		quantidade_canteiros_floridos.propertie().add("name","p_quantidade_canteiros_floridos").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		campos_de_futebol = new ListField(model,"campos_de_futebol");
		campos_de_futebol.setLabel(gt("Campos de Futebol"));
		campos_de_futebol.propertie().add("name","p_campos_de_futebol").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		campos_de_basquetebol = new ListField(model,"campos_de_basquetebol");
		campos_de_basquetebol.setLabel(gt("Campos de Basquetebol"));
		campos_de_basquetebol.propertie().add("name","p_campos_de_basquetebol").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		campos_de_voleibol = new ListField(model,"campos_de_voleibol");
		campos_de_voleibol.setLabel(gt("Campos de Voleibol"));
		campos_de_voleibol.propertie().add("name","p_campos_de_voleibol").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		recreio_coberto_exterior = new ListField(model,"recreio_coberto_exterior");
		recreio_coberto_exterior.setLabel(gt("Recreio Coberto Exterior"));
		recreio_coberto_exterior.propertie().add("name","p_recreio_coberto_exterior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		pavilhao_polivalente_exterior = new ListField(model,"pavilhao_polivalente_exterior");
		pavilhao_polivalente_exterior.setLabel(gt("Pavilhão Polivalente Exterior"));
		pavilhao_polivalente_exterior.propertie().add("name","p_pavilhao_polivalente_exterior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		pavilhao_interior = new ListField(model,"pavilhao_interior");
		pavilhao_interior.setLabel(gt("Pavilhão Interior"));
		pavilhao_interior.propertie().add("name","p_pavilhao_interior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		outras_instalacoes_exteriores = new ListField(model,"outras_instalacoes_exteriores");
		outras_instalacoes_exteriores.setLabel(gt("Outras Instalações Exteriores"));
		outras_instalacoes_exteriores.propertie().add("name","p_outras_instalacoes_exteriores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		


		btn_atualizar_dados_carat_esp_exterior = new IGRPButton("Atualizar Dados","sgie","Dados_infra_carater_exterior","atualizar_dados_carat_esp_exterior","submit_ajax","primary|fa-refresh","","");
		btn_atualizar_dados_carat_esp_exterior.propertie.add("id","button_14d9_bec2").add("type","form").add("class","primary").add("rel","atualizar_dados_carat_esp_exterior").add("refresh_components","form_carater_espaco_interior");

		
	}
		
	@Override
	public void render(){
		
		form_carat_espaco_exterior.addField(acesso_automovel);
		form_carat_espaco_exterior.addField(sistema_de_rega);
		form_carat_espaco_exterior.addField(lugares_de_estacionamento);
		form_carat_espaco_exterior.addField(manual);
		form_carat_espaco_exterior.addField(arvores_de_folha_perene);
		form_carat_espaco_exterior.addField(arvores_de_folha_caduca);
		form_carat_espaco_exterior.addField(arvores_de_fruto);
		form_carat_espaco_exterior.addField(arbustos);
		form_carat_espaco_exterior.addField(canteiros_floridos);
		form_carat_espaco_exterior.addField(quantidade_canteiros_floridos);
		form_carat_espaco_exterior.addField(campos_de_futebol);
		form_carat_espaco_exterior.addField(campos_de_basquetebol);
		form_carat_espaco_exterior.addField(campos_de_voleibol);
		form_carat_espaco_exterior.addField(recreio_coberto_exterior);
		form_carat_espaco_exterior.addField(pavilhao_polivalente_exterior);
		form_carat_espaco_exterior.addField(pavilhao_interior);
		form_carat_espaco_exterior.addField(outras_instalacoes_exteriores);

		form_carat_espaco_exterior.addButton(btn_atualizar_dados_carat_esp_exterior);
		this.addToPage(form_carat_espaco_exterior);
	}
		
	@Override
	public void setModel(Model model) {
		
		acesso_automovel.setValue(model);
		sistema_de_rega.setValue(model);
		lugares_de_estacionamento.setValue(model);
		manual.setValue(model);
		arvores_de_folha_perene.setValue(model);
		arvores_de_folha_caduca.setValue(model);
		arvores_de_fruto.setValue(model);
		arbustos.setValue(model);
		canteiros_floridos.setValue(model);
		quantidade_canteiros_floridos.setValue(model);
		campos_de_futebol.setValue(model);
		campos_de_basquetebol.setValue(model);
		campos_de_voleibol.setValue(model);
		recreio_coberto_exterior.setValue(model);
		pavilhao_polivalente_exterior.setValue(model);
		pavilhao_interior.setValue(model);
		outras_instalacoes_exteriores.setValue(model);	

		}
}
