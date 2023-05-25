package Exercicio1;

import java.util.Scanner;

public class FabricaLampada {
    Scanner ler = new Scanner(System.in);
    private String flourescente;
    private String incandescente;

    public FabricaLampada() {
        this.flourescente = "flourescente";
        this.incandescente = "incandescente";
    }

    public String getLigar() {
        return "Lampada Ligada";
    }
    public String getDesligar() {
        return "Lampada Desligada";
    }

    public void getConstruir() {

        System.out.println("Deseja construir uma Lampada:\n1 - Flourescente\n2 - Incandescende");
        int entrada = ler.nextInt();

        if (entrada == 1) {
            System.out.println("Lampada "+flourescente+" criada");

        }else if (entrada == 2){
            System.out.println("Lampada "+incandescente+" criada");
        }else{
            System.out.println("Valor invalido");
        }
    }
    public void getLigarOuDesligar() {

        System.out.println("Deseja ligar ou desligar a Lampada:\n1 - Ligar\n2 - Desligar");
        int entrada = ler.nextInt();

        if (entrada == 1) {
            System.out.println(getLigar());

        }else if (entrada == 2){
            System.out.println(getDesligar());
        }else{
            System.out.println("Valor invalido");
        }
    }



}



