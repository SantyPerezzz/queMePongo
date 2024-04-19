package queMePongo;

import lombok.Getter;

import java.util.ArrayList;

@Getter

public class TipoPrenda {
    public static TipoPrenda zapatos= new TipoPrenda(Categoria.CALZADO);
    public static TipoPrenda camisa= new TipoPrenda(Categoria.SUPERIOR);
    public static TipoPrenda pantalon= new TipoPrenda(Categoria.INFERIOR);
    public static TipoPrenda sombrero= new TipoPrenda(Categoria.ACCESORIO);


    private Categoria categoria;
    public TipoPrenda(Categoria categoria){
        this.categoria=categoria;
    }
}
