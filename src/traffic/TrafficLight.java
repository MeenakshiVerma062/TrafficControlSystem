package traffic;

public class TrafficLight {
    private String id;
    private String state; // red, yellow, green
    private int duration; // duration in seconds

    public TrafficLight(String id){
        this.id = id;
        this.state = "red";
        this.duration = 60;
    }
    public String getState(){
        return state;
    }
    public void getState(String state){
        this.state = state;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public void changeState(){
        switch (state){
            case "red" : state = "green";
            break;
            case "green" : state = "yellow";
            break;
            case " yellow" : state = "red";
            break;
        }

    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "id= ' " + id + '\'' +
                ", state= ' " + state +
                '\'' +
                "duration=" + duration +
                '}';

    }
}
