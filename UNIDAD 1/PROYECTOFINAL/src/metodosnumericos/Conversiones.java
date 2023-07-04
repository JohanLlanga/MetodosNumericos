/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosnumericos;

/**
 *
 * @author pablo
 */
public class Conversiones {
    
    
   public int BinarioAdecimal(String BinAdec){
       int numDeci = 0;
        int power = 0;

        for (int i = BinAdec.length() - 1; i >= 0; i--) {
            if (BinAdec.charAt(i) == '1') {
                numDeci += Math.pow(2, power);
            }
            power++;
        }

        return numDeci;
    }
   
   public String DecimalAbinario(double deciAbin) {
        StringBuilder binaryBuilder = new StringBuilder();
        
        while (deciAbin != 0) {
            deciAbin *= 2;
            int bit = (int) deciAbin;
            binaryBuilder.append(bit);
            deciAbin -= bit;
        }
        
        return binaryBuilder.toString();
    }
   
   public double OctalAdecimal(String octalNumber) {
        int decimalNumber = 0;
        
        for (int i = 0; i < octalNumber.length(); i++) {
            int digit = Character.getNumericValue(octalNumber.charAt(i));
            decimalNumber = decimalNumber * 8 + digit;
        }
        
        return decimalNumber;
    }
}
