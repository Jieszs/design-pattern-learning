import java.util.ArrayList;
import java.util.List;

/**
 * 委托事件处理器
 *
 * @author zj
 * @date 2019/11/5
 */
public class EventHandler {
    private List<Event> events = new ArrayList<>();

    public void addEvent(Object object, String methodName, Object... args) {
        events.add(new Event(object, methodName, args));
    }

    public void invoke() throws Exception {
        for (Event event : events) {
            event.invoke();
        }
    }

}
