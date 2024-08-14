
package Controlador;
import java.sql.PreparedStatement;

public class ActualizarRegistroVehiculo {
    public void actualizar(String[] datosEquipo) throws Exception{
    
        Conexion cone = new Conexion();
        cone.JavaToMySQL();
        
        String Query = "update vehiculo set modelo=?,numero=?,velocidadMax=?,color=?,idequipo=?,idpiloto=? where idvehiculo = ?";
        
        PreparedStatement actualizar = cone.conexion.prepareStatement(Query);
        
        for(int i=1;i<datosEquipo.length;i++){
            actualizar.setString(i,datosEquipo[i]);
                
        }
        actualizar.setString(datosEquipo.length,datosEquipo[0]);
        actualizar.executeUpdate();
    }
    
}
