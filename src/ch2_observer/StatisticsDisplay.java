package ch2_observer;

public class StatisticsDisplay implements Observer,DisplayElement {
    private WeatherData weatherData;
    private int temperature;
    private int humidity;
    private int pressure;
    public StatisticsDisplay(WeatherData data)
    {
        this.weatherData = data;
        weatherData.registerObserver(this);
        update();
    }
    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
        Display();
    }

    @Override
    public void Display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "StatisticsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
