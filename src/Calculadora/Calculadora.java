/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author bruno.191196
 */
public class Calculadora {
  
  public Double calcular (String expressao) {
    Double op1 = 0.0, op2 = 0.0;
    if (expressao.contains("+")) {
      String[] operandos = expressao.split("\\+");
      op1 = Double.valueOf(operandos[0]);
      op2 = Double.valueOf(operandos[1]);
      op1 = op1 + op2;
    } else {
      if (expressao.contains("-")) {
        String[] operandos = expressao.split("-");
        op1 = Double.valueOf(operandos[0]);
        op2 = Double.valueOf(operandos[1]);
        op1 = op1 - op2;
      } else {
        if (expressao.contains("*")) {
          String[] operandos = expressao.split("\\*");
          op1 = Double.valueOf(operandos[0]);
          op2 = Double.valueOf(operandos[1]);
          op1 = op1 * op2;
        } else {
          if (expressao.contains("/")) {
            String[] operandos = expressao.split("/");
            op1 = Double.valueOf(operandos[0]);
            op2 = Double.valueOf(operandos[1]);
            op1 = op1 / op2;
          }
        }
      }
    }
    return op1;
  }
}
