/**
 * 懒汉单例，线程安全，效率低，不推荐用
 * 延时加载，需要时创建对象，线程不安全
 * @author zj
 * @date 2019/11/27
 */
class SynchronizedLazySingleton {
    private static SynchronizedLazySingleton instance;

    /**
     * 构造方法private,堵死外部利用new实例化的可能
     */
    private SynchronizedLazySingleton() {
    }

    public static synchronized SynchronizedLazySingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }
}
