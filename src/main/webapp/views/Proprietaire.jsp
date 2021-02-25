<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8"/>
<title>Proprietaire</title>
</head>
<body>
<div>
	<s:form action ="save" method="post">
		<s:textfield label="Id" name="proprietaire.id"></s:textfield>
		<s:textfield label="nom" name="proprietaire.nom"></s:textfield>
		<s:textfield label="prenoms" name="proprietaire.prenom"></s:textfield>
		<s:textfield label="Cin" name="proprietaire.cin"></s:textfield>
		<s:textfield label="Adresse" name="proprietaire.adresse"></s:textfield>
		<s:textfield label="Tel" name="proprietaire.tel"></s:textfield>
		<s:submit value="Save"></s:submit>
	</s:form>
 </div>
 
 <div>
		<table class="table1	">
			<tr>
				<th>id</th>
			</tr>
			<s:iterator value ="proprietaires">
				<tr>
				  <td><s:property value="id"/></td>
				</tr>
			</s:iterator>
			
		</table>
 </div>
 
</body>
</html>