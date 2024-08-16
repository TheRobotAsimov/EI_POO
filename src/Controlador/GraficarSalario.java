package Controlador;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.category.DefaultCategoryDataset;

public class GraficarSalario {
    
    public void graficar (JPanel panelGrafica){
        
        JFreeChart grafico_valores = ChartFactory.createBarChart3D(
            "Salario de Pilotos",    // Nombre del grafico
            "Piloto", // Nombre de las barras (eje x)
            "Cantidad",           // Nombre de los valores (eje y)
            datos(),    // Datos del grafico
            PlotOrientation.VERTICAL,    // Orientación
            true,    // Leyenda para los valores en barra (individuales)
            false,    // Herramientas
            false    // URL del gráfico     
        );
        
        ChartPanel panel = new ChartPanel(grafico_valores);
        //Solo si tenemos las herramientas activas
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200));
        
        //Mostrar gráfico en el panel de la interfaz gráfica.
        panelGrafica.setLayout(new BorderLayout());
        //El BorderLayout.NORTH es para colocar la grafica que se encuentra en panel con respecto al borde superior
        panelGrafica.add(panel,BorderLayout.NORTH);
        
    }
    
    public DefaultCategoryDataset datos(){
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        try {
            Conexion con = new Conexion();
            con.JavaToMySQL();
            con.comando = con.conexion.createStatement();
            ResultSet rs = con.comando.executeQuery("select nombre, salario from piloto;");
            while(rs.next()){
                datos.addValue(rs.getInt("salario"),rs.getString("nombre"),rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Problemas con SQL. "+ ex.getMessage());
        }finally {
            return datos;
        }
    }
}
