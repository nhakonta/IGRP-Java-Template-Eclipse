package nosi.webapps.sgie.pages.dados_infra_carater_construtivo;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Dados_infra_carater_construtivo extends Model{		

	@RParam(rParamName = "p_separador_estrutura")
	private String separador_estrutura;

	@RParam(rParamName = "p_estrutura_horizontal")
	private String estrutura_horizontal;

	@RParam(rParamName = "p_estrutura_vertical")
	private String estrutura_vertical;

	@RParam(rParamName = "p_fundacoes")
	private String fundacoes;

	@RParam(rParamName = "p_elementos_verticais_de_suporte")
	private String elementos_verticais_de_suporte;

	@RParam(rParamName = "p_pavimentos")
	private String pavimentos;

	@RParam(rParamName = "p_separador_cobertura")
	private String separador_cobertura;

	@RParam(rParamName = "p_vedacao")
	private String vedacao;

	@RParam(rParamName = "p_cobertura")
	private String cobertura;

	@RParam(rParamName = "p_forma_cobertura_carat_construt")
	private String forma_cobertura_carat_construt;

	@RParam(rParamName = "p_estrutura_de_suporte")
	private String estrutura_de_suporte;

	@RParam(rParamName = "p_revestimento_da_cobertura_em_terraco")
	private String revestimento_da_cobertura_em_terraco;

	@RParam(rParamName = "p_revestimento_da_cobertura_inclinada")
	private String revestimento_da_cobertura_inclinada;

	@RParam(rParamName = "p_separador_paredes_exteriores")
	private String separador_paredes_exteriores;

	@RParam(rParamName = "p_revestimento_exterior")
	private String revestimento_exterior;

	@RParam(rParamName = "p_paredes_exterior")
	private String paredes_exterior;

	@RParam(rParamName = "p_tosco_parede_exterior")
	private String tosco_parede_exterior;

	@RParam(rParamName = "p_revestimento_do_paramento_exterior_das_fachadas")
	private String revestimento_do_paramento_exterior_das_fachadas;

	@RParam(rParamName = "p_revestimento_do_paramento_exterior_das_empenas")
	private String revestimento_do_paramento_exterior_das_empenas;

	@RParam(rParamName = "p_separador_paredes_interiores")
	private String separador_paredes_interiores;

	@RParam(rParamName = "p_tosco_parade_interior")
	private String tosco_parade_interior;

	@RParam(rParamName = "p_revestimento_do_paramento_interior_das_fachadas")
	private String revestimento_do_paramento_interior_das_fachadas;

	@RParam(rParamName = "p_separador_caixalharias_e_portoes")
	private String separador_caixalharias_e_portoes;

	@RParam(rParamName = "p_material")
	private String material;

	@RParam(rParamName = "p_portao_pedonal")
	private String portao_pedonal;

	@RParam(rParamName = "p_portao_automovel")
	private String portao_automovel;

	@RParam(rParamName = "p_separador_escadas")
	private String separador_escadas;

	@RParam(rParamName = "p_escadas_externas")
	private String escadas_externas;

	@RParam(rParamName = "p_rampa_externas")
	private String rampa_externas;

	@RParam(rParamName = "p_corrimaos_escadas_internas")
	private String corrimaos_escadas_internas;

	@RParam(rParamName = "p_escadas_interior")
	private String escadas_interior;

	@RParam(rParamName = "p_estrutura_de_suporte_escadas")
	private String estrutura_de_suporte_escadas;

	@RParam(rParamName = "p_corrimaos_escadas_externas")
	private String corrimaos_escadas_externas;

	@RParam(rParamName = "p_esc_id")
	private String esc_id;
	
	public void setSeparador_estrutura(String separador_estrutura){
		this.separador_estrutura = separador_estrutura;
	}
	public String getSeparador_estrutura(){
		return this.separador_estrutura;
	}
	
	public void setEstrutura_horizontal(String estrutura_horizontal){
		this.estrutura_horizontal = estrutura_horizontal;
	}
	public String getEstrutura_horizontal(){
		return this.estrutura_horizontal;
	}
	
	public void setEstrutura_vertical(String estrutura_vertical){
		this.estrutura_vertical = estrutura_vertical;
	}
	public String getEstrutura_vertical(){
		return this.estrutura_vertical;
	}
	
	public void setFundacoes(String fundacoes){
		this.fundacoes = fundacoes;
	}
	public String getFundacoes(){
		return this.fundacoes;
	}
	
	public void setElementos_verticais_de_suporte(String elementos_verticais_de_suporte){
		this.elementos_verticais_de_suporte = elementos_verticais_de_suporte;
	}
	public String getElementos_verticais_de_suporte(){
		return this.elementos_verticais_de_suporte;
	}
	
	public void setPavimentos(String pavimentos){
		this.pavimentos = pavimentos;
	}
	public String getPavimentos(){
		return this.pavimentos;
	}
	
	public void setSeparador_cobertura(String separador_cobertura){
		this.separador_cobertura = separador_cobertura;
	}
	public String getSeparador_cobertura(){
		return this.separador_cobertura;
	}
	
	public void setVedacao(String vedacao){
		this.vedacao = vedacao;
	}
	public String getVedacao(){
		return this.vedacao;
	}
	
	public void setCobertura(String cobertura){
		this.cobertura = cobertura;
	}
	public String getCobertura(){
		return this.cobertura;
	}
	
	public void setForma_cobertura_carat_construt(String forma_cobertura_carat_construt){
		this.forma_cobertura_carat_construt = forma_cobertura_carat_construt;
	}
	public String getForma_cobertura_carat_construt(){
		return this.forma_cobertura_carat_construt;
	}
	
	public void setEstrutura_de_suporte(String estrutura_de_suporte){
		this.estrutura_de_suporte = estrutura_de_suporte;
	}
	public String getEstrutura_de_suporte(){
		return this.estrutura_de_suporte;
	}
	
	public void setRevestimento_da_cobertura_em_terraco(String revestimento_da_cobertura_em_terraco){
		this.revestimento_da_cobertura_em_terraco = revestimento_da_cobertura_em_terraco;
	}
	public String getRevestimento_da_cobertura_em_terraco(){
		return this.revestimento_da_cobertura_em_terraco;
	}
	
	public void setRevestimento_da_cobertura_inclinada(String revestimento_da_cobertura_inclinada){
		this.revestimento_da_cobertura_inclinada = revestimento_da_cobertura_inclinada;
	}
	public String getRevestimento_da_cobertura_inclinada(){
		return this.revestimento_da_cobertura_inclinada;
	}
	
	public void setSeparador_paredes_exteriores(String separador_paredes_exteriores){
		this.separador_paredes_exteriores = separador_paredes_exteriores;
	}
	public String getSeparador_paredes_exteriores(){
		return this.separador_paredes_exteriores;
	}
	
	public void setRevestimento_exterior(String revestimento_exterior){
		this.revestimento_exterior = revestimento_exterior;
	}
	public String getRevestimento_exterior(){
		return this.revestimento_exterior;
	}
	
	public void setParedes_exterior(String paredes_exterior){
		this.paredes_exterior = paredes_exterior;
	}
	public String getParedes_exterior(){
		return this.paredes_exterior;
	}
	
	public void setTosco_parede_exterior(String tosco_parede_exterior){
		this.tosco_parede_exterior = tosco_parede_exterior;
	}
	public String getTosco_parede_exterior(){
		return this.tosco_parede_exterior;
	}
	
	public void setRevestimento_do_paramento_exterior_das_fachadas(String revestimento_do_paramento_exterior_das_fachadas){
		this.revestimento_do_paramento_exterior_das_fachadas = revestimento_do_paramento_exterior_das_fachadas;
	}
	public String getRevestimento_do_paramento_exterior_das_fachadas(){
		return this.revestimento_do_paramento_exterior_das_fachadas;
	}
	
	public void setRevestimento_do_paramento_exterior_das_empenas(String revestimento_do_paramento_exterior_das_empenas){
		this.revestimento_do_paramento_exterior_das_empenas = revestimento_do_paramento_exterior_das_empenas;
	}
	public String getRevestimento_do_paramento_exterior_das_empenas(){
		return this.revestimento_do_paramento_exterior_das_empenas;
	}
	
	public void setSeparador_paredes_interiores(String separador_paredes_interiores){
		this.separador_paredes_interiores = separador_paredes_interiores;
	}
	public String getSeparador_paredes_interiores(){
		return this.separador_paredes_interiores;
	}
	
	public void setTosco_parade_interior(String tosco_parade_interior){
		this.tosco_parade_interior = tosco_parade_interior;
	}
	public String getTosco_parade_interior(){
		return this.tosco_parade_interior;
	}
	
	public void setRevestimento_do_paramento_interior_das_fachadas(String revestimento_do_paramento_interior_das_fachadas){
		this.revestimento_do_paramento_interior_das_fachadas = revestimento_do_paramento_interior_das_fachadas;
	}
	public String getRevestimento_do_paramento_interior_das_fachadas(){
		return this.revestimento_do_paramento_interior_das_fachadas;
	}
	
	public void setSeparador_caixalharias_e_portoes(String separador_caixalharias_e_portoes){
		this.separador_caixalharias_e_portoes = separador_caixalharias_e_portoes;
	}
	public String getSeparador_caixalharias_e_portoes(){
		return this.separador_caixalharias_e_portoes;
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial(){
		return this.material;
	}
	
	public void setPortao_pedonal(String portao_pedonal){
		this.portao_pedonal = portao_pedonal;
	}
	public String getPortao_pedonal(){
		return this.portao_pedonal;
	}
	
	public void setPortao_automovel(String portao_automovel){
		this.portao_automovel = portao_automovel;
	}
	public String getPortao_automovel(){
		return this.portao_automovel;
	}
	
	public void setSeparador_escadas(String separador_escadas){
		this.separador_escadas = separador_escadas;
	}
	public String getSeparador_escadas(){
		return this.separador_escadas;
	}
	
	public void setEscadas_externas(String escadas_externas){
		this.escadas_externas = escadas_externas;
	}
	public String getEscadas_externas(){
		return this.escadas_externas;
	}
	
	public void setRampa_externas(String rampa_externas){
		this.rampa_externas = rampa_externas;
	}
	public String getRampa_externas(){
		return this.rampa_externas;
	}
	
	public void setCorrimaos_escadas_internas(String corrimaos_escadas_internas){
		this.corrimaos_escadas_internas = corrimaos_escadas_internas;
	}
	public String getCorrimaos_escadas_internas(){
		return this.corrimaos_escadas_internas;
	}
	
	public void setEscadas_interior(String escadas_interior){
		this.escadas_interior = escadas_interior;
	}
	public String getEscadas_interior(){
		return this.escadas_interior;
	}
	
	public void setEstrutura_de_suporte_escadas(String estrutura_de_suporte_escadas){
		this.estrutura_de_suporte_escadas = estrutura_de_suporte_escadas;
	}
	public String getEstrutura_de_suporte_escadas(){
		return this.estrutura_de_suporte_escadas;
	}
	
	public void setCorrimaos_escadas_externas(String corrimaos_escadas_externas){
		this.corrimaos_escadas_externas = corrimaos_escadas_externas;
	}
	public String getCorrimaos_escadas_externas(){
		return this.corrimaos_escadas_externas;
	}
	
	public void setEsc_id(String esc_id){
		this.esc_id = esc_id;
	}
	public String getEsc_id(){
		return this.esc_id;
	}



}
