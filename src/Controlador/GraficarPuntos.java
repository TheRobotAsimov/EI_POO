package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficarPuntos extends GraficarDatosBase {

    @Override
    protected String getTituloGrafico() {
        return "Puntos de pilotos";
    }

    @Override
    protected String getEjeX() {
        return "Piloto";
    }

    @Override
    protected String getEjeY() {
        return "Cantidad";
    }

    @Override
    protected String getConsultaSQL() {
        return "select nombre, puntos from piloto;";
    }

    @Override
    protected void mapearResultados(ResultSet rs, DefaultCategoryDataset dataset) throws SQLException {
        while (rs.next()) {
            dataset.addValue(rs.getInt("puntos"), rs.getString("nombre"), rs.getString("nombre"));
        }
    }
}
