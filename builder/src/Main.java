/**
 * 建造者模式，一个对象，同一个构建过程，有多个不同表示。
 * 用于：构建顺序是稳定的，而对象内部的变化复杂
 * 多一个不同的产品，只要多增加一个builder的实现类就可以了
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        BuilderImplA builderImplA = new BuilderImplA();
        BuilderImplB builderImplB = new BuilderImplB();

        director.construct(builderImplA);
        Product productA =builderImplA.getResult();
        productA.show();

        director.construct(builderImplB);
        Product productB =builderImplB.getResult();
        productB.show();
    }
}
