/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author kevin
 */
public class ValidacionVehiculo {
    public void validarEqu(String modelo,String num ,String velMax,String col, String idEq,String idPil) throws Exception{
        
    if (modelo.isEmpty() || num.isEmpty() || velMax.isEmpty() || col.isEmpty() || idEq.isEmpty() || idPil.isEmpty()) {
        throw new NullPointerException("Uno o más campos están vacíos.");
    }

        // Validando que los textos no tengan caracteres especiales
        if (!modelo.trim().matches("[a-zA-Z ]+") || !col.matches("[a-zA-Z ]+")) {
            throw new NumberFormatException("El campo modelo o color contiene caracteres no permitidos.");
        }

        // Validar que num, velMax, idEq, idPil contengan solo números enteros o decimales
        if (!num.matches("-?\\d+(\\.\\d+)?") || !velMax.matches("-?\\d+(\\.\\d+)?") || !idEq.matches("-?\\d+(\\.\\d+)?") 
                || !idPil.matches("-?\\d+(\\.\\d+)?")) {
            throw new NumberFormatException("Se esperaba un número en Numero,VelocidadMax, Id Equipo o ID piloto campos numéricos.");
        }
    }
}
