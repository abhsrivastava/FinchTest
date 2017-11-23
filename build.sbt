name := "FinchTest"

version := "1.0"

scalaVersion := "2.12.4"

val finchVersion = "0.15.1"
val circeVersion = "0.8.0"

libraryDependencies ++= Seq(
   "com.github.finagle" %% "finch-core" % finchVersion,
   "com.github.finagle" %% "finch-circe" % finchVersion,
   "io.circe" %% "circe-core" % circeVersion,
   "io.circe" %% "circe-generic" % circeVersion,
   "io.circe" %% "circe-parser" % circeVersion,
   "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
