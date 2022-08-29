# 55PPR

# Java

## Design patters implemented using Go

- Singleton
- Observer
- Command
- Facade
- Template Method
- Factory Method
- Adapter
- Builder
- Visitor
- State
- Strategy
- Composite

# Go

## Design patters implemented using Go

## Builder

The builder pattern is used in go when a construction of an entity get more complicated. When we have a factory method with more than 10 arguments it's not much productive so a good solution is to use the builder pattern instead.
He allows us to build an object with several builders so when an object is very complicated with several atributes we can divide it into different builders.

## Factories

The factory pattern allow us to control how an object is constructed.
So we can use this pattern when we have a struct with too many fields, and we need to initialize all then correctly. When we use this pattern unlike the builder pattern here we are building the whole object not piecewise like the builder pattern.

So we can define the Factory pattern implementation as a component responsible solely for the wholesale (not piecewise) creation of objects.

## Prototype

The prototype patter is mostly used when it's easier to copy an existent object to fully initialize a new one. So for example a complicated object like a car aren't designed from scratch, they reiterate existent objects.

When we make a copy of an existent partially of fully constructed object we are applying the prototype patter.

Summarizing the prototype pattern implementation, we first implement a prototype, that is a partially constructed object and store it, after 
that e do a deep copy of this prototype to generate our new object and after that we can customize the resulting instance

## Singleton

So the main motivation for the singleton pattern is that in some components/programs we only need to have just one instance of a specific object,
in these cases we apply the singleton pattern. (Example: Database Repository, object factory)

So picking for example a database instance we usually have an expensive construction call, so we just want to call it once and then reuse it further.

##  Adapter

The adapter pattern consists in the implementation of a construct witch adapts an existent interface X to conform to the required interface Y.

## Bridge Pattern

The bridge pattern was designed with the idea of being able to connect multi components together through abstraction.

An example of an application for this patter is when we want to build for example one ThreadSchedule, and we want to make it work both in linus and Windows

So after all we can summarize the bridge pattern objective as a mechanism that is responsible to decouple interfaces from an implementation

<p align="center" style="padding-top: 10px; text-align: center">
<img src="https://refactoring.guru/images/patterns/diagrams/bridge/structure-en.png?id=827afa4b40008dc29d26fe0f4d41b9cc">
</p>
<p align="center" style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;" >Basic structure example of this pattern</p>

- Key observations 
  - The bridge pattern is a structural design pattern.
  - Decouple abstraction from implementation.
  - Both can exist as hierarchies 
  - We can consider this pattern as a strong type of encapsulation 

## Composite Pattern

The composite pattern is a structural design pattern that allows us to compose objects, turning objects into a tree of structures allowing us to represent part-whole hierarchies.
Resuming it the composite patter is a mechanism for treating individual objects and compositions of objects in a uniform way.

- Key observations
  - Some composed and singular objects need similar or identical implementation.
  - This design patter lets us to threat both types of objects uniformly. 
  - Objects can use other objects via composition

