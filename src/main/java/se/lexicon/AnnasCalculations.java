package se.lexicon;

public class AnnasCalculations {

    public static void main(String[] args){
        double num1=45;
        double num2=11;

        double resultForAddition = AnnasCalculations.addition(num1,num2);
        System.out.println(resultForAddition) ;


        double resultForSubtraction = AnnasCalculations.subtraction(55,12);
        System.out.println(resultForSubtraction ) ;

        double resultFormMultiplication = AnnasCalculations.multiplication(12,4);
        System.out.println(resultFormMultiplication) ;

        double resultForDivision = AnnasCalculations.division(24,6) ;
        System.out.println(resultForDivision) ;






    }

    public static double addition(double num1, double num2){
        return num1 + num2;
    }
    public static double subtraction (double num1, double num2){
        return num1 - num2;

    }

    //...
    public static double multiplication(double num1, double num2){
        return num1 * num2 ;
    }
    public static double division(double num1, double num2){
        return num1 / num2 ;
    }


}



