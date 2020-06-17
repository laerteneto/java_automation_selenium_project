# language : en
Feature: Mercedes Shop
  As a Mercedes potential customer
  I want to Choose a product
  So that I can buy the product I am interested in

  Scenario: Workflow test
    Given I access the Mercedes Benz online shop
    When I look for Mercedes "Men" Fashion & Beauty
    And I choose the "AMG belt" product
    And I add the product to the shopping basket
    Then The product "AMG belt" is saved on the shopping basket
    When I go to the shopping basket
    And I proceed to "address and delivery"
    And I set the Postal Code as "SP2 0FL" and fill out the form
    And I proceed to "Continue to payment type"
    And I select "Credit Card" as payment method
    And I select "MasterCard" as card brand
    And I proceed to "Continue to verification and order placement"
    Then On the verification order and placement, the Postal Code "SP2 0FL" is in the "Invoice address"
    And On the verification order and placement, The Postal Code "SP2 0FL" is in the "Delivery address"
    And On the verification order and placement, the "Shipping type" is "Standard Delivery"
    And On the verification order and placement, the "Payment type" is "MasterCard"
    And On the verification order and placement, the shopping basket contains the product "AMG belt"
