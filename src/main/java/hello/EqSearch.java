package hello;
public class EqSearch
{
    private int distance;
    private int minmag;
    public EqSearch(){
        this.distance = 0;
        this.minmag = 0;
    }
    public void setDistance(int x){
        this.distance = x;
    }
    public void setMinmag(int x){
        this.minmag = x;
    }
    public int getDistance(){
        return this.distance;
    }
    public int getMinmag(){
        return this.minmag;
    }

}