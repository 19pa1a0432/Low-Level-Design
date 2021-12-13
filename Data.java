public class Data{
public static void main(String [] args){
try(Scanner sc=new Scanner(System.in)){
System.out.println("please enter the requirements");

System.out.println("please enter the num of cells");
int boardsize=Integer.parseInt(sc.nextLine());

System.out.println("please enter the num of dice");
int noofdice=Integer.parseInt(sc.nextLine());

System.out.println("please enter the num of snakes");
int ns=Integer.parseInt(sc.nextLine());

System.out.println("please enter the num of Ladders");
int nl=Integer.parseInt(sc.nextLine());

HashMap<Integer,Snakes> smap= new HashMap<Integer,Snakes>();
for(int i=0;i<ns;i++){
String [] sdata= sc.nextLine().split(" ");
int end=Integer.parseInt(sdata[1]);
int start= Integer.parseInt(sdata[0]);
Snakes snk= new Snake(start,end);
smap.put(start,end);
}

HashMap<Integer,Ladder> lmap= new HashMap<Integer,Snakes>();
for(int i=0;i<nl;i++){
String [] ldata= sc.nextLine().split(" ");
int end=Integer.parseInt(sdata[1]);
int start= Integer.parseInt(sdata[0]);
Ladder lad= new Ladder(start,end);
lmap.put(start,end);
}

Queue<Player>playerlist = new LinkedList<Player>();
System.out.println("please enter the num of players"); 
int n=Integer.paseInt(sc.nextLine());
for(int i=0;i<n;i++){
System.out.println("please enter the name of players "+i);
String pname=sc.nextLine();
Player p = new Player(pname);
}
Board board=new Board(boardsize,smap,lmap,playerlist);
Board.snakeandladder();
}
}
}
 








