package Códigos;

public class inversaoDeArrays {
    public int[] inverterArrays(int[] array1, int[] array2, int qnt) {
        for (int i = 0; i < qnt; i++) {
          array2[i] = array1[qnt-i-1];
       }
    
    return array2;
}   

}
