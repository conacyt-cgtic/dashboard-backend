package mx.conacyt.cgtic.dashboard.core;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mx.conacyt.cgtic.dashboard.core.Calculator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Calculatortest {
    private final static Logger LOG = Logger.getLogger(Calculatortest.class);
    private Calculator service = new Calculator();
    
    @Test
    public void testCalc() {
        assertTrue(check(100, 158));
        assertTrue(check(200, 375));
        assertTrue(check(300, 615));
        assertTrue(check(400, 869));
        assertTrue(check(500, 1135));
        assertTrue(check(600, 1409));
        assertTrue(check(700, 1690));
        assertTrue(check(800, 1977));
        assertTrue(check(900, 2270));
        assertTrue(check(1000, 2568));
        assertTrue(check(2000, 5736));
        assertTrue(check(3000, 9131));
        assertTrue(check(4000, 12674));
        assertTrue(check(5000, 16326));
        assertTrue(check(6000, 20066));
        assertTrue(check(7000, 23878));
        assertTrue(check(8000, 27753));
        assertTrue(check(9000, 31682));
        assertTrue(check(10000, 35660));
        assertTrue(check(20000, 77338));
        assertTrue(check(30000, 121288));
        assertTrue(check(40000, 166714));
        assertTrue(check(50000, 213237));
        assertTrue(check(60000, 260635));
        assertTrue(check(70000, 308760));
        assertTrue(check(80000, 357507));
        assertTrue(check(90000, 406799));
    }
    private boolean check(int n, long m) {
        long calc = service.computeFactLen(n);
        LOG.info("Calculando los digitos para factorial de "+n+": " + calc); 
        return calc==m;
    }
}