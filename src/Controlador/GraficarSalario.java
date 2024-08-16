package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficarSalario extends GraficarDatosBase {

    @Override
    protected String getTituloGrafico() {
        return "Salario de Pilotos";
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
        return "select nombre, salario from piloto;";
    }

    @Override
    protected void mapearResultados(ResultSet rs, DefaultCategoryDataset dataset) throws SQLException {
        while (rs.next()) {
            dataset.addValue(rs.getInt("salario"), rs.getString("nombre"), rs.getString("nombre"));
        }
    }
}
