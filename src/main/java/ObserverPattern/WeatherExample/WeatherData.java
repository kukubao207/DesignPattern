package ObserverPattern.WeatherExample;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temp;
    private float humid;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0)
            observers.remove(i);
    }

    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(temp,humid,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp,float humid,float pressure){
        this.temp=temp;
        this.humid=humid;
        this.pressure=pressure;
        measurementsChanged();
    }

    //其他方法
}
