public class sbpKuis {
    public static void main(String[] args) {
        // Fakta Fwal
        boolean A = true, B = false, C = false, D = false, E = true, F = false, G = false, H = false, I = false, J = false, K = false;

        // Iterasi Forward Chaining
        while (!K) {
            if (A && B && !C) {
                System.out.println("Fakta baru C");
                C = true;
            }
            if (C && !D) {
                System.out.println("Fakta baru D");
                D = true;
            }
            if (A && E && !F) {
                System.out.println("Fakta baru F");
                F = true;
            }
            if (A && !G) {
                System.out.println("Fakta baru G");
                G = true;
            }
            if (F && G && !D) {
                System.out.println("Fakta baru D");
                D = true;
            }
            if (G && E && !H) {
                System.out.println("Fakta baru H");
                H = true;
            }
            if (C && H && !I) {
                System.out.println("Fakta baru I");
                I = true;
            }
            if (I && A && !J) {
                System.out.println("Fakta baru J");
                J = true;
            }
            if (G && !J) {
                System.out.println("Fakta baru J");
                J = true;
            }
            if (J && !K) {
                System.out.println("Fakta baru K");
                K = true;
            }
        }

        // Output
        if (K) {
            System.out.println("Nilai K bernilai benar (" + K + ")");
        }
    }
}
