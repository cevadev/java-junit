package org.ceva.junit.ch01;

public class BCalculatorTest {
    private int nbErrors = 0;

    public void testAdd(){
        ACalculator cal =  new ACalculator();
        double result = cal.add(10,50);
        if(result != 60){
            throw new IllegalStateException("Bad result: " + result);
        }
    }

    public static void main(String[] args) {
        BCalculatorTest test = new BCalculatorTest();
        try{
            test.testAdd();
        }catch(Throwable e){
            test.nbErrors++;
            e.printStackTrace();
        }

        if(test.nbErrors > 0){
            throw new IllegalStateException("There were " + test.nbErrors + " error(s)");
        }
    }
}
