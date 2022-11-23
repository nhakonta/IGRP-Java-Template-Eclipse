package nosi.webapps.sgie.pages.folha_avaliacao_wc;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Folha_avaliacao_wcView extends View {

	public Field estrutura;
	public Field insuficiencia_dos_elementos_estruturais;
	public Field alteracao_na_geometria;
	public Field fendilhacao_nas_zonas_criticas;
	public Field armaduras_a_vista;
	public Field elementos_corroidos;
	public Field falta_de_condicoes_de_seguranca;
	public Field cobertura;
	public Field falta_dos_elementos_resistentes_fundamentais;
	public Field alteracao_na_geometria_cobertura;
	public Field extensiva_deterioracao_dos_revestimentos;
	public Field danos_significativos_em_partes_singulares;
	public Field sistema_de_drenagem;
	public Field anomalias_indicadores_de_deterioracao;
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
	public Field portas;
	public Field portas_abrem_e_fecham_sem_recursos_a_forca_excessiva;
	public Field portas_tem_fechaduras_que_asseguram_o_encerramento_seguro;
	public Field janelas;
	public Field janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva;
	public Field janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro;
	public Field os_elementos_que_as_constituem_estao_deterioradas;
	public Field asseguram_a_estanquidade_das_aguas_das_chuvas;
	public Field instalacoes_sanitarias;
	public Field equipada_com_lavatorio;
	public Field equipada_com_sanita_e_autoclismo;
	public Field numero_de_sanitas;
	public Field ventilacao_natural;
	public Field ventilacao_mecanica;
	public Field equipada_com_mictorios;
	public Field numero_de_mictorios;
	public Field instalacao_de_agua;
	public Field abastecimento_direta_da_rede_publica;
	public Field abastecimento_por_privados;
	public Field dispositivos_de_seguranca;
	public Field torneiras_funcionais;
	public Field valvulas_funcionais;
	public Field instalacao_eletrica;
	public Field quadro_tem_disjuntores_e_diferencial_de_protecao;
	public Field degradacao_dos_condutores_eletricos;
	public Field aparelhos_em_bom_estado_tomadas_e_interruptores;
	public Field risco_de_eletrocussao;
	public IGRPForm form_1;

	public IGRPButton btn_guardar;

	public Folha_avaliacao_wcView(){

		this.setPageTitle("folha avaliação wc");
			
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
		
		cobertura = new SeparatorField(model,"cobertura");
		cobertura.setLabel(gt("Cobertura"));
		cobertura.propertie().add("name","p_cobertura").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		falta_dos_elementos_resistentes_fundamentais = new ListField(model,"falta_dos_elementos_resistentes_fundamentais");
		falta_dos_elementos_resistentes_fundamentais.setLabel(gt("Falta dos elementos resistentes fundamentais"));
		falta_dos_elementos_resistentes_fundamentais.propertie().add("name","p_falta_dos_elementos_resistentes_fundamentais").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		alteracao_na_geometria_cobertura = new ListField(model,"alteracao_na_geometria_cobertura");
		alteracao_na_geometria_cobertura.setLabel(gt("Alteração na geometria"));
		alteracao_na_geometria_cobertura.propertie().add("name","p_alteracao_na_geometria_cobertura").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		extensiva_deterioracao_dos_revestimentos = new ListField(model,"extensiva_deterioracao_dos_revestimentos");
		extensiva_deterioracao_dos_revestimentos.setLabel(gt("Extensiva deterioração dos revestimentos"));
		extensiva_deterioracao_dos_revestimentos.propertie().add("name","p_extensiva_deterioracao_dos_revestimentos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		danos_significativos_em_partes_singulares = new ListField(model,"danos_significativos_em_partes_singulares");
		danos_significativos_em_partes_singulares.setLabel(gt("Danos significativos em partes singulares"));
		danos_significativos_em_partes_singulares.propertie().add("name","p_danos_significativos_em_partes_singulares").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sistema_de_drenagem = new ListField(model,"sistema_de_drenagem");
		sistema_de_drenagem.setLabel(gt("Sistema de drenagem"));
		sistema_de_drenagem.propertie().add("name","p_sistema_de_drenagem").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		anomalias_indicadores_de_deterioracao = new ListField(model,"anomalias_indicadores_de_deterioracao");
		anomalias_indicadores_de_deterioracao.setLabel(gt("Anomalias indicadores de deterioração"));
		anomalias_indicadores_de_deterioracao.propertie().add("name","p_anomalias_indicadores_de_deterioracao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
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
		
		portas = new SeparatorField(model,"portas");
		portas.setLabel(gt("Portas"));
		portas.propertie().add("name","p_portas").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		portas_abrem_e_fecham_sem_recursos_a_forca_excessiva = new ListField(model,"portas_abrem_e_fecham_sem_recursos_a_forca_excessiva");
		portas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setLabel(gt("Abrem e fecham sem recursos a força excessiva"));
		portas_abrem_e_fecham_sem_recursos_a_forca_excessiva.propertie().add("name","p_portas_abrem_e_fecham_sem_recursos_a_forca_excessiva").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		portas_tem_fechaduras_que_asseguram_o_encerramento_seguro = new ListField(model,"portas_tem_fechaduras_que_asseguram_o_encerramento_seguro");
		portas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setLabel(gt("Tem fechaduras que asseguram o encerramento seguro"));
		portas_tem_fechaduras_que_asseguram_o_encerramento_seguro.propertie().add("name","p_portas_tem_fechaduras_que_asseguram_o_encerramento_seguro").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		janelas = new SeparatorField(model,"janelas");
		janelas.setLabel(gt("Janelas"));
		janelas.propertie().add("name","p_janelas").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva = new ListField(model,"janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva");
		janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setLabel(gt("Abrem e fecham sem recursos a força excessiva"));
		janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva.propertie().add("name","p_janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro = new ListField(model,"janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro");
		janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setLabel(gt("Tem fechaduras que asseguram o encerramento seguro"));
		janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro.propertie().add("name","p_janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		os_elementos_que_as_constituem_estao_deterioradas = new ListField(model,"os_elementos_que_as_constituem_estao_deterioradas");
		os_elementos_que_as_constituem_estao_deterioradas.setLabel(gt("Os elementos que as constituem estão deterioradas"));
		os_elementos_que_as_constituem_estao_deterioradas.propertie().add("name","p_os_elementos_que_as_constituem_estao_deterioradas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		asseguram_a_estanquidade_das_aguas_das_chuvas = new ListField(model,"asseguram_a_estanquidade_das_aguas_das_chuvas");
		asseguram_a_estanquidade_das_aguas_das_chuvas.setLabel(gt("Asseguram a estanquidade das águas das chuvas"));
		asseguram_a_estanquidade_das_aguas_das_chuvas.propertie().add("name","p_asseguram_a_estanquidade_das_aguas_das_chuvas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		instalacoes_sanitarias = new SeparatorField(model,"instalacoes_sanitarias");
		instalacoes_sanitarias.setLabel(gt("Instalações Sanitárias"));
		instalacoes_sanitarias.propertie().add("name","p_instalacoes_sanitarias").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		equipada_com_lavatorio = new ListField(model,"equipada_com_lavatorio");
		equipada_com_lavatorio.setLabel(gt("Equipada com lavatório"));
		equipada_com_lavatorio.propertie().add("name","p_equipada_com_lavatorio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		equipada_com_sanita_e_autoclismo = new ListField(model,"equipada_com_sanita_e_autoclismo");
		equipada_com_sanita_e_autoclismo.setLabel(gt("Equipada com sanita e autoclismo"));
		equipada_com_sanita_e_autoclismo.propertie().add("name","p_equipada_com_sanita_e_autoclismo").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_de_sanitas = new NumberField(model,"numero_de_sanitas");
		numero_de_sanitas.setLabel(gt("Número de sanitas"));
		numero_de_sanitas.propertie().add("name","p_numero_de_sanitas").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		ventilacao_natural = new ListField(model,"ventilacao_natural");
		ventilacao_natural.setLabel(gt("Ventilação natural"));
		ventilacao_natural.propertie().add("name","p_ventilacao_natural").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		ventilacao_mecanica = new ListField(model,"ventilacao_mecanica");
		ventilacao_mecanica.setLabel(gt("Ventilação mecânica"));
		ventilacao_mecanica.propertie().add("name","p_ventilacao_mecanica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		equipada_com_mictorios = new ListField(model,"equipada_com_mictorios");
		equipada_com_mictorios.setLabel(gt("Equipada com mictórios"));
		equipada_com_mictorios.propertie().add("name","p_equipada_com_mictorios").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_de_mictorios = new NumberField(model,"numero_de_mictorios");
		numero_de_mictorios.setLabel(gt("Número de mictórios"));
		numero_de_mictorios.propertie().add("name","p_numero_de_mictorios").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		instalacao_de_agua = new SeparatorField(model,"instalacao_de_agua");
		instalacao_de_agua.setLabel(gt("Instalação de água"));
		instalacao_de_agua.propertie().add("name","p_instalacao_de_agua").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		abastecimento_direta_da_rede_publica = new ListField(model,"abastecimento_direta_da_rede_publica");
		abastecimento_direta_da_rede_publica.setLabel(gt("Abastecimento direta da rede pública"));
		abastecimento_direta_da_rede_publica.propertie().add("name","p_abastecimento_direta_da_rede_publica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		abastecimento_por_privados = new ListField(model,"abastecimento_por_privados");
		abastecimento_por_privados.setLabel(gt("Abastecimento por privados"));
		abastecimento_por_privados.propertie().add("name","p_abastecimento_por_privados").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		dispositivos_de_seguranca = new ListField(model,"dispositivos_de_seguranca");
		dispositivos_de_seguranca.setLabel(gt("Dispositivos de segurança"));
		dispositivos_de_seguranca.propertie().add("name","p_dispositivos_de_seguranca").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		torneiras_funcionais = new ListField(model,"torneiras_funcionais");
		torneiras_funcionais.setLabel(gt("Torneiras funcionais"));
		torneiras_funcionais.propertie().add("name","p_torneiras_funcionais").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		valvulas_funcionais = new ListField(model,"valvulas_funcionais");
		valvulas_funcionais.setLabel(gt("Válvulas funcionais"));
		valvulas_funcionais.propertie().add("name","p_valvulas_funcionais").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
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
		


		btn_guardar = new IGRPButton("Guardar","sgie","Folha_avaliacao_wc","guardar","submit_form","primary|fa-check","","");
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
		form_1.addField(cobertura);
		form_1.addField(falta_dos_elementos_resistentes_fundamentais);
		form_1.addField(alteracao_na_geometria_cobertura);
		form_1.addField(extensiva_deterioracao_dos_revestimentos);
		form_1.addField(danos_significativos_em_partes_singulares);
		form_1.addField(sistema_de_drenagem);
		form_1.addField(anomalias_indicadores_de_deterioracao);
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
		form_1.addField(portas);
		form_1.addField(portas_abrem_e_fecham_sem_recursos_a_forca_excessiva);
		form_1.addField(portas_tem_fechaduras_que_asseguram_o_encerramento_seguro);
		form_1.addField(janelas);
		form_1.addField(janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva);
		form_1.addField(janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro);
		form_1.addField(os_elementos_que_as_constituem_estao_deterioradas);
		form_1.addField(asseguram_a_estanquidade_das_aguas_das_chuvas);
		form_1.addField(instalacoes_sanitarias);
		form_1.addField(equipada_com_lavatorio);
		form_1.addField(equipada_com_sanita_e_autoclismo);
		form_1.addField(numero_de_sanitas);
		form_1.addField(ventilacao_natural);
		form_1.addField(ventilacao_mecanica);
		form_1.addField(equipada_com_mictorios);
		form_1.addField(numero_de_mictorios);
		form_1.addField(instalacao_de_agua);
		form_1.addField(abastecimento_direta_da_rede_publica);
		form_1.addField(abastecimento_por_privados);
		form_1.addField(dispositivos_de_seguranca);
		form_1.addField(torneiras_funcionais);
		form_1.addField(valvulas_funcionais);
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
		cobertura.setValue(model);
		falta_dos_elementos_resistentes_fundamentais.setValue(model);
		alteracao_na_geometria_cobertura.setValue(model);
		extensiva_deterioracao_dos_revestimentos.setValue(model);
		danos_significativos_em_partes_singulares.setValue(model);
		sistema_de_drenagem.setValue(model);
		anomalias_indicadores_de_deterioracao.setValue(model);
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
		portas.setValue(model);
		portas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setValue(model);
		portas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setValue(model);
		janelas.setValue(model);
		janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva.setValue(model);
		janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro.setValue(model);
		os_elementos_que_as_constituem_estao_deterioradas.setValue(model);
		asseguram_a_estanquidade_das_aguas_das_chuvas.setValue(model);
		instalacoes_sanitarias.setValue(model);
		equipada_com_lavatorio.setValue(model);
		equipada_com_sanita_e_autoclismo.setValue(model);
		numero_de_sanitas.setValue(model);
		ventilacao_natural.setValue(model);
		ventilacao_mecanica.setValue(model);
		equipada_com_mictorios.setValue(model);
		numero_de_mictorios.setValue(model);
		instalacao_de_agua.setValue(model);
		abastecimento_direta_da_rede_publica.setValue(model);
		abastecimento_por_privados.setValue(model);
		dispositivos_de_seguranca.setValue(model);
		torneiras_funcionais.setValue(model);
		valvulas_funcionais.setValue(model);
		instalacao_eletrica.setValue(model);
		quadro_tem_disjuntores_e_diferencial_de_protecao.setValue(model);
		degradacao_dos_condutores_eletricos.setValue(model);
		aparelhos_em_bom_estado_tomadas_e_interruptores.setValue(model);
		risco_de_eletrocussao.setValue(model);	

		}
}
