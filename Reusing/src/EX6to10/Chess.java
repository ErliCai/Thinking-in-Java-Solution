package EX6to10;
//: reusing/Chess.java
// Inheritance, constructors and arguments.
// EX6
import static net.mindview.util.Print.*;

class Game {
  Game(int i) {
    print("Game constructor");
  }
}

class BoardGame extends Game {
  BoardGame(int i) {
    print("BoardGame constructor");
    super(i);
  }
}	

public class Chess extends BoardGame {
  Chess() {
    print("Chess constructor");
  }
  public static void main(String[] args) {
    Chess x = new Chess();
  }
} /* Output:
Game constructor
BoardGame constructor
Chess constructor
*///:~
