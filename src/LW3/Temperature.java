package LW3;

public class Temperature {
    private double celsius;
    private double fahrenheit;

    public Temperature(){

    }
    public Temperature(double celsius){

    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        fahrenheit=(celsius*9/5)+32;

    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
       this.fahrenheit = fahrenheit;
        celsius=(fahrenheit-32)*5/9;

    }
}
