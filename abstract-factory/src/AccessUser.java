/**
 * @author zj
 * @date 2019/11/6
 */
public class AccessUser implements IUser {
    @Override
    public void insert(IUser user) {
        System.out.println(this.getClass().getSimpleName() + "——>insert user");
    }

    @Override
    public String get(Integer id) {
        System.out.println(this.getClass().getSimpleName() + "——>get user");
        return null;
    }
}
