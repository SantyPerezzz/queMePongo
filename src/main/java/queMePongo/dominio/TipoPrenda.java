package queMePongo.dominio;

import java.util.Arrays;
import java.util.List;

public class TipoPrenda {
    public static TipoPrenda zapatos= new TipoPrenda(Categoria.CALZADO, Arrays.asList(Material.CUERO));
    public static TipoPrenda camisa= new TipoPrenda(Categoria.SUPERIOR, Arrays.asList(Material.TELA,Material.JEAN));
    public static TipoPrenda pantalon= new TipoPrenda(Categoria.INFERIOR, Arrays.asList(Material.CUERO,Material.JEAN,Material.ALGODON));
    public static TipoPrenda sombrero= new TipoPrenda(Categoria.ACCESORIO, Arrays.asList(Material.TELA));


    private Categoria categoria;
    private List<Material> materialesValidos;
    public TipoPrenda(Categoria categoria,List<Material> materiales){
        this.categoria = categoria;
        this.materialesValidos = materiales;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    public List<Material> getMaterialesValidos(){
        return materialesValidos;
    }
}
