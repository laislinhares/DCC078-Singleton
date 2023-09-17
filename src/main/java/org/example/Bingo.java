package org.example;

import java.util.Date;

public class Bingo {

    private Bingo() {}
    private static Bingo instance = new Bingo();
    public static Bingo getInstance() {
        return instance;
    }
    private String data;
    private String numerosSorteados;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumerosSorteados() {
        return numerosSorteados;
    }

    public void setNumerosSorteados(String numerosSorteados) {
        this.numerosSorteados = numerosSorteados;
    }
}
