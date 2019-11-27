/**
 * 单例模式
 * 保证一个类只有一个实例，并提供一个允许全局访问的点
 * 全局变量能使对象全局访问，但不能防止多个实例化，最好的办法是，让类保持唯一实例，
 * 提供一个可以访问该实例的方法
 * <p>
 * 好处：严格控制客户怎么访问以及何时访问实例
 *
 * @author zj
 * @date 2019/11/27
 */
public class Main {

    public static void main(String[] args) {
        LazySingleton lazySingletonA = LazySingleton.getInstance();
        LazySingleton lazySingletonB = LazySingleton.getInstance();
        if (lazySingletonA == lazySingletonB) {
            System.out.println("同一个实例LazySingleton");
        }
        HungrySingleton hungrySingletonA = HungrySingleton.getInstance();
        HungrySingleton hungrySingletonB = HungrySingleton.getInstance();
        if (hungrySingletonA == hungrySingletonA) {
            System.out.println("同一个实例HungrySingleton");
        }
        SynchronizedLazySingleton synchronizedLazySingletonA = SynchronizedLazySingleton.getInstance();
        SynchronizedLazySingleton synchronizedLazySingletonB = SynchronizedLazySingleton.getInstance();
        if (synchronizedLazySingletonA == synchronizedLazySingletonB) {
            System.out.println("同一个实例SynchronizedLazySingleton");
        }
        DoubleCheckedLazySingleton doubleCheckedLazySingletonA = DoubleCheckedLazySingleton.getInstance();
        DoubleCheckedLazySingleton doubleCheckedLazySingletonB = DoubleCheckedLazySingleton.getInstance();
        if (doubleCheckedLazySingletonA == doubleCheckedLazySingletonB) {
            System.out.println("同一个实例DoubleCheckedLazySingleton");
        }
        EnumSingleton enumSingletonA = EnumSingleton.instance;
        EnumSingleton enumSingletonB = EnumSingleton.instance;
        if (enumSingletonA == enumSingletonB) {
            System.out.println("同一个实例EnumSingleton");
        }
    }

}
