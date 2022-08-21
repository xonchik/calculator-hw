package pro.sky.calculatorhw;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String answerCalculator() {
        return "<b>Добро пожаловать в калькулятор!<b/>";
    }

    @Override
    public String answerPlus(String firstNumber, String secondNumber) {
        if (firstNumber.length() == 0 || secondNumber.length() == 0) {
            return "<b>Не верный запрос! Отсутствует num1 или num2.</b>";
        } else {
            int num1 = Integer.valueOf(firstNumber);
            int num2 = Integer.valueOf(secondNumber);
            int sum = num1 + num2;
            return firstNumber + " + " + secondNumber + " = " + sum ;
        }
    }

    @Override
    public String answerMinus(String firstNumber, String secondNumber) {
        if (firstNumber.length() == 0 || secondNumber.length() == 0) {
            return "<b>Не верный запрос! Отсутствует num1 или num2.</b>";
        } else {
            int num1 = Integer.valueOf(firstNumber);
            int num2 = Integer.valueOf(secondNumber);
            int result = num1 - num2;
            return firstNumber + " - " + secondNumber + " = " + result ;
        }
    }

    @Override
    public String answerMultiply(String firstNumber, String secondNumber) {
        if (firstNumber.length() == 0 || secondNumber.length() == 0) {
            return "<b>Не верный запрос! Отсутствует num1 или num2.</b>";
        } else {
            int num1 = Integer.valueOf(firstNumber);
            int num2 = Integer.valueOf(secondNumber);
            int result = num1 * num2;
            return firstNumber + " * " + secondNumber + " = " + result ;
        }
    }

    @Override
    public String answerDivide(String firstNumber, String secondNumber) {
        if (firstNumber.length() == 0 || secondNumber.length() == 0) {
            return "<b>Не верный запрос! Отсутствует num1 или num2.</b>";
        } else if (Integer.valueOf(secondNumber) == 0) {
            return "<b>На ноль днлить нельзя!</b>";
        } else {
            int num1 = Integer.valueOf(firstNumber);
            int num2 = Integer.valueOf(secondNumber);
            int result = num1 / num2;
            return firstNumber + " / " + secondNumber + " = " + result;
        }
    }
}
