package traffic;

public class Sensor {
    private String id;
    private int trafficDensity;


    public Sensor(String id){
        this.id = id;
        this.trafficDensity = 0;
    }

    public int getTrafficDensity(){
        return trafficDensity;
    }

    public void updateTrafficDensity(int newDensity){
        this.trafficDensity = newDensity;
    }


    @Override
    public String toString() {
        return "Sensor{" + "id= '" + id + '\'' +
                " ,trafficDensity=" +
                trafficDensity +
                '}';


    }
}
