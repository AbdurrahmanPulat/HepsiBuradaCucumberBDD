Feature: Login page feature

Scenario: Login page title
Given user is on Home Page
Given user is on login page
When user gets the title of the page
Then page title should be "Üye Giriş Sayfası & Üye Ol - Hepsiburada"

Scenario: Forgot Password link
  Given user is on Home Page
  Given user is on login page
  Then forgot your password link should be displayed
