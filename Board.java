import java.util.*;
public class Board{

private int boardsize;
private HashMap<Integer,Snakes> snake;
private HashMap<Integer,Ladder> ladder;
private Queue<Player> playerlist;

public Board(int boardsize,HashMap<Integer,Snakes> snake,HashMap<Integer,Ladder> ladder,Queue<Player> playerlist){
this.boardsize=boardsize;
this.snake=snake;
this.ladder=ladder;
this.playerlist=playerlist;
}

public void snakeandladder(){
while(true){
Player p1=playerlist.poll();
int prevpos=p1.getplayerpos();
int newpos=prevpos+Dice.rolldice();
if (newpos<=boardsize){
if(snake.containsKey(newpos){
System.out.println(p1.getName()+"bitten by snake and came to  tail of the snake");
                    Snakes s11=snake.get(newpos);
                    newpos=s11.getEndPt();
                
                }
                else if(ladder.containsKey(newpos)){
                     System.out.println(p1.getName()+"climed the ladder and reached the top of ladder");
                    Ladder l11=ladder.get(newposition);
                    newpos=l11.getEndPt();
                   
                }
                else{
                    System.out.println(p1.getName()+"has moved from "+prevpos+"to "+newpos);
                }
                if(newpos==boardsize){
                    System.out.println(p1.getName()+"won the game");
                    break;
                }
            p1.setplayerspot(newpos);
            }
        playerlist.add(p1);
    }
}
}

