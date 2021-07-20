# PET CARE

## SOLID Principles

- Intro:
    - Uncle Bob - Robert Martin
    - Micheal Feathers is credited with coming up with the SOLID acronym
    - OOP is a powerful concept, however it doesn't always lead to quality software
    - The 5 SOLID principles focus on dependency management.
    - Poor dependency management leads to code that is brittle, fragile and hard to change.
- Single Responsibility Principle[SRP]: Just because you can doesn't mean you should
    - Every class should have a single responsibility.
    - There should never be more than one reason for a class to change.
    - Classes should be small, no more than a screen full of code.
    - Avoid 'god' classes.
    - Split big classes into smaller classes.
- Open Closed Principle: "Open Chest Surgery Is Not Needed When Putting On A Coat"
    - Your classes should be open for extension but closed for modification.
    - You should be able to extend a classes behavior, without modifying it.
    - use private variables with getters and setters.
    - Use abstract base classes.
- Liskov Substitution Principle: 
    - Quote: "If It Looks Like A Duck - You Probably Have The Wrong Abstraction"
    - violation will fail the "is-a"
- Interface Segregation Principle:
    - Quote: "A client should never be forced to implement an interface that it doesn’t use,
     or clients shouldn’t be forced to depend on methods they do not use."
    - Make fine-grained interfaces that are client specific.
    - Many client specific interfaces are better than one "general purpose" interface.
    - Keep your components focused and minimize dependencies between them.
    - Relates to SRP, avoid 'god' interfaces.
- Dependency Inversion Principle:
    - Quote: ""

