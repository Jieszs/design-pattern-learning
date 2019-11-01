import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zj
 * @Description:具体产品
 * @Date: 2019/11/1
 */
public class Product {
    private List<String> parts = new ArrayList<>();

    public void addPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品部件：----->");
        for (String s : parts) {
            System.out.println(s);
        }
    }
}
