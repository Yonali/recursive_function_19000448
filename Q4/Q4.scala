import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q4{
  def IsEven(x:Int):Boolean=x match{
    case 0 => true
    case _ => IsOdd(x-1)
  }
  def IsOdd(x:Int):Boolean={
    ! (IsEven(x))
  }
  def main(args:Array[String]){
    var input = new Scanner (System.in);
    println("Enter a number ")
    val n = input.nextInt();

    if(IsOdd(n))
      println("It is a Odd number");
    else
      println("It is a Even number");
  }

}
