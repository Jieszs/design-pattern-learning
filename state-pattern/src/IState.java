/**
 * 状态接口
 * @author zj
 * @date 2019/11/7
 */
public interface IState {
    /**
     * 处理当前状态操作
     */
    void handle();
    /**
     * 控制状态
     * @param context 根据上下文实例的状态，控制执行完当前状态后，下一个上下文实例的状态
     */
    void control(Context context);
}
