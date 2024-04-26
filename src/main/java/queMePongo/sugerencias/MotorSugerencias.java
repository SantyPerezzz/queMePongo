package queMePongo.sugerencias;

import queMePongo.dominio.*;
import java.util.List;

public interface MotorSugerencias {

    public Atuendo generarAtuendo(Prenda prendaPrincipal, List<Prenda> prendas);
    public List<Atuendo> generarAtuendos(List<Prenda> prendas);
}
