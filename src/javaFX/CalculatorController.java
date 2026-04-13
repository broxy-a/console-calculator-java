package javaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CalculatorController {
    private boolean operatorPressed = false;

    private String operator = "";
    private double firstNumber = 0;

    @FXML
    private TextField expressionDisplay;

    @FXML
    private Button bckSpcKey;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnSign;

    @FXML
    private Button btnSubtract;

    @FXML
    private TextField display;

    @FXML
    void backspaceKey(ActionEvent event) {
        String text = display.getText();
        if (text.length() > 0) {
            display.setText(text.substring(0, text.length() - 1));
        }
    }

    @FXML
    void handleDot(ActionEvent event) {
        if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }

    @FXML
    void handleEquals(ActionEvent event) {
        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;
        try {
            switch (operator) {
                case "+": result = firstNumber + secondNumber; break;
                case "-": result = firstNumber - secondNumber; break;
                case "×": result = firstNumber * secondNumber; break;
                case "÷":
                    if (secondNumber == 0) throw new ArithmeticException("divide by zero is impossible");
                    result = firstNumber / secondNumber;
                    break;
            }
            display.setText(String.valueOf(result));
            expressionDisplay.setText("");
        } catch (ArithmeticException e) {
            display.setText("Error: " + e.getMessage());
        }
        operatorPressed = true;
    }

    @FXML
    void handleNumber(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        if (operatorPressed) {
            display.setText(clicked.getText());
            operatorPressed = false;
        } else {
            if (display.getText().length() < 15) {
                display.setText(display.getText() + clicked.getText());
            }
        }
    }

    @FXML
    void handleOperator(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        firstNumber = Double.parseDouble(display.getText());
        operator = clicked.getText();
        operatorPressed = true;
        expressionDisplay.setText(firstNumber + " " + operator);
    }

    @FXML
    void handleSign(ActionEvent event) {
        double number = Double.parseDouble(display.getText());
        display.setText(String.valueOf(number * -1));
    }
}
