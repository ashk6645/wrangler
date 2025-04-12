```
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Wrangler                                                           [pom]
[INFO] Wrangler API                                                       [jar]
[INFO] Wrangler REST Protocol Classes                                     [jar]
[INFO] Wrangler Core                                                      [jar]
[INFO] Wrangler Storage                                                   [jar]
[INFO] Wrangler Service                                                   [jar]
[INFO] Wrangler Testing Framework                                         [jar]
[INFO] Wrangler Transform                                                 [jar]
[INFO] 
[INFO] ---------------------< io.cdap.wrangler:wrangler >----------------------
[INFO] Building Wrangler 4.12.0-SNAPSHOT                                  [1/8]
[INFO]   from pom.xml
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- apache-rat:0.10:check (rat-check) @ wrangler ---
[INFO] 58 implicit excludes (use -debug for more details).
[INFO] Exclude: cov-int/**
[INFO] Exclude: *.md
[INFO] Exclude: **/*.md
[INFO] Exclude: **/*.json
[INFO] Exclude: **/resources/**
[INFO] Exclude: wrangler-demos/**
[INFO] Exclude: **/com/example/**
[INFO] Exclude: /**/icons/**
[INFO] 8 resources included (use -debug for more details)
[INFO] Rat check: Summary of files. Unapproved: 0 unknown: 0 generated: 0 approved: 6 licence.
[INFO] 
[INFO] -------------------< io.cdap.wrangler:wrangler-api >--------------------
[INFO] Building Wrangler API 4.12.0-SNAPSHOT                              [2/8]
[INFO]   from wrangler-api/pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- apache-rat:0.10:check (rat-check) @ wrangler-api ---
[INFO] 51 implicit excludes (use -debug for more details).
[INFO] Exclude: cov-int/**
[INFO] Exclude: *.md
[INFO] Exclude: **/*.md
[INFO] Exclude: **/*.json
[INFO] Exclude: **/resources/**
[INFO] Exclude: wrangler-demos/**
[INFO] Exclude: **/com/example/**
[INFO] Exclude: /**/icons/**
[INFO] 73 resources included (use -debug for more details)
[INFO] Rat check: Summary of files. Unapproved: 0 unknown: 0 generated: 0 approved: 73 licence.
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ wrangler-api ---
[INFO] skip non existing resourceDirectory /Users/ashutoshsingh/Documents/wrangler/wrangler-api/src/main/resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ wrangler-api ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] ------------------< io.cdap.wrangler:wrangler-proto >-------------------
[INFO] Building Wrangler REST Protocol Classes 4.12.0-SNAPSHOT            [3/8]
[INFO]   from wrangler-proto/pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- apache-rat:0.10:check (rat-check) @ wrangler-proto ---
[INFO] 51 implicit excludes (use -debug for more details).
[INFO] Exclude: cov-int/**
[INFO] Exclude: *.md
[INFO] Exclude: **/*.md
[INFO] Exclude: **/*.json
[INFO] Exclude: **/resources/**
[INFO] Exclude: wrangler-demos/**
[INFO] Exclude: **/com/example/**
[INFO] Exclude: /**/icons/**
[INFO] 81 resources included (use -debug for more details)
[INFO] Rat check: Summary of files. Unapproved: 0 unknown: 0 generated: 0 approved: 81 licence.
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ wrangler-proto ---
[INFO] skip non existing resourceDirectory /Users/ashutoshsingh/Documents/wrangler/wrangler-proto/src/main/resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ wrangler-proto ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] -------------------< io.cdap.wrangler:wrangler-core >-------------------
[INFO] Building Wrangler Core 4.12.0-SNAPSHOT                             [4/8]
[INFO]   from wrangler-core/pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] 2 problems were encountered while building the effective model for org.apache.yetus:audience-annotations:jar:0.5.0 during dependency collection step for project (use -X to see details)
[WARNING] 1 problem was encountered while building the effective model for org.javassist:javassist:jar:3.18.2-GA during dependency collection step for project (use -X to see details)
[INFO] 
[INFO] --- apache-rat:0.10:check (rat-check) @ wrangler-core ---
[INFO] 51 implicit excludes (use -debug for more details).
[INFO] Exclude: cov-int/**
[INFO] Exclude: *.md
[INFO] Exclude: **/*.md
[INFO] Exclude: **/*.json
[INFO] Exclude: **/resources/**
[INFO] Exclude: wrangler-demos/**
[INFO] Exclude: **/com/example/**
[INFO] Exclude: /**/icons/**
[INFO] 303 resources included (use -debug for more details)
[INFO] Rat check: Summary of files. Unapproved: 0 unknown: 0 generated: 0 approved: 303 licence.
[INFO] 
[INFO] --- antlr4:4.7:antlr4 (default) @ wrangler-core ---
[INFO] No grammars to process
[INFO] ANTLR 4: Processing source directory /Users/ashutoshsingh/Documents/wrangler/wrangler-core/src/main/antlr4
[INFO] 
[INFO] --- buildnumber:1.0:create (default) @ wrangler-core ---
[INFO] Storing buildNumber: 2025-04-12-22:19:29_ashutoshsingh at timestamp: 1744476569823
[INFO] Executing: /bin/sh -c cd /Users/ashutoshsingh/Documents/wrangler/wrangler-core && git show
[INFO] Working directory: /Users/ashutoshsingh/Documents/wrangler/wrangler-core
[INFO] Storing buildScmBranch: UNKNOWN
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ wrangler-core ---
[INFO] Copying 12 resources from src/main/resources to target/classes
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ wrangler-core ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 190 source files with javac [debug target 1.8] to target/classes
[WARNING] bootstrap class path is not set in conjunction with -source 8
  not setting the bootstrap class path may lead to class files that cannot run on JDK 8
    --release 8 is recommended instead of -source 8 -target 1.8 because it sets the bootstrap class path automatically
[WARNING] source value 8 is obsolete and will be removed in a future release
[WARNING] target value 8 is obsolete and will be removed in a future release
[WARNING] To suppress warnings about obsolete options, use -Xlint:-options.
[WARNING] /Users/ashutoshsingh/Documents/wrangler/wrangler-core/src/main/java/io/cdap/directives/column/CreateRecord.java:[100,82] non-varargs call of varargs method with inexact argument type for last parameter;
  cast to java.lang.Object for a varargs call
  cast to java.lang.Object[] for a non-varargs call and to suppress this warning
[WARNING] /Users/ashutoshsingh/Documents/wrangler/wrangler-core/src/main/java/io/cdap/directives/row/Flatten.java:[169,98] non-varargs call of varargs method with inexact argument type for last parameter;
  cast to java.lang.Object for a varargs call
  cast to java.lang.Object[] for a non-varargs call and to suppress this warning
[WARNING] /Users/ashutoshsingh/Documents/wrangler/wrangler-core/src/main/java/io/cdap/wrangler/statistics/BasicStatistics.java:[43,20] Double(double) in java.lang.Double has been deprecated and marked for removal
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-core/src/main/java/io/cdap/wrangler/parser/ConfigDirectiveContext.java: Some input files use or override a deprecated API.
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-core/src/main/java/io/cdap/wrangler/parser/ConfigDirectiveContext.java: Recompile with -Xlint:deprecation for details.
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-core/src/main/java/io/cdap/directives/aggregates/DefaultTransientStore.java: Some input files use unchecked or unsafe operations.
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-core/src/main/java/io/cdap/directives/aggregates/DefaultTransientStore.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] -----------------< io.cdap.wrangler:wrangler-storage >------------------
[INFO] Building Wrangler Storage 4.12.0-SNAPSHOT                          [5/8]
[INFO]   from wrangler-storage/pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- apache-rat:0.10:check (rat-check) @ wrangler-storage ---
[INFO] 51 implicit excludes (use -debug for more details).
[INFO] Exclude: cov-int/**
[INFO] Exclude: *.md
[INFO] Exclude: **/*.md
[INFO] Exclude: **/*.json
[INFO] Exclude: **/resources/**
[INFO] Exclude: wrangler-demos/**
[INFO] Exclude: **/com/example/**
[INFO] Exclude: /**/icons/**
[INFO] 33 resources included (use -debug for more details)
[INFO] Rat check: Summary of files. Unapproved: 0 unknown: 0 generated: 0 approved: 33 licence.
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ wrangler-storage ---
[INFO] skip non existing resourceDirectory /Users/ashutoshsingh/Documents/wrangler/wrangler-storage/src/main/resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ wrangler-storage ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] -----------------< io.cdap.wrangler:wrangler-service >------------------
[INFO] Building Wrangler Service 4.12.0-SNAPSHOT                          [6/8]
[INFO]   from wrangler-service/pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- apache-rat:0.10:check (rat-check) @ wrangler-service ---
[INFO] 51 implicit excludes (use -debug for more details).
[INFO] Exclude: cov-int/**
[INFO] Exclude: *.md
[INFO] Exclude: **/*.md
[INFO] Exclude: **/*.json
[INFO] Exclude: **/resources/**
[INFO] Exclude: wrangler-demos/**
[INFO] Exclude: **/com/example/**
[INFO] Exclude: /**/icons/**
[INFO] 69 resources included (use -debug for more details)
[INFO] Rat check: Summary of files. Unapproved: 0 unknown: 0 generated: 0 approved: 69 licence.
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ wrangler-service ---
[INFO] Copying 2 resources from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ wrangler-service ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 52 source files with javac [debug target 1.8] to target/classes
[WARNING] bootstrap class path is not set in conjunction with -source 8
  not setting the bootstrap class path may lead to class files that cannot run on JDK 8
    --release 8 is recommended instead of -source 8 -target 1.8 because it sets the bootstrap class path automatically
[WARNING] source value 8 is obsolete and will be removed in a future release
[WARNING] target value 8 is obsolete and will be removed in a future release
[WARNING] To suppress warnings about obsolete options, use -Xlint:-options.
[WARNING] /Users/ashutoshsingh/Documents/wrangler/wrangler-service/src/main/java/io/cdap/wrangler/service/explorer/Explorer.java:[34,21] java.security.AccessControlException in java.security has been deprecated and marked for removal
[WARNING] /Users/ashutoshsingh/Documents/wrangler/wrangler-service/src/main/java/io/cdap/wrangler/service/explorer/Explorer.java:[104,14] java.security.AccessControlException in java.security has been deprecated and marked for removal
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-service/src/main/java/io/cdap/wrangler/service/DataPrepService.java: Some input files use or override a deprecated API.
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-service/src/main/java/io/cdap/wrangler/service/DataPrepService.java: Recompile with -Xlint:deprecation for details.
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-service/src/main/java/io/cdap/wrangler/service/adls/ADLSHandler.java: Some input files use unchecked or unsafe operations.
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-service/src/main/java/io/cdap/wrangler/service/adls/ADLSHandler.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] -------------------< io.cdap.wrangler:wrangler-test >-------------------
[INFO] Building Wrangler Testing Framework 4.12.0-SNAPSHOT                [7/8]
[INFO]   from wrangler-test/pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- apache-rat:0.10:check (rat-check) @ wrangler-test ---
[INFO] 51 implicit excludes (use -debug for more details).
[INFO] Exclude: cov-int/**
[INFO] Exclude: *.md
[INFO] Exclude: **/*.md
[INFO] Exclude: **/*.json
[INFO] Exclude: **/resources/**
[INFO] Exclude: wrangler-demos/**
[INFO] Exclude: **/com/example/**
[INFO] Exclude: /**/icons/**
[INFO] 4 resources included (use -debug for more details)
[INFO] Rat check: Summary of files. Unapproved: 0 unknown: 0 generated: 0 approved: 4 licence.
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ wrangler-test ---
[INFO] skip non existing resourceDirectory /Users/ashutoshsingh/Documents/wrangler/wrangler-test/src/main/resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ wrangler-test ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 3 source files with javac [debug target 1.8] to target/classes
[WARNING] bootstrap class path is not set in conjunction with -source 8
  not setting the bootstrap class path may lead to class files that cannot run on JDK 8
    --release 8 is recommended instead of -source 8 -target 1.8 because it sets the bootstrap class path automatically
[WARNING] source value 8 is obsolete and will be removed in a future release
[WARNING] target value 8 is obsolete and will be removed in a future release
[WARNING] To suppress warnings about obsolete options, use -Xlint:-options.
[INFO] 
[INFO] ----------------< io.cdap.wrangler:wrangler-transform >-----------------
[INFO] Building Wrangler Transform 4.12.0-SNAPSHOT                        [8/8]
[INFO]   from wrangler-transform/pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- apache-rat:0.10:check (rat-check) @ wrangler-transform ---
[INFO] 51 implicit excludes (use -debug for more details).
[INFO] Exclude: cov-int/**
[INFO] Exclude: *.md
[INFO] Exclude: **/*.md
[INFO] Exclude: **/*.json
[INFO] Exclude: **/resources/**
[INFO] Exclude: wrangler-demos/**
[INFO] Exclude: **/com/example/**
[INFO] Exclude: /**/icons/**
[INFO] 36 resources included (use -debug for more details)
[INFO] Rat check: Summary of files. Unapproved: 0 unknown: 0 generated: 0 approved: 36 licence.
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ wrangler-transform ---
[INFO] skip non existing resourceDirectory /Users/ashutoshsingh/Documents/wrangler/wrangler-transform/src/main/resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ wrangler-transform ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 5 source files with javac [debug target 1.8] to target/classes
[WARNING] bootstrap class path is not set in conjunction with -source 8
  not setting the bootstrap class path may lead to class files that cannot run on JDK 8
    --release 8 is recommended instead of -source 8 -target 1.8 because it sets the bootstrap class path automatically
[WARNING] source value 8 is obsolete and will be removed in a future release
[WARNING] target value 8 is obsolete and will be removed in a future release
[WARNING] To suppress warnings about obsolete options, use -Xlint:-options.
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-transform/src/main/java/io/cdap/wrangler/Wrangler.java: /Users/ashutoshsingh/Documents/wrangler/wrangler-transform/src/main/java/io/cdap/wrangler/Wrangler.java uses unchecked or unsafe operations.
[INFO] /Users/ashutoshsingh/Documents/wrangler/wrangler-transform/src/main/java/io/cdap/wrangler/Wrangler.java: Recompile with -Xlint:unchecked for details.
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Wrangler 4.12.0-SNAPSHOT:
[INFO] 
[INFO] Wrangler ........................................... SUCCESS [  0.273 s]
[INFO] Wrangler API ....................................... SUCCESS [  0.170 s]
[INFO] Wrangler REST Protocol Classes ..................... SUCCESS [  0.060 s]
[INFO] Wrangler Core ...................................... SUCCESS [  3.112 s]
[INFO] Wrangler Storage ................................... SUCCESS [  0.052 s]
[INFO] Wrangler Service ................................... SUCCESS [  0.827 s]
[INFO] Wrangler Testing Framework ......................... SUCCESS [  0.085 s]
[INFO] Wrangler Transform ................................. SUCCESS [  0.170 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.036 s
[INFO] Finished at: 2025-04-12T22:19:33+05:30
[INFO] ------------------------------------------------------------------------
```