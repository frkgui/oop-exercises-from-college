package Class04;


/*
* CÓDIGO ISO 3166-1
* (ex.: BRA),
* nome (ex.:Brasil),
* população (ex.: 193.946.886)
* e a sua dimensão em Km2 (ex.: 8.515.767,049).
* Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira.
* */

import java.util.ArrayList;

public class Country {

    // Var
    private String codigoIso;
    private String nomePais;
    private double populacaoPais;
    private Integer dimensaoPais; //km^2
    private ArrayList<Country> paisesVizinhos = new ArrayList<>();


    // Constructor
    public Country(String codigoIso, String nomePais, Integer dimensaoPais) {
        this.codigoIso = codigoIso;
        this.nomePais = nomePais;
        this.dimensaoPais = dimensaoPais;
    }

    public Country(String codigoIso, String nomePais) {
        this.codigoIso = codigoIso;
        this.nomePais = nomePais;
    }

    // Getters & Setters

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public double getPopulacaoPais() {
        return populacaoPais;
    }

    public void setPopulacaoPais(int populacaoPais) {
        this.populacaoPais = populacaoPais;
    }

    public ArrayList<Country> getPaisesVizinhos() {
        return paisesVizinhos;
    }

    public void setPaisesVizinhos(String iso, String nomePais) {
        this.paisesVizinhos.add(new Country(iso,nomePais));
    }

    public double getDimensaoPais() {
        return dimensaoPais;
    }

    public void setDimensaoPais(Integer dimensaoPais) {
        this.dimensaoPais = dimensaoPais;
    }

    // Methods

    public String verificaIgualdade(Country paisVerificado){
        if(this.codigoIso == paisVerificado.getCodigoIso()){return "\nOs paises são iguais!";}
        return "\nOs paises sao diferentes!";
    }

    public String verificaLimitrofe(Country paisVerificado){
        for (int i = 0; i < this.paisesVizinhos.size(); i++) {
            if(paisesVizinhos.get(i) == paisVerificado){
                return "\nO país verificado É limitrofe!";
            }
        }
        return "\nO país verificado NÃO é limitrofe";
    }

    public String retornaDensidadePopulacional(){
        int densidadePopulacional = (int) (this.populacaoPais/this.dimensaoPais);
        return "\nA densidade populacional é de " + densidadePopulacional;
    }

    public void verificaVizinhos(Country paisComparado){
        boolean temVizinhoEmComum = false;

        for (Country vizinho : this.paisesVizinhos) {
            for (Country vizinhoComparado : paisComparado.getPaisesVizinhos()) {
                if(vizinho.equals(vizinhoComparado)){
                    System.out.printf("\nOs dois paises possuem %s como vizinho!", vizinho.getNomePais());
                    temVizinhoEmComum = true;
                }
            }
        }

        if (!temVizinhoEmComum) {
            System.out.println("\nOs países não possuem vizinhos em comum!");
        }
    }


}
