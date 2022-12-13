# HepsiBuradaCucumberBDD

<a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="180" alt="Selenium"/></a>
    

# About The Project
This project tests HepsiBurada.com using the selenium and cucumber frameworks.
## Junit Video


https://user-images.githubusercontent.com/57863133/207367777-014fa9d5-c040-406f-9293-b0385c6fb3ee.mp4


## Parallel Testing Video



https://user-images.githubusercontent.com/57863133/207367934-5d7f165f-e6d8-42c0-a369-bd08e38fd3f7.mp4


# How the Project Works
 To run the project, java must be installed on your computer. In addition, one of the ide like Eclipse or Intellij Idea must be installed.
 Then you can install and run the project on your computer by typing "git clone https://github.com/AbdurrahmanPulat/HepsiBuradaCucumberBDD.git" in the terminal.
  * [About The Project](#About-The-Project)
  * [Junit Video](#Junit_Video)
  * [Parallel Testing Video](#Parallel_Testing_Video)
  * [How the Project Works](#How-The-Project-Works)
  * [Project Details](#Project-Details)
  * [Project Success Spark Report](#Project-Success-Spark-Report)
  * [Succes Scenario Report](#Succes-Scenario-Report)
  * [Succes TestNG Report](#Succes-TestNG-Report)
  * [Login Feature](#Login_Feature)
  * [AddProduct Feature](#AddOroduct-Feature)
  * [Project Failed Spark Report](#Project-Failed-Spark-Report)
  * [Failed Scenario Report](#Failed-Scenario-Report)
  * [Failed TestNG Report](#Failed-TestNG-Report)
  * [Failed Cucumber Timeline Report](#Failed-Cucumber-Timeline-Report)
  * [ParallelRun Java](#ParallelRun-Java)

  

## Project Details
- There are three different scenarios in this project. In the first scenario, the user is directed to the login page and it is checked whether the page is correct.
- In the second scenario, the user is redirected to the login page again. But this time, the "yardıma mı ihtiyacınız var?" link in the page is confirmed.
- in the third scenario, the user searches for a product, selects it, adds it to the cart and checks if it has been added to the cart.





## Project Success Spark Report


![SparkReport1](https://user-images.githubusercontent.com/57863133/207372940-081fa447-e745-4b90-a322-4b1c71d4d896.png)

![SparkReport2](https://user-images.githubusercontent.com/57863133/207373074-25aa7903-3855-495e-b374-74a8c82f5807.png)


## Succes Scenario Report
[success scenario.pdf](https://github.com/AbdurrahmanPulat/HepsiBuradaCucumberBDD/files/10219378/success.scenario.pdf)


![success1](https://user-images.githubusercontent.com/57863133/207373661-b8490427-3fb0-4fb6-9ab3-b9389e41b866.png)

![success2](https://user-images.githubusercontent.com/57863133/207373679-d4636adf-90e7-4077-8d38-161f1dc7b5f5.png)
![success3](https://user-images.githubusercontent.com/57863133/207373688-f8c07f99-6b14-451b-b0dc-c91f93018c76.png)
![success4](https://user-images.githubusercontent.com/57863133/207373701-420f8972-d0d9-4d75-8393-143e90a9d32d.png)

## Succes TestNG Report

![SuccesTestNG report](https://user-images.githubusercontent.com/57863133/207373827-dea549d7-a42d-49c0-ba2a-1e48dc75a863.png)

## Login Feature

@Smoke
Scenario: Login page title

- Given user is on Home Page
- Given user is on login page
- When user gets the title of the page
- Then page title should be "Üye Giriş Sayfası & Üye Ol - Hepsiburada"

@Regression 
Scenario: yardıma mı ihtiyacınız var link
  - Given user is on Home Page
  - Given user is on login page
  - Then yardıma mı ihtiyacınız var link should be displayed	
  
 ## AddProduct Feature
 
Feature: Product feature


@Smoke

  Scenario: Add product to cart
    - Given user is on Home Page
    - Given user types "Laptop" in the search box
    - When user click submit button
    - And user selects product
    - And user switch tab
    - And user adds product to cart
    - And user checks the cart
    - Then user goes to cart
    - And user confirms cart


## Failed Spark Report
![Failed Scenario HepsiBurada1](https://user-images.githubusercontent.com/57863133/207376404-1c3946ec-c608-40d6-aee7-2829f956aec4.png)
![Failed Scenario HepsiBurada2](https://user-images.githubusercontent.com/57863133/207376416-bac74f24-62fb-4b50-937b-b482c84d78d9.png)


## Failed Scenario Report

![Fail Scenario output1](https://user-images.githubusercontent.com/57863133/207376831-a76399a4-8d01-447d-9c89-2bb326e83f50.png)

![Fail Scenario output2](https://user-images.githubusercontent.com/57863133/207376849-25993994-e8f7-46b3-aeff-739e0f398b1d.png)
![Fail Scenario output3](https://user-images.githubusercontent.com/57863133/207376873-ae00cbd0-121b-4a8d-b44b-78cff1db09f7.png)

![Fail Scenario output4](https://user-images.githubusercontent.com/57863133/207376958-59a2ea95-efab-4553-990e-9d6fb3dc1c1e.png)


![failed rerun xml](https://user-images.githubusercontent.com/57863133/207377076-0c88836a-57fe-4d28-a312-d925b4ef0b81.png)

## Failed TestNG Report
![TestNG report1](https://user-images.githubusercontent.com/57863133/207377415-9448f4c2-84a2-4404-a1d0-03d2f727a974.png)

![TestNG report2](https://user-images.githubusercontent.com/57863133/207377457-4639e4f4-ac71-494f-a398-1f330b830e34.png)

![TestNG report3](https://user-images.githubusercontent.com/57863133/207377482-be8febff-46e3-4579-a6f8-e5813015667f.png)

![TestNG report4](https://user-images.githubusercontent.com/57863133/207377505-65c3a8ce-1763-49c1-bc7b-5e133bf6c72e.png)

## Failed Cucumber Timeline Report

![CucumberTimeline HepsiBurada](https://user-images.githubusercontent.com/57863133/207377242-0170856b-96e7-4ade-8449-18cefb6e0a45.png)
## ParallelRun Java

```java
package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"	,
				"rerun:target/failed.rerun.txt"
		},
		
		features = {"src/test/resources/parallel"},
		glue = {"parallel"},
		monochrome = true
		)

public class parallelRun extends AbstractTestNGCucumberTests  {

	@Override
	@DataProvider(parallel = true)
	public Object [] [] scenarios(){
		return super.scenarios();
	}
}
```

