package main.java.strategy;

/**
 * Created by Ufuk on 13-04-15.
 */
public class StrategyTest {

    public static void main(String[] args) {
        OperationAdd operationAdd = new OperationAdd();
        OperationSubtract operationSubtract = new OperationSubtract();
        OperationMultiply operationMultiply = new OperationMultiply();

        Context context = new Context(operationSubtract);
        context.executeStrategy(5, 10);
    }

}
