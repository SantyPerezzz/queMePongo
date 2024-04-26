package queMePongo.dominio;

import exceptions.PrendaInvalidaException;

import java.text.Normalizer;

public class Borrador {
    private TipoPrenda tipo;
    private Material material;
    private Trama trama;
    private Color color1;
    private Color color2;
    private Formalidad formalidad;

    public Borrador(TipoPrenda tipo){
        this.tipo = tipo;
        material = null;
        trama = Trama.LISA;
        color1 = null;
        color2 = null;
        this.formalidad = null;
    }

    public TipoPrenda getTipo(){
        return tipo;
    }

    public void setMaterial(Material material){
        if(!tipo.getMaterialesValidos().contains(material)) throw new RuntimeException("Material incompatible con el tipo de prenda");
        this.material = material;
    }

    public void setTrama(Trama trama){
        this.trama = trama;
    }

    public void setColorPrincipal(Color color){
        this.color1 = color;
    }

    public void setColorSecundario(Color color){
        this.color2 = color;
    }

    public void setFormalidad(Formalidad formalidad){
        this.formalidad = formalidad;
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
