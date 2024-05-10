import java.lang.System;

public class Ex05 {
    public static void main(String args[]){
        boolean ehPrimo = true;
        for (int i = 2; i < 100; i++){
            for (int j = 2; j < i; j++){
                if (i%j == 0)
                    ehPrimo = false;
            }
            if (ehPrimo)
                System.out.print(i + " ");
            ehPrimo = true;
        }
    }
}
