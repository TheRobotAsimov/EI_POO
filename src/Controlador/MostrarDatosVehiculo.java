package Controlador;

import java.util.HashMap;
import java.util.Map;

public class MostrarDatosVehiculo extends MostrarDatosBase<BuscarVehiculo> {

    @Override
    protected BuscarVehiculo crearBuscador() {
        return new BuscarVehiculo();
    }

    @Override
    protected Map<Integer, String> getOpcMap() {
        Map<Integer, String> opcMap = new HashMap<>();
        opcMap.put(1, "idVehiculo");
        opcMap.put(2, "modelo");
        opcMap.put(3, "numero");
        opcMap.put(4, "color");
        return opcMap;
    }
}
