/**
 * @author zj
 * @date 2019/11/4
 * 观察者接口，在得到主题的通知时更新自己
 */
public interface Observer {
    /**
     * 更新
     */
    void update();
}
