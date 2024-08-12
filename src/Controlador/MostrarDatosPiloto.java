
package Controlador;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MostrarDatosPiloto {
    public void mostrar(List<String[]> lista,JTable piloto){
        
        DefaultTableModel modelo =(DefaultTableModel) piloto.getModel();
        modelo.setRowCount(0);
        
        for(int i=0;i<lista.size();i++){
            modelo.addRow(lista.get(i));
        }
    }
}
