
// Resolvers

resolvers += Classpaths.typesafeResolver

resolvers += Classpaths.sbtPluginReleases

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// Plugins

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("com.sqality.scct" % "sbt-scct" % "0.3.1-SNAPSHOT")

addSbtPlugin("me.lessis" % "sbt-growl-plugin" % "0.1.3")

addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "0.98.4")
