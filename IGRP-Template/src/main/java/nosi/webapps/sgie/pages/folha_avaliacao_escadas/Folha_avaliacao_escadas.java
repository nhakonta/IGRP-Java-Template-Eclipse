package nosi.webapps.sgie.pages.folha_avaliacao_escadas;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Folha_avaliacao_escadas extends Model{		

	@RParam(rParamName = "p_escadas")
	private String escadas;

	@RParam(rParamName = "p_insuficiencia_dos_elementos_estrutural_escadas")
	private String insuficiencia_dos_elementos_estrutural_escadas;

	@RParam(rParamName = "p_alteracao_na_geometria_escadas")
	private String alteracao_na_geometria_escadas;

	@RParam(rParamName = "p_extensiva_deterioracao_dos_degraus")
	private String extensiva_deterioracao_dos_degraus;

	@RParam(rParamName = "p_ausencia_de_guardas_ou_corrimao")
	private String ausencia_de_guardas_ou_corrimao;

	@RParam(rParamName = "p_anomalias_indicadores_de_graves_deterioracao")
	private String anomalias_indicadores_de_graves_deterioracao;
	
	public void setEscadas(String escadas){
		this.escadas = escadas;
	}
	public String getEscadas(){
		return this.escadas;
	}
	
	public void setInsuficiencia_dos_elementos_estrutural_escadas(String insuficiencia_dos_elementos_estrutural_escadas){
		this.insuficiencia_dos_elementos_estrutural_escadas = insuficiencia_dos_elementos_estrutural_escadas;
	}
	public String getInsuficiencia_dos_elementos_estrutural_escadas(){
		return this.insuficiencia_dos_elementos_estrutural_escadas;
	}
	
	public void setAlteracao_na_geometria_escadas(String alteracao_na_geometria_escadas){
		this.alteracao_na_geometria_escadas = alteracao_na_geometria_escadas;
	}
	public String getAlteracao_na_geometria_escadas(){
		return this.alteracao_na_geometria_escadas;
	}
	
	public void setExtensiva_deterioracao_dos_degraus(String extensiva_deterioracao_dos_degraus){
		this.extensiva_deterioracao_dos_degraus = extensiva_deterioracao_dos_degraus;
	}
	public String getExtensiva_deterioracao_dos_degraus(){
		return this.extensiva_deterioracao_dos_degraus;
	}
	
	public void setAusencia_de_guardas_ou_corrimao(String ausencia_de_guardas_ou_corrimao){
		this.ausencia_de_guardas_ou_corrimao = ausencia_de_guardas_ou_corrimao;
	}
	public String getAusencia_de_guardas_ou_corrimao(){
		return this.ausencia_de_guardas_ou_corrimao;
	}
	
	public void setAnomalias_indicadores_de_graves_deterioracao(String anomalias_indicadores_de_graves_deterioracao){
		this.anomalias_indicadores_de_graves_deterioracao = anomalias_indicadores_de_graves_deterioracao;
	}
	public String getAnomalias_indicadores_de_graves_deterioracao(){
		return this.anomalias_indicadores_de_graves_deterioracao;
	}



}
