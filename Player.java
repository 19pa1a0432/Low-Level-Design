public class Player{
private String name;
private int playerpos=0;
public Player(String name){
this.name=name;
}
public String getName(){
return name;
}
public void setplayerpos(int pos){
this.playerpos=pos;
}
public int getplayerpos(){
return playerpos;
}
}