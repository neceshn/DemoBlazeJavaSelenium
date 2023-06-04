Feature: Add Product and Purchase

  Background:
    Given User is on DemoBlaze home page
    When  User clicks Log in button
    Then  System Opens Log in modal
    When  User sends username to Log in modal "test123_45678"
    And   User sends password to Log in modal "test123_45678"
    And   User clicks LogIn button in modal
    Then  System displays username "test123_45678"

    Scenario Outline: Add Product and Purchase
      When  User scrolls to element "<productName>"
      And   User clicks of product "<productName>"
      Then  System opens product page "<productName>"
      When  User checks product information "<productDescription>"  "<productPrice>"
      And   User clicks Add To Cart button
      Then  System displays successful message "Product added."
      When  User closes the modal
      And   User clicks button of Cart
      And   User checks Product Title "<productName>"
      And   User clicks button of Place Order
      Then  System displays total price "<productPrice>"
      When  User sends to Place Order information "<receiverName>" "<receiverCountry>" "<receiverCity>" "<receiverCreditCard>" "<receiverMonth>" "<receiverYear>"
      And   User clicks button of Purchase
      Then  System shows purchase message "Thank you for your purchase!"

      Examples:
        | productName | productDescription | productPrice  | receiverName | receiverCountry | receiverCity | receiverCreditCard | receiverMonth | receiverYear |
        | HTC One M9  | The HTC One M9 is powered by 1.5GHz octa-core Qualcomm Snapdragon 810 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage that can be expanded up to 128GB via a microSD card.| 700 | TestName | Turkiye | Ankara | 4058138739073904569 | 12 | 2024 |
