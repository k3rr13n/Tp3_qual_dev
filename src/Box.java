import java.util.ArrayList;

class Box{
    ArrayList<Thing> contents = new ArrayList<Thing>();
    public void add(Thing truc){
        this.contents.add(truc);
    }
    public boolean contien(Thing turc){
        return this.contents.contains(turc);
    }
}