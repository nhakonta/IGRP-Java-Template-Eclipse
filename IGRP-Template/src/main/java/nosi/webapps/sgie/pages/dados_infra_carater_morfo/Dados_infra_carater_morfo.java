package nosi.webapps.sgie.pages.dados_infra_carater_morfo;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Dados_infra_carater_morfo extends Model{		

	@RParam(rParamName = "p_numero_de_corpos")
	private Integer numero_de_corpos;

	@RParam(rParamName = "p_simetria_entre_corpos")
	private String simetria_entre_corpos;

	@RParam(rParamName = "p_numero_de_compartimentos")
	private Integer numero_de_compartimentos;

	@RParam(rParamName = "p_numero_de_instalacoes_sanitarias")
	private Integer numero_de_instalacoes_sanitarias;

	@RParam(rParamName = "p_forma")
	private String forma;

	@RParam(rParamName = "p_entrada_")
	private String entrada_;

	@RParam(rParamName = "p_esc_id")
	private String esc_id;
	
	public void setNumero_de_corpos(Integer numero_de_corpos){
		this.numero_de_corpos = numero_de_corpos;
	}
	public Integer getNumero_de_corpos(){
		return this.numero_de_corpos;
	}
	
	public void setSimetria_entre_corpos(String simetria_entre_corpos){
		this.simetria_entre_corpos = simetria_entre_corpos;
	}
	public String getSimetria_entre_corpos(){
		return this.simetria_entre_corpos;
	}
	
	public void setNumero_de_compartimentos(Integer numero_de_compartimentos){
		this.numero_de_compartimentos = numero_de_compartimentos;
	}
	public Integer getNumero_de_compartimentos(){
		return this.numero_de_compartimentos;
	}
	
	public void setNumero_de_instalacoes_sanitarias(Integer numero_de_instalacoes_sanitarias){
		this.numero_de_instalacoes_sanitarias = numero_de_instalacoes_sanitarias;
	}
	public Integer getNumero_de_instalacoes_sanitarias(){
		return this.numero_de_instalacoes_sanitarias;
	}
	
	public void setForma(String forma){
		this.forma = forma;
	}
	public String getForma(){
		return this.forma;
	}
	
	public void setEntrada_(String entrada_){
		this.entrada_ = entrada_;
	}
	public String getEntrada_(){
		return this.entrada_;
	}
	
	public void setEsc_id(String esc_id){
		this.esc_id = esc_id;
	}
	public String getEsc_id(){
		return this.esc_id;
	}



}
