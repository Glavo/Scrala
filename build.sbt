val common = Seq (
  version := "0.1",

  scalaVersion := "2.12.4"
)

lazy val root = (project in file("."))
  .settings(
    name := "scrala",
    autoScalaLibrary := false
  ).aggregate(`scrala-souper`)

lazy val `scrala-base` = (project in file("scrala-base"))
  .settings(
    common,
    name := "scrala"
  ).dependsOn(`scrala-souper`)

lazy val `scrala-souper` = (project in file("scrala-souper"))
  .settings(
    common,
    name := "scrala-souper",

    libraryDependencies ++= Seq(
      "org.jsoup" % "jsoup" % "1.11.2",
      "org.jetbrains" % "annotations" % "15.0"
    )
  )

