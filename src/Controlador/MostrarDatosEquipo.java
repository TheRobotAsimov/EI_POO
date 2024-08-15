package Controlador;

import java.util.HashMap;
import java.util.Map;

public class MostrarDatosEquipo extends MostrarDatosBase<BuscarEquipo> {

    @Override
    protected BuscarEquipo crearBuscador() {
        return new BuscarEquipo();
    }

    @Override
    protected Map<Integer, String> getOpcMap() {
        Map<Integer, String> opcMap = new HashMap<>();
        opcMap.put(1, "idEquipo");
        opcMap.put(2, "marca");
        opcMap.put(3, "director");
        opcMap.put(4, "nacionalidadEquipo");
        return opcMap;
    }
}
