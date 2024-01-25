package com.Sindyai.FractionsSpringHomework.utill;

public class ActionsWithFractions {
    public static boolean correctFraction(int nominator, int denominator){
        return nominator<denominator;
    }

    public static String reduction(int nominator,int denominator, int divider){
if(nominator%divider==0 && denominator%divider==0){
    return nominator+"/"+denominator+" после сокращения на "+divider+"\n"+
            nominator/divider+"/"+denominator/divider;

}
    else {
        return "Дробь невозможно сократить";
}
    }

    public static String addition(int nom1,int den1,int nom2,int den2){
double result=((double) nom1/den2)+((double)nom2/den2);
        return String.valueOf(nom1+"/"+den1+" + "+nom2+"/"+den2+" = "+result);
    }


    public static String subtraction(int nom1,int den1,int nom2,int den2) {
        double result = ((double) nom1 / den2) - ((double) nom2 / den2);
        return String.valueOf(nom1 + "/" + den1 + " + " + nom2 + "/" + den2 + " = " + result);
    }

    public static String division(int nom1,int den1,int nom2,int den2) {
        double result = ((double) nom1 / den2) / ((double) nom2 / den2);
        return String.valueOf(nom1 + "/" + den1 + " + " + nom2 + "/" + den2 + " = " + result);
    }

    public static String multiplication(int nom1,int den1,int nom2,int den2) {
        double result = ((double) nom1 / den2) * ((double) nom2 / den2);
        return String.valueOf(nom1 + "/" + den1 + " + " + nom2 + "/" + den2 + " = " + result);
    }


}
