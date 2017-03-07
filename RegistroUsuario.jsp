

<%@page import="controlador.servletUsuario.ServRegistroUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      
   
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
     
        <script>
            $(document).ready(function () {
                $('#ingresar').click(function (event) {
                    var nombre = $('#nombre').val();
                    var id_usuar = $('#id_usuar').val();
                    var pass = $('#contraseña').val();
                    var alias = $('#alias').val();
                    var estado = $('#estado').val();
                    var email = $('#email').val();
                    var telef = $('#email').val();
                   
                    var data2 =  {
                            nombre:nombre,
                            id_usuar:id_usuar,
                            pass:pass,
                            alias:alias,
                            estado:estado,
                            email: email,
                            telef:telef
                            
                        };
                    $.ajax({
                        url:"ServRegistroUsuario", 
                        type: "POST",
                        dataType: 'json',
                        data:JSON.stringify(data2),//convierte el objeto tipo json en cadena
                        contentType: 'application/json',
                        mimeType: 'application/json; charset=utf-8',
                        success: function (data) {
                           if(data = ""){
                              alert("Rellene sus datos"); 
                           }else {
                                location.href = "/talk_me/index.jsp?iduser="+data;
                           }
                        }
                    });
                });
            });
        </script>
         </head>
    <body>
        <h1>  NUEVO REGISTRO</h1>
   <form >
        
    <center>
        <table align="center">
            <tr>
 
                <td> Nombre(s):</td>    
                <td> <input type="text"   id="nombre"></td>
            </tr>
            
            <tr>
                <td> ID Usuario:</td>    
                <td> <input type="text"   id="id_usuar"  ></td>
            </tr>
            
             <tr>
                <td> Password:</td>    
                <td> <input type="text"   id="contraseña"  ></td>
            </tr>
            
              <tr>
                <td> Alias:</td>    
                <td> <input type="text"   id="alias"      ></td>
            </tr>
             <tr>
                <td> Estado:</td>    
                <td> <input type="text"    id="estado"  ></td>
            </tr>
            
            <tr>
                <td> Email:</td>    
                <td> <input type="text"    id="email"  ></td>
            </tr>
            
            
             <tr>
                <td> Teléfono:</td>    
                <td> <input type="text"    id="telef" ></td>
            </tr>

            <tr>
                <td></td>    
                <td>  <input type="submit"  id="ingresar" value="Ingresar"></td>
            </tr>   
        </table>

    </center>
        </form>
 
    </body>
    
</html>
