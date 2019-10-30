public class SubFactory implements IFactory {
    @Override
    public Operator createOperator() {
        return new OperatorSub();
    }
}
