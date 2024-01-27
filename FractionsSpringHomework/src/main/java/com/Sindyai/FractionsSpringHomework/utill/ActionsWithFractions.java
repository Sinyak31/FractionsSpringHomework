package com.Sindyai.FractionsSpringHomework.utill;

public class ActionsWithFractions {
    public static boolean correctFraction(int nominator, int denominator) {
        return nominator < denominator;
    }

    public static String reduction(int nominator, int denominator) {
        int[]res =getShortenedFraction(nominator,denominator);
        return nominator+"/"+denominator+" после сокращения = "+res[0]+"/"+res[1];
    }

    public static String addition(int nom1, int den1, int nom2, int den2) {
        int nom1Result=nom1*den2;
        int denResult = den1*den2;
        int nom2Result=nom2*den1;
        int[]res =getShortenedFraction(nom1Result+nom2Result,denResult);
        return nom1 + "/" + den1 + " + " + nom2 + "/" + den2 + " = " + res[0]+"/"+res[1];
    }


    public static String subtraction(int nom1, int den1, int nom2, int den2) {
        int nom1Result=nom1*den2;
        int denResult = den1*den2;
        int nom2Result=nom2*den1;
        int[]res =getShortenedFraction(nom1Result-nom2Result,denResult);
        return nom1 + "/" + den1 + " - " + nom2 + "/" + den2 + " = " + res[0]+"/"+res[1];
    }

    public static String division(int nom1, int den1, int nom2, int den2) {
        int[]res =getShortenedFraction(nom1*den2,den1*nom2);
        return nom1 + "/" + den1 + " / " + nom2 + "/" + den2 + " = " + res[0]+"/"+res[1];
    }

    /*
    Метод умножения
    В параметры передаем  2 дроби (nom1/den1 и nom2/den2)
    */

    public static String multiplication(int nom1, int den1, int nom2, int den2) {
        int[]res =getShortenedFraction(nom1*nom2,den1*den2); //передаем результат умножения дробей и получаем сокращенную дробь
        return nom1 + "/" + den1 + " * " + nom2 + "/" + den2 + " = " + res[0]+"/"+res[1];
    }


    //Метод сокращения дробей
private static int[] getShortenedFraction(int nom,int den){
        int[]result = new int[2];
        int max = 1;
    if (den % nom == 0) {
        result[0]= 1;
        result[1] = den/ nom;
    }
       else{
        for (int i = 2; i < den; i++) {
            if(nom%i ==0 && den%i==0)
                max=i;
        }
        result[0]= nom/max;
        result[1] = den/ max;
    }
       return result;
}

}
