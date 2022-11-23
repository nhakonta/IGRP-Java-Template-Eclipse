package nosi.webapps.sgie.pages.dados_infra_carater_interior;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dados_infra_carater_interiorView extends View {

	public Field muro_de_vedacao;
	public Field patio_da_escola;
	public Field rampa_de_acesso;
	public Field cozinha;
	public Field dispensa_armazem;
	public Field placa_desportiva;
	public Field ginasio;
	public Field casa_de_banho;
	public Field laboratorio_informatico;
	public Field laboratorio_biologia;
	public Field laboratorio_quimicafisica;
	public Field sala_multimedia;
	public Field biblioteca;
	public Field cantina;
	public Field club_ecologico;
	public Field centros_de_recursos;
	public Field laboratorio_de_lingua;
	public Field sala_de_professores;
	public Field secretaria;
	public Field anfiteatro;
	public Field direcao;
	public Field reprografia;
	public Field sala_de_leitura;
	public Field oficina_de_mecanica;
	public Field oficina_de_eletrotecnica_eletronica;
	public Field oficina_de_construcao_civil;
	public Field oficina_de_artes_graficas;
	public Field oficina_de_informatica;
	public Field oficina_de_soldaduraconstrucao_metalica;
	public Field sala_de_associacao_de_alunos;
	public Field papelaria;
	public Field salas_especificas;
	public Field outros_espacos;
	public Field esc_id;
	public IGRPForm form_carater_espaco_interior;

	public IGRPButton btn_atualizar_dados_carat_esp_interior;

	public Dados_infra_carater_interiorView(){

		this.setPageTitle("Dados infra carater interior");
			
		form_carater_espaco_interior = new IGRPForm("form_carater_espaco_interior","");

		muro_de_vedacao = new ListField(model,"muro_de_vedacao");
		muro_de_vedacao.setLabel(gt("Muro de vedação"));
		muro_de_vedacao.propertie().add("name","p_muro_de_vedacao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		patio_da_escola = new ListField(model,"patio_da_escola");
		patio_da_escola.setLabel(gt("Pátio da escola"));
		patio_da_escola.propertie().add("name","p_patio_da_escola").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		rampa_de_acesso = new ListField(model,"rampa_de_acesso");
		rampa_de_acesso.setLabel(gt("Rampa de acesso"));
		rampa_de_acesso.propertie().add("name","p_rampa_de_acesso").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		cozinha = new ListField(model,"cozinha");
		cozinha.setLabel(gt("Cozinha"));
		cozinha.propertie().add("name","p_cozinha").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		dispensa_armazem = new ListField(model,"dispensa_armazem");
		dispensa_armazem.setLabel(gt("Dispensa/ armazém"));
		dispensa_armazem.propertie().add("name","p_dispensa_armazem").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		placa_desportiva = new ListField(model,"placa_desportiva");
		placa_desportiva.setLabel(gt("Placa desportiva"));
		placa_desportiva.propertie().add("name","p_placa_desportiva").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		ginasio = new ListField(model,"ginasio");
		ginasio.setLabel(gt("Ginásio"));
		ginasio.propertie().add("name","p_ginasio").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		casa_de_banho = new ListField(model,"casa_de_banho");
		casa_de_banho.setLabel(gt("Casa de banho"));
		casa_de_banho.propertie().add("name","p_casa_de_banho").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
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
		
		biblioteca = new ListField(model,"biblioteca");
		biblioteca.setLabel(gt("Biblioteca"));
		biblioteca.propertie().add("name","p_biblioteca").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		cantina = new ListField(model,"cantina");
		cantina.setLabel(gt("Cantina"));
		cantina.propertie().add("name","p_cantina").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		club_ecologico = new ListField(model,"club_ecologico");
		club_ecologico.setLabel(gt("Club ecológico"));
		club_ecologico.propertie().add("name","p_club_ecologico").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		centros_de_recursos = new ListField(model,"centros_de_recursos");
		centros_de_recursos.setLabel(gt("Centros de recursos"));
		centros_de_recursos.propertie().add("name","p_centros_de_recursos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		laboratorio_de_lingua = new ListField(model,"laboratorio_de_lingua");
		laboratorio_de_lingua.setLabel(gt("Laboratório de língua"));
		laboratorio_de_lingua.propertie().add("name","p_laboratorio_de_lingua").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_professores = new ListField(model,"sala_de_professores");
		sala_de_professores.setLabel(gt("Sala de professores"));
		sala_de_professores.propertie().add("name","p_sala_de_professores").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		secretaria = new ListField(model,"secretaria");
		secretaria.setLabel(gt("Secretaria"));
		secretaria.propertie().add("name","p_secretaria").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		anfiteatro = new ListField(model,"anfiteatro");
		anfiteatro.setLabel(gt("Anfiteatro"));
		anfiteatro.propertie().add("name","p_anfiteatro").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		direcao = new ListField(model,"direcao");
		direcao.setLabel(gt("Direção"));
		direcao.propertie().add("name","p_direcao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		reprografia = new ListField(model,"reprografia");
		reprografia.setLabel(gt("Reprografia"));
		reprografia.propertie().add("name","p_reprografia").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_leitura = new ListField(model,"sala_de_leitura");
		sala_de_leitura.setLabel(gt("Sala de leitura"));
		sala_de_leitura.propertie().add("name","p_sala_de_leitura").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_mecanica = new ListField(model,"oficina_de_mecanica");
		oficina_de_mecanica.setLabel(gt("Oficina de mecânica"));
		oficina_de_mecanica.propertie().add("name","p_oficina_de_mecanica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_eletrotecnica_eletronica = new ListField(model,"oficina_de_eletrotecnica_eletronica");
		oficina_de_eletrotecnica_eletronica.setLabel(gt("Oficina de eletrotécnica /eletrónica"));
		oficina_de_eletrotecnica_eletronica.propertie().add("name","p_oficina_de_eletrotecnica_eletronica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_construcao_civil = new ListField(model,"oficina_de_construcao_civil");
		oficina_de_construcao_civil.setLabel(gt("Oficina de construção civil"));
		oficina_de_construcao_civil.propertie().add("name","p_oficina_de_construcao_civil").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_artes_graficas = new ListField(model,"oficina_de_artes_graficas");
		oficina_de_artes_graficas.setLabel(gt("Oficina de artes gráficas"));
		oficina_de_artes_graficas.propertie().add("name","p_oficina_de_artes_graficas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_informatica = new ListField(model,"oficina_de_informatica");
		oficina_de_informatica.setLabel(gt("Oficina de informática"));
		oficina_de_informatica.propertie().add("name","p_oficina_de_informatica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		oficina_de_soldaduraconstrucao_metalica = new ListField(model,"oficina_de_soldaduraconstrucao_metalica");
		oficina_de_soldaduraconstrucao_metalica.setLabel(gt("Oficina de soldadura/construção Metálica"));
		oficina_de_soldaduraconstrucao_metalica.propertie().add("name","p_oficina_de_soldaduraconstrucao_metalica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sala_de_associacao_de_alunos = new ListField(model,"sala_de_associacao_de_alunos");
		sala_de_associacao_de_alunos.setLabel(gt("Sala de associação de alunos"));
		sala_de_associacao_de_alunos.propertie().add("name","p_sala_de_associacao_de_alunos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		papelaria = new ListField(model,"papelaria");
		papelaria.setLabel(gt("Papelaria"));
		papelaria.propertie().add("name","p_papelaria").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		salas_especificas = new ListField(model,"salas_especificas");
		salas_especificas.setLabel(gt("Salas específicas"));
		salas_especificas.propertie().add("name","p_salas_especificas").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		outros_espacos = new ListField(model,"outros_espacos");
		outros_espacos.setLabel(gt("Outros espaços"));
		outros_espacos.propertie().add("name","p_outros_espacos").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		esc_id = new HiddenField(model,"esc_id");
		esc_id.setLabel(gt(""));
		esc_id.propertie().add("name","p_esc_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","esc_id");
		


		btn_atualizar_dados_carat_esp_interior = new IGRPButton("Atualizar Dados","sgie","Dados_infra_carater_interior","atualizar_dados_carat_esp_interior","submit_ajax","primary|fa-refresh","","");
		btn_atualizar_dados_carat_esp_interior.propertie.add("id","button_e3e2_5574").add("type","form").add("class","primary").add("rel","atualizar_dados_carat_esp_interior").add("refresh_components","form_carater_espaco_interior");

		
	}
		
	@Override
	public void render(){
		
		form_carater_espaco_interior.addField(muro_de_vedacao);
		form_carater_espaco_interior.addField(patio_da_escola);
		form_carater_espaco_interior.addField(rampa_de_acesso);
		form_carater_espaco_interior.addField(cozinha);
		form_carater_espaco_interior.addField(dispensa_armazem);
		form_carater_espaco_interior.addField(placa_desportiva);
		form_carater_espaco_interior.addField(ginasio);
		form_carater_espaco_interior.addField(casa_de_banho);
		form_carater_espaco_interior.addField(laboratorio_informatico);
		form_carater_espaco_interior.addField(laboratorio_biologia);
		form_carater_espaco_interior.addField(laboratorio_quimicafisica);
		form_carater_espaco_interior.addField(sala_multimedia);
		form_carater_espaco_interior.addField(biblioteca);
		form_carater_espaco_interior.addField(cantina);
		form_carater_espaco_interior.addField(club_ecologico);
		form_carater_espaco_interior.addField(centros_de_recursos);
		form_carater_espaco_interior.addField(laboratorio_de_lingua);
		form_carater_espaco_interior.addField(sala_de_professores);
		form_carater_espaco_interior.addField(secretaria);
		form_carater_espaco_interior.addField(anfiteatro);
		form_carater_espaco_interior.addField(direcao);
		form_carater_espaco_interior.addField(reprografia);
		form_carater_espaco_interior.addField(sala_de_leitura);
		form_carater_espaco_interior.addField(oficina_de_mecanica);
		form_carater_espaco_interior.addField(oficina_de_eletrotecnica_eletronica);
		form_carater_espaco_interior.addField(oficina_de_construcao_civil);
		form_carater_espaco_interior.addField(oficina_de_artes_graficas);
		form_carater_espaco_interior.addField(oficina_de_informatica);
		form_carater_espaco_interior.addField(oficina_de_soldaduraconstrucao_metalica);
		form_carater_espaco_interior.addField(sala_de_associacao_de_alunos);
		form_carater_espaco_interior.addField(papelaria);
		form_carater_espaco_interior.addField(salas_especificas);
		form_carater_espaco_interior.addField(outros_espacos);
		form_carater_espaco_interior.addField(esc_id);

		form_carater_espaco_interior.addButton(btn_atualizar_dados_carat_esp_interior);
		this.addToPage(form_carater_espaco_interior);
	}
		
	@Override
	public void setModel(Model model) {
		
		muro_de_vedacao.setValue(model);
		patio_da_escola.setValue(model);
		rampa_de_acesso.setValue(model);
		cozinha.setValue(model);
		dispensa_armazem.setValue(model);
		placa_desportiva.setValue(model);
		ginasio.setValue(model);
		casa_de_banho.setValue(model);
		laboratorio_informatico.setValue(model);
		laboratorio_biologia.setValue(model);
		laboratorio_quimicafisica.setValue(model);
		sala_multimedia.setValue(model);
		biblioteca.setValue(model);
		cantina.setValue(model);
		club_ecologico.setValue(model);
		centros_de_recursos.setValue(model);
		laboratorio_de_lingua.setValue(model);
		sala_de_professores.setValue(model);
		secretaria.setValue(model);
		anfiteatro.setValue(model);
		direcao.setValue(model);
		reprografia.setValue(model);
		sala_de_leitura.setValue(model);
		oficina_de_mecanica.setValue(model);
		oficina_de_eletrotecnica_eletronica.setValue(model);
		oficina_de_construcao_civil.setValue(model);
		oficina_de_artes_graficas.setValue(model);
		oficina_de_informatica.setValue(model);
		oficina_de_soldaduraconstrucao_metalica.setValue(model);
		sala_de_associacao_de_alunos.setValue(model);
		papelaria.setValue(model);
		salas_especificas.setValue(model);
		outros_espacos.setValue(model);
		esc_id.setValue(model);	

		}
}
