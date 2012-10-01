<?xml version="1.0" encoding="Shift_JIS"?>
<!-- 
	XSLT Style Sheet for Ronpro Text
	This sheet can transfer  "Ronpro Text" to "SmartDoc Text".
	
	2011/06/09
	
	Transfom Command is the following:	
	java org.apache.xalan.xslt.Process -in [IN_FILE] -xsl [THIS_FILE] -out [OUT_FILE]
	!! is no longer unavailable !!
	
	Copyright(c) 2007-2011 Yoshiaki Matsuzawa
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	
	<!-- �e�L�X�g�f�[�^�݂̂ŁA�^�O��CDATA�ɂ��Ă���Ȃ��炵�� -->
	<!-- <xsl:output cdata-section-elements="native"/> -->
	
	<!-- imports -->
	<xsl:import href="copy.xsl"/>
	<xsl:import href="section.xsl"/>
	<xsl:import href="pageformat.xsl"/>
	<xsl:import href="longtable.xsl"/>
	<xsl:import href="hcp.xsl"/>
	<xsl:import href="uml.xsl"/>
	<xsl:import href="text.xsl"/>
	
	<!-- ##################################################
							���i (src�t�H���_����)
	####################################################### -->
		
	<xsl:template name="ronpro.applet.source" priority="0.0">
		<xsl:element name="program">
        	<xsl:attribute name="title"><xsl:value-of select="./@class"/>.java</xsl:attribute>        
        	<xsl:attribute name="id">src:<xsl:value-of select="./@class"/></xsl:attribute>
        	<xsl:attribute name="src">src/<xsl:value-of select="./@class"/>.java</xsl:attribute>        
        	<xsl:attribute name="javasrcSyntaxHilight">true</xsl:attribute>
        	<xsl:attribute name="normalizer">line, javasrc</xsl:attribute>
        	<xsl:attribute name="encoding">Shift_JIS</xsl:attribute> 
		</xsl:element>		
	</xsl:template>
	
	<xsl:template name="ronpro.applet.download" priority="0.0">
		<xsl:element name="p">
			<xsl:element name="a">
        		<xsl:attribute name="href"><xsl:value-of select="./@chapter"/>/src/<xsl:value-of select="./@class"/>.java</xsl:attribute>
        		����
			</xsl:element>
			���N���b�N����ƁA�v���O�������_�E�����[�h�ł��܂��B
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="ronpro.applet.applet" priority="0.0">
		<xsl:param name="postfix"></xsl:param>
		<xsl:element name="p">
			���̃{�^���������ƁA<xsl:value-of select="./@class"/>�v���O���������s�ł��܂��B
		</xsl:element>
		<xsl:element name="native">
			<xsl:attribute name="format">html4</xsl:attribute>  
			<xsl:text disable-output-escaping="yes">&lt;![CDATA[</xsl:text>
			<xsl:element name="applet">
        		<xsl:attribute name="code">TurtleLaunchApplet</xsl:attribute>  
        		<xsl:attribute name="archive"><xsl:value-of select="./@chapter"/>_binary.jar,blib.jar</xsl:attribute>
        		<xsl:attribute name="width">200</xsl:attribute>
		       	<xsl:attribute name="height">38</xsl:attribute>        
				<xsl:element name="param">
	       			<xsl:attribute name="name">Turtle</xsl:attribute>
	       			<xsl:attribute name="value"><xsl:value-of select="./@class"/><xsl:value-of select="$postfix"/></xsl:attribute>  
				</xsl:element>
			</xsl:element>	
			<xsl:text disable-output-escaping="yes">]]&gt;</xsl:text>
		</xsl:element>
	</xsl:template>

	<!-- ##################################################
							�e���v���[�g
	####################################################### -->
	
	<!-- �A�v���b�g�t�̃^�[�g���\�[�X���o�͂��� -->
    <xsl:template match="text.turtle.src" priority="0.0">
		<xsl:call-template name="ronpro.applet.source"/>
	</xsl:template>	
	
	<!-- �A�v���b�g�t�̃^�[�g���\�[�X���o�͂��� -->
    <xsl:template match="text.turtle.applet" priority="0.0">
		<xsl:call-template name="ronpro.applet.source"/>
		<xsl:call-template name="ronpro.applet.download"/>
		<xsl:call-template name="ronpro.applet.applet"/>
	</xsl:template>
  
	<!-- �A�v���b�g�t�̃^�[�g���\�[�X���o�͂���i�\�[�X�_�E�����[�h�ł��Ȃ��o�[�W�����j -->
    <xsl:template match="text.turtle.applet.nodownload" priority="0.0">
    	<xsl:call-template name="ronpro.applet.applet"/> 
  	</xsl:template>
  
  	<!-- �A�v���b�g�t�̃^�[�g���\�[�X���o�͂��� -->
	<!-- CUI�o�[�W���� ���[���F�\��������A�v���b�g��Turtle���p��������ŁC�N���X���ɁuApplet�v��t������ -->
    <xsl:template match="text.turtle.cui" priority="0.0">
		<xsl:call-template name="ronpro.applet.source"/>
		<xsl:call-template name="ronpro.applet.download"/>
		<xsl:call-template name="ronpro.applet.applet">
			<xsl:with-param name="postfix">Applet</xsl:with-param>
		</xsl:call-template>
	</xsl:template>


</xsl:stylesheet>
