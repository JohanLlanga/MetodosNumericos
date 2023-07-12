/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosnumericos;
import java.util.function.Function;

/**
 *
 * @author maikd
 */
public class Biseccion {
    
    public Function<Double, Double> CrearFuncionB(String functionStr) {
        return x -> evaluarFuncion(functionStr, x);
    }

    public double evaluarFuncion(String functionStr, double x) {
        return x;
    }
    
    public static final double TOLERANCE = 0.0001;
    public static final int MAX_ITERATIONS = 100;

    public double findRoot(double a, double b, Function<Double, Double> functionB) {
        double c = 0;
        double fA = functionB.apply(a);
        double fC = 0;

        for (int i = 0; i < MAX_ITERATIONS; i++) {
            c = (a + b) / 2;
            fC = functionB.apply(c);

            if (Math.abs(fC) < TOLERANCE) {
                break;
            }

            if (fA * fC < 0) {
                b = c;
            } else {
                a = c;
                fA = fC;
            }
        }

        return c;
    }
    
}
