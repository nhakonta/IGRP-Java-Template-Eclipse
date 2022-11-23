package nosi.webapps.sgie.pages.dados_infra_carater_funcional;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dados_infra_carater_funcionalView extends View {

	public Field geral;
	public Field numero_de_alunos;
	public Field numero_de_professores;
	public Field area_util;
	public Field divisoes_principais;
	public Field cozinheiras;
	public Field guardas;
	public Field pessoal_de_limpeza;
	public Field continuos;
	public Field pessoal_manutencao;
	public Field formas_de_acesso_a_escola;
	public Field areas_administrativas;
	public Field secretaria_carat_funcional;
	public Field conselho_executivo_;
	public Field areas_didaticas;
	public Field numero_de_sala_de_aulas;
	public Field biblioteca_carat_funcional;
	public Field club_ecologico_carat_funcional;
	public Field auditorio;
	public Field sala_polivalente;
	public Field ginasio_carat_funcional;
	public Field sala_de_musica;
	public Field ludoteca;
	public Field sala_de_informatica;
	public Field sala_de_professores;
	public Field sala_de_pais_;
	public Field sala_auxiliares;
	public Field vestiario_de_alunos;
	public Field sala_de_atl;
	public Field gabinete_de_apoio_;
	public Field recreio_interior;
	public Field areas_de_servico;
	public Field refeitorio;
	public Field cozinha_carat_funcional;
	public Field cozinha_equipada;
	public Field cozinha_confeciona;
	public Field armazemdispensa_carat_funcional;
	public Field anexos;
	public Field arrecadacao;
	public Field outras;
	public Field casa_banhos_para_meninos;
	public Field casa_de_banho_para_meninas;
	public Field casa_de_banho_para_professores;
	public Field casa_de_banho_para_professoras;
	public Field casa_de_banho_adaptado_para_criancas_com_nee;
	public Field o_estabelecimento_possui_instalacao_eletrica;
	public Field esc_id;
	public IGRPForm form_carater_funcional;

	public IGRPButton btn_atualizar_dados_carat_funcional;

	public Dados_infra_carater_funcionalView(){

		this.setPageTitle("Dados infra carater funcional");
			
		form_carater_funcional = new IGRPForm("form_carater_funcional","");

		geral = new SeparatorField(model,"geral");
		geral.setLabel(gt("Geral"));
		geral.propertie().add("name","p_geral").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_de_alunos = new NumberField(model,"numero_de_alunos");
		numero_de_alunos.setLabel(gt("Número de Alunos"));
		numero_de_alunos.propertie().add("name","p_numero_de_alunos").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_de_professores = new NumberField(model,"numero_de_professores");
		numero_de_professores.setLabel(gt("Número de Professores"));
		numero_de_professores.propertie().add("name","p_numero_de_professores").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		area_util = new NumberField(model,"area_util");
		area_util.setLabel(gt("Área Útil"));
		area_util.propertie().add("name","p_area_util").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		divisoes_principais = new NumberField(model,"divisoes_principais");
		divisoes_principais.setLabel(gt("Divisões Principais"));
		divisoes_principais.propertie().add("name","p_divisoes_principais").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		cozinheiras = new NumberField(model,"cozinheiras");
		cozinheiras.setLabel(gt("Cozinheiras"));
		cozinheiras.propertie().add("name","p_cozinheiras").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		guardas = new NumberField(model,"guardas");
		guardas.setLabel(gt("Guardas"));
		guardas.propertie().add("name","p_guardas").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		pessoal_de_limpeza = new NumberField(model,"pessoal_de_limpeza");
		pessoal_de_limpeza.setLabel(gt("Pessoal de limpeza"));
		pessoal_de_limpeza.propertie().add("name","p_pessoal_de_limpeza").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		continuos = new NumberField(model,"continuos");
		continuos.setLabel(gt("Contínuos"));
		continuos.propertie().add("name","p_continuos").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		pessoal_manutencao = new NumberField(model,"pessoal_manutencao");
		pessoal_manutencao.setLabel(gt("Pessoal Manutenção"));
		pessoal_manutencao.propertie().add("name","p_pessoal_manutencao").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		formas_de_acesso_a_escola = new ListField(model,"formas_de_acesso_a_escola");
		formas_de_acesso_a_escola.setLabel(gt("Formas de acesso à escola"));
		formas_de_acesso_a_escola.propertie().add("name","p_formas_de_acesso_a_escola").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		areas_administrativas = new SeparatorField(model,"areas_administrativas");
		areas_administrativas.setLabel(gt("Áreas Administrativas"));
		areas_administrativas.propertie().add("name","p_areas_administrativas").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		secretaria_carat_funcional = new ListField(model,"secretaria_carat_funcional");
		secretaria_carat_funcional.setLabel(gt("Secretaria"));
		secretaria_carat_funcional.propertie().add("name","p_secretaria_carat_funcional").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		conselho_executivo_ = new ListField(model,"conselho_executivo_");
		conselho_executivo_.setLabel(gt("Conselho Executivo "));
		conselho_executivo_.propertie().add("name","p_conselho_executivo_").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		areas_didaticas = new ListField(model,"areas_didaticas");
		areas_didaticas.setLabel(gt("Áreas Didáticas"));
		areas_didaticas.propertie().add("name","p_areas_didaticas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_de_sala_de_aulas = new NumberField(model,"numero_de_sala_de_aulas");
		numero_de_sala_de_aulas.setLabel(gt("Número de Sala de Aulas"));
		numero_de_sala_de_aulas.propertie().add("name","p_numero_de_sala_de_aulas").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		biblioteca_carat_funcional = new ListField(model,"biblioteca_carat_funcional");
		biblioteca_carat_funcional.setLabel(gt("Biblioteca"));
		biblioteca_carat_funcional.propertie().add("name","p_biblioteca_carat_funcional").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		club_ecologico_carat_funcional = new ListField(model,"club_ecologico_carat_funcional");
		club_ecologico_carat_funcional.setLabel(gt("Club ecológico"));
		club_ecologico_carat_funcional.propertie().add("name","p_club_ecologico_carat_funcional").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		auditorio = new ListField(model,"auditorio");
		auditorio.setLabel(gt("Auditório"));
		auditorio.propertie().add("name","p_auditorio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_polivalente = new ListField(model,"sala_polivalente");
		sala_polivalente.setLabel(gt("Sala Polivalente"));
		sala_polivalente.propertie().add("name","p_sala_polivalente").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		ginasio_carat_funcional = new ListField(model,"ginasio_carat_funcional");
		ginasio_carat_funcional.setLabel(gt("Ginásio"));
		ginasio_carat_funcional.propertie().add("name","p_ginasio_carat_funcional").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_musica = new ListField(model,"sala_de_musica");
		sala_de_musica.setLabel(gt("Sala de Música"));
		sala_de_musica.propertie().add("name","p_sala_de_musica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		ludoteca = new ListField(model,"ludoteca");
		ludoteca.setLabel(gt("Ludoteca"));
		ludoteca.propertie().add("name","p_ludoteca").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_informatica = new ListField(model,"sala_de_informatica");
		sala_de_informatica.setLabel(gt("Sala de Informática"));
		sala_de_informatica.propertie().add("name","p_sala_de_informatica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_professores = new ListField(model,"sala_de_professores");
		sala_de_professores.setLabel(gt("Sala de Professores"));
		sala_de_professores.propertie().add("name","p_sala_de_professores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_pais_ = new ListField(model,"sala_de_pais_");
		sala_de_pais_.setLabel(gt("Sala de Pais "));
		sala_de_pais_.propertie().add("name","p_sala_de_pais_").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_auxiliares = new ListField(model,"sala_auxiliares");
		sala_auxiliares.setLabel(gt("Sala Auxiliares"));
		sala_auxiliares.propertie().add("name","p_sala_auxiliares").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		vestiario_de_alunos = new ListField(model,"vestiario_de_alunos");
		vestiario_de_alunos.setLabel(gt("Vestiário de Alunos"));
		vestiario_de_alunos.propertie().add("name","p_vestiario_de_alunos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_atl = new ListField(model,"sala_de_atl");
		sala_de_atl.setLabel(gt("Sala de ATL"));
		sala_de_atl.propertie().add("name","p_sala_de_atl").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		gabinete_de_apoio_ = new ListField(model,"gabinete_de_apoio_");
		gabinete_de_apoio_.setLabel(gt("Gabinete de Apoio "));
		gabinete_de_apoio_.propertie().add("name","p_gabinete_de_apoio_").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		recreio_interior = new ListField(model,"recreio_interior");
		recreio_interior.setLabel(gt("Recreio Interior"));
		recreio_interior.propertie().add("name","p_recreio_interior").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		areas_de_servico = new SeparatorField(model,"areas_de_servico");
		areas_de_servico.setLabel(gt("Áreas de Serviço"));
		areas_de_servico.propertie().add("name","p_areas_de_servico").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		refeitorio = new ListField(model,"refeitorio");
		refeitorio.setLabel(gt("Refeitório"));
		refeitorio.propertie().add("name","p_refeitorio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		cozinha_carat_funcional = new ListField(model,"cozinha_carat_funcional");
		cozinha_carat_funcional.setLabel(gt("Cozinha"));
		cozinha_carat_funcional.propertie().add("name","p_cozinha_carat_funcional").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		cozinha_equipada = new ListField(model,"cozinha_equipada");
		cozinha_equipada.setLabel(gt("Cozinha equipada"));
		cozinha_equipada.propertie().add("name","p_cozinha_equipada").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		cozinha_confeciona = new ListField(model,"cozinha_confeciona");
		cozinha_confeciona.setLabel(gt("Cozinha confeciona"));
		cozinha_confeciona.propertie().add("name","p_cozinha_confeciona").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		armazemdispensa_carat_funcional = new ListField(model,"armazemdispensa_carat_funcional");
		armazemdispensa_carat_funcional.setLabel(gt("Armazém/Dispensa"));
		armazemdispensa_carat_funcional.propertie().add("name","p_armazemdispensa_carat_funcional").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		anexos = new ListField(model,"anexos");
		anexos.setLabel(gt("Anexos"));
		anexos.propertie().add("name","p_anexos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		arrecadacao = new ListField(model,"arrecadacao");
		arrecadacao.setLabel(gt("Arrecadação"));
		arrecadacao.propertie().add("name","p_arrecadacao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		outras = new ListField(model,"outras");
		outras.setLabel(gt("Outras"));
		outras.propertie().add("name","p_outras").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_banhos_para_meninos = new ListField(model,"casa_banhos_para_meninos");
		casa_banhos_para_meninos.setLabel(gt("Casa banhos para Meninos"));
		casa_banhos_para_meninos.propertie().add("name","p_casa_banhos_para_meninos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_de_banho_para_meninas = new ListField(model,"casa_de_banho_para_meninas");
		casa_de_banho_para_meninas.setLabel(gt("Casa de banho para Meninas"));
		casa_de_banho_para_meninas.propertie().add("name","p_casa_de_banho_para_meninas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_de_banho_para_professores = new ListField(model,"casa_de_banho_para_professores");
		casa_de_banho_para_professores.setLabel(gt("Casa de banho para professores"));
		casa_de_banho_para_professores.propertie().add("name","p_casa_de_banho_para_professores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_de_banho_para_professoras = new ListField(model,"casa_de_banho_para_professoras");
		casa_de_banho_para_professoras.setLabel(gt("Casa de banho para professoras"));
		casa_de_banho_para_professoras.propertie().add("name","p_casa_de_banho_para_professoras").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_de_banho_adaptado_para_criancas_com_nee = new ListField(model,"casa_de_banho_adaptado_para_criancas_com_nee");
		casa_de_banho_adaptado_para_criancas_com_nee.setLabel(gt("Casa de banho adaptado para crianças com NEE"));
		casa_de_banho_adaptado_para_criancas_com_nee.propertie().add("name","p_casa_de_banho_adaptado_para_criancas_com_nee").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		o_estabelecimento_possui_instalacao_eletrica = new ListField(model,"o_estabelecimento_possui_instalacao_eletrica");
		o_estabelecimento_possui_instalacao_eletrica.setLabel(gt("O estabelecimento possui instalação elétrica"));
		o_estabelecimento_possui_instalacao_eletrica.propertie().add("name","p_o_estabelecimento_possui_instalacao_eletrica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		esc_id = new HiddenField(model,"esc_id");
		esc_id.setLabel(gt(""));
		esc_id.propertie().add("name","p_esc_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","esc_id");
		


		btn_atualizar_dados_carat_funcional = new IGRPButton("Atualizar Dados","sgie","Dados_infra_carater_funcional","atualizar_dados_carat_funcional","submit_ajax","primary|fa-refresh","","");
		btn_atualizar_dados_carat_funcional.propertie.add("id","button_75f3_a7f0").add("type","form").add("class","primary").add("rel","atualizar_dados_carat_funcional").add("refresh_components","form_carater_funcional");

		
	}
		
	@Override
	public void render(){
		
		form_carater_funcional.addField(geral);
		form_carater_funcional.addField(numero_de_alunos);
		form_carater_funcional.addField(numero_de_professores);
		form_carater_funcional.addField(area_util);
		form_carater_funcional.addField(divisoes_principais);
		form_carater_funcional.addField(cozinheiras);
		form_carater_funcional.addField(guardas);
		form_carater_funcional.addField(pessoal_de_limpeza);
		form_carater_funcional.addField(continuos);
		form_carater_funcional.addField(pessoal_manutencao);
		form_carater_funcional.addField(formas_de_acesso_a_escola);
		form_carater_funcional.addField(areas_administrativas);
		form_carater_funcional.addField(secretaria_carat_funcional);
		form_carater_funcional.addField(conselho_executivo_);
		form_carater_funcional.addField(areas_didaticas);
		form_carater_funcional.addField(numero_de_sala_de_aulas);
		form_carater_funcional.addField(biblioteca_carat_funcional);
		form_carater_funcional.addField(club_ecologico_carat_funcional);
		form_carater_funcional.addField(auditorio);
		form_carater_funcional.addField(sala_polivalente);
		form_carater_funcional.addField(ginasio_carat_funcional);
		form_carater_funcional.addField(sala_de_musica);
		form_carater_funcional.addField(ludoteca);
		form_carater_funcional.addField(sala_de_informatica);
		form_carater_funcional.addField(sala_de_professores);
		form_carater_funcional.addField(sala_de_pais_);
		form_carater_funcional.addField(sala_auxiliares);
		form_carater_funcional.addField(vestiario_de_alunos);
		form_carater_funcional.addField(sala_de_atl);
		form_carater_funcional.addField(gabinete_de_apoio_);
		form_carater_funcional.addField(recreio_interior);
		form_carater_funcional.addField(areas_de_servico);
		form_carater_funcional.addField(refeitorio);
		form_carater_funcional.addField(cozinha_carat_funcional);
		form_carater_funcional.addField(cozinha_equipada);
		form_carater_funcional.addField(cozinha_confeciona);
		form_carater_funcional.addField(armazemdispensa_carat_funcional);
		form_carater_funcional.addField(anexos);
		form_carater_funcional.addField(arrecadacao);
		form_carater_funcional.addField(outras);
		form_carater_funcional.addField(casa_banhos_para_meninos);
		form_carater_funcional.addField(casa_de_banho_para_meninas);
		form_carater_funcional.addField(casa_de_banho_para_professores);
		form_carater_funcional.addField(casa_de_banho_para_professoras);
		form_carater_funcional.addField(casa_de_banho_adaptado_para_criancas_com_nee);
		form_carater_funcional.addField(o_estabelecimento_possui_instalacao_eletrica);
		form_carater_funcional.addField(esc_id);

		form_carater_funcional.addButton(btn_atualizar_dados_carat_funcional);
		this.addToPage(form_carater_funcional);
	}
		
	@Override
	public void setModel(Model model) {
		
		geral.setValue(model);
		numero_de_alunos.setValue(model);
		numero_de_professores.setValue(model);
		area_util.setValue(model);
		divisoes_principais.setValue(model);
		cozinheiras.setValue(model);
		guardas.setValue(model);
		pessoal_de_limpeza.setValue(model);
		continuos.setValue(model);
		pessoal_manutencao.setValue(model);
		formas_de_acesso_a_escola.setValue(model);
		areas_administrativas.setValue(model);
		secretaria_carat_funcional.setValue(model);
		conselho_executivo_.setValue(model);
		areas_didaticas.setValue(model);
		numero_de_sala_de_aulas.setValue(model);
		biblioteca_carat_funcional.setValue(model);
		club_ecologico_carat_funcional.setValue(model);
		auditorio.setValue(model);
		sala_polivalente.setValue(model);
		ginasio_carat_funcional.setValue(model);
		sala_de_musica.setValue(model);
		ludoteca.setValue(model);
		sala_de_informatica.setValue(model);
		sala_de_professores.setValue(model);
		sala_de_pais_.setValue(model);
		sala_auxiliares.setValue(model);
		vestiario_de_alunos.setValue(model);
		sala_de_atl.setValue(model);
		gabinete_de_apoio_.setValue(model);
		recreio_interior.setValue(model);
		areas_de_servico.setValue(model);
		refeitorio.setValue(model);
		cozinha_carat_funcional.setValue(model);
		cozinha_equipada.setValue(model);
		cozinha_confeciona.setValue(model);
		armazemdispensa_carat_funcional.setValue(model);
		anexos.setValue(model);
		arrecadacao.setValue(model);
		outras.setValue(model);
		casa_banhos_para_meninos.setValue(model);
		casa_de_banho_para_meninas.setValue(model);
		casa_de_banho_para_professores.setValue(model);
		casa_de_banho_para_professoras.setValue(model);
		casa_de_banho_adaptado_para_criancas_com_nee.setValue(model);
		o_estabelecimento_possui_instalacao_eletrica.setValue(model);
		esc_id.setValue(model);	

		}
}
