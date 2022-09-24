Feature: Je remplis le formulaire
  En tant que utilisateur je souhaite de remplir le formulaire dans le site Mercury

  @remplissageformulaire
  Scenario: Je remplis le formulaire
    Given J accéde à lapplication Mercury
    When Je clique sur le bouton register
    And Je saisie First Name "Amina"
    And Je saisie Last Name "Fatnassi"
    And Je saisie Phone "52506476"
    And Je saisie Email "Amina.fatnassi@esprit.tn"
    And Je saisie Adresse "Res El AMen Bloc D Appart D 3-2"
    And Je saisie la ville "Petite Ariana"
    And Je saisie la région "Raoued"
    And Je saisie le code postal "2083"
    And Je choisis le pays "TUNISIA"
    And Je saisie un User Name "Amina 123"
    And Je saisie un password "aminaFat"
    And Je confirme le password "aminaFat"
    And Je clique sur le bouton envoyer
    Then Je me redirige vers la register
