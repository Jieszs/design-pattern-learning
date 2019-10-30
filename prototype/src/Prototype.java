import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable {
    private String name;
    private Integer id;
    private List<String> notes;

    public Prototype(String name, Integer id, List<String> notes) {
        this.name = name;
        this.id = id;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", notes=" + notes +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        //除了基础字段，集合对象都要另行处理
        List<String> notes = new ArrayList<>();
        for (String s : prototype.getNotes()) {
            notes.add(s);
        }
        prototype.setNotes(notes);
        return prototype;
    }
}
