package greeter

object cheatsheets {

  /** Pattern Matching */
  val mymap = Map("a" -> 42, "b" -> 43)           //> mymap  : scala.collection.immutable.Map[String,Int] = Map(a -> 42, b -> 43)
  println("1: " + mymap.get("a"))                 //> 1: Some(42)

  def getMapVal(s: String): String = {
    mymap get s match {
      case Some(a) => "" + a
      case None => "None here!"
    }
  }                                               //> getMapVal: (s: String)String

  println("2: " + getMapVal("a"))                 //> 2: 42

}