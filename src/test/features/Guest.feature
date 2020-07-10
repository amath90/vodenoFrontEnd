Feature: Guest shopping

  Scenario: Checkout as guest

    Given Guest customer is on main page
    When He adds to cart build your own computer product
    Then He sees information that product has been successfully added to his cart
    When He goes to cart using main page top menu
    And Confirms that chosen product is in cart table
    Then He chooses to start checkout procedure
    And He chooses to checkout as guest
    When He fills in all mandatory billing address information
    Then He confirms default shipping method
    And He confirms default payment method
    And He confirms payment information
    And He confirms order
    When He goes to order details
    Then He verifies billing address information



