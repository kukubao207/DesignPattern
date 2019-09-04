package SingleInstancePattern;

public class EagerInstance {
    public static EagerInstance instance = new EagerInstance();
    private EagerInstance(){

    }
    public EagerInstance getInstance(){
        return instance;
    }
}
