package queMePongo.dominio;


public class Prenda {
    private TipoPrenda tipo;
    private Material material;
    private Trama trama;
    private Color color1;
    private Color color2;
    private Formalidad formalidad;

    public TipoPrenda getTipo(){
        return tipo;
    }

    public Prenda(TipoPrenda tipo,Material material, Trama trama, Color colorPrincipal, Color colorSecundario, Formalidad formalidad){
        this.tipo=tipo;
        this.material=material;
        this.color1=colorPrincipal;
        this.color2=colorSecundario;
        this.formalidad=formalidad;
    }


}
