package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MeteoData {

    private final EstacionMeteorologica estacionMeteorologica;
    private List<Display> displays = new ArrayList<>();
    private final CondicionesActualesDisplay condicionesActualesDisplay = new CondicionesActualesDisplay();

    public MeteoData(EstacionMeteorologica estacionMeteorologica, List<Display> displays) {
        this.estacionMeteorologica = estacionMeteorologica;
        this.displays = displays;
    }

    public double getHumedad() {
        return new Random().nextDouble();
    }

    public double getTemperatura() {
        return new Random().nextDouble();
    }

    public double getPresion() {
        return new Random().nextDouble();
    }

    /**
     * No nos interesa saber como MeteData obtiene los datos de la estación meteorológica.
     * Solo nos interesa saber que cada vez q algún dato se actualiza, se ejecuta el método
     * informacionActualizada
     */
    public void informacionActualizada() {
        displays.stream().forEach( d -> d.actualizar(this.getHumedad(), this.getPresion(), this.getTemperatura()) );
    }
}
