package SingleInstancePattern;

public class LazyInstance {
    private static LazyInstance instance = null;

    private LazyInstance() {
    }

    public static synchronized LazyInstance getInstance() {      //去掉synchronized就是线程不安全
        if (instance == null) {
            instance = new LazyInstance();
        }
        return instance;
    }
}
