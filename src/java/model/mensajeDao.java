package model;

import Conexion.Conectbd.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class mensajeDao {
   Connection conect = Conexion.obtener();
   public String id_mensaje,mensaje_contenido,fecha_de_envio,estado_mensaje,id_chat,id_usu;
    
   public void ObtnerMensaje(String id_chat) throws SQLException{
        String consulta = "Insert into mensajes (id_msg,id_chat,msg,id_usu,fec_msg,est_msg) values (?,?,?,?,?,?,?,?)";
        PreparedStatement insert=conect.prepareStatement(consulta);
        
        insert.setString(1,nombre);
        
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < user.size(); i++) {
            data.add(user.get(i).getId_usu());
        }
        String lista_contactos = String.join(",", data);
        
        insert.setString(2, lista_contactos);
        long mili = System.currentTimeMillis();
        Date date = new Date(mili);
        insert.setDate(3, date);
        insert.setString(4, id_user_Admin);
        insert.setString(5,img );
   }
    
}
