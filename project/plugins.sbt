val sbtTypelevelVersion = "0.7.2"
val sbtMdocVersion      = "2.5.4"

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.12.1")
addSbtPlugin("ch.epfl.scala" % "sbt-bloop"    % "1.6.0")

addSbtPlugin("com.github.sbt"    % "sbt-native-packager" % "1.9.14")
addSbtPlugin("de.heikoseeberger" % "sbt-header"          % "5.10.0")

addSbtPlugin("org.typelevel" % "sbt-typelevel"          % sbtTypelevelVersion)
addSbtPlugin("org.http4s"    % "sbt-http4s-org"         % "0.17.2")
addSbtPlugin("org.typelevel" % "sbt-typelevel-site"     % sbtTypelevelVersion)
addSbtPlugin("org.typelevel" % "sbt-typelevel-scalafix" % sbtTypelevelVersion)
addSbtPlugin("org.scalameta" % "sbt-mdoc"               % sbtMdocVersion)
