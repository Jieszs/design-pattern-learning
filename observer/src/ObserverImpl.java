/**
 * @author zj
 * @date 2019/11/4
 */
public class ObserverImpl implements Observer {
    private String name;
    private String observerState;
    private SubjectImpl subject;

    public ObserverImpl(String name, SubjectImpl subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者：" + name + " 状态：" + observerState);
    }

    public SubjectImpl getSubject() {
        return subject;
    }

    public void setSubject(SubjectImpl subject) {
        this.subject = subject;
    }
}
