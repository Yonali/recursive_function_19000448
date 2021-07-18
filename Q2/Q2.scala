import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q2{
  def gcd(l:Int,k:Int):Int=k match{
    case 0 => l
    case i if (i>l) => gcd(i,l)
   case _ => gcd(k,l%k)
  }
  def prime(x:Int, y:Int=2): Boolean = y match{
    case i if(i==x) => true
    case i if gcd(x,i) > 1 => false
    case i => prime(x,i+1)
  }
  def primeSeq(p:Int) : Unit = {
    if(p>2)
      primeSeq(p-1);
    var bool = (prime(p));
    if(bool)
      println(p);
  }
    
  def main(args:Array[String]){
    var input = new Scanner (System.in);
    println("Enter a number")
    val N=input.nextInt();

    primeSeq(N);
  }
  
}

