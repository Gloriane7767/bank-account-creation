![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# OOP 1 – Exercises

## Exercise 1
- Create a `BankAccount` class.
- Fields: `accountHolder`, `balance`.
- Apply **encapsulation** by making fields private.
- Use:
    - Constructors to initialize values
    - Getters to read data
    - Setters to update data safely
    - Use deposit and withdraw methods to update the balance
- Create **multiple BankAccount objects** with different values.
- Show how each object maintains its own data.
- Create a UML class diagram.
---

## Exercise 2
- Create a `Customer` class.
- Add the required fields (e.g., customerId, name, email).
- Apply **encapsulation** by making all fields private.
- Use:
    - Constructors to initialize customer data
    - Getters to access field values
    - Setters to update field values safely
- Create **multiple Customer objects** with different data.
- Demonstrate that each object stores and manages its own information.
- Create a UML class diagram for the `Customer` class.
---

## Exercise 3
- Create a `Student` class.
- Add the required fields (e.g., studentId, name, age, major).
- Apply **encapsulation** by making all fields private.
- Use:
    - Constructors to initialize student data
    - Getters to access field values
    - Setters to update field values safely
- Create **multiple Student objects** with different data.
- Show that each object represents a unique student.
- Create a UML class diagram for the `Student` class.
---

## Exercise 4
- Create a `Product` class.
- Add the required fields (e.g., productId, name, price).
- Apply **encapsulation** by making all fields private.
- Use:
    - **Constructors** to initialize product data
    - Getters to read product information
    - Setters to update product details safely
- Create **multiple Product objects** with different values.
- Demonstrate that each object maintains its own state.
- Create a UML class diagram for the `Product` class.
---

## Exercise 5 (Optional)
- Create a class **Order**
- An order contains **multiple products** (use a collection)
- Apply **encapsulation**:
  - All fields must be **private**
- Use:
  - Constructors
  - Getters to access order data
- Add methods:
  - `addProduct(Product p)`
  - `removeProduct(Product p)`
  - `calculateTotal()` to compute the total price
- Create **multiple orders**, each with different product lists
- Each order should calculate its **own total price**

### Relationship
- One **Order** → many **Products**
---