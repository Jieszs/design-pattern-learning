public class Main {
/**
 * 工厂方法模式
 *
 * 简单工厂模式，生成产品的选择逻辑放在内部，需要修改时，违背了开放-封闭原则
 * 工厂方法模式，生成产品的选择逻辑放在外部，存在与具体产品的依赖
 * */
    public static void main(String[] args) {
        IFactory factory =new AddFactory();
        System.out.println(factory.createOperator().getResult(1.0,1.0));
        factory =new SubFactory();
        System.out.println(factory.createOperator().getResult(1.0,1.0));
    }
}
