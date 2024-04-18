package queMePongo;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter

public class Guardarropa {

    private List<Prenda> prendas;

    public void agregarPrenda(TipoPrenda tipo, Material material,Trama trama, Color color1, Color color2){
        prendas.add(new Prenda(tipo,material,trama,color1,color2));
    }

}
