package nosi.webapps.sgie.pages.folha_avaliacao_campos;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Folha_avaliacao_campos extends Model{		

	@RParam(rParamName = "p_estrutura")
	private String estrutura;

	@RParam(rParamName = "p_insuficiencia_dos_elementos_estruturais")
	private String insuficiencia_dos_elementos_estruturais;

	@RParam(rParamName = "p_alteracao_na_geometria")
	private String alteracao_na_geometria;

	@RParam(rParamName = "p_fendilhacao_nas_zonas_criticas")
	private String fendilhacao_nas_zonas_criticas;

	@RParam(rParamName = "p_armaduras_a_vista")
	private String armaduras_a_vista;

	@RParam(rParamName = "p_elementos_corroidos")
	private String elementos_corroidos;

	@RParam(rParamName = "p_falta_de_condicoes_de_seguranca")
	private String falta_de_condicoes_de_seguranca;

	@RParam(rParamName = "p_paredes__pavimentos__tetos")
	private String paredes__pavimentos__tetos;

	@RParam(rParamName = "p_buracos_ou_aberturas_nas_paredes")
	private String buracos_ou_aberturas_nas_paredes;

	@RParam(rParamName = "p_alteracao_na_geometria_de_paredes")
	private String alteracao_na_geometria_de_paredes;

	@RParam(rParamName = "p_extensiva_deterioracao_dos_revestimentos_nas_paredes")
	private String extensiva_deterioracao_dos_revestimentos_nas_paredes;

	@RParam(rParamName = "p_danos_significativos_em_partes_singulares_nas_paredes")
	private String danos_significativos_em_partes_singulares_nas_paredes;

	@RParam(rParamName = "p_anomalias_indicadores_de_deterioracao_nas_paredes")
	private String anomalias_indicadores_de_deterioracao_nas_paredes;

	@RParam(rParamName = "p_sinais_de_presenca_de_agua")
	private String sinais_de_presenca_de_agua;

	@RParam(rParamName = "p_buracos_no_piso")
	private String buracos_no_piso;

	@RParam(rParamName = "p_fissurasrachaduras")
	private String fissurasrachaduras;

	@RParam(rParamName = "p_alteracao_na_geometria_no_pavimento")
	private String alteracao_na_geometria_no_pavimento;

	@RParam(rParamName = "p_instalacao_eletrica")
	private String instalacao_eletrica;

	@RParam(rParamName = "p_quadro_tem_disjuntores_e_diferencial_de_protecao")
	private String quadro_tem_disjuntores_e_diferencial_de_protecao;

	@RParam(rParamName = "p_degradacao_dos_condutores_eletricos")
	private String degradacao_dos_condutores_eletricos;

	@RParam(rParamName = "p_aparelhos_em_bom_estado_tomadas_e_interruptores")
	private String aparelhos_em_bom_estado_tomadas_e_interruptores;

	@RParam(rParamName = "p_risco_de_eletrocussao")
	private String risco_de_eletrocussao;
	
	public void setEstrutura(String estrutura){
		this.estrutura = estrutura;
	}
	public String getEstrutura(){
		return this.estrutura;
	}
	
	public void setInsuficiencia_dos_elementos_estruturais(String insuficiencia_dos_elementos_estruturais){
		this.insuficiencia_dos_elementos_estruturais = insuficiencia_dos_elementos_estruturais;
	}
	public String getInsuficiencia_dos_elementos_estruturais(){
		return this.insuficiencia_dos_elementos_estruturais;
	}
	
	public void setAlteracao_na_geometria(String alteracao_na_geometria){
		this.alteracao_na_geometria = alteracao_na_geometria;
	}
	public String getAlteracao_na_geometria(){
		return this.alteracao_na_geometria;
	}
	
	public void setFendilhacao_nas_zonas_criticas(String fendilhacao_nas_zonas_criticas){
		this.fendilhacao_nas_zonas_criticas = fendilhacao_nas_zonas_criticas;
	}
	public String getFendilhacao_nas_zonas_criticas(){
		return this.fendilhacao_nas_zonas_criticas;
	}
	
	public void setArmaduras_a_vista(String armaduras_a_vista){
		this.armaduras_a_vista = armaduras_a_vista;
	}
	public String getArmaduras_a_vista(){
		return this.armaduras_a_vista;
	}
	
	public void setElementos_corroidos(String elementos_corroidos){
		this.elementos_corroidos = elementos_corroidos;
	}
	public String getElementos_corroidos(){
		return this.elementos_corroidos;
	}
	
	public void setFalta_de_condicoes_de_seguranca(String falta_de_condicoes_de_seguranca){
		this.falta_de_condicoes_de_seguranca = falta_de_condicoes_de_seguranca;
	}
	public String getFalta_de_condicoes_de_seguranca(){
		return this.falta_de_condicoes_de_seguranca;
	}
	
	public void setParedes__pavimentos__tetos(String paredes__pavimentos__tetos){
		this.paredes__pavimentos__tetos = paredes__pavimentos__tetos;
	}
	public String getParedes__pavimentos__tetos(){
		return this.paredes__pavimentos__tetos;
	}
	
	public void setBuracos_ou_aberturas_nas_paredes(String buracos_ou_aberturas_nas_paredes){
		this.buracos_ou_aberturas_nas_paredes = buracos_ou_aberturas_nas_paredes;
	}
	public String getBuracos_ou_aberturas_nas_paredes(){
		return this.buracos_ou_aberturas_nas_paredes;
	}
	
	public void setAlteracao_na_geometria_de_paredes(String alteracao_na_geometria_de_paredes){
		this.alteracao_na_geometria_de_paredes = alteracao_na_geometria_de_paredes;
	}
	public String getAlteracao_na_geometria_de_paredes(){
		return this.alteracao_na_geometria_de_paredes;
	}
	
	public void setExtensiva_deterioracao_dos_revestimentos_nas_paredes(String extensiva_deterioracao_dos_revestimentos_nas_paredes){
		this.extensiva_deterioracao_dos_revestimentos_nas_paredes = extensiva_deterioracao_dos_revestimentos_nas_paredes;
	}
	public String getExtensiva_deterioracao_dos_revestimentos_nas_paredes(){
		return this.extensiva_deterioracao_dos_revestimentos_nas_paredes;
	}
	
	public void setDanos_significativos_em_partes_singulares_nas_paredes(String danos_significativos_em_partes_singulares_nas_paredes){
		this.danos_significativos_em_partes_singulares_nas_paredes = danos_significativos_em_partes_singulares_nas_paredes;
	}
	public String getDanos_significativos_em_partes_singulares_nas_paredes(){
		return this.danos_significativos_em_partes_singulares_nas_paredes;
	}
	
	public void setAnomalias_indicadores_de_deterioracao_nas_paredes(String anomalias_indicadores_de_deterioracao_nas_paredes){
		this.anomalias_indicadores_de_deterioracao_nas_paredes = anomalias_indicadores_de_deterioracao_nas_paredes;
	}
	public String getAnomalias_indicadores_de_deterioracao_nas_paredes(){
		return this.anomalias_indicadores_de_deterioracao_nas_paredes;
	}
	
	public void setSinais_de_presenca_de_agua(String sinais_de_presenca_de_agua){
		this.sinais_de_presenca_de_agua = sinais_de_presenca_de_agua;
	}
	public String getSinais_de_presenca_de_agua(){
		return this.sinais_de_presenca_de_agua;
	}
	
	public void setBuracos_no_piso(String buracos_no_piso){
		this.buracos_no_piso = buracos_no_piso;
	}
	public String getBuracos_no_piso(){
		return this.buracos_no_piso;
	}
	
	public void setFissurasrachaduras(String fissurasrachaduras){
		this.fissurasrachaduras = fissurasrachaduras;
	}
	public String getFissurasrachaduras(){
		return this.fissurasrachaduras;
	}
	
	public void setAlteracao_na_geometria_no_pavimento(String alteracao_na_geometria_no_pavimento){
		this.alteracao_na_geometria_no_pavimento = alteracao_na_geometria_no_pavimento;
	}
	public String getAlteracao_na_geometria_no_pavimento(){
		return this.alteracao_na_geometria_no_pavimento;
	}
	
	public void setInstalacao_eletrica(String instalacao_eletrica){
		this.instalacao_eletrica = instalacao_eletrica;
	}
	public String getInstalacao_eletrica(){
		return this.instalacao_eletrica;
	}
	
	public void setQuadro_tem_disjuntores_e_diferencial_de_protecao(String quadro_tem_disjuntores_e_diferencial_de_protecao){
		this.quadro_tem_disjuntores_e_diferencial_de_protecao = quadro_tem_disjuntores_e_diferencial_de_protecao;
	}
	public String getQuadro_tem_disjuntores_e_diferencial_de_protecao(){
		return this.quadro_tem_disjuntores_e_diferencial_de_protecao;
	}
	
	public void setDegradacao_dos_condutores_eletricos(String degradacao_dos_condutores_eletricos){
		this.degradacao_dos_condutores_eletricos = degradacao_dos_condutores_eletricos;
	}
	public String getDegradacao_dos_condutores_eletricos(){
		return this.degradacao_dos_condutores_eletricos;
	}
	
	public void setAparelhos_em_bom_estado_tomadas_e_interruptores(String aparelhos_em_bom_estado_tomadas_e_interruptores){
		this.aparelhos_em_bom_estado_tomadas_e_interruptores = aparelhos_em_bom_estado_tomadas_e_interruptores;
	}
	public String getAparelhos_em_bom_estado_tomadas_e_interruptores(){
		return this.aparelhos_em_bom_estado_tomadas_e_interruptores;
	}
	
	public void setRisco_de_eletrocussao(String risco_de_eletrocussao){
		this.risco_de_eletrocussao = risco_de_eletrocussao;
	}
	public String getRisco_de_eletrocussao(){
		return this.risco_de_eletrocussao;
	}



}
