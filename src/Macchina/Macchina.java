package Macchina;

import java.util.Locale;

public class Macchina {


    //ATTRIBUTI
    private String nome;
    private int cilindrata;
    private String targa;
    private double prezzo;
    private String colore;
    private int numeroMarce;
    private boolean motoreAcceso = false;
    private int marcia = 0;



    //COSTRUTTORE

    public Macchina(String nome, int cilindrata, String targa, double prezzo, String colore, int numeroMarce) {
        this.nome = nome;
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.prezzo = prezzo;
        this.colore = colore;
        this.numeroMarce = numeroMarce;

    }



    //GETTER & SETTER

    public String getNome() {
        return nome;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa.toUpperCase(Locale.ROOT);
    }


    public String getColore() {
        return colore.toLowerCase(Locale.ROOT);
    }

    public int getNumeroMarce() {
        return numeroMarce;
    }


    public void setMotoreAcceso(boolean motoreAcceso) {
        this.motoreAcceso = motoreAcceso;
    }

    public int getMarcia() {
        return marcia;
    }

    public void setMarcia(int marcia) {
        this.marcia = marcia;
    }

    public double getValore() {
        return prezzo;
    }


    //METODI

    public void accendiMotore(){
        setMotoreAcceso(true);
    }

    public void spegniMotore(){
        setMotoreAcceso(false);
        setMarcia(0);
    }

    public void cambiaMarcia(int numeroMarcia){
        if (numeroMarcia >= 0 && numeroMarcia <= getNumeroMarce() && numeroMarcia != getMarcia()){
        setMarcia(numeroMarcia);
        }
        else {
            throw new RuntimeException("Marcia non valida");
        }
    }

    public void scalaMarcia(){
        if (getMarcia() < 1){
            throw new RuntimeException("Impossibile scalare la marcia!");
        }
        else{
        setMarcia(getMarcia()-1);
        }
    }

    public void aumentaMarcia(){
        if (getMarcia() == getNumeroMarce()){
            throw new RuntimeException("Impossibile aumentare la marcia!");
        }
        else{
            setMarcia(getMarcia()+1);
        }
    }

    public void stampaInformazioni(){
        System.out.println("Nome: " + getNome() + "\nCilindrata: " + getCilindrata() + "" + "\nColore: " + getColore() + "\nMarce: " + getNumeroMarce()  + "\nTarga: " + getTarga() + "\nPrezzo: " + getValore() + "\n");
    }

}
