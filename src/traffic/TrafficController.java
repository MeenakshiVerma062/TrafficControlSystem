package traffic;

import java.util.Arrays;

public class TrafficController {
    public static void main(String[] args) {
        TrafficLight light1 = new TrafficLight("TL1");
        TrafficLight light2 = new TrafficLight("TL2");
        TrafficLight light3 = new TrafficLight("TL3");
        TrafficLight light4 = new TrafficLight("TL4");

        //Intersections

        Intersection intersection1 = new Intersection("I1", Arrays.asList(light1,light2));
        Intersection intersection2 = new Intersection("I2", Arrays.asList(light3,light4));

        //Initialize Sensor
        Sensor sensor1 = new Sensor("S1");
        Sensor sensor2 = new Sensor("S2");

        //simulate traffic monitoring

        sensor1.updateTrafficDensity(30);
        sensor2.updateTrafficDensity(50);

        //display initialize status
        System.out.println("Initial Intersection Status:");

        intersection1.displayIntersectionStatus();
        intersection2.displayIntersectionStatus();

        //control traffic
        System.out.println("\nControlling Traffic.");
        intersection1.controlTraffic();
        intersection2.controlTraffic();
    }
}
