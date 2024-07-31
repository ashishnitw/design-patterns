package behavioral.observer.weatherapp;

public class LaptopDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("Laptop Display: Weather updated - " + weather);
    }
}
