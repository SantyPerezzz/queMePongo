package queMePongo;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter

public class Guardarropa {

    private List<Prenda> prendas;

    public void agregarPrenda(TipoPrenda tipo, Material material, Color color1, Color color2){
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
        }
    }
}
