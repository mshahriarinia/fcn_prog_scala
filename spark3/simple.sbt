name := "Simple Project3"

version := "1.0"

scalaVersion := "2.9.2"


libraryDependencies += "org.spark-project" % "spark-core_2.9.2" % "0.7.0"

libraryDependencies += "org.spark-project" % "spark-streaming_2.9.2" % "0.7.0"



resolvers ++= Seq(
   "Maven Repository" at "http://repo1.maven.org/maven2",
   "Akka Repository" at "http://repo.akka.io/releases/",
   "Spray Repository" at "http://repo.spray.cc/",
   "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases",
   "opennlp sourceforge repo" at "http://opennlp.sourceforge.net/maven2"
)
