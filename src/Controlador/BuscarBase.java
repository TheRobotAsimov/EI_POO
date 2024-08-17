package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class BuscarBase {
    protected List<String[]> lista;

    // Constructor
    public BuscarBase() {
        lista = new ArrayList<>();
    }

    // Método común para realizar la búsqueda sin condiciones
    public List<String[]> buscar() throws SQLException, Exception {
        String query = getBaseQuery();
        queryToList(query);
        return lista;
    }

    // Método común para realizar la búsqueda con condiciones
    public List<String[]> buscar(String campo, String valor) throws SQLException, Exception {
        // Validar si el valor es un número
        if(campo.contains("id") && !esEntero(valor)){
            throw new Exception("Ingresar un número entero");
        } else
        if (!esNumero(valor)) {
            valor = "\"" + valor + "\""; // Agregar comillas si no es un número
        }

        String query = getBaseQuery() + " where " + campo + " = " + valor;
        queryToList(query);
        return lista;
    }

    private boolean esNumero(String valor) {
        try {
            Double.valueOf(valor);
            return true; // Si se puede convertir a número, retornar true
        } catch (NumberFormatException e) {
            return false; // Si lanza una excepción, no es un número
        }
    }
    
    private boolean esEntero(String valor) {
        try {
            Integer.valueOf(valor);
            return true; // Si se puede convertir a número, retornar true
        } catch (NumberFormatException e) {
            return false; // Si lanza una excepción, no es un número
        }
    }


    // Método común para ejecutar la consulta y convertir el resultado a una lista
    protected void queryToList(String query) throws SQLException, Exception {
        Conexion con = new Conexion();
        con.JavaToMySQL();
        con.comando = con.conexion.createStatement();
        ResultSet rs = con.comando.executeQuery(query);
        while (rs.next()) {
            lista.add(mapResultSetToData(rs));
        }
    }

    // Método abstracto que será implementado por las subclases para definir la consulta base
    protected abstract String getBaseQuery();

    // Método abstracto que será implementado por las subclases para mapear el ResultSet a un arreglo de strings
    protected abstract String[] mapResultSetToData(ResultSet rs) throws SQLException;
}
