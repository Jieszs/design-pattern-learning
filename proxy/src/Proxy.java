public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void require() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.require();
    }
}
