package com.betulkircil.javafundamentals;

public class KuruYemiscininKirasi {
    public static void main(String[] args){
        double leblebiFiyat = 3.5;
        double findik = 15.7;
        double badem = 22;

        double leblebiNetGelir = (12*(3.5 + (3.5*0.5))) - (12*(3.5));
        double findikNetGelir = (25*(15.7 + (15.7*0.4))) - (25*(15.7));
        double bademNetGelir = (40*(22 + (22*0.6))) - 40*(22);

        double toplamGelir = leblebiNetGelir + findikNetGelir + bademNetGelir;
        if(toplamGelir > 500){
            System.out.println("Kira odendi");
        }
        else{
            System.out.println("Kira odenemiyor...");
        }

    }
}
