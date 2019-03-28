package com.company.Day03;



/*
given the speed of light is about 299,792 kms/second use double to compute the following:
•	How long will it take light on earth to travel to the moon (384,000 kms)
•	How long will it take someone traveling at the speed of light to reach the sun from the earth.
(the sun is 149.6 million kilometers from the Earth)
•	How long will it take light to reach Jupiter (588 million kms) from the Earth
•	How long will it take light to travel to the nearest star, Alpha Centauri (41.32 trillion km away)
•	How many kilometers can light travel in one year?
•	By the way… the fastest space probe (Juno) speed = 265,000 kph


 */
public class HowBig {

    /*
        1 year = 12 months
        1 month = 30 days
        1 day = 24 hrs
        1 hour = 60 minutes
        1 minute = 60 seconds
    */
    public static void main(String[] args) {

        double speedOfLight = 299792;
        double distEarthToMoon = 384000;
        double distEarthToSun = 149600000;
        double distEarthToJupiter = 588000000;
        long distEarthToAlphaCentauri = 41320000000L;
        
        
        double speedPerKMIn1Year = (((((speedOfLight*60)*60)*24)*30)*12);
        double oneYear = (((((60*60)*60)*24)*30)*12);
        double distPerKMIn1Year = speedOfLight * oneYear;

        double timeToMoon = distEarthToMoon/speedPerKMIn1Year;
        double timeToSun = distEarthToSun/speedPerKMIn1Year;
        double timeToJupiter = distEarthToJupiter/speedPerKMIn1Year;
        double timeToNearestStar = distEarthToAlphaCentauri/speedPerKMIn1Year;

        System.out.println("Distance from Earth to Moon is "+timeToMoon+" years");
        System.out.println("Distance from Earth to Sun is "+timeToSun+" years");
        System.out.println("Distance from Earth to Jupiter is "+timeToJupiter+" years");
        System.out.println("Distance from Earth to Alpha Centauri "+timeToNearestStar+" years");
        System.out.println("Kilometers light travels in 1 year "+ distPerKMIn1Year+" kms");

    }
}
