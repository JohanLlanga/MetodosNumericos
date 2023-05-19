/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores.relativo.y.absoluto;

/**
 *
 * @author fing.labcom
 */
public class ErroresRelativoYAbsoluto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=0.50*(10^2);
        double a1=0.51*(10^2);
        double Ea=0;
        double Er=0;
        Ea = a1-a;
        Er = Ea/a1;
    
        System.out.println("Error absoluto: "+Ea);
        System.out.println("Error relativo: "+Er);
    
    
    
        
    
        // TODO code application logic here
    }
    
}
