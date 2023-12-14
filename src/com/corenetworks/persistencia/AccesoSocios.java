package com.corenetworks.persistencia;

import com.corenetworks.modelo.Socio;

import java.sql.SQLException;
import java.sql.Statement;

public class AccesoSocios  extends Conexion{
    public boolean alta(Socio s) throws SQLException, ClassNotFoundException {
     //1 variables
        Statement sentencia;
        int resultado=0;
        String sql= "insert into socios (carnet,dni) values ('"+s.getCarnet()+ "','" + s.getDni()+"');";
     //2 abrir conexion
        abrirConexion();
     //3 crear statement
        sentencia = miConexion.createStatement();
     //4 actualizar
        resultado= sentencia.executeUpdate(sql);
        //5. Devolver el resultado
        return resultado >0;

    }
}
