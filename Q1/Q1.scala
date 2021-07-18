import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q1{
  def gcd(l:Int,k:Int):Int=k match{
    case 0=>l
    case i if (i>l) => gcd(i,l)
    case _ => gcd(k,l%k)
  }
  def prime(x:Int,n:Int=2):Boolean=n match{
    case i if(x==i) => true
    case i if (gcd(x,i)>1) => false
    case i => prime(x,i+1)
  }
  def main(args:Array[String]){
    var input = new Scanner(System.in)
    println("Enter a number")
    val N=input.nextInt();

    print(prime(N))
  }  

}
