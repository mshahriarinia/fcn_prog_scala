package greeter

object test extends App{
  val mymap = Map("a" -> 42, "b" -> 43)
  println("1: "+mymap.get("a"))

  def getMapVal(s: String): String = {
    mymap.get(s) match {
      case Some(a) => ""+a       
      case None => "None here!"
    }    
  }
  
  println("2: " + getMapVal("a"))
}