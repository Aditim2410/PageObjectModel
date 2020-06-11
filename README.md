# PageObjectModelFramework


- Basic framework skeleton is created using page object model and object repository,can be use for any application

- For Extracting Elements from HTML dom Xpath,CSS mostly used in object repository.(Can used other methods)





# Steps to clone & execute the tests

- git clone <url>
  
- cd PageObjectModelFramework

- mvn clean test

# For logs purpose:

- Apache Log4J is used


# CI/CD purpose:

# Jenkins Integration with Maven

-Install latest jenkins.war file

- How to trigger build locally:

- Create and add Admin users

- Add Maven plugins 

- Create Pipeline in Jenkins

- Add extra utitlies required for report generation if required

- Give POM.xml path from your local directory


# Git and Jenkins Integration

- Create Pipeline for your build

- Provide github URL of project instead of local POM.xml path

- Configure HTML Report pluggin if wish to see extended report

- In Post Build action Provide path of html report ,usually test-output/Extent.html in index page

-  Give Report Title ,Rest keep as it is.

- For nice overview , in configure build->Add script-> provide System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "")

- Run your build
