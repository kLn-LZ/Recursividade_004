package View;

import java.util.*;
import Controller.Negativo;

public class Principal {
    public static void main(String[] args) {

        Negativo negativo = new Negativo();

        Scanner scan = new Scanner(System.in);

        int v[] = new int[11];

        int tam = v.length;

        for (int i = 0; i < tam - 1; i++) {

            v[i] = scan.nextInt();

        }

        System.out.println(negativo.funcNegativo(v, tam - 1 , 0));




    }



}
