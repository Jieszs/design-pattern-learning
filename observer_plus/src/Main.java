/**
 * 观察者模式（发布-订阅），事件委托版。
 * 观察者模式区别：观察者和主题解耦，选择逻辑在客户端中进行,可以不需要观察者
 * 解耦的好处：一个观察者可以接收多个主题，一个主题通知可以引起多个观察者，使用多种不同名函数
 *
 * @author zj
 * @date 2019/11/4
 */
public class Main {

    public static void main(String[] args) {
        ObserverCXK cxk =new ObserverCXK();
        ObserverLBW lbw =new ObserverLBW();
        cxk.selfIntroduction("唱跳rap篮球");
        lbw.usePlugIn("绝地求生");
        SubjectImpl subject =new SubjectImpl();
        subject.addEvent(cxk,"issueLawyerLetter","B站");
        subject.addEvent(lbw,"actualProof");
        subject.notifyObservers();
    }
}
