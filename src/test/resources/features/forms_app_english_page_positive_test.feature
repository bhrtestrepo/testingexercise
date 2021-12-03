@forms_app_positive_test_english_form

Feature: User should enter required information on the forms application

  Background:
    Given user goes to the url
    Then user verifies "This is a Liferay Forms" title

  @valid_info_test_english_form
  Scenario Outline: User enters required information with valid data in the english form
    And user enters name "<name>"
    And user enters date of birth "<date_of_birth>"
    And user enters a text "<text>" in the box
    And user clicks submit button
    Then user verifies success message
    Then user closes the application

    Examples:
      | name      | date_of_birth | text            |
      | Mary Jane | 2021 12 14    | This is a test. |

