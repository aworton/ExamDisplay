name := "ExamDisplay"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.92-R10"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// Exclude some folders associated with IntelliJ
ideaExcludeFolders += ".idea"

ideaExcludeFolders += ".idea_modules"
    