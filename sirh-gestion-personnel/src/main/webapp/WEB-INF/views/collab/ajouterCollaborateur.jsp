<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/boostrap-4.3.1-dist/css/bootstrap.css">
</head>
<body>
	<div class="section">
		<div class="container">
			<div class="titre">
				<h1 class="titre__page">Nouveau Collaborateur</h1>
			</div>
			<form action="<%=request.getContextPath()%>/collaborateurs/nouveau"
				method="post">

				<div class="formulaire__ajout">
					<div class="form-group">
						<label class="col-md-4 control-label" for="formulaire__ajout">Nom</label>
						<div class="col-md-5">
							<input id="formulaire__ajout__nom" name="nom" type="text"
								placeholder="nom" class="form-control input-md" required="">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label" for="formulaire__ajout">Prénom</label>
						<div class="col-md-5">
							<input id="formulaire__ajout__prénom" name="prenom" type="text"
								placeholder="prénom" class="form-control input-md" required="">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label" for="textarea">Adresse</label>
						<div class="col-md-5">
							<textarea class="form-control" id="textarea" name="adresse"
								required="">adresse</textarea>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label" for="formulaire__ajout">Numéro
							de Sécurité Social</label>
						<div class="col-md-5">
							<input id="formulaire__ajout__prénom" name="numeroSecuriteSocial"
								type="text" class="form-control input-md" required="" maxlength="15">
						</div>
					</div>
					<div class="bouton">
						<div class="bouton__ajout"></div>
						<div class="form-group">
							<div class="col-md-4">
								<button type="submit" id="singlebutton" name="singlebutton"
									class="btn btn-primary" >créer</button>
							</div>
						</div>
					</div>
				</div>

			</form>
</body>
</html>