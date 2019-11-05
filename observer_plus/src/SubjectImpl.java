/**
 * 主题接口实现类
 *
 * @author zj
 * @date 2019/11/4
 */
public class SubjectImpl implements Subject {

    private EventHandler eventHandler = new EventHandler();

    @Override
    public void notifyObservers() {
        System.out.println("B站up主更新啦！！！");
        try {
            eventHandler.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addEvent(Object object, String methodName, Object... args) {
        System.out.println(object.getClass().getSimpleName() + "上B站");
        eventHandler.addEvent(object, methodName, args);
    }
}
