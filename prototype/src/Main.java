import java.util.ArrayList;
import java.util.List;
/**
 * 原型模式
 * 本质上就是深拷贝
 * */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> list =new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Prototype prototypeA =new Prototype("A",1, list);
        Prototype prototypeB =(Prototype) prototypeA.clone();
        prototypeA.getNotes().add("4");
        prototypeB.setName("B");
        prototypeB.setId(2);
        prototypeB.getNotes().remove(0);
        System.out.println(prototypeA.toString());
        System.out.println(prototypeB.toString());

    }
}
