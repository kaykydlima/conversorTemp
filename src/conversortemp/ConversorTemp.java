
package conversortemp;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConversorTemp {


    public static void main(String[] args) {
        //Programa para converter °C em ° F
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Seja bem vindo! Este é o conversor de °C para °F");
        System.out.println("Agora digite a temperatura: ");
        double temperatura = leia.nextDouble();
        System.out.println("Deseja converter para °C ou °F? Digite 'c' ou 'f' para prosseguir: ");
        char selecao = leia.next().charAt(0);
        char celsius = 'c';
        char fahrenheit = 'f';

        if(selecao == 'c'){
            double converte = temperatura * 1.8;
            System.out.println("A temperatura é de: " + converte + "°C");
        } else if (selecao == 'f'){
            double converte = temperatura / 1.8;
            System.out.println("A temperatura é de: " + converte + "°F");
    }
    }
 }
