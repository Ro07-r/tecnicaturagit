package CicloWhile;
import java.util.Scanner;
public class CicloWhile01 { //CICLO WHILE
    public static void main(String[] args) {
        var contar = 0;
        while (contar <7){
            System.out.println("contar = " + contar);
            contar++;
        }
        
        //CICLO DO WHILE
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 7);
        
        //CICLO FOR
        for(var contando = 0; contando < 7; contando++){
            System.out.println("contando = " + contando);
        }
        
        //BREAK
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);
                break; // aparece el 0 porque apenas encuentra la primera posicion que da como resultado 0 (par) 
                       //(multiplo de 2), entonces entra al condicional, cumple, imprime y sale del ciclo
            }            
        }
        
        //CONTINUE
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 != 0){
                continue; //Vamos a la siguiente iteracion
            }
            System.out.println("contando = " + contando);
        }
        
        //EJERCICIO SUELTO DE PRACTICA
        Scanner practica = new Scanner(System.in);
        System.out.println("Ingrese un numero de ventas: ");
        var num= practica.nextInt();
        var ingreso = 0;
        while (ingreso < num){
            Scanner practice = new Scanner(System.in);
            System.out.println("Ingrese un numero de ventas: ");
            var num_2 = practice.nextLine();
            ingreso++;
        }
        
        
    }
}
