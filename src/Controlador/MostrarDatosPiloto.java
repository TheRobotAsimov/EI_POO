package Controlador;

import java.util.HashMap;
import java.util.Map;

public class MostrarDatosPiloto extends MostrarDatosBase<BuscarPiloto> {

    @Override
    protected BuscarPiloto crearBuscador() {
        return new BuscarPiloto();
    }

    @Override
    protected Map<Integer, String> getOpcMap() {
        Map<Integer, String> opcMap = new HashMap<>();
        opcMap.put(1, "idPiloto");
        opcMap.put(2, "nombre");
        opcMap.put(3, "apellido");
        opcMap.put(4, "nacionalidad");
        return opcMap;
    }
}
