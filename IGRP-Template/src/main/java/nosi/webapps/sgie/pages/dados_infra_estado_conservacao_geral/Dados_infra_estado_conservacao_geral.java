package nosi.webapps.sgie.pages.dados_infra_estado_conservacao_geral;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Dados_infra_estado_conservacao_geral extends Model{		

	@RParam(rParamName = "p_form_estado_conserva_geral_separator_1")
	private String form_estado_conserva_geral_separator_1;

	@RParam(rParamName = "p_estado_conservacao")
	private String estado_conservacao;

	@RParam(rParamName = "p_localizacao_do_lote")
	private String localizacao_do_lote;

	@RParam(rParamName = "p_aspeto_exterior_do_edificio")
	private String aspeto_exterior_do_edificio;

	@RParam(rParamName = "p_esc_id")
	private String esc_id;
	
	public void setForm_estado_conserva_geral_separator_1(String form_estado_conserva_geral_separator_1){
		this.form_estado_conserva_geral_separator_1 = form_estado_conserva_geral_separator_1;
	}
	public String getForm_estado_conserva_geral_separator_1(){
		return this.form_estado_conserva_geral_separator_1;
	}
	
	public void setEstado_conservacao(String estado_conservacao){
		this.estado_conservacao = estado_conservacao;
	}
	public String getEstado_conservacao(){
		return this.estado_conservacao;
	}
	
	public void setLocalizacao_do_lote(String localizacao_do_lote){
		this.localizacao_do_lote = localizacao_do_lote;
	}
	public String getLocalizacao_do_lote(){
		return this.localizacao_do_lote;
	}
	
	public void setAspeto_exterior_do_edificio(String aspeto_exterior_do_edificio){
		this.aspeto_exterior_do_edificio = aspeto_exterior_do_edificio;
	}
	public String getAspeto_exterior_do_edificio(){
		return this.aspeto_exterior_do_edificio;
	}
	
	public void setEsc_id(String esc_id){
		this.esc_id = esc_id;
	}
	public String getEsc_id(){
		return this.esc_id;
	}



}
