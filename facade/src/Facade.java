/**
 * @Author: zj
 * @Description:外观类，知道那些子系统负责请求，将客户的请求代理给适当的子系统对象
 * @Date: C9:58 2019/11/1
 */
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public void methodA() {
        System.out.println("方法组A:");
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }

    public void methodB() {
        System.out.println("方法组B:");
        subSystemB.methodB();
        subSystemC.methodC();
    }

    public void methodC() {
        System.out.println("方法组C:");
        subSystemC.methodC();
    }
}
