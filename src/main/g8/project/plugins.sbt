
// Resolvers

resolvers += Classpaths.typesafeResolver

resolvers += Classpaths.sbtPluginReleases

// Plugins

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")

addSbtPlugin("com.sqality.scct" % "sbt-scct" % "0.2.2")

addSbtPlugin("me.lessis" % "sbt-growl-plugin" % "0.1.3")

