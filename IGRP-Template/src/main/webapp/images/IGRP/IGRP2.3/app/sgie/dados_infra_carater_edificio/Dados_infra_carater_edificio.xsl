<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-ac7316a7"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/form_caraterizacao_edificios"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_caraterizacao_edificios"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_caraterizacao_edificios/fields"/><xsl:if test="rows/content/form_caraterizacao_edificios/fields/altura_total_do_edificio"><div class="form-group col-sm-3   gen-fields-holder" item-name="altura_total_do_edificio" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/altura_total_do_edificio/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/altura_total_do_edificio/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/altura_total_do_edificio/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/altura_total_do_edificio/@name}" name="{rows/content/form_caraterizacao_edificios/fields/altura_total_do_edificio/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/altura_total_do_edificio"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/area_bruta"><div class="form-group col-sm-3   gen-fields-holder" item-name="area_bruta" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/area_bruta/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/area_bruta/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/area_bruta/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/area_bruta/@name}" name="{rows/content/form_caraterizacao_edificios/fields/area_bruta/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/area_bruta"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/decada_de_construcao"><div class="form-group col-sm-3   gen-fields-holder" item-name="decada_de_construcao" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/decada_de_construcao/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/decada_de_construcao/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/decada_de_construcao/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/decada_de_construcao/@name}" name="{rows/content/form_caraterizacao_edificios/fields/decada_de_construcao/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/decada_de_construcao"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/guarita_de_porteiro"><div class="col-sm-3 form-group  gen-fields-holder" item-name="guarita_de_porteiro" item-type="select"><label for="{rows/content/form_caraterizacao_edificios/fields/guarita_de_porteiro/@name}"><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/guarita_de_porteiro/label"/></label><select class="form-control select2  " id="form_caraterizacao_edificios_guarita_de_porteiro" name="{rows/content/form_caraterizacao_edificios/fields/guarita_de_porteiro/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/guarita_de_porteiro"/></xsl:call-template><xsl:for-each select="rows/content/form_caraterizacao_edificios/fields/guarita_de_porteiro/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/ano_de_construcao_"><div class="form-group col-sm-3   gen-fields-holder" item-name="ano_de_construcao_" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/ano_de_construcao_/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/ano_de_construcao_/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/ano_de_construcao_/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/ano_de_construcao_/@name}" name="{rows/content/form_caraterizacao_edificios/fields/ano_de_construcao_/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/ano_de_construcao_"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/pisos_abaixo_do_solo"><div class="form-group col-sm-3   gen-fields-holder" item-name="pisos_abaixo_do_solo" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/pisos_abaixo_do_solo/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/pisos_abaixo_do_solo/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/pisos_abaixo_do_solo/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/pisos_abaixo_do_solo/@name}" name="{rows/content/form_caraterizacao_edificios/fields/pisos_abaixo_do_solo/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/pisos_abaixo_do_solo"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/pisos_acima_do_solo"><div class="form-group col-sm-3   gen-fields-holder" item-name="pisos_acima_do_solo" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/pisos_acima_do_solo/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/pisos_acima_do_solo/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/pisos_acima_do_solo/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/pisos_acima_do_solo/@name}" name="{rows/content/form_caraterizacao_edificios/fields/pisos_acima_do_solo/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/pisos_acima_do_solo"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/ano_da_ultima_restruturacao"><div class="form-group col-sm-3   gen-fields-holder" item-name="ano_da_ultima_restruturacao" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/ano_da_ultima_restruturacao/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/ano_da_ultima_restruturacao/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/ano_da_ultima_restruturacao/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/ano_da_ultima_restruturacao/@name}" name="{rows/content/form_caraterizacao_edificios/fields/ano_da_ultima_restruturacao/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/ano_da_ultima_restruturacao"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/nome_da_empresaconsorcio_executor_obra"><div class="form-group col-sm-3   gen-fields-holder" item-name="nome_da_empresaconsorcio_executor_obra" item-type="text"><label for="{rows/content/form_caraterizacao_edificios/fields/nome_da_empresaconsorcio_executor_obra/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/nome_da_empresaconsorcio_executor_obra/label"/></span></label><input type="text" value="{rows/content/form_caraterizacao_edificios/fields/nome_da_empresaconsorcio_executor_obra/value}" class="form-control  " inputmask="" id="{rows/content/form_caraterizacao_edificios/fields/nome_da_empresaconsorcio_executor_obra/@name}" name="{rows/content/form_caraterizacao_edificios/fields/nome_da_empresaconsorcio_executor_obra/@name}" disablehtml="true" maxlength="250" placeholder="{rows/content/form_caraterizacao_edificios/fields/nome_da_empresaconsorcio_executor_obra/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/nome_da_empresaconsorcio_executor_obra"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/telefone_da_empresaconsorcio_"><div class="form-group col-sm-3   gen-fields-holder" item-name="telefone_da_empresaconsorcio_" item-type="text"><label for="{rows/content/form_caraterizacao_edificios/fields/telefone_da_empresaconsorcio_/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/telefone_da_empresaconsorcio_/label"/></span></label><input type="text" value="{rows/content/form_caraterizacao_edificios/fields/telefone_da_empresaconsorcio_/value}" class="form-control  " inputmask="" id="{rows/content/form_caraterizacao_edificios/fields/telefone_da_empresaconsorcio_/@name}" name="{rows/content/form_caraterizacao_edificios/fields/telefone_da_empresaconsorcio_/@name}" disablehtml="true" maxlength="250" placeholder="{rows/content/form_caraterizacao_edificios/fields/telefone_da_empresaconsorcio_/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/telefone_da_empresaconsorcio_"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/morada_da_empresaconsorcio"><div class="form-group col-sm-3   gen-fields-holder" item-name="morada_da_empresaconsorcio" item-type="text"><label for="{rows/content/form_caraterizacao_edificios/fields/morada_da_empresaconsorcio/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/morada_da_empresaconsorcio/label"/></span></label><input type="text" value="{rows/content/form_caraterizacao_edificios/fields/morada_da_empresaconsorcio/value}" class="form-control  " inputmask="" id="{rows/content/form_caraterizacao_edificios/fields/morada_da_empresaconsorcio/@name}" name="{rows/content/form_caraterizacao_edificios/fields/morada_da_empresaconsorcio/@name}" disablehtml="true" maxlength="250" placeholder="{rows/content/form_caraterizacao_edificios/fields/morada_da_empresaconsorcio/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/morada_da_empresaconsorcio"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/email_da_empresaconsorcio"><div class="form-group col-sm-3   gen-fields-holder" item-name="email_da_empresaconsorcio" item-type="email"><label for="{rows/content/form_caraterizacao_edificios/fields/email_da_empresaconsorcio/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/email_da_empresaconsorcio/label"/></span></label><input type="email" value="{rows/content/form_caraterizacao_edificios/fields/email_da_empresaconsorcio/value}" class="form-control  " inputmask="" id="{rows/content/form_caraterizacao_edificios/fields/email_da_empresaconsorcio/@name}" name="{rows/content/form_caraterizacao_edificios/fields/email_da_empresaconsorcio/@name}" maxlength="250" placeholder="{rows/content/form_caraterizacao_edificios/fields/email_da_empresaconsorcio/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/email_da_empresaconsorcio"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/volumetria"><div class="form-group col-sm-3   gen-fields-holder" item-name="volumetria" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/volumetria/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/volumetria/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/volumetria/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/volumetria/@name}" name="{rows/content/form_caraterizacao_edificios/fields/volumetria/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/volumetria"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/area_total_de_lote"><div class="form-group col-sm-3   gen-fields-holder" item-name="area_total_de_lote" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/area_total_de_lote/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/area_total_de_lote/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/area_total_de_lote/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/area_total_de_lote/@name}" name="{rows/content/form_caraterizacao_edificios/fields/area_total_de_lote/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/area_total_de_lote"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_caraterizacao_edificios/fields/numero_de_lugares_estacionamento"><div class="form-group col-sm-3   gen-fields-holder" item-name="numero_de_lugares_estacionamento" item-type="number"><label for="{rows/content/form_caraterizacao_edificios/fields/numero_de_lugares_estacionamento/@name}"><span><xsl:value-of select="rows/content/form_caraterizacao_edificios/fields/numero_de_lugares_estacionamento/label"/></span></label><input type="number" value="{rows/content/form_caraterizacao_edificios/fields/numero_de_lugares_estacionamento/value}" min="" max="" class="form-control  " id="{rows/content/form_caraterizacao_edificios/fields/numero_de_lugares_estacionamento/@name}" name="{rows/content/form_caraterizacao_edificios/fields/numero_de_lugares_estacionamento/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_caraterizacao_edificios/fields/numero_de_lugares_estacionamento"/></xsl:call-template></input></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_caraterizacao_edificios/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/inputmask/jquery.inputmask.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/inputmask/igrp.inputmask.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=18"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=18"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=18"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=18"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=18"/></xsl:stylesheet>
