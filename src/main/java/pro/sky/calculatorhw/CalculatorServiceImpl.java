package pro.sky.calculatorhw;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int answerPlus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public int answerMinus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public int answerMultiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double answerDivide(int firstNumber, int secondNumber) {
        return (double)firstNumber / secondNumber;
    }
}
