public class Main {

    public static void main(String[] args) {
        Operator operator = OperatorFactory.create("+");
        System.out.println(operator.getResult(1.0,1.0));
        operator = OperatorFactory.create("-");
        System.out.println(operator.getResult(1.0,1.0));
    }
}
