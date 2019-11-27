/**
 * 懒汉单例，不可用
 * 延时加载，需要时创建对象，线程不安全
 * @author zj
 * @date 2019/11/27
 */
class LazySingleton {
    private static LazySingleton instance;

    /**
     * 构造方法private,堵死外部利用new实例化的可能
     */
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
