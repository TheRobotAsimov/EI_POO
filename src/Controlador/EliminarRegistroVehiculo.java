
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EliminarRegistroVehiculo {
    public boolean eliminar(String id) throws Exception{
        Conexion cone = new Conexion();
        Connection conexion = null;
        PreparedStatement stmt = null;
        cone.JavaToMySQL();
        conexion = (Connection) cone.conexion;

        String Query = "DELETE FROM vehiculo WHERE idVehiculo = ?";
        stmt = conexion.prepareStatement(Query);
        stmt.setString(1, id);

        // Ejecutar la actualización y verificar si se eliminó alguna fila
        int filasAfectadas = stmt.executeUpdate();
        if (filasAfectadas > 0) {
            return true;
        }
        return false;
    }
}
