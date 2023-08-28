/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosnumericos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.objecthunter.exp4j.Expression;

/**
 *
 * @author maikd
 */
public class Runge_Kutta {
    
    List<String> iterations4 = new ArrayList<>();
    
    public static double function(double x, double y, Expression exp) {
        exp.setVariable("x", x);
        exp.setVariable("y", y);
        return exp.evaluate();
    }
    
    public static double rungeKutta4(double x0, double y0, double h, double x, Expression exp, List<String> iterations4) {
        double y = y0;

        while (x0 < x) {
            double k1 = h * function(x0, y, exp);
            double k2 = h * function(x0 + h / 2, y + k1 / 2, exp);
            double k3 = h * function(x0 + h / 2, y + k2 / 2, exp);
            double k4 = h * function(x0 + h, y + k3, exp);

            iterations4.add(String.format(Locale.US, "%.6f\t%.6f\t%.6f\t%.6f\t%.6f\t%.6f",
                    x0, y, k1, k2, k3, k4));

            y += (k1 + 2 * k2 + 2 * k3 + k4) / 6;

            x0 += h;
        }

        return y;
    }
}
