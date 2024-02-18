package FanapCamps.Stream;

import java.io.Serializable;

public class employee implements Serializable {
    String name;
    String family;
    int id;
    int hash;

    public String getName(){
        return name;
    }
    public String getFamily(){
        return family;
    }
    public int getId(){
        return id;
    }
    public int getHash(){
        return hash;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setFamily(String family){
        this.family=family;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setHash(int hash){
        this.hash=hash;
    }

    public employee (String name, String family, int id, int hash){
        this.name=name;
        this.family=family;
        this.id=id;
        this.hash=hash;
    }
}
