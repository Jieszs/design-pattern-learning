/**
 * @author zj
 * @date 2019/11/6
 */
public class AccessDepartment implements IDepartment{
    @Override
    public void insert(IDepartment department) {
        System.out.println(this.getClass().getSimpleName() + "——>insert department");
    }

    @Override
    public String get(Integer id) {
        System.out.println(this.getClass().getSimpleName() + "——>get department");
        return null;
    }
}
