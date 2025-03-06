public class Thing{
    String name;
    int volume;
    public Thing(String name){
        this.name = name;
    }
    public Thing(int volume){
        this.volume = volume;
    }
    public Thing(String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    public int volume(){
        return this.volume;
    }
    public void setName(String nom){
        this.name = nom;
    }
    public boolean hasName(String nom){
        if (this.name == nom) {return true;}
        return false;
    }

    @Override
    public String toString(){
        return "Nom " + this.name + ", Volume " + this.volume;
    }
}