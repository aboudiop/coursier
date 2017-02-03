addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.8.2")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.14")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.4.0")
addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.4.8")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M15-1")
addSbtPlugin("com.typesafe.sbt" % "sbt-proguard" % "0.2.2")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.13")
libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
