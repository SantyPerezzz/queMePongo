package queMePongo;

import java.util.ArrayList;
import java.util.Scanner;


public class Guardarropa {

    private ArrayList<Prenda> prendas;
    private Prenda borrador;

    public Guardarropa(){
        this.prendas= new ArrayList<Prenda>();
        this.borrador= null;
    }
    public void agregarPrenda(TipoPrenda tipo, Material material,Trama trama, Color color1, Color color2){
        prendas.add(new Prenda(tipo,material,trama,color1,color2));
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public void agregarPrenda(){
        if(borrador==null){
            borrador= new Prenda();
            borrador.elegirTipo();
            borrador.elegirMaterial();
            borrador.elegirTrama();
            borrador.elegirColor();
        } else if(borrador.getMaterial()==null){
            borrador.elegirMaterial();
            borrador.elegirTrama();
            borrador.elegirColor();
        } else if(borrador.getTrama()==null){
            borrador.elegirTrama();
            borrador.elegirColor();
        } else if(borrador.getColor1()==null){
            borrador.elegirColor();
        } else{
            System.out.println("¿Qué desea hacer?\n 1.Guardar la prenda borrador \n 2.Posponer decisión \n 3.Descartar borrador");
            Scanner scan=new Scanner(System.in);
            switch(scan.nextInt()){
                case 1:
                    this.guardarPrenda();
                    break;
                case 2:
                    break;
                case 3:
                    borrador=null;
                default:
                    System.out.println("Elija una opcion válida");
                    this.agregarPrenda();
            }
        }
    }

    private void guardarPrenda(){
        prendas.add(borrador);
        borrador=null;
    }

}
