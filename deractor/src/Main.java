public class Main {
    /**
     * 装饰模式
     *
     * */
    public static void main(String[] args) {
        UserModelImpl userModel = new UserModelImpl();
        UserModelDecoratorImplA userModelDecoratorImplA = new UserModelDecoratorImplA();
        UserModelDecoratorImplB userModelDecoratorImplB = new UserModelDecoratorImplB();
        userModelDecoratorImplA.setUserModel(userModel);
        userModelDecoratorImplB.setUserModel(userModelDecoratorImplA);
        userModelDecoratorImplB.operator();
    }
}
