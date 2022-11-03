<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
	<title>Liste Des Produits</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
</head>

<body>
	<%@include file="navbar.html"%>
	<br><br>
	
	<form method=get action=produitmc>
		<div class=container>
			<div class="row mt-4 pl-2">
				<div class="col-md-1">
					<label for="mc" class="form-label">Mot Cle:</label>
				</div>
				<div class="col-md-3">
					<input type="text" id="mc" class="form-control" name=mc>
				</div>
				<div class="col-md-3">
					<button type="submit" class="btn btn-primary">Chercher</button>
				</div> 
			</div> 
		</div> 
	</form>
	
	<br><hr>
	
	<table class="table table-hover">
		<tr>
			<th>Id</th>
			<th>Nom</th>
			<th>Prix</th>
			<th>Quantite</th>
			<th>Categorie</th>
			<th>Action</th>
		</tr>
		
		<c:forEach items="${liste}" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.nom}</td>
				<td>${p.prix }</td>
				<td>${p.quantite}</td>
				<td>${p.categorie.nom}</td>
				<td>
					<a href="/apiproduit/supprimerproduit/${p.id}" class="btn btn-danger">
						<span class="fa fa-trash"></span>
					</a>
					<a href="/apiproduit/modifierproduit/${p.id}" class="btn btn-warning">
						<span class="fa fa-edit">
					</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
</body>