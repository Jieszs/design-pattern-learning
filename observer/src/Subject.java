/**
 * @author zj
 * @date 2019/11/4
 * 主题接口，把所有观察者的引用聚集在一个聚集里，每个主题都可以有任意个观察者。
 * 主题接口提供一个方法添加或删除观察者
 */
public interface Subject {
    /**
     * 添加观察者
     * @param observer
     */
    void add(Observer observer);
    /**
     * 删除观察者
     * @param observer
     */
    void remove(Observer observer);
    /**
     * 通知
     */
    void notifyObservers();


}
