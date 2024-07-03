<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.TblProductocl3" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LPII - CL3</title>
</head>
<body  bgcolor="#c5dec9">
	<h1 align="center">Actualizar Producto</h1>
	
	<form  method="post" action="ControladorProducto">
	
		<%
		String cod=request.getAttribute("codigo").toString();
		String nom=(request.getAttribute("nombre")!=null)?request.getAttribute("nombre").toString():"";
		String ape=(request.getAttribute("precioventa")!=null)?request.getAttribute("precioventa").toString():"";
		String dni=(request.getAttribute("preciocomp")!=null)?request.getAttribute("preciocomp").toString():"";
		String email=(request.getAttribute("estado")!=null)?request.getAttribute("estado").toString():"";
		String telf=(request.getAttribute("descrip")!=null)?request.getAttribute("descrip").toString():""; 
		%>
		
		<table align="center"  borde="2">
			<input type="hidden" name="codigo"  value="<%=cod%>">
			<tr>
				<td>Nombre</td>
				<td>
				<input type="text" name="nombre" value="<%=nom%>">
				</td>
			</tr>
			<tr>
				<td>Precio de venta</td>
				<td><input type="text" name="precioventa" value="<%=ape%>"></td>
			</tr>
			<tr>
				<td>Precio de compra</td>
				<td><input type="text" name="preciocomp" value="<%=dni%>"></td>
			</tr>
			<tr>
				<td>Estado</td>
				<td><input type="text" name="estado" value="<%=email%>"></td>
			</tr>
			<tr>
				<td>Descripcion</td>
				<td><input type="text" name="descrip" value="<%=telf%>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Actualizar Producto"></td>
			</tr>
		
		</table>
	
	</form>

</body>
</html>