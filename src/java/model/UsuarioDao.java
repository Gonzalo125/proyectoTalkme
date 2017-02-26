/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Conexion.Conectbd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class UsuarioDao {
    
    usuario user;
    Connection conect = null;
    public usuario getUser(String idUser) throws SQLException{
        
        usuario user = new usuario();
         String consulta = "Select * from Usuario where id_usu=?";
        PreparedStatement Consulta=conect.prepareStatement(consulta);
        Consulta.setString(1, idUser);
         ResultSet Resultado=Consulta.executeQuery();
            while(Resultado.next()){
                user.setId_usu(Resultado.getString(1));
            user.setNombre_usu(Resultado.getString(2));
            user.setAlias(Resultado.getString(3));
            user.setEstado_usu(Resultado.getString(4));
            user.setImagen_usu(Resultado.getString(5));
            user.setFecha_registro(Resultado.getString(6));
            user.setCelular(Resultado.getInt(7));
            user.setEmail(Resultado.getString(8));
            
            String contactos = Resultado.getString(10);
            String[] contact =  contactos.split(",");
            user.setContactos(Arrays.asList(contact));
            }
     
        
       //Conexion.Cerrar();
       return user;
    }
     public ArrayList<usuario> getcontactos(String idUser) throws SQLException{
       conect= Conexion.obtener();
        ArrayList<usuario> lista_contactos = new ArrayList<>();
        
        usuario user = getUser(idUser);
        
         for (int i = 0; i < user.contactos.size(); i++) {
             lista_contactos.add(getUser(user.contactos.get(i)));
         }
         Conexion.Cerrar();
        return lista_contactos;
    }
}
