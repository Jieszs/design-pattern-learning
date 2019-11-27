/**
 * 懒汉单例，双重校验锁，推荐用
 * 延时加载，需要时创建对象，线程安全
 *
 * @author zj
 * @date 2019/11/27
 */
class DoubleCheckedLazySingleton {
    private static DoubleCheckedLazySingleton instance;

    /**
     * 构造方法private,堵死外部利用new实例化的可能
     */
    private DoubleCheckedLazySingleton() {
    }

    public static synchronized DoubleCheckedLazySingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLazySingleton();
                }
            }
        }
        return instance;
    }
}
