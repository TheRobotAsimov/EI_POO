
package Controlador;
import java.sql.PreparedStatement;

public class ActualizarRegistroPiloto {
    public void actualizar(String[] datosPiloto) throws Exception{
    
        Conexion cone = new Conexion();
        cone.JavaToMySQL();
        
        String Query = "update piloto set nombre = ?, apellido = ?, peso = ?, nacionalidad = ?,fechaNac=?,altura=?,puntos =?, fechaIngreso =?, fechaContrato=?,salario=?,idEquipo=? where idpiloto = ?";
        
        PreparedStatement actualizar = cone.conexion.prepareStatement(Query);
        
        for(int i=1;i<datosPiloto.length;i++){
            actualizar.setString(i,datosPiloto[i]);
                
        }
        actualizar.setString(datosPiloto.length,datosPiloto[0]);
        actualizar.executeUpdate();
    }
    
}
