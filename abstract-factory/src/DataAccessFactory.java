import java.lang.reflect.Constructor;

/**
 * 数据库访问工厂
 *
 * @author zj
 * @date 2019/11/6
 */
public class DataAccessFactory {
    /**
     * 这是需要构造的类的字符串
     */
    private static final String db = "SqlServer";

    public static IUser CreateUser() throws Exception {
        String className = db + "User";
        //得到类
        Class userClass = Class.forName(className);
        //得到类的构造函数
        Constructor<?> constructor = userClass.getConstructor();
        //使用构造函数得到类的实例
        return (IUser) constructor.newInstance();
    }
    public static IDepartment CreateDepartment() throws Exception {
        String className = db + "Department";
        //得到类
        Class userClass = Class.forName(className);
        //得到类的构造函数
        Constructor<?> constructor = userClass.getConstructor();
        //使用构造函数得到类的实例
        return (IDepartment) constructor.newInstance();
    }
}
