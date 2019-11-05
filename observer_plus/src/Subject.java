/**
 * 主题接口，与观察者解耦
 * @author zj
 * @date 2019/11/4
 */
public interface Subject {
    /**
     * 通知
     */
    void notifyObservers();
    /**
     * 添加事件
     * @param object
     * @param methodName
     * @param args
     */
    void addEvent(Object object, String methodName, Object... args);


}
