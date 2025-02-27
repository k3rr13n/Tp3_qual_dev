import java.util.ArrayList;

class Box{
    ArrayList<Thing> contents = new ArrayList<Thing>();
    public void add(Thing truc){
        this.contents.add(truc);
    }
    public boolean contient(Thing turc){
        return this.contents.contains(turc);
    }
    public void supprimer(Thing truc){
        for (int i=0; i>contents.size(); i++){
            if (this.contents.get(i) == truc)
                this.contents.remove(i);
        }
    }
}