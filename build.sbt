organization  := "gitbucket"
name          := "pages-plugin"
scalaVersion  := "2.12.2"
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)

resolvers ++= Seq(
  Resolver.jcenterRepo,
  Resolver.mavenLocal
)

libraryDependencies ++= Seq(
  "io.github.gitbucket"   %%  "gitbucket"           % "4.14.0",
  "javax.servlet"         %   "javax.servlet-api"   % "3.1.0",
  "com.typesafe.play"     %%  "twirl-compiler"      % "1.3.2"
)

