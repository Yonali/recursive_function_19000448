import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q3{
  def sum(x:Int,y:Int=0): Int=x match{
    case 0 =>y
    case i if i>0 => sum((x-1),(x+y))
  }
  def main(args:Array[String]){
    var input = new Scanner (System.in);
    println("Sum of n numbers(1 to n)");
    print("Enter a number \nn=");
    val N=input.nextInt();
    println(sum(N));
  }

}
