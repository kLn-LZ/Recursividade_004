package Controller;

public class Negativo {

    public Negativo() {
        super();

    }

    public int funcNegativo (int n[], int tam, int count) {


        // tamanho do vetor ser negativo
        if (tam < 0 ) {

            return count;
        }

        if (n[tam] < 0) {
            count += 1;
        }

        // chamar função até passar pelo vetor inteiro
        return funcNegativo(n, tam - 1, count);
    }

}
