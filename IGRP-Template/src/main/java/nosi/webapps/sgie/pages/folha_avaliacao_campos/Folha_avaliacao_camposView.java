package nosi.webapps.sgie.pages.folha_avaliacao_campos;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Folha_avaliacao_camposView extends View {

	public Field estrutura;
	public Field insuficiencia_dos_elementos_estruturais;
	public Field alteracao_na_geometria;
	public Field fendilhacao_nas_zonas_criticas;
	public Field armaduras_a_vista;
	public Field elementos_corroidos;
	public Field falta_de_condicoes_de_seguranca;
	public Field paredes__pavimentos__tetos;
	public Field buracos_ou_aberturas_nas_paredes;
	public Field alteracao_na_geometria_de_paredes;
	public Field extensiva_deterioracao_dos_revestimentos_nas_paredes;
	public Field danos_significativos_em_partes_singulares_nas_paredes;
	public Field anomalias_indicadores_de_deterioracao_nas_paredes;
	public Field sinais_de_presenca_de_agua;
	public Field buracos_no_piso;
	public Field fissurasrachaduras;
	public Field alteracao_na_geometria_no_pavimento;
	public Field instalacao_eletrica;
	public Field quadro_tem_disjuntores_e_diferencial_de_protecao;
	public Field degradacao_dos_condutores_eletricos;
	public Field aparelhos_em_bom_estado_tomadas_e_interruptores;
	public Field risco_de_eletrocussao;
	public IGRPForm form_1;

	public IGRPButton btn_guardar;

	public Folha_avaliacao_camposView(){

		this.setPageTitle("folha avaliação campos");
			
		form_1 = new IGRPForm("form_1","");

		estrutura = new SeparatorField(model,"estrutura");
		estrutura.setLabel(gt("Estrutura"));
		estrutura.propertie().add("name","p_estrutura").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		insuficiencia_dos_elementos_estruturais = new ListField(model,"insuficiencia_dos_elementos_estruturais");
		insuficiencia_dos_elementos_estruturais.setLabel(gt("Insuficiência dos elementos estruturais"));
		insuficiencia_dos_elementos_estruturais.propertie().add("name","p_insuficiencia_dos_elementos_estruturais").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		alteracao_na_geometria = new ListField(model,"alteracao_na_geometria");
		alteracao_na_geometria.setLabel(gt("Alteração na geometria"));
		alteracao_na_geometria.propertie().add("name","p_alteracao_na_geometria").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		fendilhacao_nas_zonas_criticas = new ListField(model,"fendilhacao_nas_zonas_criticas");
		fendilhacao_nas_zonas_criticas.setLabel(gt("Fendilhação nas zonas críticas"));
		fendilhacao_nas_zonas_criticas.propertie().add("name","p_fendilhacao_nas_zonas_criticas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		armaduras_a_vista = new ListField(model,"armaduras_a_vista");
		armaduras_a_vista.setLabel(gt("Armaduras à vista"));
		armaduras_a_vista.propertie().add("name","p_armaduras_a_vista").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		elementos_corroidos = new ListField(model,"elementos_corroidos");
		elementos_corroidos.setLabel(gt("Elementos corroídos"));
		elementos_corroidos.propertie().add("name","p_elementos_corroidos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		falta_de_condicoes_de_seguranca = new ListField(model,"falta_de_condicoes_de_seguranca");
		falta_de_condicoes_de_seguranca.setLabel(gt("Falta de condições de segurança"));
		falta_de_condicoes_de_seguranca.propertie().add("name","p_falta_de_condicoes_de_seguranca").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		paredes__pavimentos__tetos = new SeparatorField(model,"paredes__pavimentos__tetos");
		paredes__pavimentos__tetos.setLabel(gt("Paredes / Pavimentos / tetos"));
		paredes__pavimentos__tetos.propertie().add("name","p_paredes__pavimentos__tetos").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		buracos_ou_aberturas_nas_paredes = new ListField(model,"buracos_ou_aberturas_nas_paredes");
		buracos_ou_aberturas_nas_paredes.setLabel(gt("Buracos ou aberturas nas paredes"));
		buracos_ou_aberturas_nas_paredes.propertie().add("name","p_buracos_ou_aberturas_nas_paredes").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		alteracao_na_geometria_de_paredes = new ListField(model,"alteracao_na_geometria_de_paredes");
		alteracao_na_geometria_de_paredes.setLabel(gt("Alteração na geometria de paredes"));
		alteracao_na_geometria_de_paredes.propertie().add("name","p_alteracao_na_geometria_de_paredes").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		extensiva_deterioracao_dos_revestimentos_nas_paredes = new ListField(model,"extensiva_deterioracao_dos_revestimentos_nas_paredes");
		extensiva_deterioracao_dos_revestimentos_nas_paredes.setLabel(gt("Extensiva deterioração dos revestimentos nas paredes"));
		extensiva_deterioracao_dos_revestimentos_nas_paredes.propertie().add("name","p_extensiva_deterioracao_dos_revestimentos_nas_paredes").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		danos_significativos_em_partes_singulares_nas_paredes = new ListField(model,"danos_significativos_em_partes_singulares_nas_paredes");
		danos_significativos_em_partes_singulares_nas_paredes.setLabel(gt("Danos significativos em partes singulares nas paredes"));
		danos_significativos_em_partes_singulares_nas_paredes.propertie().add("name","p_danos_significativos_em_partes_singulares_nas_paredes").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		anomalias_indicadores_de_deterioracao_nas_paredes = new ListField(model,"anomalias_indicadores_de_deterioracao_nas_paredes");
		anomalias_indicadores_de_deterioracao_nas_paredes.setLabel(gt("Anomalias indicadores de deterioração nas paredes"));
		anomalias_indicadores_de_deterioracao_nas_paredes.propertie().add("name","p_anomalias_indicadores_de_deterioracao_nas_paredes").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sinais_de_presenca_de_agua = new ListField(model,"sinais_de_presenca_de_agua");
		sinais_de_presenca_de_agua.setLabel(gt("Sinais de presença de água"));
		sinais_de_presenca_de_agua.propertie().add("name","p_sinais_de_presenca_de_agua").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		buracos_no_piso = new ListField(model,"buracos_no_piso");
		buracos_no_piso.setLabel(gt("Buracos no piso"));
		buracos_no_piso.propertie().add("name","p_buracos_no_piso").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		fissurasrachaduras = new ListField(model,"fissurasrachaduras");
		fissurasrachaduras.setLabel(gt("Fissuras/rachaduras"));
		fissurasrachaduras.propertie().add("name","p_fissurasrachaduras").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		alteracao_na_geometria_no_pavimento = new ListField(model,"alteracao_na_geometria_no_pavimento");
		alteracao_na_geometria_no_pavimento.setLabel(gt("Alteração na geometria no pavimento"));
		alteracao_na_geometria_no_pavimento.propertie().add("name","p_alteracao_na_geometria_no_pavimento").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		instalacao_eletrica = new SeparatorField(model,"instalacao_eletrica");
		instalacao_eletrica.setLabel(gt("Instalação elétrica"));
		instalacao_eletrica.propertie().add("name","p_instalacao_eletrica").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		quadro_tem_disjuntores_e_diferencial_de_protecao = new ListField(model,"quadro_tem_disjuntores_e_diferencial_de_protecao");
		quadro_tem_disjuntores_e_diferencial_de_protecao.setLabel(gt("Quadro tem disjuntores e diferencial de proteção"));
		quadro_tem_disjuntores_e_diferencial_de_protecao.propertie().add("name","p_quadro_tem_disjuntores_e_diferencial_de_protecao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		degradacao_dos_condutores_eletricos = new ListField(model,"degradacao_dos_condutores_eletricos");
		degradacao_dos_condutores_eletricos.setLabel(gt("Degradação dos condutores elétricos"));
		degradacao_dos_condutores_eletricos.propertie().add("name","p_degradacao_dos_condutores_eletricos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		aparelhos_em_bom_estado_tomadas_e_interruptores = new ListField(model,"aparelhos_em_bom_estado_tomadas_e_interruptores");
		aparelhos_em_bom_estado_tomadas_e_interruptores.setLabel(gt("Aparelhos em bom estado (tomadas e interruptores"));
		aparelhos_em_bom_estado_tomadas_e_interruptores.propertie().add("name","p_aparelhos_em_bom_estado_tomadas_e_interruptores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		risco_de_eletrocussao = new ListField(model,"risco_de_eletrocussao");
		risco_de_eletrocussao.setLabel(gt("Risco de eletrocussão"));
		risco_de_eletrocussao.propertie().add("name","p_risco_de_eletrocussao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		


		btn_guardar = new IGRPButton("Guardar","sgie","Folha_avaliacao_campos","guardar","submit_form","primary|fa-check","","");
		btn_guardar.propertie.add("id","button_52d3_a87d").add("type","form").add("class","primary").add("rel","guardar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(estrutura);
		form_1.addField(insuficiencia_dos_elementos_estruturais);
		form_1.addField(alteracao_na_geometria);
		form_1.addField(fendilhacao_nas_zonas_criticas);
		form_1.addField(armaduras_a_vista);
		form_1.addField(elementos_corroidos);
		form_1.addField(falta_de_condicoes_de_seguranca);
		form_1.addField(paredes__pavimentos__tetos);
		form_1.addField(buracos_ou_aberturas_nas_paredes);
		form_1.addField(alteracao_na_geometria_de_paredes);
		form_1.addField(extensiva_deterioracao_dos_revestimentos_nas_paredes);
		form_1.addField(danos_significativos_em_partes_singulares_nas_paredes);
		form_1.addField(anomalias_indicadores_de_deterioracao_nas_paredes);
		form_1.addField(sinais_de_presenca_de_agua);
		form_1.addField(buracos_no_piso);
		form_1.addField(fissurasrachaduras);
		form_1.addField(alteracao_na_geometria_no_pavimento);
		form_1.addField(instalacao_eletrica);
		form_1.addField(quadro_tem_disjuntores_e_diferencial_de_protecao);
		form_1.addField(degradacao_dos_condutores_eletricos);
		form_1.addField(aparelhos_em_bom_estado_tomadas_e_interruptores);
		form_1.addField(risco_de_eletrocussao);

		form_1.addButton(btn_guardar);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		estrutura.setValue(model);
		insuficiencia_dos_elementos_estruturais.setValue(model);
		alteracao_na_geometria.setValue(model);
		fendilhacao_nas_zonas_criticas.setValue(model);
		armaduras_a_vista.setValue(model);
		elementos_corroidos.setValue(model);
		falta_de_condicoes_de_seguranca.setValue(model);
		paredes__pavimentos__tetos.setValue(model);
		buracos_ou_aberturas_nas_paredes.setValue(model);
		alteracao_na_geometria_de_paredes.setValue(model);
		extensiva_deterioracao_dos_revestimentos_nas_paredes.setValue(model);
		danos_significativos_em_partes_singulares_nas_paredes.setValue(model);
		anomalias_indicadores_de_deterioracao_nas_paredes.setValue(model);
		sinais_de_presenca_de_agua.setValue(model);
		buracos_no_piso.setValue(model);
		fissurasrachaduras.setValue(model);
		alteracao_na_geometria_no_pavimento.setValue(model);
		instalacao_eletrica.setValue(model);
		quadro_tem_disjuntores_e_diferencial_de_protecao.setValue(model);
		degradacao_dos_condutores_eletricos.setValue(model);
		aparelhos_em_bom_estado_tomadas_e_interruptores.setValue(model);
		risco_de_eletrocussao.setValue(model);	

		}
}
