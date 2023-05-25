package Exercicio1;

public class Fluorescente extends FabricaLampada implements Lampada {

    @Override
    public String getLigar() {
        return "Lampada Ligada";
    }

    @Override
    public String getDesligar() {
        return "Lampada Desligada";
    }


}
