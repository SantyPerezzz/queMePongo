package queMePongo;

import exceptions.PrendaInvalidaException;

import java.util.Scanner;


public class Prenda {
    private TipoPrenda tipo;
    private Material material;
    private Trama trama;
    private Color color1;
    private Color color2;

    public Prenda(TipoPrenda tipo,Material material, Trama trama, Color colorPrincipal, Color colorSecundario){
        if(tipo==null){
            throw new PrendaInvalidaException("No tiene tipo");
        }
        if(material==null){
            throw new PrendaInvalidaException("No tiene material");
        }
        if(colorPrincipal==null){
            throw new PrendaInvalidaException("No tiene color principal");
        }
        this.tipo=tipo;
        this.material=material;
        this.color1=colorPrincipal;
        this.color2=colorSecundario;
    }

    /* IMPLEMENTAR LA CREACION POR PARTES EN UNA CLASE BORRADOR
    public void elegirTipo(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Elija tipo de prenda: \n 1.Camisa \n 2.Pantalon \n 3.Zapatos \n 4.Sombrero");
            switch(scan.nextInt()){
                case 1:
                    this.tipo=TipoPrenda.camisa;
                    break;
                case 2:
                    this.tipo=TipoPrenda.pantalon;
                    break;
                case 3:
                    this.tipo=TipoPrenda.zapatos;
                    break;
                case 4:
                    this.tipo=TipoPrenda.sombrero;
                    break;
                default:
                    System.out.println("Introduzca una opción válida por favor");
                    this.elegirTipo();
            }
    }

    public void elegirMaterial(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Elija material de la prenda: \n 1.Tela \n 2.Algodon \n 3.Jean \n 4.Cuero");
        switch(scan.nextInt()){
            case 1:
                this.material=Material.TELA;
                break;
            case 2:
                this.material=Material.ALGODON;
                break;
            case 3:
                this.material=Material.JEAN;
                break;
            case 4:
                this.material=Material.CUERO;
                break;
            default:
                System.out.println("Introduzca una opción válida por favor");
                this.elegirMaterial();
        }
    }

    public void elegirTrama(){

    }

    public void elegirColor(){

    }
*/
}
