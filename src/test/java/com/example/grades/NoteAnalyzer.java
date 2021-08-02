package com.example.grades;

public class NoteAnalyzer {

    private Boolean isProvaFinal;
    private int primeira;
    private int segunda;
    private int terceira;
    private int quarta;
    private int provaFinal;

    public NoteAnalyzer(Boolean isProvaFinal, int primeira, int segunda, int terceira, int quarta, int provaFinal) {
        this.isProvaFinal = isProvaFinal;
        this.primeira = primeira;
        this.segunda = segunda;
        this.terceira = terceira;
        this.quarta = quarta;
        this.provaFinal = provaFinal;
    }

    public String analyze() {
        int media;
        media = (primeira + segunda + terceira + quarta) / 4;

        if (isProvaFinal) {
            media = (media + provaFinal) / 2;
            if (media >= 6) {
                return "Aprovado na prova final."; // 1
            } else {
                return "Reprovado na prova final."; // 2
            }
        } else {
            if (media >= 6 ) {
                return "Aprovado."; // 3
            } else if (media < 6 && media >= 4) {
                return "Prova final."; // 4
            } else {
                return "Reprovado."; // 5
            }
        }
    }


    public void setProvaFinal(Boolean provaFinal) {
        isProvaFinal = provaFinal;
    }

    public int getProvaFinal() {
        return provaFinal;
    }

    public void setProvaFinal(int provaFinal) {
        this.provaFinal = provaFinal;
    }

    public int getPrimeira() {
        return primeira;
    }

    public void setPrimeira(int primeira) {
        this.primeira = primeira;
    }

    public int getSegunda() {
        return segunda;
    }

    public void setSegunda(int segunda) {
        this.segunda = segunda;
    }

    public int getTerceira() {
        return terceira;
    }

    public void setTerceira(int terceira) {
        this.terceira = terceira;
    }

    public int getQuarta() {
        return quarta;
    }

    public void setQuarta(int quarta) {
        this.quarta = quarta;
    }
}
