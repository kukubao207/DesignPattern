package CommandPattern;

public class CDOffCommand implements Command{
    CD cd;
    CDOffCommand(CD cd){
        this.cd = cd;
    }
    public void execute(){
        cd.stop();
    }
    public void undo(){
        cd.on();
    }
}
