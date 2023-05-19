
package ejerciciostransformaciones;


public class EjerciciosTransformaciones {

    // Numero Binario 101111 a decimal//
    public static void main(String[] args) {
        String nb = "101111";
        int nd = binaryToDecimal(nb);
        System.out.println("ejercicio n1");
        System.out.println("El número binario " + nb + " en decimal es: " + nd);
        
        
             double decimalNumber = 27.025;
        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;
        
        String binaryIntegerPart = Integer.toBinaryString(integerPart);
        String binaryFractionalPart = convertFractionalPartToBinary(fractionalPart);
        
        String binaryNumber = binaryIntegerPart + "." + binaryFractionalPart;
         System.out.println("ejercicio n2");
        System.out.println("El número binario es: " + binaryNumber);
        
         String octalNumber = "42";
        int decimalNumber1 = convertOctalToDecimal(octalNumber);
         System.out.println("ejercicio n3");
        System.out.println("El número decimal es: " + decimalNumber1);
        
        int decimalNumber2 = 64;
        String binaryNumber2 = convertDecimalToBinary(decimalNumber2);
         System.out.println("ejercicio n4");
        System.out.println("El número binario es: " + binaryNumber2);
        
        int decimalNumber3 = 145;
        String binaryNumber3 = convertDecimalToBinary(decimalNumber3);
         System.out.println("ejercicio n5");
        System.out.println("El número binario es: " + binaryNumber3);
        
         char hexChar = 'C';
        int decimalNumber4 = convertHexToDecimal(hexChar);
         System.out.println("ejercicio n6");
        System.out.println("El número decimal es: " + decimalNumber4);
         System.out.println("ejercicio n7");
         String hex = "ABCD";
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("El valor hexadecimal " + hex + " en decimal es: " + decimal);
    }

       public static int binaryToDecimal(String nb) {
        int nd = 0;
        int power = 0;

        for (int i = nb.length() - 1; i >= 0; i--) {
            if (nb.charAt(i) == '1') {
                nd += Math.pow(2, power);
            }
            power++;
        }

        return nd;
    }
       //Numero decimal 27.025 a binario//
       private static String convertFractionalPartToBinary(double fractionalPart) {
        StringBuilder binaryBuilder = new StringBuilder();
        
        while (fractionalPart != 0) {
            fractionalPart *= 2;
            int bit = (int) fractionalPart;
            binaryBuilder.append(bit);
            fractionalPart -= bit;
        }
        
        return binaryBuilder.toString();
    }
       //Numero 42 en base 8 a decimal//
           private static int convertOctalToDecimal(String octalNumber) {
        int decimalNumber = 0;
        
        for (int i = 0; i < octalNumber.length(); i++) {
            int digit = Character.getNumericValue(octalNumber.charAt(i));
            decimalNumber = decimalNumber * 8 + digit;
        }
        
        return decimalNumber;
    }
           
           //transformar el numero 64 base 10 a binario
            //transformar el numero 145  base 10 a binario
           private static String convertDecimalToBinary(int decimalNumber) {
        StringBuilder binaryBuilder = new StringBuilder();
        
        if (decimalNumber == 0) {
            binaryBuilder.append("0");
        } else {
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binaryBuilder.insert(0, remainder);
                decimalNumber /= 2;
            }
        }
        
        return binaryBuilder.toString();
    }
        //transformar el caracter C en base 16 a decimal   
               private static int convertHexToDecimal(char hexChar) {
        int decimalNumber = Character.digit(hexChar, 16);
        return decimalNumber;
           }
}



