package EX11;
//: reusing/Detergent.java
// Inheritance syntax & properties.
import static net.mindview.util.Print.*;

class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    print(x);
  }
}	

public class Detergent{
  Cleanser c = new Cleanser();
  // Change a method:
  public void dilute() {c.dilute();}
  public void apply() {c.apply();}
  public void scrub() {
    c.append(" Detergent.scrub()");
    c.scrub(); // Call base-class version
  }
  // Add methods to the interface:
  public void foam() { c.append(" foam()"); }
  // Test the new class:
  public String toString() { return c.toString(); }
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    print(x);
    print("Testing base class:");
    Cleanser.main(args);
  }	
} /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
Testing base class:
Cleanser dilute() apply() scrub()
*///:~
