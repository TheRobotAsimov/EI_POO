package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficarNumNeumaticos extends GraficarDatosBase {

    @Override
    protected String getTituloGrafico() {
        return "Numero de Neumaticos";
    }

    @Override
    protected String getEjeX() {
        return "Equipo";
    }

    @Override
    protected String getEjeY() {
        return "Cantidad";
    }

    @Override
    protected String getConsultaSQL() {
        return "select marca, cantNeuma as cantidad from equipo;";
    }

    @Override
    protected void mapearResultados(ResultSet rs, DefaultCategoryDataset dataset) throws SQLException {
        while (rs.next()) {
            dataset.addValue(rs.getInt("cantidad"), rs.getString("marca"), rs.getString("marca"));
        }
    }
}
