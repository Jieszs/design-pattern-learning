/**
 * 饿汉单例,推荐用
 * 一开始就创建，线程安全
 * @author zj
 * @date 2019/11/27
 */
class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    /**
     * 构造方法private,堵死外部利用new实例化的可能
     */
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
