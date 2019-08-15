<%-- 
    Document   : opcBase
    Created on : 11-13-2018, 12:07:34 PM
    Author     : gebbl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="teal lighten-1">
            <div class="nav-wrapper">
                <a href="#" class="brand-logo center">Ventas</a>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col s6">
                    <form action="CrearBD" method="post">
                        <input type="hidden" value="crear" name="Accion"> 
                        <input class="waves-effect waves-light btn" type="submit" value="Crear BD">
                    </form>
                    
                </div>
                <div class="col s6">
                    <form action="CrearBD" method="post">
                        <input type="hidden" value="eliminar" name="Accion"> 
                        <input class="waves-effect waves-light btn" type="submit" value="Eliminar BD">
                    </form>
                </div>
 
            </div>
        </div>
        <div class="row">
                <div class="col s12">
                    <div style="display: <c:if test='${mensajeAccion == null}'>none</c:if>;">
                        <h4>Mensajes:</h4>
                        <h4>${mensajeAccion}</h4>
                    </div>
                </div>
        </div>
    </body>
</html>
