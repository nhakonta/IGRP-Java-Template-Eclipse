package nosi.webapps.sgie.pages.detalhes_seguimento;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Detalhes_seguimentoView extends View {

	public Field areas_adminstrativas_e_didaticas;
	public Field direcao;
	public Field secretaria;
	public Field biblioteca;
	public Field ginasio;
	public Field laboratorio_informatico;
	public Field laboratorio_biologia;
	public Field laboratorio_quimicafisica;
	public Field sala_multimedia;
	public Field reprografia;
	public Field club_ecologico;
	public Field sala_de_leitura;
	public Field oficina_de_artes_graficas;
	public Field centros_de_recursos;
	public Field laboratorio_de_lingua_portuguesa;
	public Field laboratorio_de_lingua_inglesa;
	public Field laboratorio_de_lingua_francesa;
	public Field oficina_de_eletrotecnica_eletronica;
	public Field oficina_de_mecanica;
	public Field oficina_de_informatica;
	public Field papelaria;
	public Field anfiteatroauditorio;
	public Field oficina_de_soldaduraconstrucao_metalica;
	public Field sala_de_associacao_de_alunos;
	public Field salas_especificas;
	public Field oficina_de_construcao_civil;
	public Field outros_espacos;
	public Field campos_de_voleibol;
	public Field campos_de_futebol;
	public Field campos_de_basquetebol;
	public Field pavilhao_polivalente_exterior;
	public Field pavilhao_interior;
	public Field placa_desportiva;
	public Field outras_instalacoes_exteriores;
	public Field sala_de_professores;
	public Field areas_de_servico;
	public Field refeitorio;
	public Field armazemdispensa;
	public Field anexosarrecadacao;
	public Field escadas_e_corredores_internos;
	public Field casa_banhos_para_meninos;
	public Field casa_banhos_para_meninas;
	public Field casa_banhos_para_criancas_com_deficiencias;
	public Field casa_de_banho_para_professores;
	public Field casa_de_banho_para_professoras;
	public Field cantina;
	public Field cozinha;
	public Field areas_diversas;
	public Field rampa_de_acesso;
	public Field acesso_automovel;
	public Field acesso_pedonal;
	public Field sistema_de_rega;
	public Field muro_de_vedacao;
	public Field patio_da_escola;
	public Field canteiros_floridos;
	public Field parque_automovel;
	public IGRPForm form_seguimento;

	public IGRPButton btn_guardar_seguimento;

	public Detalhes_seguimentoView(){

		this.setPageTitle("detalhes seguimento");
			
		form_seguimento = new IGRPForm("form_seguimento","");

		areas_adminstrativas_e_didaticas = new SeparatorField(model,"areas_adminstrativas_e_didaticas");
		areas_adminstrativas_e_didaticas.setLabel(gt("Áreas adminstrativas e didáticas"));
		areas_adminstrativas_e_didaticas.propertie().add("name","p_areas_adminstrativas_e_didaticas").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		direcao = new ListField(model,"direcao");
		direcao.setLabel(gt("Direção"));
		direcao.propertie().add("name","p_direcao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		secretaria = new ListField(model,"secretaria");
		secretaria.setLabel(gt("Secretaria"));
		secretaria.propertie().add("name","p_secretaria").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		biblioteca = new ListField(model,"biblioteca");
		biblioteca.setLabel(gt("Biblioteca"));
		biblioteca.propertie().add("name","p_biblioteca").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		ginasio = new ListField(model,"ginasio");
		ginasio.setLabel(gt("Ginásio"));
		ginasio.propertie().add("name","p_ginasio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_informatico = new ListField(model,"laboratorio_informatico");
		laboratorio_informatico.setLabel(gt("Laboratório informático"));
		laboratorio_informatico.propertie().add("name","p_laboratorio_informatico").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_biologia = new ListField(model,"laboratorio_biologia");
		laboratorio_biologia.setLabel(gt("Laboratório Biologia"));
		laboratorio_biologia.propertie().add("name","p_laboratorio_biologia").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_quimicafisica = new ListField(model,"laboratorio_quimicafisica");
		laboratorio_quimicafisica.setLabel(gt("Laboratório Química/Física"));
		laboratorio_quimicafisica.propertie().add("name","p_laboratorio_quimicafisica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_multimedia = new ListField(model,"sala_multimedia");
		sala_multimedia.setLabel(gt("Sala multimédia"));
		sala_multimedia.propertie().add("name","p_sala_multimedia").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		reprografia = new ListField(model,"reprografia");
		reprografia.setLabel(gt("Reprografia"));
		reprografia.propertie().add("name","p_reprografia").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		club_ecologico = new ListField(model,"club_ecologico");
		club_ecologico.setLabel(gt("Club ecológico"));
		club_ecologico.propertie().add("name","p_club_ecologico").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_leitura = new ListField(model,"sala_de_leitura");
		sala_de_leitura.setLabel(gt("Sala de leitura"));
		sala_de_leitura.propertie().add("name","p_sala_de_leitura").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_artes_graficas = new ListField(model,"oficina_de_artes_graficas");
		oficina_de_artes_graficas.setLabel(gt("Oficina de artes gráficas"));
		oficina_de_artes_graficas.propertie().add("name","p_oficina_de_artes_graficas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		centros_de_recursos = new ListField(model,"centros_de_recursos");
		centros_de_recursos.setLabel(gt("Centros de recursos"));
		centros_de_recursos.propertie().add("name","p_centros_de_recursos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_de_lingua_portuguesa = new ListField(model,"laboratorio_de_lingua_portuguesa");
		laboratorio_de_lingua_portuguesa.setLabel(gt("Laboratório de língua Portuguesa"));
		laboratorio_de_lingua_portuguesa.propertie().add("name","p_laboratorio_de_lingua_portuguesa").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_de_lingua_inglesa = new ListField(model,"laboratorio_de_lingua_inglesa");
		laboratorio_de_lingua_inglesa.setLabel(gt("Laboratório de língua Inglesa"));
		laboratorio_de_lingua_inglesa.propertie().add("name","p_laboratorio_de_lingua_inglesa").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_de_lingua_francesa = new ListField(model,"laboratorio_de_lingua_francesa");
		laboratorio_de_lingua_francesa.setLabel(gt("Laboratório de língua Francesa"));
		laboratorio_de_lingua_francesa.propertie().add("name","p_laboratorio_de_lingua_francesa").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_eletrotecnica_eletronica = new ListField(model,"oficina_de_eletrotecnica_eletronica");
		oficina_de_eletrotecnica_eletronica.setLabel(gt("Oficina de eletrotécnica /eletrónica"));
		oficina_de_eletrotecnica_eletronica.propertie().add("name","p_oficina_de_eletrotecnica_eletronica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_mecanica = new ListField(model,"oficina_de_mecanica");
		oficina_de_mecanica.setLabel(gt("Oficina de mecânica"));
		oficina_de_mecanica.propertie().add("name","p_oficina_de_mecanica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_informatica = new ListField(model,"oficina_de_informatica");
		oficina_de_informatica.setLabel(gt("Oficina de informática"));
		oficina_de_informatica.propertie().add("name","p_oficina_de_informatica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		papelaria = new ListField(model,"papelaria");
		papelaria.setLabel(gt("Papelaria"));
		papelaria.propertie().add("name","p_papelaria").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		anfiteatroauditorio = new ListField(model,"anfiteatroauditorio");
		anfiteatroauditorio.setLabel(gt("Anfiteatro/Auditório"));
		anfiteatroauditorio.propertie().add("name","p_anfiteatroauditorio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_soldaduraconstrucao_metalica = new ListField(model,"oficina_de_soldaduraconstrucao_metalica");
		oficina_de_soldaduraconstrucao_metalica.setLabel(gt("Oficina de soldadura/construção Metálica"));
		oficina_de_soldaduraconstrucao_metalica.propertie().add("name","p_oficina_de_soldaduraconstrucao_metalica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_associacao_de_alunos = new ListField(model,"sala_de_associacao_de_alunos");
		sala_de_associacao_de_alunos.setLabel(gt("Sala de associação de alunos"));
		sala_de_associacao_de_alunos.propertie().add("name","p_sala_de_associacao_de_alunos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		salas_especificas = new ListField(model,"salas_especificas");
		salas_especificas.setLabel(gt("Salas específicas"));
		salas_especificas.propertie().add("name","p_salas_especificas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_construcao_civil = new ListField(model,"oficina_de_construcao_civil");
		oficina_de_construcao_civil.setLabel(gt("Oficina de construção civil"));
		oficina_de_construcao_civil.propertie().add("name","p_oficina_de_construcao_civil").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		outros_espacos = new ListField(model,"outros_espacos");
		outros_espacos.setLabel(gt("Outros espaços"));
		outros_espacos.propertie().add("name","p_outros_espacos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		campos_de_voleibol = new ListField(model,"campos_de_voleibol");
		campos_de_voleibol.setLabel(gt("Campos de Voleibol"));
		campos_de_voleibol.propertie().add("name","p_campos_de_voleibol").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		campos_de_futebol = new ListField(model,"campos_de_futebol");
		campos_de_futebol.setLabel(gt("Campos de Futebol"));
		campos_de_futebol.propertie().add("name","p_campos_de_futebol").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		campos_de_basquetebol = new ListField(model,"campos_de_basquetebol");
		campos_de_basquetebol.setLabel(gt("Campos de Basquetebol"));
		campos_de_basquetebol.propertie().add("name","p_campos_de_basquetebol").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		pavilhao_polivalente_exterior = new ListField(model,"pavilhao_polivalente_exterior");
		pavilhao_polivalente_exterior.setLabel(gt("Pavilhão Polivalente Exterior"));
		pavilhao_polivalente_exterior.propertie().add("name","p_pavilhao_polivalente_exterior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		pavilhao_interior = new ListField(model,"pavilhao_interior");
		pavilhao_interior.setLabel(gt("Pavilhão Interior"));
		pavilhao_interior.propertie().add("name","p_pavilhao_interior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		placa_desportiva = new ListField(model,"placa_desportiva");
		placa_desportiva.setLabel(gt("Placa desportiva"));
		placa_desportiva.propertie().add("name","p_placa_desportiva").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		outras_instalacoes_exteriores = new ListField(model,"outras_instalacoes_exteriores");
		outras_instalacoes_exteriores.setLabel(gt("Outras Instalações Exteriores"));
		outras_instalacoes_exteriores.propertie().add("name","p_outras_instalacoes_exteriores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_professores = new ListField(model,"sala_de_professores");
		sala_de_professores.setLabel(gt("Sala de professores"));
		sala_de_professores.propertie().add("name","p_sala_de_professores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		areas_de_servico = new SeparatorField(model,"areas_de_servico");
		areas_de_servico.setLabel(gt("Áreas de serviço"));
		areas_de_servico.propertie().add("name","p_areas_de_servico").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		refeitorio = new ListField(model,"refeitorio");
		refeitorio.setLabel(gt("Refeitório"));
		refeitorio.propertie().add("name","p_refeitorio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		armazemdispensa = new ListField(model,"armazemdispensa");
		armazemdispensa.setLabel(gt("Armazém/Dispensa"));
		armazemdispensa.propertie().add("name","p_armazemdispensa").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		anexosarrecadacao = new ListField(model,"anexosarrecadacao");
		anexosarrecadacao.setLabel(gt("Anexos/Arrecadação"));
		anexosarrecadacao.propertie().add("name","p_anexosarrecadacao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		escadas_e_corredores_internos = new ListField(model,"escadas_e_corredores_internos");
		escadas_e_corredores_internos.setLabel(gt("Escadas e corredores internos"));
		escadas_e_corredores_internos.propertie().add("name","p_escadas_e_corredores_internos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_banhos_para_meninos = new ListField(model,"casa_banhos_para_meninos");
		casa_banhos_para_meninos.setLabel(gt("Casa banhos para Meninos"));
		casa_banhos_para_meninos.propertie().add("name","p_casa_banhos_para_meninos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_banhos_para_meninas = new ListField(model,"casa_banhos_para_meninas");
		casa_banhos_para_meninas.setLabel(gt("Casa banhos para Meninas"));
		casa_banhos_para_meninas.propertie().add("name","p_casa_banhos_para_meninas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_banhos_para_criancas_com_deficiencias = new ListField(model,"casa_banhos_para_criancas_com_deficiencias");
		casa_banhos_para_criancas_com_deficiencias.setLabel(gt("Casa banhos para crianças com deficiências"));
		casa_banhos_para_criancas_com_deficiencias.propertie().add("name","p_casa_banhos_para_criancas_com_deficiencias").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_de_banho_para_professores = new ListField(model,"casa_de_banho_para_professores");
		casa_de_banho_para_professores.setLabel(gt("Casa de banho para professores"));
		casa_de_banho_para_professores.propertie().add("name","p_casa_de_banho_para_professores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_de_banho_para_professoras = new ListField(model,"casa_de_banho_para_professoras");
		casa_de_banho_para_professoras.setLabel(gt("Casa de banho para professoras"));
		casa_de_banho_para_professoras.propertie().add("name","p_casa_de_banho_para_professoras").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		cantina = new ListField(model,"cantina");
		cantina.setLabel(gt("Cantina"));
		cantina.propertie().add("name","p_cantina").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		cozinha = new ListField(model,"cozinha");
		cozinha.setLabel(gt("Cozinha"));
		cozinha.propertie().add("name","p_cozinha").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		areas_diversas = new SeparatorField(model,"areas_diversas");
		areas_diversas.setLabel(gt("Áreas diversas"));
		areas_diversas.propertie().add("name","p_areas_diversas").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		rampa_de_acesso = new ListField(model,"rampa_de_acesso");
		rampa_de_acesso.setLabel(gt("Rampa de acesso"));
		rampa_de_acesso.propertie().add("name","p_rampa_de_acesso").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		acesso_automovel = new ListField(model,"acesso_automovel");
		acesso_automovel.setLabel(gt("Acesso Automóvel"));
		acesso_automovel.propertie().add("name","p_acesso_automovel").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		acesso_pedonal = new ListField(model,"acesso_pedonal");
		acesso_pedonal.setLabel(gt("Acesso pedonal"));
		acesso_pedonal.propertie().add("name","p_acesso_pedonal").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sistema_de_rega = new ListField(model,"sistema_de_rega");
		sistema_de_rega.setLabel(gt("Sistema de Rega"));
		sistema_de_rega.propertie().add("name","p_sistema_de_rega").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		muro_de_vedacao = new ListField(model,"muro_de_vedacao");
		muro_de_vedacao.setLabel(gt("Muro de vedação"));
		muro_de_vedacao.propertie().add("name","p_muro_de_vedacao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		patio_da_escola = new ListField(model,"patio_da_escola");
		patio_da_escola.setLabel(gt("Pátio da escola"));
		patio_da_escola.propertie().add("name","p_patio_da_escola").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		canteiros_floridos = new ListField(model,"canteiros_floridos");
		canteiros_floridos.setLabel(gt("Canteiros floridos"));
		canteiros_floridos.propertie().add("name","p_canteiros_floridos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		parque_automovel = new ListField(model,"parque_automovel");
		parque_automovel.setLabel(gt("Parque automóvel"));
		parque_automovel.propertie().add("name","p_parque_automovel").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		


		btn_guardar_seguimento = new IGRPButton("Guardar","sgie","Detalhes_seguimento","guardar_seguimento","submit_ajax","primary|fa-check","","");
		btn_guardar_seguimento.propertie.add("id","button_e3e2_5574").add("type","form").add("class","primary").add("rel","guardar_seguimento").add("refresh_components","form_seguimento");

		
	}
		
	@Override
	public void render(){
		
		form_seguimento.addField(areas_adminstrativas_e_didaticas);
		form_seguimento.addField(direcao);
		form_seguimento.addField(secretaria);
		form_seguimento.addField(biblioteca);
		form_seguimento.addField(ginasio);
		form_seguimento.addField(laboratorio_informatico);
		form_seguimento.addField(laboratorio_biologia);
		form_seguimento.addField(laboratorio_quimicafisica);
		form_seguimento.addField(sala_multimedia);
		form_seguimento.addField(reprografia);
		form_seguimento.addField(club_ecologico);
		form_seguimento.addField(sala_de_leitura);
		form_seguimento.addField(oficina_de_artes_graficas);
		form_seguimento.addField(centros_de_recursos);
		form_seguimento.addField(laboratorio_de_lingua_portuguesa);
		form_seguimento.addField(laboratorio_de_lingua_inglesa);
		form_seguimento.addField(laboratorio_de_lingua_francesa);
		form_seguimento.addField(oficina_de_eletrotecnica_eletronica);
		form_seguimento.addField(oficina_de_mecanica);
		form_seguimento.addField(oficina_de_informatica);
		form_seguimento.addField(papelaria);
		form_seguimento.addField(anfiteatroauditorio);
		form_seguimento.addField(oficina_de_soldaduraconstrucao_metalica);
		form_seguimento.addField(sala_de_associacao_de_alunos);
		form_seguimento.addField(salas_especificas);
		form_seguimento.addField(oficina_de_construcao_civil);
		form_seguimento.addField(outros_espacos);
		form_seguimento.addField(campos_de_voleibol);
		form_seguimento.addField(campos_de_futebol);
		form_seguimento.addField(campos_de_basquetebol);
		form_seguimento.addField(pavilhao_polivalente_exterior);
		form_seguimento.addField(pavilhao_interior);
		form_seguimento.addField(placa_desportiva);
		form_seguimento.addField(outras_instalacoes_exteriores);
		form_seguimento.addField(sala_de_professores);
		form_seguimento.addField(areas_de_servico);
		form_seguimento.addField(refeitorio);
		form_seguimento.addField(armazemdispensa);
		form_seguimento.addField(anexosarrecadacao);
		form_seguimento.addField(escadas_e_corredores_internos);
		form_seguimento.addField(casa_banhos_para_meninos);
		form_seguimento.addField(casa_banhos_para_meninas);
		form_seguimento.addField(casa_banhos_para_criancas_com_deficiencias);
		form_seguimento.addField(casa_de_banho_para_professores);
		form_seguimento.addField(casa_de_banho_para_professoras);
		form_seguimento.addField(cantina);
		form_seguimento.addField(cozinha);
		form_seguimento.addField(areas_diversas);
		form_seguimento.addField(rampa_de_acesso);
		form_seguimento.addField(acesso_automovel);
		form_seguimento.addField(acesso_pedonal);
		form_seguimento.addField(sistema_de_rega);
		form_seguimento.addField(muro_de_vedacao);
		form_seguimento.addField(patio_da_escola);
		form_seguimento.addField(canteiros_floridos);
		form_seguimento.addField(parque_automovel);

		form_seguimento.addButton(btn_guardar_seguimento);
		this.addToPage(form_seguimento);
	}
		
	@Override
	public void setModel(Model model) {
		
		areas_adminstrativas_e_didaticas.setValue(model);
		direcao.setValue(model);
		secretaria.setValue(model);
		biblioteca.setValue(model);
		ginasio.setValue(model);
		laboratorio_informatico.setValue(model);
		laboratorio_biologia.setValue(model);
		laboratorio_quimicafisica.setValue(model);
		sala_multimedia.setValue(model);
		reprografia.setValue(model);
		club_ecologico.setValue(model);
		sala_de_leitura.setValue(model);
		oficina_de_artes_graficas.setValue(model);
		centros_de_recursos.setValue(model);
		laboratorio_de_lingua_portuguesa.setValue(model);
		laboratorio_de_lingua_inglesa.setValue(model);
		laboratorio_de_lingua_francesa.setValue(model);
		oficina_de_eletrotecnica_eletronica.setValue(model);
		oficina_de_mecanica.setValue(model);
		oficina_de_informatica.setValue(model);
		papelaria.setValue(model);
		anfiteatroauditorio.setValue(model);
		oficina_de_soldaduraconstrucao_metalica.setValue(model);
		sala_de_associacao_de_alunos.setValue(model);
		salas_especificas.setValue(model);
		oficina_de_construcao_civil.setValue(model);
		outros_espacos.setValue(model);
		campos_de_voleibol.setValue(model);
		campos_de_futebol.setValue(model);
		campos_de_basquetebol.setValue(model);
		pavilhao_polivalente_exterior.setValue(model);
		pavilhao_interior.setValue(model);
		placa_desportiva.setValue(model);
		outras_instalacoes_exteriores.setValue(model);
		sala_de_professores.setValue(model);
		areas_de_servico.setValue(model);
		refeitorio.setValue(model);
		armazemdispensa.setValue(model);
		anexosarrecadacao.setValue(model);
		escadas_e_corredores_internos.setValue(model);
		casa_banhos_para_meninos.setValue(model);
		casa_banhos_para_meninas.setValue(model);
		casa_banhos_para_criancas_com_deficiencias.setValue(model);
		casa_de_banho_para_professores.setValue(model);
		casa_de_banho_para_professoras.setValue(model);
		cantina.setValue(model);
		cozinha.setValue(model);
		areas_diversas.setValue(model);
		rampa_de_acesso.setValue(model);
		acesso_automovel.setValue(model);
		acesso_pedonal.setValue(model);
		sistema_de_rega.setValue(model);
		muro_de_vedacao.setValue(model);
		patio_da_escola.setValue(model);
		canteiros_floridos.setValue(model);
		parque_automovel.setValue(model);	

		}
}
