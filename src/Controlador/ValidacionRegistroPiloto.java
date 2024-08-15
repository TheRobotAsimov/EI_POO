
package Controlador;

public class ValidacionRegistroPiloto {
    public void validar(String nombre,String apellido,String peso,String nacionalidad,String anio,String mes,String dia,String altura,String ide) throws Exception{
        
        //Validando que los campos no esten vacios
        if(nombre.isEmpty() || apellido.isEmpty() || nacionalidad.isEmpty() || peso.isEmpty() || anio.isEmpty()
            || mes.isEmpty() || dia.isEmpty() || altura.isEmpty()){
            throw new NullPointerException (); 
        }
        
        //Validando que los textos no tengan caracteres especiales
        if(!nombre.matches("[a-zA-Z ]+") || !apellido.matches("[a-zA-Z ]+") || !nacionalidad.matches("[a-zA-Z ]+")){
            throw new Exception();
        }
        
        //Evaluando que la cadena tenga solo numeros
        if(!peso.matches("\\d+") || anio.isEmpty() || mes.isEmpty() || dia.isEmpty() || altura.isEmpty()){
            throw new Exception();
        }
    }
}
