public class Main {
  public static void main(String[] args) {
    System.out.println("Question 2");

    String info;
    Scoreboard game = new Scoreboard("Red", "Blue");
    info = game.getScore();
    System.out.println(info);
    
    game.recordPlay(1); 
    info = game.getScore(); 
    System.out.println(info);

    
    game.recordPlay(0); 
    info = game.getScore(); 
    info = game.getScore();
    System.out.println(info);
    
    game.recordPlay(3); 
    info = game.getScore();
    System.out.println(info);
    
    game.recordPlay(1); 
    game.recordPlay(0);
    info = game.getScore();
    System.out.println(info);
    
    game.recordPlay(0); 
    game.recordPlay(4); 
    game.recordPlay(0); 
    info = game.getScore();
    System.out.println(info);
    
    Scoreboard match = new Scoreboard("Lions", "Tigers");
    info = match.getScore(); //"0-0-Lions"
    System.out.println(info);
    
    info = game.getScore();
    System.out.println(info);
  }
}
