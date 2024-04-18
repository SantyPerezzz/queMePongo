package queMePongo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter

public class Atuendo {
    private Prenda superior;
    private Prenda inferior;
    private Prenda calzado;
    private ArrayList<Prenda> accesorios;


}
