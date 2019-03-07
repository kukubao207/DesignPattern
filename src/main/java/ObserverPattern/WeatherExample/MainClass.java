package ObserverPattern.WeatherExample;

public class MainClass {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(2,4,5);
    }
}
