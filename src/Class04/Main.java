package Class04;

public class Main {

    public static void main(String[] args) {

        Country brasil = new Country("BRA","Brasil", 8510000);
        Country espanha = new Country("ESP","Espanha", 506030);


        brasil.setPaisesVizinhos("SUR","Suriname");
        brasil.setPaisesVizinhos("COL","Colombia");
        brasil.setPaisesVizinhos("URY","Uruguai");
        brasil.setPaisesVizinhos("PRY","Paraguai");

        espanha.setPaisesVizinhos("AND", "Andorra");
        espanha.setPaisesVizinhos("FR", "França");
        espanha.setPaisesVizinhos("PT", "Portugal");

        System.out.println(brasil.verificaIgualdade(espanha));
        System.out.println(brasil.verificaLimitrofe(espanha));
        brasil.verificaVizinhos(espanha);

        Continent americaDoSul = new Continent("America do Sul");

        americaDoSul.setPopulacaoTotalDoContinente(425664218);
        americaDoSul.setDimensaoTotalDoContinente(17800000);

        System.out.println(americaDoSul.verificaDensidadePopulacional());




    }
}
