organization := "com.yuilsang"

name := "HelloServlet"

version := "0.1"

scalaVersion := "2.9.2"

seq(webSettings :_*)

// add the .war file to what gets published
//addArtifact(artifact in (Compile, packageWar), packageWar)

libraryDependencies ++= Seq(
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
    "javax.servlet" % "servlet-api" % "2.5" % "provided",
    "javax.servlet.jsp" % "javax.servlet.jsp-api" % "2.3.1" % "provided"
)