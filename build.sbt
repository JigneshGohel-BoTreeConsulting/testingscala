name := "Testing Scala"

version := "1.0"

scalaVersion := "2.10.1"

// org.scalatest looks in the maven and scala central repositories by default
// for the dependency scalatest_2.9.2 when using %%.The two percent 
// signs %% will append an underscore and the scala version number to the name
// of the library. If you don’t want SBT to control the scala version and wish 
// to do it yourself, you can specify your own version using % instead of %%.
// By default dependenices are downloaded to ~/.ivy2/cache/
//
//  You can use any ScalaTest 1.x release or the latest 2.0.M5b (recommended). 
//  Using ScalaTest 2.0 enables the following:
//    1. Test result view built in the eclipse workspace.
//    2. Running of selected specific test or scope.
// 
//  When using ScalaTest 1.x, the GUI Runner provided by ScalaTest will be used 
//  instead of the built-in test result view. 
//
// Reference: 
//  http://stackoverflow.com/questions/12220147/scala-sbt-dependencies-not-downloading
//  https://github.com/harrah/xsbt/wiki/Getting-Started-Library-Dependencies
//  http://www.scalatest.org/user_guide/using_scalatest_with_eclipse
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test"