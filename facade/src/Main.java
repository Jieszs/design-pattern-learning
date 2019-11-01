/**
 *  外观模式
 *  做法：分层，定义一个高层接口，包装多个不同的底层接口，客户端直接调用高层接口即可
 *  好处：更好调用子系统
 */
public class Main {

    public static void main(String[] args) {
        Facade facade =new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}
