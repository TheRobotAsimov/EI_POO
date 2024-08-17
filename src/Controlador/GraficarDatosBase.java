package Controlador;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public abstract class GraficarDatosBase {
    
    // Método abstracto para obtener el título del gráfico
    protected abstract String getTituloGrafico();
    
    // Método abstracto para obtener el eje X del gráfico
    protected abstract String getEjeX();
    
    // Método abstracto para obtener el eje Y del gráfico
    protected abstract String getEjeY();
    
    // Método abstracto para obtener la consulta SQL
    protected abstract String getConsultaSQL();
    
    // Método abstracto para mapear los resultados a los datos del gráfico
    protected abstract void mapearResultados(ResultSet rs, DefaultCategoryDataset dataset) throws SQLException;

    public void graficar(JPanel panelGrafica) {
        JFreeChart grafico_valores = ChartFactory.createBarChart3D(
            getTituloGrafico(),    // Nombre del grafico
            getEjeX(), // Nombre de las barras (eje x)
            getEjeY(),           // Nombre de los valores (eje y)
            datos(),    // Datos del grafico
            PlotOrientation.VERTICAL,    // Orientación
            true,    // Leyenda para los valores en barra (individuales)
            false,    // Herramientas
            false    // URL del gráfico     
        );
        
        ChartPanel panel = new ChartPanel(grafico_valores);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400, 200));
        
        // Mostrar gráfico en el panel de la interfaz gráfica.
        panelGrafica.setLayout(new BorderLayout());
        panelGrafica.add(panel, BorderLayout.NORTH);
    }

    public DefaultCategoryDataset datos() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        try {
            Conexion con = new Conexion();
            con.JavaToMySQL();
            con.comando = con.conexion.createStatement();
            ResultSet rs = con.comando.executeQuery(getConsultaSQL());
            mapearResultados(rs, datos);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas con SQL. " + ex.getMessage());
        }
        return datos;
    }
}
