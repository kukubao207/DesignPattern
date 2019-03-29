package CommandPattern;

public class LightOffCommand implements Command{
    Light light;
    LightOffCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.LightOff();
    }
    public void undo(){
        light.LightOn();
    }
}
