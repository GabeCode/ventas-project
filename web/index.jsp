<%-- 
    Document   : index
    Created on : 11-13-2018, 09:19:11 AM
    Author     : gebbl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
    </head>
    <body>
        <nav class="teal lighten-1">
            <div class="nav-wrapper">
                <a href="#" class="brand-logo center">Ventas</a>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col s6 offset-s3">
                    <table>
                        <thead>
                            <tr>
                                <th>Seleccionar Opcion:</th>
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td><a href="opcBase.jsp">Base de datos /*configurar aqui antes de cualquier cosa*/</a></td>
                            </tr>
                            <tr>
                                <td><a href="index.jsp">Productos</a></td>
                            </tr>
                            <tr>
                                <td><a href="index.jsp">Ventas</a></td>
                            </tr>
                            <tr>
                                <td><a href="index.jsp">Vendedores</a></td>
                            </tr>
                            <tr>
                                <td><a href="index.jsp">Clientes</a></td>
                            </tr>
                            <tr>
                                <td><a href="index.jsp">Inventario</a></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
