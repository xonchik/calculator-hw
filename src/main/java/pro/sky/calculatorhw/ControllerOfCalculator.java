package pro.sky.calculatorhw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOfCalculator {
    private final CalculatorService calculatorServiceImpl;

    public ControllerOfCalculator(CalculatorService calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }
    @GetMapping
    public String hello() {
        return "Hello!";
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return "<b>Добро пожаловать в калькулятор!<b/>";
    }


    @GetMapping(path = "/calculator/plus")
    public String answerPlus(@RequestParam("num1") Integer firstNumber, @RequestParam("num2") Integer secondNumber) {
        if(firstNumber == null || secondNumber == null){ return "<b>Не верный запрос! Отсутствует num1 или num2.</b>";}
        int result = calculatorServiceImpl.answerPlus(firstNumber, secondNumber);
        return firstNumber + " + " +  secondNumber +  " = " + result;
    }

    @GetMapping(path = "/calculator/minus")
    public String answerMinus(@RequestParam("num1") Integer firstNumber,@RequestParam("num2") Integer secondNumber) {
        if(firstNumber == null || secondNumber == null) {return "<b>Не верный запрос! Отсутствует num1 или num2.</b>";}
        int result = calculatorServiceImpl.answerMinus(firstNumber, secondNumber);
        return firstNumber + " - " +  secondNumber +  " = " + result;
    }

    @GetMapping(path = "/calculator/multiply")
    public String answerMultiply(@RequestParam("num1") Integer firstNumber, @RequestParam("num2") Integer secondNumber) {
        if(firstNumber == null || secondNumber == null) {return "<b>Не верный запрос! Отсутствует num1 или num2.</b>";}
        int result = calculatorServiceImpl.answerMultiply(firstNumber, secondNumber);
        return firstNumber + " * " +  secondNumber +  " = " + result;
    }

    @GetMapping(path = "/calculator/divide")
    public String answerDivide(@RequestParam("num1") Integer firstNumber, @RequestParam("num2") Integer secondNumber) {
        if(firstNumber == null || secondNumber == null ){ return "<b>Не верный запрос! Отсутствует num1 или num2.</b>";}
        if(secondNumber == 0) return "<b>На ноль делить нельзя!</b>";
        double result = calculatorServiceImpl.answerDivide(firstNumber, secondNumber);
        return firstNumber + " / " +  secondNumber +  " = " + result;
    }
}
