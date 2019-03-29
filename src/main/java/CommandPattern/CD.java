package CommandPattern;

import java.net.ServerSocket;

public class CD {
    CD(){}
    public void on(){
        System.out.println("cd on");
    }
    public void stop(){
        System.out.println("cd stop");
    }
    public void setCD(){
        System.out.println("set cd");
    }
    public void setVolumn(int volumn){
        System.out.println("set volumn="+volumn);
    }
}
