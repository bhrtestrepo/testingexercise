@forms_app_portuguese_page_test

Feature: All of the fields in the portuguese form should be translated and user should enter required info

  @test_with_valid_data_in_the_portuguese_form
  Scenario: Portuguese form test
    Given user goes to the url
    And user clicks language icon and navigates to portuguese form page
    Then user verifies the "Este é um Liferay Forms" title in portuguese
    And user enters name "name" in portuguese page
    And user enters date of birth "date_of_birth" in portuguese page
    And user enters a text "text" in the box in portuguese page
    And user clicks submit button in portuguese page
    Then user verifies success message in portuguese page
    Then user closes the application



