package ch2_observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("before:");
        WeatherData data = new WeatherData(100,200,300);
        ForecastDisplay forecastDisplay = new ForecastDisplay(data);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(data);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(data);
        System.out.println("after:");
        data.setHumidity(400);
    }
}
