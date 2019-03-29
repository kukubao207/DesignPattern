package CommandPattern;

public class RemoteControl {
    public class NoCommand implements Command{
        NoCommand(){}
        public void execute(){
            System.out.println("no command");
        }
        public void undo(){
            System.out.println("no command");
        }
    }

    Command[] onCommands;
    Command[] offCommands;
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i=0;i<7;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommands(int i,Command onCommand,Command offCommand){
        onCommands[i]=onCommand;
        offCommands[i]=offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
    }
    public void onButtonWasUnPressed(int slot){
        offCommands[slot].execute();
    }
}
