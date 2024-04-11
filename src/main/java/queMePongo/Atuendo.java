package queMePongo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter

public class Atuendo {
    private ParteSuperior superior;
    private ParteInferior inferior;
    private Calzado calzado;
    private ArrayList<Accesorio> accesorios;


}
