/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaryCalculator;

/**
 *
 * @author Louvel
 */
public class CalculatorFunction {
    public static double getSalary(double hrs, double rph, double tax){
        double grossPay = hrs * rph;
        double getTax = grossPay * tax;
        return grossPay - getTax;
    }
    public static double getSalary(double hrs, double rph, int tax){
        double grossPay = hrs * rph;
        double getTax = grossPay * tax/100;
        return grossPay - getTax;
    }
}
