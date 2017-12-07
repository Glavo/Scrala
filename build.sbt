lazy val root = (project in file("."))
  .settings(
    name := "scrala",
    autoScalaLibrary := false
  ).aggregate(`scrala-souper`)


lazy val `scrala-souper` = (project in file("scrala-souper"))
  .settings(
    name := "scrala-souper",

    version := "0.1",

    scalaVersion := "2.12.4",

    libraryDependencies ++= Seq(
      "org.jsoup" % "jsoup" % "1.11.2",
      "org.jetbrains" % "annotations" % "15.0"
    )
  )