@forms_app_negative_test_english_form

  Feature: User should enter invalid information on the forms application and get error message

    Background:
      Given user goes to the url
      Then user verifies "This is a Liferay Forms" title

    @blank_info_test
    Scenario Outline: User enters only name and leaves blank date and text box
      And user enters "<name2>"
      And user enters "<blank_date_of_birth>"
      And user enters a "<blank_text>" in the box
      And user clicks submit button
      Then user verifies This field is required message under date box
      Then user verifies This field is required message under text box
      Then user closes the application

      Examples:
        | name2 | blank_date_of_birth | blank_text |
        | name2 | blank_date_of_birth | blank_text |

    @invalid_info_test
    Scenario Outline:
      And user enters "<name3>"
      And user enters "<future_date_of_birth>"
      And user enters a "<text_with_special_char_and_number>" in the box
      And user clicks submit button
      Then user verifies "success" message
      Then user closes the application

      Examples:
        | name3 | future_date_of_birth | text_with_special_char_and_number |
        | name3 | future_date_of_birth | text_with_special_char_and_number|