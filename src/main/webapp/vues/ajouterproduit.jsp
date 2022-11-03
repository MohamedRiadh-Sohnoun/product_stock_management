<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
	<title>Ajouter Un Produit</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
</head>

<body>
	<%@include file="navbar.html" %>
	<br>
	<div class=container>
		<div class="card m-5 p-2">
			<div class="card-header">
				<h2>Ajouter Produit</h2>
			</div>
				<div class="card-body">
					<form action="/apiproduit/saveproduit" method=post>
						<div class="mb-3 mt-3">
							<label for="nom" class="form-label">Nom:</label>
							<input type=text class="form-control" id="nom" name="nom" value="${produit.nom}">
						</div>
						<div class="mb-3">
							<label for="prix" class="form-label">Prix:</label>
							<input type="number" class="form-control" id="prix" name="prix" value="${produit.prix}">
						</div>
						<div class="mb-3">
							<label for="quantite" class="form-label">Quantite:</label>
							<input type="number" class="form-control" id="quantite" name="quantite" value="${produit.quantite}">
						</div>
						<div class="mb-3">
							<label for="Categorie" class="form-label">Categorie:</label>
							<select name="categorie" >
								<option selected hidden>Choose here</option>
								<c:forEach items="${categories}" var="cc">
									<option value=${cc.id} <c:if test="${produit.categorie.id==cc.id}">selected="true"</c:if>>${cc.nom} </option>
								</c:forEach>
							</select>
						</div>
						<input type=hidden name=idp value="${produit.id}">
						<button type="submit" class="btn btn-primary" >Save</button>
					</form>
				</div>
			</div>
		</div>
</body>