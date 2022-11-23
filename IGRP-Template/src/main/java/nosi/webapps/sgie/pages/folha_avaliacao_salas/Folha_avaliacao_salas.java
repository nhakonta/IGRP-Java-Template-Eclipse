package nosi.webapps.sgie.pages.folha_avaliacao_salas;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Folha_avaliacao_salas extends Model{		

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

	@RParam(rParamName = "p_cobertura")
	private String cobertura;

	@RParam(rParamName = "p_falta_dos_elementos_resistentes_fundamentais")
	private String falta_dos_elementos_resistentes_fundamentais;

	@RParam(rParamName = "p_alteracao_na_geometria_cobertura")
	private String alteracao_na_geometria_cobertura;

	@RParam(rParamName = "p_extensiva_deterioracao_dos_revestimentos")
	private String extensiva_deterioracao_dos_revestimentos;

	@RParam(rParamName = "p_danos_significativos_em_partes_singulares")
	private String danos_significativos_em_partes_singulares;

	@RParam(rParamName = "p_sistema_de_drenagem")
	private String sistema_de_drenagem;

	@RParam(rParamName = "p_anomalias_indicadores_de_deterioracao")
	private String anomalias_indicadores_de_deterioracao;

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

	@RParam(rParamName = "p_portas")
	private String portas;

	@RParam(rParamName = "p_portas_abrem_e_fecham_sem_recursos_a_forca_excessiva")
	private String portas_abrem_e_fecham_sem_recursos_a_forca_excessiva;

	@RParam(rParamName = "p_portas_tem_fechaduras_que_asseguram_o_encerramento_seguro")
	private String portas_tem_fechaduras_que_asseguram_o_encerramento_seguro;

	@RParam(rParamName = "p_janelas")
	private String janelas;

	@RParam(rParamName = "p_janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva")
	private String janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva;

	@RParam(rParamName = "p_janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro")
	private String janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro;

	@RParam(rParamName = "p_os_elementos_que_as_constituem_estao_deterioradas")
	private String os_elementos_que_as_constituem_estao_deterioradas;

	@RParam(rParamName = "p_asseguram_a_estanquidade_das_aguas_das_chuvas")
	private String asseguram_a_estanquidade_das_aguas_das_chuvas;

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
	
	public void setCobertura(String cobertura){
		this.cobertura = cobertura;
	}
	public String getCobertura(){
		return this.cobertura;
	}
	
	public void setFalta_dos_elementos_resistentes_fundamentais(String falta_dos_elementos_resistentes_fundamentais){
		this.falta_dos_elementos_resistentes_fundamentais = falta_dos_elementos_resistentes_fundamentais;
	}
	public String getFalta_dos_elementos_resistentes_fundamentais(){
		return this.falta_dos_elementos_resistentes_fundamentais;
	}
	
	public void setAlteracao_na_geometria_cobertura(String alteracao_na_geometria_cobertura){
		this.alteracao_na_geometria_cobertura = alteracao_na_geometria_cobertura;
	}
	public String getAlteracao_na_geometria_cobertura(){
		return this.alteracao_na_geometria_cobertura;
	}
	
	public void setExtensiva_deterioracao_dos_revestimentos(String extensiva_deterioracao_dos_revestimentos){
		this.extensiva_deterioracao_dos_revestimentos = extensiva_deterioracao_dos_revestimentos;
	}
	public String getExtensiva_deterioracao_dos_revestimentos(){
		return this.extensiva_deterioracao_dos_revestimentos;
	}
	
	public void setDanos_significativos_em_partes_singulares(String danos_significativos_em_partes_singulares){
		this.danos_significativos_em_partes_singulares = danos_significativos_em_partes_singulares;
	}
	public String getDanos_significativos_em_partes_singulares(){
		return this.danos_significativos_em_partes_singulares;
	}
	
	public void setSistema_de_drenagem(String sistema_de_drenagem){
		this.sistema_de_drenagem = sistema_de_drenagem;
	}
	public String getSistema_de_drenagem(){
		return this.sistema_de_drenagem;
	}
	
	public void setAnomalias_indicadores_de_deterioracao(String anomalias_indicadores_de_deterioracao){
		this.anomalias_indicadores_de_deterioracao = anomalias_indicadores_de_deterioracao;
	}
	public String getAnomalias_indicadores_de_deterioracao(){
		return this.anomalias_indicadores_de_deterioracao;
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
	
	public void setPortas(String portas){
		this.portas = portas;
	}
	public String getPortas(){
		return this.portas;
	}
	
	public void setPortas_abrem_e_fecham_sem_recursos_a_forca_excessiva(String portas_abrem_e_fecham_sem_recursos_a_forca_excessiva){
		this.portas_abrem_e_fecham_sem_recursos_a_forca_excessiva = portas_abrem_e_fecham_sem_recursos_a_forca_excessiva;
	}
	public String getPortas_abrem_e_fecham_sem_recursos_a_forca_excessiva(){
		return this.portas_abrem_e_fecham_sem_recursos_a_forca_excessiva;
	}
	
	public void setPortas_tem_fechaduras_que_asseguram_o_encerramento_seguro(String portas_tem_fechaduras_que_asseguram_o_encerramento_seguro){
		this.portas_tem_fechaduras_que_asseguram_o_encerramento_seguro = portas_tem_fechaduras_que_asseguram_o_encerramento_seguro;
	}
	public String getPortas_tem_fechaduras_que_asseguram_o_encerramento_seguro(){
		return this.portas_tem_fechaduras_que_asseguram_o_encerramento_seguro;
	}
	
	public void setJanelas(String janelas){
		this.janelas = janelas;
	}
	public String getJanelas(){
		return this.janelas;
	}
	
	public void setJanelas_abrem_e_fecham_sem_recursos_a_forca_excessiva(String janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva){
		this.janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva = janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva;
	}
	public String getJanelas_abrem_e_fecham_sem_recursos_a_forca_excessiva(){
		return this.janelas_abrem_e_fecham_sem_recursos_a_forca_excessiva;
	}
	
	public void setJanelas_tem_fechaduras_que_asseguram_o_encerramento_seguro(String janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro){
		this.janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro = janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro;
	}
	public String getJanelas_tem_fechaduras_que_asseguram_o_encerramento_seguro(){
		return this.janelas_tem_fechaduras_que_asseguram_o_encerramento_seguro;
	}
	
	public void setOs_elementos_que_as_constituem_estao_deterioradas(String os_elementos_que_as_constituem_estao_deterioradas){
		this.os_elementos_que_as_constituem_estao_deterioradas = os_elementos_que_as_constituem_estao_deterioradas;
	}
	public String getOs_elementos_que_as_constituem_estao_deterioradas(){
		return this.os_elementos_que_as_constituem_estao_deterioradas;
	}
	
	public void setAsseguram_a_estanquidade_das_aguas_das_chuvas(String asseguram_a_estanquidade_das_aguas_das_chuvas){
		this.asseguram_a_estanquidade_das_aguas_das_chuvas = asseguram_a_estanquidade_das_aguas_das_chuvas;
	}
	public String getAsseguram_a_estanquidade_das_aguas_das_chuvas(){
		return this.asseguram_a_estanquidade_das_aguas_das_chuvas;
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
