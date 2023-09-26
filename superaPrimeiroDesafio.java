import java.util.Scanner;

public class superaPrimeiroDesafio {

    private static Integer[] ordemCrescente (Integer[] lista, Integer maxIndex){
        Integer[] ordenada = new Integer[maxIndex];
        Integer swap = 0;
        ordenada=lista;
        for (int i=0;i<maxIndex;i++){
            for (int j=maxIndex-1;j>0;j--){
                if (ordenada[j]<ordenada[j-1]){
                    swap = ordenada[j-1];
                    ordenada[j-1]=ordenada[j];
                    ordenada[j]=swap;
                }
            }            
        }
        return ordenada;       
    }
    private static Integer[] ordemDecrescente (Integer[] lista, Integer maxIndex){
        Integer[] ordenada = new Integer[maxIndex];
        Integer swap = 0;
        ordenada=lista;
        for (int i=0;i<maxIndex;i++){
            for (int j=maxIndex-1;j>0;j--){
                if (ordenada[j]>ordenada[j-1]){
                    swap = ordenada[j-1];
                    ordenada[j-1]=ordenada[j];
                    ordenada[j]=swap;
                }
            }           
        }
        return ordenada;       
    }

    public static void main (String args[]){
        Integer termos= 0;
        Scanner input = new Scanner(System.in);
       // System.out.println("Digite a quantidade de termos a serem ordenados.");
        termos = input.nextInt();
        Integer[] par= new Integer[termos];
        Integer[] impar = new Integer[termos];
        Integer indexPar=0;
        Integer indexImpar = 0;
        Integer numero=0;
        for (int i=0;i<termos;i++){
          //  System.out.println("Digite o "+(i+1)+"° número:");
            numero = input.nextInt();
            if (numero%2==0){
                par[indexPar]=numero;
                indexPar++;
            } else{
                    impar[indexImpar]=numero;
                    indexImpar++;
            }
        }
        par=ordemCrescente (par, indexPar);
        impar=ordemDecrescente(impar, indexImpar);
        for (int i=0;i<indexPar;i++){
            System.out.println(par[i]);
        }
        for (int i=0;i<indexImpar;i++){
            System.out.println(impar[i]);
        }
    }
}