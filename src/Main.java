import Macchina.Macchina;

public class Main {
    public static void main(String[] args) {

        Macchina[] arrCars = new Macchina[5];

        arrCars[0] = new Macchina("Ferrari",1600, "GA129KM", 300000, "Rosso",7);
        arrCars[1] = new Macchina("Audi",1200, "HJ546DR", 49000.499, "Grigio",6);
        arrCars[2] = new Macchina("BMW",1300, "TY890FF", 67999.899, "Nero",6);
        arrCars[3] = new Macchina("Mercedes",1100, "RW311BM", 54000.999, "Metallizzato",6);
        arrCars[4] = new Macchina("FIAT",500, "VD678ZX", 14999.257, "Giallo",5);

        Macchina macchina1 = arrCars[0];
        Macchina macchina2 = arrCars[1];
        Macchina macchina3 = arrCars[2];
        Macchina macchina4 = arrCars[3];
        Macchina macchina5 = arrCars[4];

        infoMacchinaPiuCostosa(arrCars);
        infoMacchina("TY890FF", arrCars);
        infoMacchinaColore("giallo", arrCars);
    }

    static void infoMacchinaPiuCostosa(Macchina[] arrCars){
        double max = 0;
        Macchina carMax = null;
        for (int i = 0; i < arrCars.length; i++){
            if (arrCars[i].getValore() > max){
                max = arrCars[i].getValore();
                carMax = arrCars[i];
            }
        }
        System.out.println("\nLa macchina piu' costosa e': ");
        carMax.stampaInformazioni();

    }

    static void infoMacchina(String targa, Macchina[] arrCars){
        Macchina carTarga = null;
        for (int i = 0; i < arrCars.length; i++){
            if (targa.equals(arrCars[i].getTarga())){
                carTarga = arrCars[i];
            }
        }
        if (carTarga == null){
            throw new RuntimeException("Targa inserita inesistente!");
        } else {
            System.out.println("La targa " + "'" + targa + "'" + " corrisponde alla macchina: ");
            carTarga.stampaInformazioni();
        }

    }

    static void infoMacchinaColore(String colore, Macchina[] arrCars){
        Macchina carColore = null;
        for (int i = 0; i < arrCars.length; i++){
            if (colore.equals(arrCars[i].getColore())){
                carColore = arrCars[i];
            }
        }
        if (carColore == null){
            throw new RuntimeException("Colore inserito inesistente!");
        } else {
            System.out.println("La macchina di colore " + "'" + colore + "'" + " corrisponde a:");
            carColore.stampaInformazioni();
        }
    }
}
