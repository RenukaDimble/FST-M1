package activities;

public class Activity3 {

    public static void main (String[] args)
    {
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        System.out.println("Age on earth is "+ age(seconds,EarthSeconds,1));
        System.out.println("Age on mercury is "+age(seconds,EarthSeconds,MercurySeconds));
        System.out.println("Age on Venusis "+ age(seconds,EarthSeconds,VenusSeconds));
        System.out.println("Age on Mars is "+ age(seconds,EarthSeconds,MarsSeconds));
        System.out.println("Age on Jupiter is "+ age(seconds,EarthSeconds,JupiterSeconds));
        System.out.println("Age on eSaturnis "+ age(seconds,EarthSeconds,SaturnSeconds));
        System.out.println("Age on eUranusis "+ age(seconds,EarthSeconds,UranusSeconds));
        System.out.println("Age on eNeptune is "+age(seconds,EarthSeconds, NeptuneSeconds));

    }
        public static double age(double a,double b,double d)
        {
            double c=  a/b/d;
            return c;
        }

}
