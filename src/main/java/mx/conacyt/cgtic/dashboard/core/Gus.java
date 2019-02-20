package mx.conacyt.cgtic.dashboard.core;

import mx.conacyt.cgtic.dashboard.kernel.Calculator;

public class Gus {
    private Calculator calc = new Calculator();
    
    public long computeFactLen(int n) {
        return calc.computeFactLen(n);
    }
}
