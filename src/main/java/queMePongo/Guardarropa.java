package queMePongo;
import java.util.List;

public class Guardarropa {

    private List<Prenda> prendas;

    public void agregarPrenda(TipoPrenda tipo, String material, String color1, String color2){
        switch (tipo.categoria){
            case SUPERIOR:
                prendas.add(new ParteSuperior(tipo,material,color1,color2));
                break;
            case INFERIOR:
                prendas.add(new ParteInferior(tipo,material,color1,color2));
                break;
            case CALZADO:
                prendas.add(new Calzado(tipo,material,color1,color2));
                break;
            case ACCESORIO:
                prendas.add(new Accesorio(tipo,material,color1,color2));
                break;
            default:
                System.out.println("Escoja un tipo valido de prenda");
        }
    }
}
