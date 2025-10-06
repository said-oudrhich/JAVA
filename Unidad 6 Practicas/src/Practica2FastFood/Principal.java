package Practica2FastFood;

public class Principal {
    public static void main(String[] args) {
        // carta
        Ternera     plato1 = new Ternera("simple",15.5,"Hamburguesa de ternera básica");
        Buey        plato2 = new Buey("doble",25.5,"Hamburguesa de ternera doble");
        MasaFina    plato3 = new MasaFina("pequeña",16.75,"pizza masa fina tamaño pequeño");
        MasaFina    plato4 = new MasaFina("mediana",25.0,"pizza masa fina tamaño mediano");
        MasaFina    plato5 = new MasaFina("grande",31.25,"pizza masa fina tamaño grande");
        MasaGruesa  plato6 = new MasaGruesa("pequeña", 20.0, "pizza masa gruesa tamaño pequeño");
        MasaGruesa  plato7 = new MasaGruesa("mediana", 28.0, "pizza masa gruesa tamaño mediano");
        MasaGruesa  plato8 = new MasaGruesa("grande", 33.60, "pizza masa gruesa tamaño grande");
        Vegetariana plato9 = new Vegetariana("simple",19.0,"Hamburguesa vegetariana");

        Cliente pepe = new Cliente("pepe");
        Cliente rebeca = new Cliente("rebeca");

        // Pedido de Pepe (1 plato para probar)
        pepe.hacerPedido(plato1);

        // Pedido de Rebeca (10 platos distintos)
        rebeca.hacerPedido(plato2);
        rebeca.hacerPedido(plato3);
        rebeca.hacerPedido(plato4);
        rebeca.hacerPedido(plato5);
        rebeca.hacerPedido(plato6);
        rebeca.hacerPedido(plato7);
        rebeca.hacerPedido(plato8);
        rebeca.hacerPedido(plato9);
        rebeca.hacerPedido(plato1);
        rebeca.hacerPedido(plato2);

        pepe.visualizarMisPlatos();
        System.out.println();
        rebeca.visualizarMisPlatos();
    }
}
