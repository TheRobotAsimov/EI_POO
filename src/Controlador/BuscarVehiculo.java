package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarVehiculo extends BuscarBase {

    @Override
    protected String getBaseQuery() {
        return "select * from vehiculo";
    }

    @Override
    protected String[] mapResultSetToData(ResultSet rs) throws SQLException {
        return new String[]{
            rs.getString("idVehiculo"),
            rs.getString("modelo"),  
            rs.getString("numero"),
            rs.getString("peso"),
            rs.getString("velocidadMax"),
            rs.getString("color"),
            rs.getString("idEquipo"),
            rs.getString("idPiloto")
        };
    }
}