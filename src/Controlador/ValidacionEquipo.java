/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author kevin
 */
public class ValidacionEquipo {
    public void validarEqu(String marca,String Dir ,String nacionalidad) throws Exception{
        
        //Validando que los campos no esten vacios
        if(marca.isEmpty() || Dir.isEmpty() || nacionalidad.isEmpty()){
            throw new NullPointerException("Uno o más campos están vacíos.");
        }
        
        //Validando que los textos no tengan caracteres especiales
        if(!marca.trim().matches("[a-zA-Z ]+") || !Dir.matches("[a-zA-Z ]+") || !nacionalidad.matches("[a-zA-Z ]+")){
            throw new NumberFormatException("El campo marca, Director o nacionalidad contiene caracteres no permitidos.");
        }
    }
}
