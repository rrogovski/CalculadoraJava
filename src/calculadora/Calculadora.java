/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Calculadora {
    
    //propriedades
    private float valorA;
    private float valorB;
    private float resultado;
    private List operatorsList = new ArrayList();
    
    /**
     * Construtor padrão
     */
    public Calculadora() {
        this.valorA = 0;
        this.valorB = 0;
        this.resultado = 0;
        this.operatorsList.add("+");
        this.operatorsList.add("-");
        this.operatorsList.add("x");
        this.operatorsList.add("/");
        this.operatorsList.add("%");
        this.operatorsList.add("=");
    }    

    public float getValorA() {
        return valorA;
    }

    public void setValorA(float valorA) {
        this.valorA = valorA;
    }

    public float getValorB() {
        return valorB;
    }

    public void setValorB(float valorB) {
        this.valorB = valorB;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public float somar() {
        return resultado = getValorA() + getValorB();
    }
    
    public float calcular(String expression) {
        isOperator('=');
        return 0;
    }
    
    public void isOperator(char operator) {
        operatorsList.forEach( op -> System.out.println(op));
    }
}
