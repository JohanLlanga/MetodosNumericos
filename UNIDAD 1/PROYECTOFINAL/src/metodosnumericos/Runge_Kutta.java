/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosnumericos;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.util.Scanner;


/**
 *
 * @author maikd
 */
public class Runge_Kutta {
    
    public static double calcularInstancia(Expression funcion, double x, double y) {
        // Asigna los valores de las variables "x" e "y"
        funcion.setVariable("x", x);
        funcion.setVariable("y", y);

        // Calcula la instancia de la función
        return funcion.evaluate();
    }
    public static double rungeKutta(Expression funcion, double y0, double h, double xFinal) {
        double x = 0.0;
        double y = y0;

        while (x < xFinal) {
            double k1 = h * funcion.setVariable("x", x).setVariable("y", y).evaluate();
            double k2 = h * funcion.setVariable("x", x + h / 2.0).setVariable("y", y + k1 / 2.0).evaluate();
            double k3 = h * funcion.setVariable("x", x + h / 2.0).setVariable("y", y + k2 / 2.0).evaluate();
            double k4 = h * funcion.setVariable("x", x + h).setVariable("y", y + k3).evaluate();

            y = y + (k1 + 2 * k2 + 2 * k3 + k4) / 6.0;
            x = x + h;
        }

        return y;
    }

    
}
