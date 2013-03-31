package greeter

object cheatsheets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 

  /** Pattern Matching */
  val mymap = Map("a" -> 42, "b" -> 43);System.out.println("""mymap  : scala.collection.immutable.Map[String,Int] = """ + $show(mymap ));$skip(34); 
  println("1: " + mymap.get("a"));$skip(135); 

  def getMapVal(s: String): String = {
    mymap get s match {
      case Some(a) => "" + a
      case None => "None here!"
    }
  };System.out.println("""getMapVal: (s: String)String""");$skip(35); 

  println("2: " + getMapVal("a"));$skip(109); 

//OR
def getMapVal2(s: String): String = mymap.get(s).map("Found value: " + _).getOrElse("Value Not Found");System.out.println("""getMapVal2: (s: String)String""");$skip(33); 
println("3: " + getMapVal2("a"));$skip(33); 
println("3: " + getMapVal2("f"))}
}
