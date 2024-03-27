package Class04;

import java.util.ArrayList;

public class Continent {

        private String nomeDoContinente;
        private ArrayList<String> paisesDoContinente = new ArrayList<>();
        private Integer dimensaoTotalDoContinente;
        private Integer populacaoTotalDoContinente;
        private Integer densidadePopulacionalDoContinente;


    public Continent(String nomeDoContinente) {
        this.nomeDoContinente = nomeDoContinente;
    }

    public void adicionarPais(String nomeDoPais){
        this.paisesDoContinente.add(nomeDoPais);
    }

    public Integer getDimensaoTotalDoContinente() {
        return dimensaoTotalDoContinente;
    }

    public void setDimensaoTotalDoContinente(Integer dimensaoTotalDoContinente) {
        this.dimensaoTotalDoContinente = dimensaoTotalDoContinente;
    }

    public Integer getPopulacaoTotalDoContinente() {
        return populacaoTotalDoContinente;
    }

    public void setPopulacaoTotalDoContinente(Integer populacaoTotalDoContinente) {
        this.populacaoTotalDoContinente = populacaoTotalDoContinente;
    }

    public String verificaDensidadePopulacional(){
        this.densidadePopulacionalDoContinente =
                this.populacaoTotalDoContinente/this.dimensaoTotalDoContinente;

        return "\nA densidade populacional do continente é de " + this.densidadePopulacionalDoContinente
                + " habitantes/km^2";
    }

}
