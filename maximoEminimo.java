package Códigos;

public class maximoEminimo {
    

    public void encontrarOmaiorEmenor(int[] arrayQualquer) {
        int maiorPossivel = Integer.MIN_VALUE;
        int menorPossivel = Integer.MAX_VALUE;

        for (int i : arrayQualquer) {
            if (i > maiorPossivel) {
                maiorPossivel = i;
            }
            if (i < menorPossivel) {
                menorPossivel = i;
            }
        }
        System.out.println("Maior valor possível: " + maiorPossivel);
        System.out.println("Menor valor possível: "  + menorPossivel);
    }

}
