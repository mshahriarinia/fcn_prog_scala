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

//OR
def getMapVal2(s: String): String = mymap.get(s).map("Found value: " + _).getOrElse("Value Not Found")
                                                  //> getMapVal2: (s: String)String
println("3: " + getMapVal2("a"))                  //> 3: Found value: 42
println("3: " + getMapVal2("f"))                  //> 3: Value Not Found

val mixedList = List("a", 1, 2, "b", 19, 42.0) //this is a List[Any]
                                                  //> mixedList  : List[Any] = List(a, 1, 2, b, 19, 42.0)
val results = mixedList collect {
  case s: String => "String:" + s
  case i: Int => "Int:" + i.toString
}                                                 //> results  : List[String] = List(String:a, Int:1, Int:2, String:b, Int:19)

}