package behavioral.observer.weatherapp;

public class App {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        LaptopDisplay laptopDisplay = new LaptopDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(laptopDisplay);

        weatherStation.setWeather("Sunny");
    }
}