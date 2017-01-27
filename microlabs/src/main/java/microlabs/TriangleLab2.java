package microlabs;

/**
 * Created by andykim on 1/27/17.
 */
public class TriangleLab2 {
    public static void main(String[] args){

        int i = 0;

        while (i <= 5) {
            int j = 5;
            while(j > i ){

                System.out.print("*");
                j--;

            }
            i++;
            System.out.println("");
        }


    }
}
