<%-- 
    Document   : Vehiculo
    Created on : 30/04/2015, 01:16:49 PM
    Author     : jedisson.tapias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<htm<head>
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
                <h1>Vehículo</h1>
                <form action="./VehiculoServlet" method="POST">
                     <table>
                         <!--Pendiente añadir imagen redimensionada-->
                        <tr>
                            <th><h2>Matricula</h2></th>
                            <th><input type="text" name="matricula" value="${vehiculo.matricula}"/> </th>
                        </tr>
                        <tr>
                            <th><h2>Modelo</h2></th>
                            <th> <input type="text" name="modelo" value="${vehiculo.modelo}"/></th>
                        </tr>
                        <tr>
                            <th><h2>Color</h2></th>
                            <th><input type="text" name="color" value="${vehiculo.color}"/> </th>
                        </tr>
                        <tr>
                            <th><h2>Cantidad</h2></th>
                            <th> <input type="text" name="cantidad" value="${vehiculo.cantidad}"/></th>
                        </tr>
                        <tr>
                            <th><h2>Precio</h2></th>
                            <th><input type="text" name="precio" value="${vehiculo.precio}"/> </th>
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
                    <th>Matricula</th>
                    <th>Modelo</th>
                    <th>Color</th>
                    <th>Cantidad</th>
                    <th>Precio</th>
                
                    <c:forEach items="${AllVehiculos}" var="vehi">
                        <tr>
                            <td>${vehi.matricula}</td>
                            <td>${vehi.modelo}</td>
                            <td>${vehi.color}</td>
                            <td>${vehi.cantidad}</td>
                            <td>${vehi.precio}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
