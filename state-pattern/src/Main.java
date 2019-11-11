/**
 * 状态模式
 * 当一个对象的状态改变时，其行为也发生改变，看起来像是改变了其类
 * 主要解决：控制对象状态改变的条件过于复杂
 * 方式：把状态的判断放到不同状态类的一系列类中,可以把复杂的判断逻辑简化
 *
 * @author zj
 * @date 2019/11/7
 */
public class Main {

    public static void main(String[] args) {
        Context krisWu = new Context(new StateA());
        krisWu.request();
        krisWu.request();
        krisWu.request();
        krisWu.request();
        krisWu.request();
        krisWu.request();
        krisWu.request();
    }
}
