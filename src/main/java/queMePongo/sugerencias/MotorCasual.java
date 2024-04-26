package queMePongo.sugerencias;

import queMePongo.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class MotorCasual implements MotorSugerencias{

    public MotorCasual(){
    }

    public Atuendo generarAtuendo(Prenda prendaPrincipal, List<Prenda> prendas){


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
