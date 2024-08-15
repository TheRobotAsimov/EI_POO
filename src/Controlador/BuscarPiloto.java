package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarPiloto extends BuscarBase {

    @Override
    protected String getBaseQuery() {
        return "select * from piloto";
    }

    @Override
    protected String[] mapResultSetToData(ResultSet rs) throws SQLException {
        return new String[]{
            rs.getString("idPiloto"),
            rs.getString("nombre"),  
            rs.getString("apellido"),
            rs.getString("peso"),
            rs.getString("nacionalidad"),
            rs.getString("fechaNac"),
            rs.getString("altura"),
            rs.getString("puntos"),
            rs.getString("fechaIngreso"),
            rs.getString("fechaContrato"),
            rs.getString("salario"),
            rs.getString("idEquipo")
        };
    }
}