package com.unama;

import sun.security.util.Debug;

import java.util.Scanner;

public class Q02<Run> {
    public static String calcsemana (int codigoSemana){
        switch (codigoSemana){
            case 1:
            return "Segunda-Feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-Feira";
            case 4:
                return "Quinta-Feira";
            case 5:
                return "Sexta-Feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
    }
        return null;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o código da semana: ");
        int codigoSemana = sc.nextInt();
        String semana = calcsemana(codigoSemana);
        System.out.println("O dia da semana é: " +semana);
    }
}
