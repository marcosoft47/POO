import java.lang.System;
import java.util.Scanner;

public class Ex02{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int escolha = scan.nextInt();
        int n, n2;
        switch (escolha) {
            case 1:
                n = scan.nextInt();
                if (n>10){
                    System.out.println("MAIOR");
                }else{
                    System.out.println("MENOR");
                }
                break;
            case 2:
                n = scan.nextInt();
                if (n%2 == 0){
                    n *=  5;
                }
                if (n%3 == 0){
                    n -= 1;
                }
                System.out.println(n);
                break;
            case 3:
                n = scan.nextInt();
                n++; // Não sei porque mas com n normal só vai n-1 vezes
                String[] texto = new String[n];
                for (int i = 0; i<n; i++){
                    texto[i] = scan.nextLine();
                }
                for (int i = n-1; i >= 0; i--){
                    System.out.print(texto[i] + " ");
                }
                System.out.println("");
                break;
            case 4:
                n = scan.nextInt();
                n2 = scan.nextInt();
                int temp;
                while (n2 > 0){
                    temp = n % n2;
                    n = n2;
                    n2 = temp;
                }
                System.out.println(n);
                break;
            case 5:
                boolean loopar = true;
                n = 0;
                while(loopar){
                    if(scan.hasNextInt()){
                        n += scan.nextInt();
                    } else{
                        loopar = false;
                    }
                }
                System.out.println(n);
                break;
            default:
                break;
        }
        scan.close();
    }
}