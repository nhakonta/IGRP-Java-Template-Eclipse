<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-29f6f59e"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/estrutura"><div item-name="estrutura" class="box-head subtitle gen-fields-holder" text-color="1" style="color: white;&#10;background-color: #00c4f3;"><span><xsl:value-of select="rows/content/form_1/fields/estrutura/label"/></span></div></xsl:if><xsl:if test="rows/content/form_1/fields/insuficiencia_dos_elementos_estruturais"><div class="col-sm-3 form-group  gen-fields-holder" item-name="insuficiencia_dos_elementos_estruturais" item-type="select"><label for="{rows/content/form_1/fields/insuficiencia_dos_elementos_estruturais/@name}"><xsl:value-of select="rows/content/form_1/fields/insuficiencia_dos_elementos_estruturais/label"/></label><select class="form-control select2  " id="form_1_insuficiencia_dos_elementos_estruturais" name="{rows/content/form_1/fields/insuficiencia_dos_elementos_estruturais/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/insuficiencia_dos_elementos_estruturais"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/insuficiencia_dos_elementos_estruturais/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/alteracao_na_geometria"><div class="col-sm-3 form-group  gen-fields-holder" item-name="alteracao_na_geometria" item-type="select"><label for="{rows/content/form_1/fields/alteracao_na_geometria/@name}"><xsl:value-of select="rows/content/form_1/fields/alteracao_na_geometria/label"/></label><select class="form-control select2  " id="form_1_alteracao_na_geometria" name="{rows/content/form_1/fields/alteracao_na_geometria/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/alteracao_na_geometria"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/alteracao_na_geometria/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/fendilhacao_nas_zonas_criticas"><div class="col-sm-3 form-group  gen-fields-holder" item-name="fendilhacao_nas_zonas_criticas" item-type="select"><label for="{rows/content/form_1/fields/fendilhacao_nas_zonas_criticas/@name}"><xsl:value-of select="rows/content/form_1/fields/fendilhacao_nas_zonas_criticas/label"/></label><select class="form-control select2  " id="form_1_fendilhacao_nas_zonas_criticas" name="{rows/content/form_1/fields/fendilhacao_nas_zonas_criticas/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/fendilhacao_nas_zonas_criticas"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/fendilhacao_nas_zonas_criticas/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/armaduras_a_vista"><div class="col-sm-3 form-group  gen-fields-holder" item-name="armaduras_a_vista" item-type="select"><label for="{rows/content/form_1/fields/armaduras_a_vista/@name}"><xsl:value-of select="rows/content/form_1/fields/armaduras_a_vista/label"/></label><select class="form-control select2  " id="form_1_armaduras_a_vista" name="{rows/content/form_1/fields/armaduras_a_vista/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/armaduras_a_vista"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/armaduras_a_vista/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/elementos_corroidos"><div class="col-sm-3 form-group  gen-fields-holder" item-name="elementos_corroidos" item-type="select"><label for="{rows/content/form_1/fields/elementos_corroidos/@name}"><xsl:value-of select="rows/content/form_1/fields/elementos_corroidos/label"/></label><select class="form-control select2  " id="form_1_elementos_corroidos" name="{rows/content/form_1/fields/elementos_corroidos/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/elementos_corroidos"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/elementos_corroidos/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/falta_de_condicoes_de_seguranca"><div class="col-sm-3 form-group  gen-fields-holder" item-name="falta_de_condicoes_de_seguranca" item-type="select"><label for="{rows/content/form_1/fields/falta_de_condicoes_de_seguranca/@name}"><xsl:value-of select="rows/content/form_1/fields/falta_de_condicoes_de_seguranca/label"/></label><select class="form-control select2  " id="form_1_falta_de_condicoes_de_seguranca" name="{rows/content/form_1/fields/falta_de_condicoes_de_seguranca/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/falta_de_condicoes_de_seguranca"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/falta_de_condicoes_de_seguranca/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/paredes__pavimentos__tetos"><div item-name="paredes__pavimentos__tetos" class="box-head subtitle gen-fields-holder" text-color="1" style="color: white;&#10;background-color: #00c4f3;"><span><xsl:value-of select="rows/content/form_1/fields/paredes__pavimentos__tetos/label"/></span></div></xsl:if><xsl:if test="rows/content/form_1/fields/buracos_ou_aberturas_nas_paredes"><div class="col-sm-3 form-group  gen-fields-holder" item-name="buracos_ou_aberturas_nas_paredes" item-type="select"><label for="{rows/content/form_1/fields/buracos_ou_aberturas_nas_paredes/@name}"><xsl:value-of select="rows/content/form_1/fields/buracos_ou_aberturas_nas_paredes/label"/></label><select class="form-control select2  " id="form_1_buracos_ou_aberturas_nas_paredes" name="{rows/content/form_1/fields/buracos_ou_aberturas_nas_paredes/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/buracos_ou_aberturas_nas_paredes"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/buracos_ou_aberturas_nas_paredes/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/alteracao_na_geometria_de_paredes"><div class="col-sm-3 form-group  gen-fields-holder" item-name="alteracao_na_geometria_de_paredes" item-type="select"><label for="{rows/content/form_1/fields/alteracao_na_geometria_de_paredes/@name}"><xsl:value-of select="rows/content/form_1/fields/alteracao_na_geometria_de_paredes/label"/></label><select class="form-control select2  " id="form_1_alteracao_na_geometria_de_paredes" name="{rows/content/form_1/fields/alteracao_na_geometria_de_paredes/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/alteracao_na_geometria_de_paredes"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/alteracao_na_geometria_de_paredes/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/extensiva_deterioracao_dos_revestimentos_nas_paredes"><div class="col-sm-3 form-group  gen-fields-holder" item-name="extensiva_deterioracao_dos_revestimentos_nas_paredes" item-type="select"><label for="{rows/content/form_1/fields/extensiva_deterioracao_dos_revestimentos_nas_paredes/@name}"><xsl:value-of select="rows/content/form_1/fields/extensiva_deterioracao_dos_revestimentos_nas_paredes/label"/></label><select class="form-control select2  " id="form_1_extensiva_deterioracao_dos_revestimentos_nas_paredes" name="{rows/content/form_1/fields/extensiva_deterioracao_dos_revestimentos_nas_paredes/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/extensiva_deterioracao_dos_revestimentos_nas_paredes"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/extensiva_deterioracao_dos_revestimentos_nas_paredes/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/danos_significativos_em_partes_singulares_nas_paredes"><div class="col-sm-3 form-group  gen-fields-holder" item-name="danos_significativos_em_partes_singulares_nas_paredes" item-type="select"><label for="{rows/content/form_1/fields/danos_significativos_em_partes_singulares_nas_paredes/@name}"><xsl:value-of select="rows/content/form_1/fields/danos_significativos_em_partes_singulares_nas_paredes/label"/></label><select class="form-control select2  " id="form_1_danos_significativos_em_partes_singulares_nas_paredes" name="{rows/content/form_1/fields/danos_significativos_em_partes_singulares_nas_paredes/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/danos_significativos_em_partes_singulares_nas_paredes"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/danos_significativos_em_partes_singulares_nas_paredes/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/anomalias_indicadores_de_deterioracao_nas_paredes"><div class="col-sm-3 form-group  gen-fields-holder" item-name="anomalias_indicadores_de_deterioracao_nas_paredes" item-type="select"><label for="{rows/content/form_1/fields/anomalias_indicadores_de_deterioracao_nas_paredes/@name}"><xsl:value-of select="rows/content/form_1/fields/anomalias_indicadores_de_deterioracao_nas_paredes/label"/></label><select class="form-control select2  " id="form_1_anomalias_indicadores_de_deterioracao_nas_paredes" name="{rows/content/form_1/fields/anomalias_indicadores_de_deterioracao_nas_paredes/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/anomalias_indicadores_de_deterioracao_nas_paredes"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/anomalias_indicadores_de_deterioracao_nas_paredes/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/sinais_de_presenca_de_agua"><div class="col-sm-3 form-group  gen-fields-holder" item-name="sinais_de_presenca_de_agua" item-type="select"><label for="{rows/content/form_1/fields/sinais_de_presenca_de_agua/@name}"><xsl:value-of select="rows/content/form_1/fields/sinais_de_presenca_de_agua/label"/></label><select class="form-control select2  " id="form_1_sinais_de_presenca_de_agua" name="{rows/content/form_1/fields/sinais_de_presenca_de_agua/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/sinais_de_presenca_de_agua"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/sinais_de_presenca_de_agua/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/buracos_no_piso"><div class="col-sm-3 form-group  gen-fields-holder" item-name="buracos_no_piso" item-type="select"><label for="{rows/content/form_1/fields/buracos_no_piso/@name}"><xsl:value-of select="rows/content/form_1/fields/buracos_no_piso/label"/></label><select class="form-control select2  " id="form_1_buracos_no_piso" name="{rows/content/form_1/fields/buracos_no_piso/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/buracos_no_piso"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/buracos_no_piso/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/fissurasrachaduras"><div class="col-sm-3 form-group  gen-fields-holder" item-name="fissurasrachaduras" item-type="select"><label for="{rows/content/form_1/fields/fissurasrachaduras/@name}"><xsl:value-of select="rows/content/form_1/fields/fissurasrachaduras/label"/></label><select class="form-control select2  " id="form_1_fissurasrachaduras" name="{rows/content/form_1/fields/fissurasrachaduras/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/fissurasrachaduras"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/fissurasrachaduras/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/alteracao_na_geometria_no_pavimento"><div class="col-sm-3 form-group  gen-fields-holder" item-name="alteracao_na_geometria_no_pavimento" item-type="select"><label for="{rows/content/form_1/fields/alteracao_na_geometria_no_pavimento/@name}"><xsl:value-of select="rows/content/form_1/fields/alteracao_na_geometria_no_pavimento/label"/></label><select class="form-control select2  " id="form_1_alteracao_na_geometria_no_pavimento" name="{rows/content/form_1/fields/alteracao_na_geometria_no_pavimento/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/alteracao_na_geometria_no_pavimento"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/alteracao_na_geometria_no_pavimento/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/instalacao_eletrica"><div item-name="instalacao_eletrica" class="box-head subtitle gen-fields-holder" text-color="1" style="color: white;&#10;background-color: #00c4f3;"><span><xsl:value-of select="rows/content/form_1/fields/instalacao_eletrica/label"/></span></div></xsl:if><xsl:if test="rows/content/form_1/fields/quadro_tem_disjuntores_e_diferencial_de_protecao"><div class="col-sm-3 form-group  gen-fields-holder" item-name="quadro_tem_disjuntores_e_diferencial_de_protecao" item-type="select"><label for="{rows/content/form_1/fields/quadro_tem_disjuntores_e_diferencial_de_protecao/@name}"><xsl:value-of select="rows/content/form_1/fields/quadro_tem_disjuntores_e_diferencial_de_protecao/label"/></label><select class="form-control select2  " id="form_1_quadro_tem_disjuntores_e_diferencial_de_protecao" name="{rows/content/form_1/fields/quadro_tem_disjuntores_e_diferencial_de_protecao/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/quadro_tem_disjuntores_e_diferencial_de_protecao"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/quadro_tem_disjuntores_e_diferencial_de_protecao/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/degradacao_dos_condutores_eletricos"><div class="col-sm-3 form-group  gen-fields-holder" item-name="degradacao_dos_condutores_eletricos" item-type="select"><label for="{rows/content/form_1/fields/degradacao_dos_condutores_eletricos/@name}"><xsl:value-of select="rows/content/form_1/fields/degradacao_dos_condutores_eletricos/label"/></label><select class="form-control select2  " id="form_1_degradacao_dos_condutores_eletricos" name="{rows/content/form_1/fields/degradacao_dos_condutores_eletricos/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/degradacao_dos_condutores_eletricos"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/degradacao_dos_condutores_eletricos/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/aparelhos_em_bom_estado_tomadas_e_interruptores"><div class="col-sm-3 form-group  gen-fields-holder" item-name="aparelhos_em_bom_estado_tomadas_e_interruptores" item-type="select"><label for="{rows/content/form_1/fields/aparelhos_em_bom_estado_tomadas_e_interruptores/@name}"><xsl:value-of select="rows/content/form_1/fields/aparelhos_em_bom_estado_tomadas_e_interruptores/label"/></label><select class="form-control select2  " id="form_1_aparelhos_em_bom_estado_tomadas_e_interruptores" name="{rows/content/form_1/fields/aparelhos_em_bom_estado_tomadas_e_interruptores/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/aparelhos_em_bom_estado_tomadas_e_interruptores"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/aparelhos_em_bom_estado_tomadas_e_interruptores/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/risco_de_eletrocussao"><div class="col-sm-3 form-group  gen-fields-holder" item-name="risco_de_eletrocussao" item-type="select"><label for="{rows/content/form_1/fields/risco_de_eletrocussao/@name}"><xsl:value-of select="rows/content/form_1/fields/risco_de_eletrocussao/label"/></label><select class="form-control select2  " id="form_1_risco_de_eletrocussao" name="{rows/content/form_1/fields/risco_de_eletrocussao/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/risco_de_eletrocussao"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/risco_de_eletrocussao/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=22"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=22"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=22"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=22"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=22"/></xsl:stylesheet>
