package queMePongo;
import java.util.List;

public class Guardarropa {

    private List<Prenda> prendas;

    public void agregarPrenda(TipoDePrenda tipo, String material, String color1, String color2){
        switch (tipo){
            case CAMISA:
                prendas.add(new ParteSuperior(/*PARAMETROS*/));
                break;
            case ZAPATOS:
                prendas.add(new Calzado(tipo,material,color1,color2));
        }
    }
}
