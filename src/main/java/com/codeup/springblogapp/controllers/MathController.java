package com.codeup.springblogapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    // method that listens for
    //  /add/5/and/3
    //  /{operation}/{firstNum}/{keyword}/{secondNum}

    @GetMapping("/{operation}/{firstNum}/{keyword}/{secondNum}")
    @ResponseBody
    public String doMath(@PathVariable String operation, @PathVariable int firstNum, @PathVariable String keyword, @PathVariable int secondNum) {

        // decide what to do based on "add" "subtract"... etc from 'operation' PathVariable
        switch (operation) {
            case "add":
                int sum;
                sum = firstNum + secondNum;
                return Integer.toString(sum);
            case "subtract":
                int diff;
                diff = secondNum - firstNum;
                return Integer.toString(diff);
            case "multiply":
                int product;
                product = firstNum * secondNum;
                return Integer.toString(product);
            case "divide":
                int quotient;
                quotient = firstNum / secondNum;
                if (firstNum % secondNum != 0) {
                    int remainder = firstNum % secondNum;
                    return Integer.toString(quotient) + " remainder " + Integer.toString(remainder);
                } else {
                    return Integer.toString(quotient);
                }
            default:
                return "Ed Sheeran hasn't written this album yet.";
        }

    }

}
