package Class04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Country brasil = new Country("BRA","Brasil", 8510000);
        Country espanha = new Country("ESP","Espanha", 506030);

       brasil.setPaisesVizinhos("SUR","Suriname");
       brasil.setPaisesVizinhos("COL","Colombia");

    }
}
