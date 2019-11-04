/**
 * @author zj
 * @date 2019/11/4
 * 观察者模式（发布-订阅），一对多的依赖关系，多个观察者监听一个主题对象。
 * 主题对象状态发生变化时，会通知所有观察者，让它们自动更新
 * 适用于：一个对象A改变，需要同时改变多个其他对象,且A不知道需要改变多少个对象时
 * 不足：主题和观察者还是有耦合，需要主题添加或删除观察者
 * 改进：事件委托
 */
public class Main {

    public static void main(String[] args) {
        SubjectImpl subject =new SubjectImpl();
        subject.add(new ObserverImpl("A",subject));
        subject.add(new ObserverImpl("B",subject));
        subject.add(new ObserverImpl("C",subject));
        subject.setSubjectState("XYZ");
        subject.notifyObservers();
    }
}
