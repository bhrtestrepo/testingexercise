@forms_app_portuguese_page_test

  Feature: All of the fields in the portuguese form should be translated and user should enter required info

  Background:
    Given user goes to the forms page
    Then user verifies "Este é um Liferay Forms" title

    @test_with_valid_data_and_check_language
    Scenario Outline:

      And user clicks language icon
      Then user verifies the "Text" is translated into portuguese
      And user enters "<name>"
      And user enters "<date_of_birth>"
      And user enters a "<text>" in the box
      And user clicks submit button
      Then user verifies success message


      Examples:
        | name | date_of_birth | text |
        | name | date_of_birth | text |
