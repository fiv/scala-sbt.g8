
// Resolvers

resolvers += Classpaths.typesafeResolver

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += Classpaths.sbtPluginReleases

// Plugins

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")

addSbtPlugin("com.sqality.scct" % "sbt-scct" % "0.3-SNAPSHOT")

addSbtPlugin("me.lessis" % "sbt-growl-plugin" % "0.1.3")

