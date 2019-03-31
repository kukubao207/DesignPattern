package SingleInstancePattern;

public class DoubleCheckInstance {
    public volatile static DoubleCheckInstance instance;
    private DoubleCheckInstance(){}
    public DoubleCheckInstance getInstance(){
        if(instance==null){
            synchronized (DoubleCheckInstance.class){
                if(instance==null){
                    instance=new DoubleCheckInstance();
                }
            }
        }
        return instance;
    }
}
