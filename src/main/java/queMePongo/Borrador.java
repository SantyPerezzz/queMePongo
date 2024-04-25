package queMePongo;

import exceptions.PrendaInvalidaException;

public class Borrador {
    private TipoPrenda tipo;
    private Material material;
    private Trama trama;
    private Color color1;
    private Color color2;

    public Borrador(TipoPrenda tipo){
        this.tipo=tipo;
        material=null;
        trama=Trama.LISA;
        color1=null;
        color2=null;
    }

    public TipoPrenda getTipo(){
        return tipo;
    }

    public void setMaterial(Material material){
        this.material=material;
    }

    public void setTrama(Trama trama){
        this.trama=trama;
    }

    public void setColorPrincipal(Color color){
        this.color1=color;
    }

    public void setColorSecundario(Color color){
        this.color2=color;
    }

    public Prenda buildPrenda(){
        if(tipo==null){
            throw new PrendaInvalidaException("No tiene tipo");
        }
        if(material==null){
            throw new PrendaInvalidaException("No tiene material");
        }
        if(color1==null){
            throw new PrendaInvalidaException("No tiene color principal");
        }

        return new Prenda(tipo,material,trama,color1,color2);
    }

}
