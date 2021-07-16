object Q2 extends App{
  def primeSeq(x:Int) : Boolean = {
    if(x<=1)
      false
    else if(x==2)
      true
    else
      !(2 to (x-1)).exists(i=>x % i==0)
  }

  (1 to 10).foreach(x=> if (primeSeq(x)) println("%d is a prime number".format(x)))
}

