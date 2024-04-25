package queMePongo;

public class Uniforme {
    private Prenda parteSuperior;
    private Prenda parteInferior;
    private Prenda calzado;

    public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
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
