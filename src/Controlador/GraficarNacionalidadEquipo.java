package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficarNacionalidadEquipo extends GraficarDatosBase {

    @Override
    protected String getTituloGrafico() {
        return "Nacionalidades de Equipos";
    }

    @Override
    protected String getEjeX() {
        return "Nombres";
    }

    @Override
    protected String getEjeY() {
        return "Cantidad";
    }

    @Override
    protected String getConsultaSQL() {
        return "select nacionalidadEquipo as nacionalidad, count(*) as cantidad from equipo group by nacionalidadEquipo;";
    }

    @Override
    protected void mapearResultados(ResultSet rs, DefaultCategoryDataset dataset) throws SQLException {
        while (rs.next()) {
            dataset.addValue(rs.getInt("cantidad"), rs.getString("nacionalidad"), rs.getString("nacionalidad"));
        }
    }
}
