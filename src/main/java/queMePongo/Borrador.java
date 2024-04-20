package queMePongo;

public class Borrador {
    private TipoPrenda tipo;
    private Material material;
    private Trama trama;
    private Color color1;
    private Color color2;

    public Borrador(){
        tipo=null;
        material=null;
        trama=null;
        color1=null;
        color2=null;
    }

    public void setTipo(TipoPrenda tipo){
        this.tipo= tipo;
    }

    public void setMaterial(Material material){
        if(this.tipo==null){
            throw new RuntimeException("Debe especificar el tipo de prenda");
        }
        this.material=material;
    }

    public void setTrama(Trama trama){
        if(this.tipo==null){
            throw new RuntimeException("Debe especificar el tipo de prenda");
        }
        this.trama=trama;
    }

    public void setColorPrincipal(Color color){
        if(this.tipo==null){
            throw new RuntimeException("Debe especificar el tipo de prenda");
        }
        this.color1=color;
    }

    public void setColorSecundario(Color color){
        if(this.tipo==null){
            throw new RuntimeException("Debe especificar el tipo de prenda");
        }
        this.color2=color;
    }
}
