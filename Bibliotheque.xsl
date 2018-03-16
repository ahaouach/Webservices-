<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" indent="yes" encoding="UFT-8"/>
	
	<!-- <xsl:key name="..." match="..." use="..."/>
	<xsl:decimal-format name="..."/>
	<xsl:attribute-set name="...">...</xsl:attribute-set>
	<xsl:variable name="...">...</xsl:variable>
	<xsl:param name="...">...</xsl:param> -->
	
	<xsl:template match="Bibliotheque">
		<html>			
			<body>
				
				<h2> LISTE DES OUVRAGES </h2>
				
				<table border="1" cellspacing="0" cellpadding="3">
					<th>Réf.</th>
					<th>Titre</th>
					<th>Edition</th>
					<th>Annee</th>
					<th>ISBN</th>
					<th>NbreExemplaires</th>
					<th>Commentaires</th>
					<th>Categorie</th>
					<th>Auteur(s)</th>
					<th>Editeur</th>
					<xsl:for-each select="Ouvrages/Theme/Ouvrage">
						<tr>
							<td>
								<xsl:value-of select="Reference"/>
							</td>
							<td>
								<xsl:value-of select="Titre"/>
							</td>
							<td>
								<xsl:value-of select="Edition"/>
							</td>
							<td>
								<xsl:value-of select="Annee"/>
							</td>
							<td>
								<xsl:value-of select="ISBN"/>
							</td>
							<td>
								<xsl:value-of select="NbreExemplaires"/>
							</td>
							<td>
								<xsl:value-of select="Commentaires"/>
							</td>
							<td>
								<xsl:value-of select="Categorie"/>
							</td>
							<td>
								<xsl:value-of select="Auteur"/>
							</td>
							<td>
								<xsl:value-of select="Editeur"/>
							</td>
						</tr>
					</xsl:for-each>
					
				</table>
				
				<!--  
				<h2> list des editeur  </h2>
				
				<table border="1" cellspacing="0" cellpadding="3">
					<th>N° | Maison d'édition</th>

					<xsl:variable name="edit" select="Theme/Ouvrage/Editeur" />
					<xsl:for-each select="$edit">
						<tr>
						  	<xsl:if test="generate-id() = generate-id($edit[e = current()][1])">
						    <td>
						    	<xsl:value-of select="e" />
						    </td>
						  	</xsl:if>
					  </tr>
					</xsl:for-each>
					
				</table>
				-->
			</body>
		</html>	
	</xsl:template>
		
</xsl:stylesheet>