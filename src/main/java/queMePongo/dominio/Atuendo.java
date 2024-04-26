package queMePongo.dominio;

import java.util.List;

public class Atuendo {
    private Prenda superior;
    private Prenda inferior;
    private Prenda calzado;
    private List<Prenda> accesorios;

    public Atuendo(Prenda superior, Prenda inferior, Prenda calzado, List<Prenda> accesorios){
        if(superior.getTipo().getCategoria()!=Categoria.SUPERIOR) throw new RuntimeException("La parte superior no es de la categoría adecuada");
        if(inferior.getTipo().getCategoria()!=Categoria.INFERIOR) throw new RuntimeException("La parte inferior no es de la categoría adecuada");
        if(calzado.getTipo().getCategoria()!=Categoria.CALZADO) throw new RuntimeException("El calzado no es de la categoría adecuada");
        for(Prenda accesorio: accesorios){
            if(accesorio.getTipo().getCategoria()!=Categoria.ACCESORIO){
                throw new RuntimeException("Hay un accesorio que no es de la categoría adecuada");
            }
        }
        this.superior = superior;
        this.inferior = inferior;
        this.calzado = calzado;
        this.accesorios = accesorios;
    }
}