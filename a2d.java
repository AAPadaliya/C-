import java.util.Scanner;

class a2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] a = { { 1.1f, 2.4f, 3.5f }, { 4.6f, 5.4f, 6.6f } };
        System.out.println("enter your vlaue of array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("value of array[" + i + "][" + j + "]:" + a[i][j] + "\t");

            }

        }
    }

}
