<%-- 
    Document   : Venta
    Created on : 30/04/2015, 01:17:25 PM
    Author     : jedisson.tapias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Lab 2</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="resources/divtitulo.css" type="text/css"/>
        <link rel="stylesheet" href="resources/div1.css" type="text/css"/>
        <link rel="stylesheet" href="resources/div2.css" type="text/css">
        <link rel="stylesheet" href="resources/div2alterno.css" type="text/css"/>



    </head>
     <body background="resources/concesionario-autos.jpg">
        <div class="titulo" align="center" >
            Concesionario CRUD
        </div>
        <div align="center" style= "margin-left: 15%  ;margin-right:  15%  ;margin-top: 5%  ;">
            <div class="contenedor1">
                <div style="margin-top: 50%;">
                    <a href="Cliente.jsp">Cliente</a><br><br>
                    <a href="Vehiculo.jsp">Vehículo</a><br><br>
                    <a href="Venta.jsp">Venta</a><br>
                </div>

            </div>
            <div class="contenedor2alterno">
                <h1>Venta</h1>
                <form action="./VentaServlet" method="POST">
                     <table>
                         <!--Pendiente añadir imagen redimensionada-->
                        <tr>
                            <th><h2>#Factura</h2></th>
                            <th><input type="text" name="matricula" value="${venta.nroFactura}"/> </th>
                        </tr>
                        <tr>
                            <th><h2>#Cliente</h2></th>
                            <th> <input type="text" name="modelo" value="${venta.idCliente}"/></th>
                        </tr>
                        <tr>
                            <th><h2>#Vehiculo</h2></th>
                            <th><input type="text" name="color" value="${venta.idVehiculo}"/> </th>
                        </tr>
                        <tr>
                            <th><h2>Cantidad</h2></th>
                            <th> <input type="text" name="cantidad" value="${venta.cantidad}"/></th>
                        </tr>
                        <tr>
                            <th><h2>Precio Total</h2></th>
                            <th><input type="text" name="precio" value="${venta.precioTotal}"/> </th>
                        </tr>
                        <th><br></th>
                        <tr>
                            <td colspan="2">
                                <input type="submit" name="accion" value="Añadir"/>
                                <input type="submit" name="accion" value="Editar"/>
                                <input type="submit" name="accion" value="Eliminar"/>
                                <input type="submit" name="accion" value="Buscar"/>
                            </td>
                        </tr>
                     </table>
                </form>
                <br>
                <br>
                <table border="1">
                    <th>Factura</th>
                    <th>Cliente</th>
                    <th>Vehiculo</th>
                    <th>Cantidad</th>
                    <th>Precio</th>
                
                    <c:forEach items="${AllVentas}" var="vent">
                        <tr>
                            <td>${vent.nroFactura}</td>
                            <td>${vent.idCliente}</td>
                            <td>${vent.idVehiculo}</td>
                            <td>${vent.cantidad}</td>
                            <td>${vent.precioTotal}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
