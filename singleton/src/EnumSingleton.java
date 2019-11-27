/**
 * 枚举单例，推荐使用
 * 线程安全
 *
 * @author zj
 * @date 2019/11/27
 */
public enum EnumSingleton {
    instance;

    private EnumSingleton() {
    }

    public void method() {
    }
}
