package app;

public class Main {
    public static final double Miles_to_KM = 1.609344;
    public static final double KM_to_Miles = 1/Miles_to_KM;


    public static double convert_milles_to_km(double miles) {
        return miles * Miles_to_KM;
    }

    public static double convertKilometersToMiles(double kilometers) {
        return kilometers * KM_to_Miles;
    }
    public static void main(String[] args){
        System.out.println("Distance unit converter");
    double miles = 5;
    double km = convert_milles_to_km(miles);
    double Miles = convertKilometersToMiles(km);

        System.out.printf("%.2f miles is equal to %.2f kilometers%n", miles, km);
        System.out.printf("%.2f kilometers is equal to %.2f miles%n", km, Miles);

    }
}