import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q6{
  def f(n:Int):Int=n match{
  case n if n==0 => 0
  case n if n==1 => 1
  case n => f(n-1)+f(n-2)

  }
  def main(args:Array[String]){
    var input = new Scanner(System.in);
    println("Enter a number");
    val N=input.nextInt();

    println(f(N))
  }  


}

