package main.java.strategy;

import java.util.List;

/**
 * Created by Ufuk on 13-04-15.
 */
public class StrategyTest {

    public static void main(String[] args) {
        OperationAdd operationAdd = new OperationAdd();
        OperationSubstract operationSubstract = new OperationSubstract();
        OperationMultiply operationMultiply = new OperationMultiply();

        Context context = new Context(operationSubstract);
        context.executeStrategy(5, 10);
    }

}
