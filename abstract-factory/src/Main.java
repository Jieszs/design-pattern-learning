/**
 * 抽象工厂+反射
 * 简单工厂：产品抽象，解耦产品，在工厂内部判断逻辑生成什么产品。增减产品时，修改工厂，不修改客户端
 * 工厂方法：产品抽象，工厂抽象，在客户端判断选择什么工厂。增减产品时，满足开放-封闭原则，不修改原有的工厂和产品，增减新的工厂和产品，并修改客户端逻辑。
 * 抽象工厂方法：同工厂方法，增加产品类别
 * 简单工厂+抽象工厂方法：同简单工厂，增加产品类别
 * 抽象工厂+反射：同简单工厂，增加产品类别，用反射消除简单工厂内部的复杂switch语句
 * @author zj
 * @date 2019/11/6
 */
public class Main {

    public static void main(String[] args) throws Exception {
        IUser user = DataAccessFactory.CreateUser();
        user.insert(null);
        user.get(1);

        IDepartment department = DataAccessFactory.CreateDepartment();
        department.insert(null);
        department.get(1);
    }
}
