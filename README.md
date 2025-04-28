# Shape, Circle, Rectangle, and Square Classes

# UML
![UML](https://www3.ntu.edu.sg/home/ehchua/programming/java/images/ClassShapeCircleRectangleSquareJava.png)

## Shape Class

Write a superclass called `Shape` (as shown in the class diagram), which contains:

- **Instance Variables**:
  - `color` (String)
  - `filled` (boolean)

- **Constructors**:
  1. A no-argument constructor that initializes:
     - `color` to `"green"`
     - `filled` to `true`
  2. A constructor that initializes `color` and `filled` to the given values.

- **Methods**:
  - Getters and setters for all instance variables.
    - By convention, the getter for a boolean variable `xxx` is called `isXXX()` (instead of `getXxx()` for other types).
  - `toString()` method that returns:
    ```
    "A Shape with color of xxx and filled/Not filled"
    ```

- **Test Program**:
  Write a test program to test all the methods defined in `Shape`.

---

## Circle Class

Write a subclass of `Shape` called `Circle`, which contains:

- **Instance Variable**:
  - `radius` (double)

- **Constructors**:
  1. A no-argument constructor that initializes `radius` to `1.0`.
  2. Other constructors as shown in the class diagram.

- **Methods**:
  - Getters and setters for the `radius` instance variable.
  - `getArea()` and `getPerimeter()` methods.
  - Override the `toString()` method inherited from `Shape` to return:
    ```
    "A Circle with radius=xxx, which is a subclass of yyy"
    ```
    where `yyy` is the output of the `toString()` method from the superclass.

---

## Rectangle Class

Write a subclass of `Shape` called `Rectangle`, which contains:

- **Instance Variables**:
  - `width` (double)
  - `length` (double)

- **Constructors**:
  1. A no-argument constructor that initializes:
     - `width` to `1.0`
     - `length` to `1.0`
  2. Other constructors as shown in the class diagram.

- **Methods**:
  - Getters and setters for all instance variables.
  - `getArea()` and `getPerimeter()` methods.
  - Override the `toString()` method inherited from `Shape` to return:
    ```
    "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy"
    ```
    where `yyy` is the output of the `toString()` method from the superclass.

---

## Square Class

Write a subclass of `Rectangle` called `Square`. Convince yourself that `Square` can be modeled as a subclass of `Rectangle`. `Square` has no instance variables but inherits the instance variables `width` and `length` from its superclass `Rectangle`.

- **Constructors**:
  - Provide the appropriate constructors as shown in the class diagram.
    - Example:
      ```java
      public Square(double side) {
         super(side, side);  // Call superclass Rectangle(double, double)
      }
      ```

- **Methods**:
  - Override the `toString()` method to return:
    ```
    "A Square with side=xxx, which is a subclass of yyy"
    ```
    where `yyy` is the output of the `toString()` method from the superclass.
  - Test whether you need to override `getArea()` and `getPerimeter()`.
  - Override the `setLength()` and `setWidth()` methods to change both the `width` and `length`, so as to maintain the square geometry.

## Exercise Source
- Link: https://www3.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html#zz-4.5
