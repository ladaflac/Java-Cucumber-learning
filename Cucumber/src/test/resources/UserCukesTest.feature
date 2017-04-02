Feature: Kreiranje novog usera
  Scenario: Unesi novog usera
    Given Unesem sve potrebne podatke o budućem useru
    When Pokrenem akciju spremanja novog usera
    Then Novi user ima defaultni username
    And Novi user ima defaultni password
