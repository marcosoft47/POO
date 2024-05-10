import java.lang.System;

public class Ex03 {
    public static void main(String args[]){
        boolean x = true;
        boolean y = true;
        boolean z = true;

        for (int i = 0; i<2 ; i++){
            x = !x;
            for (int j = 0; j<2 ; j++){
                y = !y;
                for (int k = 0; k<2 ; k++){
                    z = !z;
                    System.out.println(x + " e " + y + " ou " + z + " = " + ((x&&y)||z));
                }
            }
        }
    }
}
