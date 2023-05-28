/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puntofijo1;

/**
 *
 * @author WSVARGAS
 */
public class Puntofijo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hexadecimal = 0x00600000;

        // Obtener los componentes del número en coma flotante
        int signo = (hexadecimal >> 31) & 1;
        int exponente = ((hexadecimal >> 23) & 0xFF);
        int mantisa = hexadecimal & 0x7FFFFF;

        // Convertir la mantisa y el exponente a sus representaciones binarias
        String mantisaBinaria = String.format("%23s", Integer.toBinaryString(mantisa)).replace(' ', '0');
        String exponenteBinario = String.format("%8s", Integer.toBinaryString(exponente)).replace(' ', '0');

        // Convertir los componentes a valores decimales
        double valor = Math.pow(-1, signo) * (1 + (mantisa / Math.pow(2, 23))) * Math.pow(2, exponente - 127);
        System.out.println("Ejercicio 5:");
        System.out.println("");
        // Imprimir el resultado
        System.out.println("Número hexadecimal: 0x00600000");
        System.out.println("Signo: " + signo);
        System.out.println("Exponente (binario): " + exponenteBinario);
        System.out.println("Mantisa (binario): " + mantisaBinaria);
        System.out.println("Valor decimal: " + valor);
        
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("Ejercicio 6:");
        System.out.println("");
        System.out.println("");
        
        
        float numero1 = -24.50f;

        // Obtener los componentes del número en coma flotante
        int bits1 = Float.floatToIntBits(numero1);
        int signo1 = (bits1 >> 31) & 1;
        int exponente1 = (bits1 >> 23) & 0xFF;
        int mantisa1 = bits1 & 0x7FFFFF;

        // Convertir la mantisa y el exponente a sus representaciones binarias
        String mantisaBinaria1 = String.format("%23s", Integer.toBinaryString(mantisa1)).replace(' ', '0');
        String exponenteBinario1 = String.format("%8s", Integer.toBinaryString(exponente1)).replace(' ', '0');

        // Convertir los componentes a valores decimales
        float valor1 = (float) ((Math.pow(-1, signo1) * (1 + (mantisa1 / Math.pow(2, 23)))) * Math.pow(2, exponente1 - 127));

        // Imprimir los resultados
        System.out.println("Número: " + numero1);
        System.out.println("Signo: " + signo1);
        System.out.println("Exponente (binario): " + exponenteBinario1);
        System.out.println("Mantisa (binario): " + mantisaBinaria1);
        System.out.println("Valor decimal: " + valor1);
        System.out.println("Valor en binario: " + String.format("%32s", Integer.toBinaryString(bits1)).replace(' ', '0'));
        System.out.println("Valor en hexadecimal: 0x" + String.format("%8s", Integer.toHexString(bits1)).replace(' ', '0').toUpperCase());
    
    }
    }
    
    

