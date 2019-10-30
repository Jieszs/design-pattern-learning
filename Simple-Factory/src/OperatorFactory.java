public class OperatorFactory {
    public static Operator create(String s) {
        Operator operator = null;
        switch (s) {
            case "+":
                operator = new OperatorAdd();
                break;
            case "-":
                operator = new OperatorSub();
                break;
            default:
                break;
        }
        return operator;
    }
}
