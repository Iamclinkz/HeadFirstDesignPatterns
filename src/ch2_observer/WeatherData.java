package ch2_observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public int getTemperature()
    {
        return temperature;
    }
    public int getHumidity()
    {
        return humidity;
    }
    public int getPressure()
    {
        return pressure;
    }
    public void measurementsChanged()
    {
        notifyObservers();
    }


    private List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
        {
            observer.update();
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        measurementsChanged();
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }
}
