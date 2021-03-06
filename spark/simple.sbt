name := "Simple Project"

version := "1.0"

scalaVersion := "2.9.2"


libraryDependencies += "org.spark-project" % "spark-core_2.9.2" % "0.7.0"

libraryDependencies += "org.spark-project" % "spark-streaming_2.9.2" % "0.7.0"



resolvers ++= Seq(
   "Maven Repository" at "http://repo1.maven.org/maven2",
   "Akka Repository" at "http://repo.akka.io/releases/",
   "Spray Repository" at "http://repo.spray.cc/"
)
