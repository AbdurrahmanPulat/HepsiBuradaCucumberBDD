Feature: Login page feature

@Smoke
Scenario: Login page title
Given user is on Home Page
Given user is on login page
When user gets the title of the page
Then page title should be "Üye Giriş Sayfası & Üye Ol - Hepsiburada"

@Regression 
Scenario: yardıma mı ihtiyacınız var link
  Given user is on Home Page
  Given user is on login page
  Then yardıma mı ihtiyacınız var link should be displayed	
