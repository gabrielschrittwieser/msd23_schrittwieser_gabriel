# Exercise 6

### What's necessary to generate Maven Site Documentation?

Maven Site requires a specific folder structure in order to work:

\+\- src/
&emsp;\+\- site/
&emsp;&emsp;\+\- apt/
&emsp;&emsp;|&emsp;\+\- index.apt
&emsp;&emsp;|
&emsp;&emsp;\+\- fml/
&emsp;&emsp;|&emsp;\+\- general.fml
&emsp;&emsp;|&emsp;\+\- faq.fml
&emsp;&emsp;|
&emsp;&emsp;\+\- markdown/
&emsp;&emsp;|&emsp;\+\- markup.md
&emsp;&emsp;|
&emsp;&emsp;\+\- xdoc/
&emsp;&emsp;|&emsp;\+\- other.xml
&emsp;&emsp;|
&emsp;&emsp;\+\- xhtml/
&emsp;&emsp;|&emsp;\+\- xhtml-too.xhtml
&emsp;&emsp;|
&emsp;&emsp;\+\- site.xnl

It uses data from provided information such as JavaDoc comments, maven site documents, JUnit Tests, pom.xml information, etc.

### What different Aspects, Configurations, Information etc. is configured in site.xml & pom.xml?

The pom.xml file includes the maven site plugin and jacoco to generate the documentation as well as information about test coverage. Developer Information and a link to the github repo is also added to the beginning of the file. The site.xml file is used to structure the Layout of the Maven Site Documentation.