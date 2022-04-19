package diviseur;

public class Diviseur extends Thread {
    private int n;
    private int[] liste;

    // declaration du constructeur
    public Diviseur(int n) {
        this.n = n;
    }

    // declaration de la methode run
    public void run() {
        liste = new int[n];
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                liste[j] = i;
                j++;
            }
        }
    }

    // declaration de la methode getListe
    public int[] getListe() {
        return liste;
    }
}
