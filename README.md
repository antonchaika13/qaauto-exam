# What's inside this project
This is a project with QA automation simple test simple test 
that will open [google.com](https://www.google.com/) in web browser, search for "Selenium" 
and verify results on first 2 pages.
Inside the project we have the next structure divided in 2 packages (for all pages
and for all tests)
Created classes in 'page' package:
1. GoogleBasePage - the base class which will be a parent class for all pages
2. GoogleStartPage - class with page that opened after user enters [google.com](https://www.google.com/) in URL
3. GoogleFirstSearchPage - class with search results page: 1
4. GoogleSecondSearchPage - class with search results page: 2
Created classes in 'test' package:
1. GoogleBaseTest - the base class which will be a parent class for GoogleSearchTest class
and for the further test classes also. 
2. GoogleSearchTest - class, that consists a code with autotest for search.
# What needs to be installed in order to run my tests
1. Intellij Idea IDE - [link](https://www.jetbrains.com/idea/download/#section=windows)
2. JDK file - [link](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
3. Latest version of FireFox browser
4. Also Maven framework support should be installed, added to my project and
last changes should be imported.
# How to run my tests via command line

