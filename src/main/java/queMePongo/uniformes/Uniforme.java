package queMePongo.uniformes;

import queMePongo.dominio.Categoria;
import queMePongo.dominio.Prenda;

public class Uniforme {
    private Prenda parteSuperior;
    private Prenda parteInferior;
    private Prenda calzado;

    public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
        if(parteSuperior.getTipo().getCategoria()!= Categoria.SUPERIOR) throw new RuntimeException("La parte superior no es de la categoría adecuada");
        if(parteInferior.getTipo().getCategoria()!=Categoria.INFERIOR) throw new RuntimeException("La parte inferior no es de la categoría adecuada");
        if(calzado.getTipo().getCategoria()!=Categoria.CALZADO) throw new RuntimeException("El calzado no es de la categoría adecuada");
        this.parteSuperior = parteSuperior;
        this.parteInferior = parteInferior;
        this.calzado = calzado;
    }

    public void fabricarUniforme(Sastre sastre){
        this.parteSuperior = sastre.fabricarParteSuperior();
        this.parteInferior = sastre.fabricarParteInferior();
        this.calzado = sastre.fabricarCalzado();
    }
}
