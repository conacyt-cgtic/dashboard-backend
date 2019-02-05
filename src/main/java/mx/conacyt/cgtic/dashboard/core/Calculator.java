package mx.conacyt.cgtic.dashboard.core;

public class Calculator {
    public long computeFactLen(int n) {
        double res = 1.0;
        for(int i=1; i<=n; i++)
            res = res + Math.log10(i);
        return (long)res;
    }
}
