package com.Sindyai.FractionsSpringHomework.conroller;


import com.Sindyai.FractionsSpringHomework.utill.ActionsWithFractions;
import jakarta.websocket.server.PathParam;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.server.WebServerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fraction")
public class Controller {


    @GetMapping("/correct")
    public boolean correctFraction(@PathParam("nom") Integer nom,@PathParam("den") Integer den){
        return ActionsWithFractions.correctFraction(nom, den);

    }
    @GetMapping("/reduction")
    public String fractionReduction(@PathParam("nom") Integer nom,@PathParam("den") Integer den){
        return ActionsWithFractions.reduction(nom,den);
    }

    @GetMapping("/addition")
    public String fractionAddition(@PathParam("nom1") Integer nom1,@PathParam("den1") Integer den1,
                                   @PathParam("nom2") Integer nom2,@PathParam("den1") Integer den2){
        return ActionsWithFractions.addition(nom1,den1,nom2,den2);
    }

    @GetMapping("/subtraction")
    public String fractionSubtraction(@PathParam("nom1") Integer nom1,@PathParam("den1") Integer den1,
                                   @PathParam("nom2") Integer nom2,@PathParam("den1") Integer den2){
        return ActionsWithFractions.subtraction(nom1,den1,nom2,den2);
    }

    @GetMapping("/division")
    public String fractionDivision(@PathParam("nom1") Integer nom1,@PathParam("den1") Integer den1,
                                      @PathParam("nom2") Integer nom2,@PathParam("den1") Integer den2){
        return ActionsWithFractions.division(nom1,den1,nom2,den2);
    }

    @GetMapping("/multiplication")
    public String fractionMultiplication(@PathParam("nom1") Integer nom1,@PathParam("den1") Integer den1,
                                      @PathParam("nom2") Integer nom2,@PathParam("den1") Integer den2){
        return ActionsWithFractions.multiplication(nom1,den1,nom2,den2);
    }

}