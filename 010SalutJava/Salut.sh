#! /bin/bash
echo ---------------------------------------------------------
echo $ export JAVA_HOME="$(jrunscript -e 'java.lang.System.out.println(java.lang.System.getProperty("java.home"));')"
echo ---------------------------------------------------------
ls


javac Salut.java

echo Running with classpath $LOCALCLASSPATH
echo Starting...
echo

java Salut
