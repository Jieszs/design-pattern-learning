public class AddFactory implements IFactory {
    @Override
    public Operator createOperator() {
        return new OperatorAdd();
    }
}
