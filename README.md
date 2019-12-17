[![License](https://img.shields.io/badge/License-Apache%202.0-yellow.svg)](https://opensource.org/licenses/Apache-2.0)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.github.lahresdev%3Akotlin-gradle-single-module&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.github.lahresdev%3Akotlin-gradle-single-module)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.github.lahresdev%3Akotlin-gradle-single-module&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=com.github.lahresdev%3Akotlin-gradle-single-module)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=com.github.lahresdev%3Akotlin-gradle-single-module&metric=security_rating)](https://sonarcloud.io/dashboard?id=com.github.lahresdev%3Akotlin-gradle-single-module)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.github.lahresdev%3Akotlin-gradle-single-module&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=com.github.lahresdev%3Akotlin-gradle-single-module)
<br>[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=com.github.lahresdev%3Akotlin-gradle-single-module&metric=ncloc)](https://sonarcloud.io/dashboard?id=com.github.lahresdev%3Akotlin-gradle-single-module)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.github.lahresdev%3Akotlin-gradle-single-module&metric=coverage)](https://sonarcloud.io/dashboard?id=com.github.lahresdev%3Akotlin-gradle-single-module)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=com.github.lahresdev%3Akotlin-gradle-single-module&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=com.github.lahresdev%3Akotlin-gradle-single-module)

## Introduction
This repository serves as template for kotlin projects which use gradle as build tool. 

Features are:
 * Sample kotlin class file with simple output.
 * Single module gradle project
 * Static code analysis with Sonar -> [Project Page](https://sonarcloud.io/dashboard?id=com.github.lahresdev%3Akotlin-gradle-single-module)
 * Self-contained jar file creation
 * Unit tests. Results, created by JaCoCo, are found on sonar project page.
 * Sample license and readme file
 * Git as version control system with .gitignore file to exclude automatically created files from repository.

---

## Building the project
Just run the following gradle task
<pre>
build
</pre>
The output can be found inside the build folder.

---

## Generating Sonar report
To generate a sonar report, the following gradle task has to be run
<pre>
sonarqube
</pre>
You need to set <code>systemProp.sonar.login</code> inside your local gradle.properties file.
The sonar login token can be generated on the sonar account page (needs admin rights).

---

## Running the self-contained jar file
To run the self-contained jar file
<pre>
java -jar build/libs/kotlin-gradle-single-module-1.0-SNAPSHOT.jar
</pre>
Output should be:
<pre>
Hello Jack. You're 22 years old, and your gender is male.
</pre>
