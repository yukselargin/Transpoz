import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][]arr={
                {1,2,3},
                {4,5,6}
        };
        int[][]tArr = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tArr[j][i]=arr[i][j];
            }
        }
        System.out.println("Girilen matrisin transpozu : \n");
        for (int[] val : tArr) {
            for (int k : val) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}