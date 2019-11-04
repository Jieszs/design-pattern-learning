import java.util.ArrayList;
import java.util.List;

/**
 * @author zj
 * @date 2019/11/4
 */
public class SubjectImpl implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String subjectState;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
