import java.util.Random;
class Dice{
public static int rolldice(){
return new Random().nextInt(6)+1;
} 
}