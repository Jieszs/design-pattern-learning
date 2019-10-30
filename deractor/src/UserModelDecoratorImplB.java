public class UserModelDecoratorImplB extends UserModelDecorator {

    @Override
    public void operator() {
        super.operator();
        addBehavior();
        System.out.println(UserModelDecoratorImplB.class);
    }

    private void addBehavior() {

    }
}
