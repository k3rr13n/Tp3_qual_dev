import java.util.ArrayList;

public class Box{
    boolean etatBoite;
    int capacite;
    ArrayList<Thing> contents = new ArrayList<Thing>();
    public Box(){
        this.capacite = -1;
    }
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
    public boolean isOpen(){
        return this.etatBoite;
    }
    public void close(){
        this.etatBoite = false;
    }
    public void open(){
        this.etatBoite = true;
    }
    public String actionLook(){
        if (etatBoite == true){
            return "la boite contient: ceci, cela";
        }
        return "la boite est fermee";
    }
    public void setCapacity(int volume){
        this.capacite = volume;
    }
    public int capacity(){
        return this.capacite;
    }
    public boolean hasRoomFor(Thing truc){
        if (this.capacite < 0 && this.capacite == -1) {return true;}   
        if (this.capacite - truc.volume >= 0) {return true;} 
        return false;
    }
    public void actionAdd(Thing truc){
        if (this.hasRoomFor(truc) == true && this.isOpen() == true){
            this.capacite -= truc.volume;
            this.add(truc);
        }
    }
    public Thing find(String nomTruc){
        for (Thing truc : this.contents){
            if (truc.hasName(nomTruc) == true){
                return truc;
            }
        }
        return null;
    }
}