package pro.sky.calculatorhw;

public interface CalculatorService {
    String answerCalculator();
    String answerPlus(String firstNumber, String secondNumber);
    String answerMinus(String firstNumber, String secondNumber);
    String answerMultiply(String firstNumber, String secondNumber);
    String answerDivide(String firstNumber, String secondNumber);
}
