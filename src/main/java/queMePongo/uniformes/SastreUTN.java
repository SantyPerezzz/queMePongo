package queMePongo.uniformes;

import queMePongo.dominio.Borrador;
import queMePongo.dominio.Prenda;
import queMePongo.dominio.TipoPrenda;

public class SastreUTN implements Sastre{
    // Esta clase es un ejemplo de como serian los sastres que implementan la interfaz Sastre

    @Override
    public Prenda fabricarParteSuperior() {
        Borrador parteSuperior = new Borrador(TipoPrenda.camisa);
        // Arma la prenda con las caracteristicas deseadas

        return parteSuperior.buildPrenda();
    }

    @Override
    public Prenda fabricarParteInferior() {
        Borrador parteInferior = new Borrador(TipoPrenda.pantalon);
        // Arma la prenda con las caracteristicas deseadas

        return parteInferior.buildPrenda();
    }

    @Override
    public Prenda fabricarCalzado() {
        Borrador calzado = new Borrador(TipoPrenda.zapatos);
        // Arma la prenda con las caracteristicas deseadas

        return calzado.buildPrenda();
    }
}
