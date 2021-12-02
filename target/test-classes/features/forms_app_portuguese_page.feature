@forms_app_portuguese_page_test

  Feature: All of the fields in the portuguese form should be translated and user should enter required info

    @test_with_valid_data_in_the_portuguese_form
    Scenario Outline:
      Given user goes to the url
      And user clicks language icon and navigates to portuguese form page
      Then user verifies "Este é um Liferay Forms" title
      And user enters "<name>"
      And user enters "<date_of_birth>"
      And user enters a "<text>" in the box
      And user clicks submit button
      Then user verifies "success" message
      Then user closes the application


      Examples:
        | name | date_of_birth | text |
        | name | date_of_birth | text |
