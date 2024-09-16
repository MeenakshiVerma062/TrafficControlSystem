package traffic;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.StandardSocketOptions;
import java.util.List;

public class Intersection {
    private String id;
    private List<TrafficLight> trafficLights;

    public Intersection(String id, List<TrafficLight> trafficLights){
        this.id = id;
        this.trafficLights = trafficLights;
    }
    public void controlTraffic(){
           for(TrafficLight light : trafficLights){
               light.changeState();
               System.out.println(light);
           }
    }
    public void displayIntersectionStatus(){
        for(TrafficLight light : trafficLights){
            System.out.println(light);
        }
    }


}
