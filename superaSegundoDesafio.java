import java.util.Scanner;

public class superaSegundoDesafio {
    
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        Double valor = input.nextDouble();
        Double resto = 0.0d;
        
        int notaCem = (int) (valor/100);
        resto = valor%100;
        int notaCinquenta = (int) (resto/50);
        resto = resto%50;
        int notaVinte = (int) (resto/20);
        resto = resto%20;
        int notaDez = (int) (resto/10);
        resto = resto%10;
        int notaCinco = (int) (resto/5);
        resto = resto%5;
        int notaDois = (int) (resto/2);
        resto = resto%2;
        int moedaUm = (int) (resto/1);
        resto = resto%1;
        int moedaCinquenta = (int) (resto*10/5);
        resto = (resto*10)%5;
        int moedaVinteCinco = (int) (resto*10/25);
        resto = (resto*10)%25;
        int moedaDez = (int) (resto/10);
        resto = (resto)%10;
        int moedaCinco = (int) (resto/5);
        resto = (resto)%5;
        int moedaUmCentavo = (int) (resto/1);
        System.out.println("NOTAS:");
        System.out.println(notaCem +"\tnota(s)\t\tde\tR$\t100.00");
        System.out.println(notaCinquenta+ "\tnota(s)\t\tde\tR$\t 50.00");
        System.out.println(notaVinte+ "\tnota(s)\t\tde\tR$\t 25.00");
        System.out.println(notaDez+ "\tnota(s)\t\tde\tR$\t 10.00");
        System.out.println(notaCinco+ "\tnota(s)\t\tde\tR$\t  5.00");
        System.out.println(notaDois+ "\tnota(s)\t\tde\tR$\t  2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedaUm+ "\tmoeda(s)\tde\tR$\t  1.00");
        System.out.println(moedaCinquenta+ "\tmoeda(s)\tde\tR$\t  0.50");
        System.out.println(moedaVinteCinco+ "\tmoeda(s)\tde\tR$\t  0.25");
        System.out.println(moedaDez+ "\tmoeda(s)\tde\tR$\t  0.10");
        System.out.println(moedaCinco+ "\tmoeda(s)\tde\tR$\t  0.05");
        System.out.println(moedaUmCentavo+ " moeda(s) de R$ 0.01");
    }
}
