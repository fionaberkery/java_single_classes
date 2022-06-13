public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int newVolume){
        this.volume = newVolume;
    }

    public int drink(){
        setVolume(this.volume - 10);
        return this.volume;
    }

    public int emptyBottle(){
        setVolume(0);
        return this.volume;
    }

    public int refillBottle(){
        setVolume(100);
        return this.volume;

    }







}
