package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficarEdad extends GraficarDatosBase {

    @Override
    protected String getTituloGrafico() {
        return "Edad de Pilotos";
    }

    @Override
    protected String getEjeX() {
        return "Piloto";
    }

    @Override
    protected String getEjeY() {
        return "Edad";
    }

    @Override
    protected String getConsultaSQL() {
        return "select nombre, timestampdiff(year, fechanac, CURDATE()) as edad from piloto;";
    }

    @Override
    protected void mapearResultados(ResultSet rs, DefaultCategoryDataset dataset) throws SQLException {
        while (rs.next()) {
            dataset.addValue(rs.getInt("edad"), rs.getString("nombre"), rs.getString("nombre"));
        }
    }
}
