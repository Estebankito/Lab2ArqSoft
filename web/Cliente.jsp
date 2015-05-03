<%-- 
    Document   : Cliente
    Created on : 30/04/2015, 01:14:07 PM
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
                <h1>Cliente</h1>
                <form action="./ClienteServlet" method="POST">
                     <table>
                        <tr>
                            <th><h2>Identificación</h2></th>
                            <th><input type="text" name="identificacion" value="${cliente.identificacion}"/> </th>
                        </tr>
                        <tr>
                            <th><h2>Nombres</h2></th>
                            <th> <input type="text" name="nombres" value="${cliente.nombres}"/></th>
                        </tr>
                        <tr>
                            <th> <h2>Apellidos</h2></th>
                            <th><input type="text" name="apellidos" value="${cliente.apellidos}"/> </th>
                        </tr>
                        <tr>
                            <th><h2>Correo</h2></th>
                            <th> <input type="text" name="correo" value="${cliente.correo}"/></th>
                        </tr>
                        <tr>
                            <th><h2>Teléfono</h2></th>
                            <th><input type="text" name="telefono" value="${cliente.telefono}"/> </th>
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
                    <th>Identificación</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Correo</th>
                    <th>Teléfono</th>
                
                    <c:forEach items="${AllClientes}" var="clien">
                        <tr>
                            <td>${clien.identificacion}</td>
                            <td>${clien.nombres}</td>
                            <td>${clien.apellidos}</td>
                            <td>${clien.correo}</td>
                            <td>${clien.telefono}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
