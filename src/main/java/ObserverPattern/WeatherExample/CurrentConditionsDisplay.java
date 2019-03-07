package ObserverPattern.WeatherExample;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temp;
    private float humid;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temp,float humid,float pressure){
        this.temp=temp;
        this.humid=humid;
        display();
    }
    public void display(){
        System.out.println("current conditions:"+temp+"F degrees and "+humid+"% humidity");
    }
}
