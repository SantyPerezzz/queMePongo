package queMePongo.sugerencias;

import queMePongo.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class MotorCasual implements MotorSugerencias{

    public static MotorCasual motorCasual= new MotorCasual();

    public MotorCasual(){
    }

    public Atuendo generarAtuendo(Prenda prendaPrincipal, List<Prenda> prendas){
        // TODO Implementar algoritmo que genere atuendos a partir de una prenda principal.
        // Idea: Hacer funciones en las prendas que comparen su compatibilidad con otra prenda

        return null;
    }

    public List<Atuendo> generarAtuendos(List<Prenda> prendas){
        List<Atuendo> atuendos = new ArrayList<>();
        Atuendo aux;
        for(Prenda prenda: prendas) {
            aux = generarAtuendo(prenda, prendas);
            if(!atuendos.contains(aux)){
                atuendos.add(aux);
            }
        }
        return atuendos;
    }
}
