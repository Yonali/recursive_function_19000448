object Q6 extends App{

  def f(n:Int):Int=n match{
  case n if n==0 => 0
  case n if n==1 => 1
  case n => f(n-1)+f(n-2)

  }

println(f(5))

}

