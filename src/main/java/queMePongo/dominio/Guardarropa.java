package queMePongo.dominio;

import queMePongo.sugerencias.*;
import java.util.ArrayList;
import java.util.List;


public class Guardarropa {

    private Integer edadUsuario;
    private Boolean filtrarRopaInformal;
    private MotorSugerencias motorSugerencias;
    private List<Prenda> prendas;
    private Borrador borrador;

    public Guardarropa(Integer edad){
        this.edadUsuario = edad;
        this.filtrarRopaInformal = false;
        this.motorSugerencias = MotorCasual.motorCasual;
        this.prendas = new ArrayList<Prenda>();
        this.borrador = null;
    }

    private void guardarPrenda(){
        prendas.add(borrador.buildPrenda());
    }

    private void reiniciarBorrador(){
        this.borrador = null;
    }
}