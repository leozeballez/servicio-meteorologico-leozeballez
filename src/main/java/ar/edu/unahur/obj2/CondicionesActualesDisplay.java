package ar.edu.unahur.obj2;

public class CondicionesActualesDisplay extends Display {

    public void mostrarCondiciones() {
        System.out.println();
    }

    public void actualizar(double h, double p, double t) {
        this.humedad = h;
        this.presion = p;
        this.temperatura = t;
    }

}
