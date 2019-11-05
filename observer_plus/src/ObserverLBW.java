/**
 * 观察者
 *
 * @author zj
 * @date 2019/11/5
 */
public class ObserverLBW {
    /**
     * 使用外挂
     *
     * @param gameName
     */
    public void usePlugIn(String gameName) {
        System.out.println(this.getClass().getSimpleName() + "在游戏" + gameName + "使用外挂，八倍镜不屏息");
    }

    /**
     * 被实锤
     *
     * @return
     */
    public void actualProof() {
        System.out.println(this.getClass().getSimpleName() + "给B站发律师函");
    }
}
