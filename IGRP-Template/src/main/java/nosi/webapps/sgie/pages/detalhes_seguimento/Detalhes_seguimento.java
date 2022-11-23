package nosi.webapps.sgie.pages.detalhes_seguimento;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Detalhes_seguimento extends Model{		

	@RParam(rParamName = "p_areas_adminstrativas_e_didaticas")
	private String areas_adminstrativas_e_didaticas;

	@RParam(rParamName = "p_direcao")
	private String direcao;

	@RParam(rParamName = "p_secretaria")
	private String secretaria;

	@RParam(rParamName = "p_biblioteca")
	private String biblioteca;

	@RParam(rParamName = "p_ginasio")
	private String ginasio;

	@RParam(rParamName = "p_laboratorio_informatico")
	private String laboratorio_informatico;

	@RParam(rParamName = "p_laboratorio_biologia")
	private String laboratorio_biologia;

	@RParam(rParamName = "p_laboratorio_quimicafisica")
	private String laboratorio_quimicafisica;

	@RParam(rParamName = "p_sala_multimedia")
	private String sala_multimedia;

	@RParam(rParamName = "p_reprografia")
	private String reprografia;

	@RParam(rParamName = "p_club_ecologico")
	private String club_ecologico;

	@RParam(rParamName = "p_sala_de_leitura")
	private String sala_de_leitura;

	@RParam(rParamName = "p_oficina_de_artes_graficas")
	private String oficina_de_artes_graficas;

	@RParam(rParamName = "p_centros_de_recursos")
	private String centros_de_recursos;

	@RParam(rParamName = "p_laboratorio_de_lingua_portuguesa")
	private String laboratorio_de_lingua_portuguesa;

	@RParam(rParamName = "p_laboratorio_de_lingua_inglesa")
	private String laboratorio_de_lingua_inglesa;

	@RParam(rParamName = "p_laboratorio_de_lingua_francesa")
	private String laboratorio_de_lingua_francesa;

	@RParam(rParamName = "p_oficina_de_eletrotecnica_eletronica")
	private String oficina_de_eletrotecnica_eletronica;

	@RParam(rParamName = "p_oficina_de_mecanica")
	private String oficina_de_mecanica;

	@RParam(rParamName = "p_oficina_de_informatica")
	private String oficina_de_informatica;

	@RParam(rParamName = "p_papelaria")
	private String papelaria;

	@RParam(rParamName = "p_anfiteatroauditorio")
	private String anfiteatroauditorio;

	@RParam(rParamName = "p_oficina_de_soldaduraconstrucao_metalica")
	private String oficina_de_soldaduraconstrucao_metalica;

	@RParam(rParamName = "p_sala_de_associacao_de_alunos")
	private String sala_de_associacao_de_alunos;

	@RParam(rParamName = "p_salas_especificas")
	private String salas_especificas;

	@RParam(rParamName = "p_oficina_de_construcao_civil")
	private String oficina_de_construcao_civil;

	@RParam(rParamName = "p_outros_espacos")
	private String outros_espacos;

	@RParam(rParamName = "p_campos_de_voleibol")
	private String campos_de_voleibol;

	@RParam(rParamName = "p_campos_de_futebol")
	private String campos_de_futebol;

	@RParam(rParamName = "p_campos_de_basquetebol")
	private String campos_de_basquetebol;

	@RParam(rParamName = "p_pavilhao_polivalente_exterior")
	private String pavilhao_polivalente_exterior;

	@RParam(rParamName = "p_pavilhao_interior")
	private String pavilhao_interior;

	@RParam(rParamName = "p_placa_desportiva")
	private String placa_desportiva;

	@RParam(rParamName = "p_outras_instalacoes_exteriores")
	private String outras_instalacoes_exteriores;

	@RParam(rParamName = "p_sala_de_professores")
	private String sala_de_professores;

	@RParam(rParamName = "p_areas_de_servico")
	private String areas_de_servico;

	@RParam(rParamName = "p_refeitorio")
	private String refeitorio;

	@RParam(rParamName = "p_armazemdispensa")
	private String armazemdispensa;

	@RParam(rParamName = "p_anexosarrecadacao")
	private String anexosarrecadacao;

	@RParam(rParamName = "p_escadas_e_corredores_internos")
	private String escadas_e_corredores_internos;

	@RParam(rParamName = "p_casa_banhos_para_meninos")
	private String casa_banhos_para_meninos;

	@RParam(rParamName = "p_casa_banhos_para_meninas")
	private String casa_banhos_para_meninas;

	@RParam(rParamName = "p_casa_banhos_para_criancas_com_deficiencias")
	private String casa_banhos_para_criancas_com_deficiencias;

	@RParam(rParamName = "p_casa_de_banho_para_professores")
	private String casa_de_banho_para_professores;

	@RParam(rParamName = "p_casa_de_banho_para_professoras")
	private String casa_de_banho_para_professoras;

	@RParam(rParamName = "p_cantina")
	private String cantina;

	@RParam(rParamName = "p_cozinha")
	private String cozinha;

	@RParam(rParamName = "p_areas_diversas")
	private String areas_diversas;

	@RParam(rParamName = "p_rampa_de_acesso")
	private String rampa_de_acesso;

	@RParam(rParamName = "p_acesso_automovel")
	private String acesso_automovel;

	@RParam(rParamName = "p_acesso_pedonal")
	private String acesso_pedonal;

	@RParam(rParamName = "p_sistema_de_rega")
	private String sistema_de_rega;

	@RParam(rParamName = "p_muro_de_vedacao")
	private String muro_de_vedacao;

	@RParam(rParamName = "p_patio_da_escola")
	private String patio_da_escola;

	@RParam(rParamName = "p_canteiros_floridos")
	private String canteiros_floridos;

	@RParam(rParamName = "p_parque_automovel")
	private String parque_automovel;
	
	public void setAreas_adminstrativas_e_didaticas(String areas_adminstrativas_e_didaticas){
		this.areas_adminstrativas_e_didaticas = areas_adminstrativas_e_didaticas;
	}
	public String getAreas_adminstrativas_e_didaticas(){
		return this.areas_adminstrativas_e_didaticas;
	}
	
	public void setDirecao(String direcao){
		this.direcao = direcao;
	}
	public String getDirecao(){
		return this.direcao;
	}
	
	public void setSecretaria(String secretaria){
		this.secretaria = secretaria;
	}
	public String getSecretaria(){
		return this.secretaria;
	}
	
	public void setBiblioteca(String biblioteca){
		this.biblioteca = biblioteca;
	}
	public String getBiblioteca(){
		return this.biblioteca;
	}
	
	public void setGinasio(String ginasio){
		this.ginasio = ginasio;
	}
	public String getGinasio(){
		return this.ginasio;
	}
	
	public void setLaboratorio_informatico(String laboratorio_informatico){
		this.laboratorio_informatico = laboratorio_informatico;
	}
	public String getLaboratorio_informatico(){
		return this.laboratorio_informatico;
	}
	
	public void setLaboratorio_biologia(String laboratorio_biologia){
		this.laboratorio_biologia = laboratorio_biologia;
	}
	public String getLaboratorio_biologia(){
		return this.laboratorio_biologia;
	}
	
	public void setLaboratorio_quimicafisica(String laboratorio_quimicafisica){
		this.laboratorio_quimicafisica = laboratorio_quimicafisica;
	}
	public String getLaboratorio_quimicafisica(){
		return this.laboratorio_quimicafisica;
	}
	
	public void setSala_multimedia(String sala_multimedia){
		this.sala_multimedia = sala_multimedia;
	}
	public String getSala_multimedia(){
		return this.sala_multimedia;
	}
	
	public void setReprografia(String reprografia){
		this.reprografia = reprografia;
	}
	public String getReprografia(){
		return this.reprografia;
	}
	
	public void setClub_ecologico(String club_ecologico){
		this.club_ecologico = club_ecologico;
	}
	public String getClub_ecologico(){
		return this.club_ecologico;
	}
	
	public void setSala_de_leitura(String sala_de_leitura){
		this.sala_de_leitura = sala_de_leitura;
	}
	public String getSala_de_leitura(){
		return this.sala_de_leitura;
	}
	
	public void setOficina_de_artes_graficas(String oficina_de_artes_graficas){
		this.oficina_de_artes_graficas = oficina_de_artes_graficas;
	}
	public String getOficina_de_artes_graficas(){
		return this.oficina_de_artes_graficas;
	}
	
	public void setCentros_de_recursos(String centros_de_recursos){
		this.centros_de_recursos = centros_de_recursos;
	}
	public String getCentros_de_recursos(){
		return this.centros_de_recursos;
	}
	
	public void setLaboratorio_de_lingua_portuguesa(String laboratorio_de_lingua_portuguesa){
		this.laboratorio_de_lingua_portuguesa = laboratorio_de_lingua_portuguesa;
	}
	public String getLaboratorio_de_lingua_portuguesa(){
		return this.laboratorio_de_lingua_portuguesa;
	}
	
	public void setLaboratorio_de_lingua_inglesa(String laboratorio_de_lingua_inglesa){
		this.laboratorio_de_lingua_inglesa = laboratorio_de_lingua_inglesa;
	}
	public String getLaboratorio_de_lingua_inglesa(){
		return this.laboratorio_de_lingua_inglesa;
	}
	
	public void setLaboratorio_de_lingua_francesa(String laboratorio_de_lingua_francesa){
		this.laboratorio_de_lingua_francesa = laboratorio_de_lingua_francesa;
	}
	public String getLaboratorio_de_lingua_francesa(){
		return this.laboratorio_de_lingua_francesa;
	}
	
	public void setOficina_de_eletrotecnica_eletronica(String oficina_de_eletrotecnica_eletronica){
		this.oficina_de_eletrotecnica_eletronica = oficina_de_eletrotecnica_eletronica;
	}
	public String getOficina_de_eletrotecnica_eletronica(){
		return this.oficina_de_eletrotecnica_eletronica;
	}
	
	public void setOficina_de_mecanica(String oficina_de_mecanica){
		this.oficina_de_mecanica = oficina_de_mecanica;
	}
	public String getOficina_de_mecanica(){
		return this.oficina_de_mecanica;
	}
	
	public void setOficina_de_informatica(String oficina_de_informatica){
		this.oficina_de_informatica = oficina_de_informatica;
	}
	public String getOficina_de_informatica(){
		return this.oficina_de_informatica;
	}
	
	public void setPapelaria(String papelaria){
		this.papelaria = papelaria;
	}
	public String getPapelaria(){
		return this.papelaria;
	}
	
	public void setAnfiteatroauditorio(String anfiteatroauditorio){
		this.anfiteatroauditorio = anfiteatroauditorio;
	}
	public String getAnfiteatroauditorio(){
		return this.anfiteatroauditorio;
	}
	
	public void setOficina_de_soldaduraconstrucao_metalica(String oficina_de_soldaduraconstrucao_metalica){
		this.oficina_de_soldaduraconstrucao_metalica = oficina_de_soldaduraconstrucao_metalica;
	}
	public String getOficina_de_soldaduraconstrucao_metalica(){
		return this.oficina_de_soldaduraconstrucao_metalica;
	}
	
	public void setSala_de_associacao_de_alunos(String sala_de_associacao_de_alunos){
		this.sala_de_associacao_de_alunos = sala_de_associacao_de_alunos;
	}
	public String getSala_de_associacao_de_alunos(){
		return this.sala_de_associacao_de_alunos;
	}
	
	public void setSalas_especificas(String salas_especificas){
		this.salas_especificas = salas_especificas;
	}
	public String getSalas_especificas(){
		return this.salas_especificas;
	}
	
	public void setOficina_de_construcao_civil(String oficina_de_construcao_civil){
		this.oficina_de_construcao_civil = oficina_de_construcao_civil;
	}
	public String getOficina_de_construcao_civil(){
		return this.oficina_de_construcao_civil;
	}
	
	public void setOutros_espacos(String outros_espacos){
		this.outros_espacos = outros_espacos;
	}
	public String getOutros_espacos(){
		return this.outros_espacos;
	}
	
	public void setCampos_de_voleibol(String campos_de_voleibol){
		this.campos_de_voleibol = campos_de_voleibol;
	}
	public String getCampos_de_voleibol(){
		return this.campos_de_voleibol;
	}
	
	public void setCampos_de_futebol(String campos_de_futebol){
		this.campos_de_futebol = campos_de_futebol;
	}
	public String getCampos_de_futebol(){
		return this.campos_de_futebol;
	}
	
	public void setCampos_de_basquetebol(String campos_de_basquetebol){
		this.campos_de_basquetebol = campos_de_basquetebol;
	}
	public String getCampos_de_basquetebol(){
		return this.campos_de_basquetebol;
	}
	
	public void setPavilhao_polivalente_exterior(String pavilhao_polivalente_exterior){
		this.pavilhao_polivalente_exterior = pavilhao_polivalente_exterior;
	}
	public String getPavilhao_polivalente_exterior(){
		return this.pavilhao_polivalente_exterior;
	}
	
	public void setPavilhao_interior(String pavilhao_interior){
		this.pavilhao_interior = pavilhao_interior;
	}
	public String getPavilhao_interior(){
		return this.pavilhao_interior;
	}
	
	public void setPlaca_desportiva(String placa_desportiva){
		this.placa_desportiva = placa_desportiva;
	}
	public String getPlaca_desportiva(){
		return this.placa_desportiva;
	}
	
	public void setOutras_instalacoes_exteriores(String outras_instalacoes_exteriores){
		this.outras_instalacoes_exteriores = outras_instalacoes_exteriores;
	}
	public String getOutras_instalacoes_exteriores(){
		return this.outras_instalacoes_exteriores;
	}
	
	public void setSala_de_professores(String sala_de_professores){
		this.sala_de_professores = sala_de_professores;
	}
	public String getSala_de_professores(){
		return this.sala_de_professores;
	}
	
	public void setAreas_de_servico(String areas_de_servico){
		this.areas_de_servico = areas_de_servico;
	}
	public String getAreas_de_servico(){
		return this.areas_de_servico;
	}
	
	public void setRefeitorio(String refeitorio){
		this.refeitorio = refeitorio;
	}
	public String getRefeitorio(){
		return this.refeitorio;
	}
	
	public void setArmazemdispensa(String armazemdispensa){
		this.armazemdispensa = armazemdispensa;
	}
	public String getArmazemdispensa(){
		return this.armazemdispensa;
	}
	
	public void setAnexosarrecadacao(String anexosarrecadacao){
		this.anexosarrecadacao = anexosarrecadacao;
	}
	public String getAnexosarrecadacao(){
		return this.anexosarrecadacao;
	}
	
	public void setEscadas_e_corredores_internos(String escadas_e_corredores_internos){
		this.escadas_e_corredores_internos = escadas_e_corredores_internos;
	}
	public String getEscadas_e_corredores_internos(){
		return this.escadas_e_corredores_internos;
	}
	
	public void setCasa_banhos_para_meninos(String casa_banhos_para_meninos){
		this.casa_banhos_para_meninos = casa_banhos_para_meninos;
	}
	public String getCasa_banhos_para_meninos(){
		return this.casa_banhos_para_meninos;
	}
	
	public void setCasa_banhos_para_meninas(String casa_banhos_para_meninas){
		this.casa_banhos_para_meninas = casa_banhos_para_meninas;
	}
	public String getCasa_banhos_para_meninas(){
		return this.casa_banhos_para_meninas;
	}
	
	public void setCasa_banhos_para_criancas_com_deficiencias(String casa_banhos_para_criancas_com_deficiencias){
		this.casa_banhos_para_criancas_com_deficiencias = casa_banhos_para_criancas_com_deficiencias;
	}
	public String getCasa_banhos_para_criancas_com_deficiencias(){
		return this.casa_banhos_para_criancas_com_deficiencias;
	}
	
	public void setCasa_de_banho_para_professores(String casa_de_banho_para_professores){
		this.casa_de_banho_para_professores = casa_de_banho_para_professores;
	}
	public String getCasa_de_banho_para_professores(){
		return this.casa_de_banho_para_professores;
	}
	
	public void setCasa_de_banho_para_professoras(String casa_de_banho_para_professoras){
		this.casa_de_banho_para_professoras = casa_de_banho_para_professoras;
	}
	public String getCasa_de_banho_para_professoras(){
		return this.casa_de_banho_para_professoras;
	}
	
	public void setCantina(String cantina){
		this.cantina = cantina;
	}
	public String getCantina(){
		return this.cantina;
	}
	
	public void setCozinha(String cozinha){
		this.cozinha = cozinha;
	}
	public String getCozinha(){
		return this.cozinha;
	}
	
	public void setAreas_diversas(String areas_diversas){
		this.areas_diversas = areas_diversas;
	}
	public String getAreas_diversas(){
		return this.areas_diversas;
	}
	
	public void setRampa_de_acesso(String rampa_de_acesso){
		this.rampa_de_acesso = rampa_de_acesso;
	}
	public String getRampa_de_acesso(){
		return this.rampa_de_acesso;
	}
	
	public void setAcesso_automovel(String acesso_automovel){
		this.acesso_automovel = acesso_automovel;
	}
	public String getAcesso_automovel(){
		return this.acesso_automovel;
	}
	
	public void setAcesso_pedonal(String acesso_pedonal){
		this.acesso_pedonal = acesso_pedonal;
	}
	public String getAcesso_pedonal(){
		return this.acesso_pedonal;
	}
	
	public void setSistema_de_rega(String sistema_de_rega){
		this.sistema_de_rega = sistema_de_rega;
	}
	public String getSistema_de_rega(){
		return this.sistema_de_rega;
	}
	
	public void setMuro_de_vedacao(String muro_de_vedacao){
		this.muro_de_vedacao = muro_de_vedacao;
	}
	public String getMuro_de_vedacao(){
		return this.muro_de_vedacao;
	}
	
	public void setPatio_da_escola(String patio_da_escola){
		this.patio_da_escola = patio_da_escola;
	}
	public String getPatio_da_escola(){
		return this.patio_da_escola;
	}
	
	public void setCanteiros_floridos(String canteiros_floridos){
		this.canteiros_floridos = canteiros_floridos;
	}
	public String getCanteiros_floridos(){
		return this.canteiros_floridos;
	}
	
	public void setParque_automovel(String parque_automovel){
		this.parque_automovel = parque_automovel;
	}
	public String getParque_automovel(){
		return this.parque_automovel;
	}



}
