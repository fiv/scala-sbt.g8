// Resolvers

resolvers += Classpaths.typesafeResolver

resolvers += Classpaths.sbtPluginReleases

// Plugins

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.1.0")

addSbtPlugin("com.github.scct" % "sbt-scct" % "0.2")

addSbtPlugin("me.lessis" % "sbt-growl-plugin" % "0.1.3")
