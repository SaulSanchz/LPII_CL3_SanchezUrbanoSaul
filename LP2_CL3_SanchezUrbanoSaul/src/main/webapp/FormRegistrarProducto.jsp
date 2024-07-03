<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LPII - CL3</title>
</head>
<body bgcolor="#c5dec9">
	
	<h1 align="center">Registrar Producto</h1>
	
	<form action="ControladorProducto" method="post">
	
		<table border="2" align="center">
		
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td>Precio de venta</td>
				<td><input type="text" name="precioventa"></td>
			</tr>
			<tr>
				<td>Precio de compra</td>
				<td><input type="text" name="preciocomp"></td>
			</tr>
			<tr>
				<td>Estado</td>
				<td><input type="text" name="estado"></td>
			</tr>
			<tr>
				<td>Descripcion</td>
				<td><input type="text" name="descrip"></td>
			</tr>
			<tr>
				<td colspan="2"  align="center" >
				<input type="submit" value="Registrar Cliente">
			</td>
			</tr>
			
		</table>
		
	</form>
	
</body>

</html>