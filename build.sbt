import org.typelevel.sbt.tpolecat.DevMode

ThisBuild / tpolecatDefaultOptionsMode := DevMode

lazy val root = Project("root", file("."))
  .settings(commonSettings)
  .settings(
    name := "Scala Starter",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.13.0",
      "org.scalameta" %% "munit" % "1.1.0" % Test,
    ),
  )

lazy val commonSettings = Seq(
  version := "0.1.0",
  scalaVersion := "3.6.3",
)
