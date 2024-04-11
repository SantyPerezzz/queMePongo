package queMePongo;

public enum TipoPrenda {
    ZAPATOS(Categoria.CALZADO),
    CAMISA(Categoria.SUPERIOR),
    PANTALON(Categoria.INFERIOR),
    SOMBRERO(Categoria.ACCESORIO);


    final Categoria categoria;

    TipoPrenda(Categoria categoria) {
        this.categoria=categoria;
    }

}
