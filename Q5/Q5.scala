import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q5{
  def IsEven(x:Int): Boolean=x match{
    case 0=> true
    case _=> IsOdd(x-1)
  }
  def IsOdd(x:Int):Boolean={
    !(IsEven(x))
  }  
  def sum(x:Int, y:Int=0 , out:Int=0) : Int =x match{
    case i if (i==x) => out
    case i if ((i<x) && (IsOdd(y))) => sum(x,y+1,out)
    case i if ((i<x) && (! IsOdd(y))) => sum(x,y+1,out+y)
  }  
  def main(args:Array[String]){
    var input = new Scanner(System.in);
    print("Enter a number = ");
    val N=input.nextInt();
    println(sum(N));
  } 

}
