import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;

public class Ex03 {
    public static Integer[][] setMatriz(Integer n, Integer m) {
        Integer matriz[][] = new Integer[n][m];
        for (Integer i = 0; i < n; i++) {
            for (Integer j = 0; j < m; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        return matriz;
    }

    public static void printMatriz(Integer mat[][], Integer n, Integer m) {
        for (Integer i = 0; i < n; i++) {
            for (Integer j = 0; j < m; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }
    }

    public static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        Integer n, m, i, j;
        Integer arr[];
        Integer mat[][], mat2[][], resultante[][];

        Integer escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                n = scan.nextInt();
                arr = new Integer[n];
                for (i = 0; i < n; i++)
                    arr[i] = scan.nextInt();

                Arrays.sort(arr);
                for (i = 0; i < n; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();
                break;

            case 2:
                n = scan.nextInt();
                m = scan.nextInt();
                mat = new Integer[n][m];
                mat = setMatriz(n, m);
                printMatriz(mat, n, m);

                break;
            case 3:
                n = scan.nextInt();
                mat = new Integer[n][n];
                mat = setMatriz(n, n);
                Integer diagPrincipal = 0, diagSecundaria = 0, multiplica = 1;
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        multiplica = multiplica * mat[j][(i + j) % n];
                    }
                    diagPrincipal += multiplica;
                    multiplica = 1;
                }
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        multiplica *= mat[j][(((n -i -j -1)%n) + n)%n];
                    }
                    diagSecundaria += multiplica;
                    multiplica = 1;
                }
                System.out.println(diagPrincipal-diagSecundaria);

                break;
            case 4:
                n = scan.nextInt();
                m = scan.nextInt();
                mat = setMatriz(n, m);
                mat2 = setMatriz(n, m);
                resultante = new Integer[n][m];

                for (i = 0; i < n; i++) {
                    for (j = 0; j < m; j++) {
                        resultante[i][j] = mat[i][j] + mat2[i][j];
                    }
                }
                printMatriz(resultante, n, m);
                break;
            case 5:
                n = scan.nextInt();
                m = scan.nextInt();
                mat = setMatriz(n, m);
                mat2 = setMatriz(m, n);
                resultante = new Integer[n][n];

                // numpy.zero()
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++)
                        resultante[i][j] = 0;
                }

                // la/lb -> Linha de mat ou mat2
                // ca/cb -> Coluna de mat ou mat2
                // ca == lb
                for (Integer la = 0; la < n; la++) {
                    for (Integer cb = 0; cb < n; cb++) {
                        for (Integer ca = 0; ca < m; ca++) {
                            resultante[la][cb] += mat[la][ca] * mat2[ca][cb];
                        }
                    }
                }
                printMatriz(resultante, n, n);
            default:
                break;
        }
        scan.close();
    }
}