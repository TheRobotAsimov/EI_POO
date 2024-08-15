package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarEquipo extends BuscarBase {

    @Override
    protected String getBaseQuery() {
        return "select * from equipo";
    }

    @Override
    protected String[] mapResultSetToData(ResultSet rs) throws SQLException {
        return new String[]{
            rs.getString("idEquipo"),
            rs.getString("marca"),
            rs.getString("director"),
            rs.getString("nacionalidadEquipo"),
            rs.getString("cantNeuma")
        };
    }
}
