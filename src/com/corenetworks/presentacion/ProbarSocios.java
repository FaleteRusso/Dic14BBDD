package com.corenetworks.presentacion;

import com.corenetworks.modelo.Socio;
import com.corenetworks.persistencia.AccesoSocios;

import java.sql.SQLException;

public class ProbarSocios {
    public static void main(String[] args) {
        AccesoSocios as1 =new AccesoSocios();
        Socio s = new Socio("1234567B","213452");

            try {
                System.out.println("Se ha inseratado socio? "+ as1.alta(s));
            } catch (SQLException e) {
                System.out.println(e.toString());
            } catch (ClassNotFoundException e) {
                System.out.println(e.toString());
            }

    }
}
