public abstract class AbstractTemplate {
    public abstract void abstractMethodA();
    public abstract void abstractMethodB();
    public void templateMethod(){
        System.out.println("templateMethod...");
        abstractMethodA();
        abstractMethodB();
    }
}
