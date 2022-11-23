package nosi.webapps.sgie.pages.dados_infra_carater_edificio;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Dados_infra_carater_edificio extends Model{		

	@RParam(rParamName = "p_altura_total_do_edificio")
	private Integer altura_total_do_edificio;

	@RParam(rParamName = "p_area_bruta")
	private Integer area_bruta;

	@RParam(rParamName = "p_decada_de_construcao")
	private Integer decada_de_construcao;

	@RParam(rParamName = "p_guarita_de_porteiro")
	private String guarita_de_porteiro;

	@RParam(rParamName = "p_ano_de_construcao_")
	private Integer ano_de_construcao_;

	@RParam(rParamName = "p_pisos_abaixo_do_solo")
	private Integer pisos_abaixo_do_solo;

	@RParam(rParamName = "p_pisos_acima_do_solo")
	private Integer pisos_acima_do_solo;

	@RParam(rParamName = "p_ano_da_ultima_restruturacao")
	private Integer ano_da_ultima_restruturacao;

	@RParam(rParamName = "p_nome_da_empresaconsorcio_executor_obra")
	private String nome_da_empresaconsorcio_executor_obra;

	@RParam(rParamName = "p_telefone_da_empresaconsorcio_")
	private String telefone_da_empresaconsorcio_;

	@RParam(rParamName = "p_morada_da_empresaconsorcio")
	private String morada_da_empresaconsorcio;

	@RParam(rParamName = "p_email_da_empresaconsorcio")
	private String email_da_empresaconsorcio;

	@RParam(rParamName = "p_volumetria")
	private Integer volumetria;

	@RParam(rParamName = "p_area_total_de_lote")
	private Integer area_total_de_lote;

	@RParam(rParamName = "p_numero_de_lugares_estacionamento")
	private Integer numero_de_lugares_estacionamento;

	@RParam(rParamName = "p_esc_id")
	private String esc_id;
	
	public void setAltura_total_do_edificio(Integer altura_total_do_edificio){
		this.altura_total_do_edificio = altura_total_do_edificio;
	}
	public Integer getAltura_total_do_edificio(){
		return this.altura_total_do_edificio;
	}
	
	public void setArea_bruta(Integer area_bruta){
		this.area_bruta = area_bruta;
	}
	public Integer getArea_bruta(){
		return this.area_bruta;
	}
	
	public void setDecada_de_construcao(Integer decada_de_construcao){
		this.decada_de_construcao = decada_de_construcao;
	}
	public Integer getDecada_de_construcao(){
		return this.decada_de_construcao;
	}
	
	public void setGuarita_de_porteiro(String guarita_de_porteiro){
		this.guarita_de_porteiro = guarita_de_porteiro;
	}
	public String getGuarita_de_porteiro(){
		return this.guarita_de_porteiro;
	}
	
	public void setAno_de_construcao_(Integer ano_de_construcao_){
		this.ano_de_construcao_ = ano_de_construcao_;
	}
	public Integer getAno_de_construcao_(){
		return this.ano_de_construcao_;
	}
	
	public void setPisos_abaixo_do_solo(Integer pisos_abaixo_do_solo){
		this.pisos_abaixo_do_solo = pisos_abaixo_do_solo;
	}
	public Integer getPisos_abaixo_do_solo(){
		return this.pisos_abaixo_do_solo;
	}
	
	public void setPisos_acima_do_solo(Integer pisos_acima_do_solo){
		this.pisos_acima_do_solo = pisos_acima_do_solo;
	}
	public Integer getPisos_acima_do_solo(){
		return this.pisos_acima_do_solo;
	}
	
	public void setAno_da_ultima_restruturacao(Integer ano_da_ultima_restruturacao){
		this.ano_da_ultima_restruturacao = ano_da_ultima_restruturacao;
	}
	public Integer getAno_da_ultima_restruturacao(){
		return this.ano_da_ultima_restruturacao;
	}
	
	public void setNome_da_empresaconsorcio_executor_obra(String nome_da_empresaconsorcio_executor_obra){
		this.nome_da_empresaconsorcio_executor_obra = nome_da_empresaconsorcio_executor_obra;
	}
	public String getNome_da_empresaconsorcio_executor_obra(){
		return this.nome_da_empresaconsorcio_executor_obra;
	}
	
	public void setTelefone_da_empresaconsorcio_(String telefone_da_empresaconsorcio_){
		this.telefone_da_empresaconsorcio_ = telefone_da_empresaconsorcio_;
	}
	public String getTelefone_da_empresaconsorcio_(){
		return this.telefone_da_empresaconsorcio_;
	}
	
	public void setMorada_da_empresaconsorcio(String morada_da_empresaconsorcio){
		this.morada_da_empresaconsorcio = morada_da_empresaconsorcio;
	}
	public String getMorada_da_empresaconsorcio(){
		return this.morada_da_empresaconsorcio;
	}
	
	public void setEmail_da_empresaconsorcio(String email_da_empresaconsorcio){
		this.email_da_empresaconsorcio = email_da_empresaconsorcio;
	}
	public String getEmail_da_empresaconsorcio(){
		return this.email_da_empresaconsorcio;
	}
	
	public void setVolumetria(Integer volumetria){
		this.volumetria = volumetria;
	}
	public Integer getVolumetria(){
		return this.volumetria;
	}
	
	public void setArea_total_de_lote(Integer area_total_de_lote){
		this.area_total_de_lote = area_total_de_lote;
	}
	public Integer getArea_total_de_lote(){
		return this.area_total_de_lote;
	}
	
	public void setNumero_de_lugares_estacionamento(Integer numero_de_lugares_estacionamento){
		this.numero_de_lugares_estacionamento = numero_de_lugares_estacionamento;
	}
	public Integer getNumero_de_lugares_estacionamento(){
		return this.numero_de_lugares_estacionamento;
	}
	
	public void setEsc_id(String esc_id){
		this.esc_id = esc_id;
	}
	public String getEsc_id(){
		return this.esc_id;
	}



}
