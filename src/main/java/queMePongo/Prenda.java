package queMePongo;

import lombok.Getter;

@Getter

public class Prenda {
    private TipoPrenda tipo;
    private Material material;
    private Color color1;
    private Color color2;

    public Prenda(TipoPrenda tipo,Material material, Color colorPrincipal){
        this.tipo=tipo;
        this.material=material;
        this.color1=colorPrincipal;
        this.color2 = null;
    }

    public Prenda(TipoPrenda tipo,Material material, Color colorPrincipal, Color colorSecundario){
        this.tipo=tipo;
        this.material=material;
        this.color1=colorPrincipal;
        this.color2=colorSecundario;
    }

}
