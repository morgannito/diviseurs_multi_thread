import diviseur.Diviseur;

public class Main {

    // calcule tout les diviseurs de n entier positif  et calcule le temps que cela prends
    // fait les calcule dans des threads differents
    // affiche le la liste des entier positif diviseur de n
    // stock les diviseurs dans un tableau
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int n = 100000;
        Diviseur d = new Diviseur(n);
        d.start();
        d.join();
        long end = System.currentTimeMillis();
        System.out.println("les diviseurs de "+n+" sont : ");
        for(int i = 0; i < d.getListe().length; i++){
            System.out.print(d.getListe()[i]+" ");
        }
        System.out.println("\nle temps d'execution est de "+(end-start)+" ms");
    }
}

