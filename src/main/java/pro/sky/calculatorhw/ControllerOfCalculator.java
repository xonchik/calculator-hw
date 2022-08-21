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
        return calculatorServiceImpl.answerCalculator();
    }


    @GetMapping(path = "/calculator/plus")
    public String answerPlus(@RequestParam("num1") String firstNumber, @RequestParam("num2") String secondNumber) {
        return calculatorServiceImpl.answerPlus(firstNumber, secondNumber);
    }

    @GetMapping(path = "/calculator/minus")
    public String answerMinus(@RequestParam("num1") String firstNumber,@RequestParam("num2") String secondNumber) {
        return calculatorServiceImpl.answerMinus(firstNumber, secondNumber);
    }

    @GetMapping(path = "/calculator/multiply")
    public String answerMultiply(@RequestParam("num1") String firstNumber, @RequestParam("num2") String secondNumber) {
        return calculatorServiceImpl.answerMultiply(firstNumber, secondNumber);
    }

    @GetMapping(path = "/calculator/divide")
    public String answerDivide(@RequestParam("num1") String firstNumber, @RequestParam("num2") String secondNumber) {
        return calculatorServiceImpl.answerDivide(firstNumber, secondNumber);
    }
}
