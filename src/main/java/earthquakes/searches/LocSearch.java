package earthquakes.searches;
public class LocSearch
{
    private String location;
    public LocSearch(){
        this.location = "";
    }
    public void setDistance(String x){
        this.location = x;
    }
    public String getDistance(){
        return this.location;
    }
}