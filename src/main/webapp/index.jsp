<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo trang chu</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<div>
		<nav class="navbar navbar-light bg-light justify-content-between">
			<a href="/demobtpm/CreateProduct" class="navbar-brand">Thêm sản phẩm</a>
			<form class="form-inline">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</nav>
<div class="d-flex flex-row mb-3">
		<c:forEach items="${list}" var="product">
			
				<%-- <td><a href="editProduct?code=${product.code}">Edit</a></td>
			<td><a href="deleteProduct?code=${product.code}">Delete</a></td> --%>
			
			<div class="card" style="width: 18rem;">
				<img class="card-img-top" src="${product.imageLink}" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">${product.name}</h5>
					<h5 class="card-title">${product.price}</h5>
					<p class="card-text">${product.description}</p>
					<a href="/demobtpm/EditProduct?id=${product.id}" class="btn btn-primary">Edit</a>
					<a href="/demobtpm/DeleteProduct?id=${product.id}" class="btn btn-primary">Delete</a>
				</div>	
			</div>
			
		</c:forEach>
</div>
		<div class="container mt-5">
			<div class="row">
				<div class="col-sm-4">
					<h3>Column 1</h3>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
					<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
						laboris...</p>
				</div>
				<div class="col-sm-4">
					<h3>Column 2</h3>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
					<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
						laboris...</p>
				</div>
				<div class="col-sm-4">
					<h3>Column 3</h3>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
					<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
						laboris...</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
