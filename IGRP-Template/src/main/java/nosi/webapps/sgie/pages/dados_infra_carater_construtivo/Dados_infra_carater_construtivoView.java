package nosi.webapps.sgie.pages.dados_infra_carater_construtivo;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dados_infra_carater_construtivoView extends View {

	public Field separador_estrutura;
	public Field estrutura_horizontal;
	public Field estrutura_vertical;
	public Field fundacoes;
	public Field elementos_verticais_de_suporte;
	public Field pavimentos;
	public Field separador_cobertura;
	public Field vedacao;
	public Field cobertura;
	public Field forma_cobertura_carat_construt;
	public Field estrutura_de_suporte;
	public Field revestimento_da_cobertura_em_terraco;
	public Field revestimento_da_cobertura_inclinada;
	public Field separador_paredes_exteriores;
	public Field revestimento_exterior;
	public Field paredes_exterior;
	public Field tosco_parede_exterior;
	public Field revestimento_do_paramento_exterior_das_fachadas;
	public Field revestimento_do_paramento_exterior_das_empenas;
	public Field separador_paredes_interiores;
	public Field tosco_parade_interior;
	public Field revestimento_do_paramento_interior_das_fachadas;
	public Field separador_caixalharias_e_portoes;
	public Field material;
	public Field portao_pedonal;
	public Field portao_automovel;
	public Field separador_escadas;
	public Field escadas_externas;
	public Field rampa_externas;
	public Field corrimaos_escadas_internas;
	public Field escadas_interior;
	public Field estrutura_de_suporte_escadas;
	public Field corrimaos_escadas_externas;
	public Field esc_id;
	public IGRPForm form_carater_construtiva;

	public IGRPButton btn_atualizar_dados_carat_construtiva;

	public Dados_infra_carater_construtivoView(){

		this.setPageTitle("Dados infra carater construtivo");
			
		form_carater_construtiva = new IGRPForm("form_carater_construtiva","");

		separador_estrutura = new SeparatorField(model,"separador_estrutura");
		separador_estrutura.setLabel(gt("Estrutura"));
		separador_estrutura.propertie().add("name","p_separador_estrutura").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		estrutura_horizontal = new ListField(model,"estrutura_horizontal");
		estrutura_horizontal.setLabel(gt("Estrutura horizontal"));
		estrutura_horizontal.propertie().add("name","p_estrutura_horizontal").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		estrutura_vertical = new ListField(model,"estrutura_vertical");
		estrutura_vertical.setLabel(gt("Estrutura Vertical"));
		estrutura_vertical.propertie().add("name","p_estrutura_vertical").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		fundacoes = new ListField(model,"fundacoes");
		fundacoes.setLabel(gt("Fundações"));
		fundacoes.propertie().add("name","p_fundacoes").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		elementos_verticais_de_suporte = new ListField(model,"elementos_verticais_de_suporte");
		elementos_verticais_de_suporte.setLabel(gt("Elementos verticais de suporte"));
		elementos_verticais_de_suporte.propertie().add("name","p_elementos_verticais_de_suporte").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		pavimentos = new ListField(model,"pavimentos");
		pavimentos.setLabel(gt("Pavimentos"));
		pavimentos.propertie().add("name","p_pavimentos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		separador_cobertura = new SeparatorField(model,"separador_cobertura");
		separador_cobertura.setLabel(gt("Cobertura e Vedação"));
		separador_cobertura.propertie().add("name","p_separador_cobertura").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		vedacao = new ListField(model,"vedacao");
		vedacao.setLabel(gt("Vedação"));
		vedacao.propertie().add("name","p_vedacao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		cobertura = new ListField(model,"cobertura");
		cobertura.setLabel(gt("Cobertura"));
		cobertura.propertie().add("name","p_cobertura").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		forma_cobertura_carat_construt = new ListField(model,"forma_cobertura_carat_construt");
		forma_cobertura_carat_construt.setLabel(gt("Forma"));
		forma_cobertura_carat_construt.propertie().add("name","p_forma_cobertura_carat_construt").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		estrutura_de_suporte = new ListField(model,"estrutura_de_suporte");
		estrutura_de_suporte.setLabel(gt("Estrutura de suporte"));
		estrutura_de_suporte.propertie().add("name","p_estrutura_de_suporte").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		revestimento_da_cobertura_em_terraco = new ListField(model,"revestimento_da_cobertura_em_terraco");
		revestimento_da_cobertura_em_terraco.setLabel(gt("Revestimento da cobertura em terraço"));
		revestimento_da_cobertura_em_terraco.propertie().add("name","p_revestimento_da_cobertura_em_terraco").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		revestimento_da_cobertura_inclinada = new ListField(model,"revestimento_da_cobertura_inclinada");
		revestimento_da_cobertura_inclinada.setLabel(gt("Revestimento da cobertura inclinada"));
		revestimento_da_cobertura_inclinada.propertie().add("name","p_revestimento_da_cobertura_inclinada").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		separador_paredes_exteriores = new SeparatorField(model,"separador_paredes_exteriores");
		separador_paredes_exteriores.setLabel(gt("Paredes Exteriores"));
		separador_paredes_exteriores.propertie().add("name","p_separador_paredes_exteriores").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		revestimento_exterior = new ListField(model,"revestimento_exterior");
		revestimento_exterior.setLabel(gt("Revestimento exterior"));
		revestimento_exterior.propertie().add("name","p_revestimento_exterior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		paredes_exterior = new ListField(model,"paredes_exterior");
		paredes_exterior.setLabel(gt("Paredes exterior"));
		paredes_exterior.propertie().add("name","p_paredes_exterior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		tosco_parede_exterior = new ListField(model,"tosco_parede_exterior");
		tosco_parede_exterior.setLabel(gt("Tosco"));
		tosco_parede_exterior.propertie().add("name","p_tosco_parede_exterior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		revestimento_do_paramento_exterior_das_fachadas = new ListField(model,"revestimento_do_paramento_exterior_das_fachadas");
		revestimento_do_paramento_exterior_das_fachadas.setLabel(gt("Revestimento do paramento exterior das fachadas"));
		revestimento_do_paramento_exterior_das_fachadas.propertie().add("name","p_revestimento_do_paramento_exterior_das_fachadas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		revestimento_do_paramento_exterior_das_empenas = new ListField(model,"revestimento_do_paramento_exterior_das_empenas");
		revestimento_do_paramento_exterior_das_empenas.setLabel(gt("Revestimento do paramento exterior das empenas"));
		revestimento_do_paramento_exterior_das_empenas.propertie().add("name","p_revestimento_do_paramento_exterior_das_empenas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		separador_paredes_interiores = new SeparatorField(model,"separador_paredes_interiores");
		separador_paredes_interiores.setLabel(gt("Paredes Interiores"));
		separador_paredes_interiores.propertie().add("name","p_separador_paredes_interiores").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		tosco_parade_interior = new ListField(model,"tosco_parade_interior");
		tosco_parade_interior.setLabel(gt("Tosco"));
		tosco_parade_interior.propertie().add("name","p_tosco_parade_interior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		revestimento_do_paramento_interior_das_fachadas = new ListField(model,"revestimento_do_paramento_interior_das_fachadas");
		revestimento_do_paramento_interior_das_fachadas.setLabel(gt("Revestimento do paramento interior das fachadas"));
		revestimento_do_paramento_interior_das_fachadas.propertie().add("name","p_revestimento_do_paramento_interior_das_fachadas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		separador_caixalharias_e_portoes = new SeparatorField(model,"separador_caixalharias_e_portoes");
		separador_caixalharias_e_portoes.setLabel(gt("Caixalharias e Portões"));
		separador_caixalharias_e_portoes.propertie().add("name","p_separador_caixalharias_e_portoes").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		material = new ListField(model,"material");
		material.setLabel(gt("Material"));
		material.propertie().add("name","p_material").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		portao_pedonal = new ListField(model,"portao_pedonal");
		portao_pedonal.setLabel(gt("Portão pedonal"));
		portao_pedonal.propertie().add("name","p_portao_pedonal").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		portao_automovel = new ListField(model,"portao_automovel");
		portao_automovel.setLabel(gt("Portão automóvel"));
		portao_automovel.propertie().add("name","p_portao_automovel").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		separador_escadas = new SeparatorField(model,"separador_escadas");
		separador_escadas.setLabel(gt("Escadas e Corrimãos"));
		separador_escadas.propertie().add("name","p_separador_escadas").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		escadas_externas = new ListField(model,"escadas_externas");
		escadas_externas.setLabel(gt("Escadas Externas"));
		escadas_externas.propertie().add("name","p_escadas_externas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		rampa_externas = new ListField(model,"rampa_externas");
		rampa_externas.setLabel(gt("Rampa externas"));
		rampa_externas.propertie().add("name","p_rampa_externas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		corrimaos_escadas_internas = new ListField(model,"corrimaos_escadas_internas");
		corrimaos_escadas_internas.setLabel(gt("Corrimãos escadas internas"));
		corrimaos_escadas_internas.propertie().add("name","p_corrimaos_escadas_internas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		escadas_interior = new ListField(model,"escadas_interior");
		escadas_interior.setLabel(gt("Escadas interior"));
		escadas_interior.propertie().add("name","p_escadas_interior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		estrutura_de_suporte_escadas = new ListField(model,"estrutura_de_suporte_escadas");
		estrutura_de_suporte_escadas.setLabel(gt("Estrutura de suporte"));
		estrutura_de_suporte_escadas.propertie().add("name","p_estrutura_de_suporte_escadas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		corrimaos_escadas_externas = new ListField(model,"corrimaos_escadas_externas");
		corrimaos_escadas_externas.setLabel(gt("Corrimãos escadas externas"));
		corrimaos_escadas_externas.propertie().add("name","p_corrimaos_escadas_externas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		esc_id = new HiddenField(model,"esc_id");
		esc_id.setLabel(gt(""));
		esc_id.propertie().add("name","p_esc_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","esc_id");
		


		btn_atualizar_dados_carat_construtiva = new IGRPButton("Atualizar Dados","sgie","Dados_infra_carater_construtivo","atualizar_dados_carat_construtiva","submit_ajax","primary|fa-refresh","","");
		btn_atualizar_dados_carat_construtiva.propertie.add("id","button_83d1_82d1").add("type","form").add("class","primary").add("rel","atualizar_dados_carat_construtiva").add("refresh_components","form_carater_construtiva");

		
	}
		
	@Override
	public void render(){
		
		form_carater_construtiva.addField(separador_estrutura);
		form_carater_construtiva.addField(estrutura_horizontal);
		form_carater_construtiva.addField(estrutura_vertical);
		form_carater_construtiva.addField(fundacoes);
		form_carater_construtiva.addField(elementos_verticais_de_suporte);
		form_carater_construtiva.addField(pavimentos);
		form_carater_construtiva.addField(separador_cobertura);
		form_carater_construtiva.addField(vedacao);
		form_carater_construtiva.addField(cobertura);
		form_carater_construtiva.addField(forma_cobertura_carat_construt);
		form_carater_construtiva.addField(estrutura_de_suporte);
		form_carater_construtiva.addField(revestimento_da_cobertura_em_terraco);
		form_carater_construtiva.addField(revestimento_da_cobertura_inclinada);
		form_carater_construtiva.addField(separador_paredes_exteriores);
		form_carater_construtiva.addField(revestimento_exterior);
		form_carater_construtiva.addField(paredes_exterior);
		form_carater_construtiva.addField(tosco_parede_exterior);
		form_carater_construtiva.addField(revestimento_do_paramento_exterior_das_fachadas);
		form_carater_construtiva.addField(revestimento_do_paramento_exterior_das_empenas);
		form_carater_construtiva.addField(separador_paredes_interiores);
		form_carater_construtiva.addField(tosco_parade_interior);
		form_carater_construtiva.addField(revestimento_do_paramento_interior_das_fachadas);
		form_carater_construtiva.addField(separador_caixalharias_e_portoes);
		form_carater_construtiva.addField(material);
		form_carater_construtiva.addField(portao_pedonal);
		form_carater_construtiva.addField(portao_automovel);
		form_carater_construtiva.addField(separador_escadas);
		form_carater_construtiva.addField(escadas_externas);
		form_carater_construtiva.addField(rampa_externas);
		form_carater_construtiva.addField(corrimaos_escadas_internas);
		form_carater_construtiva.addField(escadas_interior);
		form_carater_construtiva.addField(estrutura_de_suporte_escadas);
		form_carater_construtiva.addField(corrimaos_escadas_externas);
		form_carater_construtiva.addField(esc_id);

		form_carater_construtiva.addButton(btn_atualizar_dados_carat_construtiva);
		this.addToPage(form_carater_construtiva);
	}
		
	@Override
	public void setModel(Model model) {
		
		separador_estrutura.setValue(model);
		estrutura_horizontal.setValue(model);
		estrutura_vertical.setValue(model);
		fundacoes.setValue(model);
		elementos_verticais_de_suporte.setValue(model);
		pavimentos.setValue(model);
		separador_cobertura.setValue(model);
		vedacao.setValue(model);
		cobertura.setValue(model);
		forma_cobertura_carat_construt.setValue(model);
		estrutura_de_suporte.setValue(model);
		revestimento_da_cobertura_em_terraco.setValue(model);
		revestimento_da_cobertura_inclinada.setValue(model);
		separador_paredes_exteriores.setValue(model);
		revestimento_exterior.setValue(model);
		paredes_exterior.setValue(model);
		tosco_parede_exterior.setValue(model);
		revestimento_do_paramento_exterior_das_fachadas.setValue(model);
		revestimento_do_paramento_exterior_das_empenas.setValue(model);
		separador_paredes_interiores.setValue(model);
		tosco_parade_interior.setValue(model);
		revestimento_do_paramento_interior_das_fachadas.setValue(model);
		separador_caixalharias_e_portoes.setValue(model);
		material.setValue(model);
		portao_pedonal.setValue(model);
		portao_automovel.setValue(model);
		separador_escadas.setValue(model);
		escadas_externas.setValue(model);
		rampa_externas.setValue(model);
		corrimaos_escadas_internas.setValue(model);
		escadas_interior.setValue(model);
		estrutura_de_suporte_escadas.setValue(model);
		corrimaos_escadas_externas.setValue(model);
		esc_id.setValue(model);	

		}
}
