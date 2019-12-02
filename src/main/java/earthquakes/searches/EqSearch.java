package earthquakes.searches;
public class EqSearch
{
    private int distance;
    private int minmag;
    private double lat;
    private double lon;
    private String location;
    public EqSearch(){
        this.distance = 0;
        this.minmag = 0;
        this.lat = 0;
        this.lon = 0;
        this.location = "";
    }
    public void setDistance(int x){
        this.distance = x;
    }
    public void setMinmag(int x){
        this.minmag = x;
    }
    public void setLat(double x){
        this.lat = x;
    }
    public void setLon(double x){
        this.lon = x;
    }
    public void setLocation(String x){
        this.location = x;
    }
    public int getDistance(){
        return this.distance;
    }
    public int getMinmag(){
        return this.minmag;
    }
    public double getLat(){
        return this.lat;
    }
    public double getLon(){
        return this.lon;
    }
    public String getLocation(){
        return this.location;
    }

}