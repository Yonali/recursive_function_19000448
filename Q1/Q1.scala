










object Q1 extends App{
  def prime(x:Int):Boolean={
    if(x<=1)
      false
    else if(x==2)
      true
    else
      !(2 to (x-1)).exists(i=>x % i==0)
  }
  println(prime(3));
}
