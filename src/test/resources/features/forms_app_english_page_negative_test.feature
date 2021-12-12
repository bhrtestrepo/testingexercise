@forms_app_negative_test_english_form

Feature: User should enter invalid information on the forms application and get error message

  Background:
    Given user goes to the url
    Then user verifies "This is a Liferay Forms" title

  @invalid_info_test
  Scenario Outline: Negative test case
    And user enters name3 "<name3>"
    And user enters a future date of birth "<future_date_of_birth>"
    And user enters a text with "<text_with_special_char_and_number>" in the box
    And user clicks submit button
    Then user verifies success message
    Then user closes the application

    Examples:
      | name3   | future_date_of_birth | text_with_special_char_and_number |
      | F-0sl./ | Fri Dec 31 2021      | This-is-1-test!                   |