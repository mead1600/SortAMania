public class Thingy implements Comparable<Thingy>{

    public int getValue() {
        return value;
    }

    private int value;

    public Thingy(){
        this.value = (int)(Math.random()*10000);
    }

    public int compareTo(Thingy other) {
        return this.value - other.value;
    }
    public  static Thingy[] randomThingArr(int num){
        Thingy[] things = new Thingy[num];
        for(int i = 0; i < num; i++){
            things[i] = new Thingy();
        }
        return things;
    }
}
