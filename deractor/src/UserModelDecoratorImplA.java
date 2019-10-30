public class UserModelDecoratorImplA extends UserModelDecorator {
    private String addState;
    @Override
    public void operator() {
        super.operator();
        addState ="New state";
        System.out.println(UserModelDecoratorImplA.class);
    }
}
