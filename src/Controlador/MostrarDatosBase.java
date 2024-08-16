package Controlador;

import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class MostrarDatosBase<T extends BuscarBase> {
    
    protected abstract T crearBuscador();
    
    // Método abstracto para obtener el mapa de opc a campos de búsqueda
    protected abstract Map<Integer, String> getOpcMap();

    public void mostrar(JTable table, int opc, String parametro) {
        T buscador = crearBuscador();
        Map<Integer, String> opcMap = getOpcMap();
        
        try {
            if (opc == 0) {
                actualizarTabla(buscador.buscar(), table);
            } else if (opcMap.containsKey(opc)) {
                actualizarTabla(buscador.buscar(opcMap.get(opc), parametro), table);
            } else {
                JOptionPane.showMessageDialog(null, "Opción de búsqueda no válida");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la búsqueda. "+ex.getMessage());
        }
    }

    public void actualizarTabla(List<String[]> lista, JTable table) {
        
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "No se encontraron coincidencias. Revisar dato ingresado");
            return;
        }
        
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);

        for (String[] fila : lista) {
            modelo.addRow(fila);
        }
    }
}
