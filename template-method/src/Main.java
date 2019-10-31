public class Main {
/**
 * 模板方法模式
 * 做法：将不变行为搬移到父类，将变化行为在字类中具体实现
 * 功能：减少代码重复
 * 原理：利用继承和多态的特性
 * */
    public static void main(String[] args) {
        TemplateA templateA =new TemplateA();
        templateA.templateMethod();
        TemplateB templateB =new TemplateB();
        templateB.templateMethod();
    }
}
