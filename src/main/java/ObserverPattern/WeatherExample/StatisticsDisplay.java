package ObserverPattern.WeatherExample;

public class StatisticsDisplay implements Observer,DisplayElement {
    private Subject subject;
    private float maxTemp;
    private float minTemp;
    private float avgTemp;

    public StatisticsDisplay(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }

    public void update(float temp,float humid,float pressure){
        if(temp<minTemp)
            minTemp=temp;
        if(temp>maxTemp)
            maxTemp=temp;
        avgTemp=(this.avgTemp+temp)/2;
        display();
    }
    public void display() {
        System.out.println(maxTemp+" "+minTemp+" "+avgTemp);
    }
}
