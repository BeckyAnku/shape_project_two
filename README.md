# Shape Project Two

This is another beginner version of the same Java shape task.

The project has:

- `Shape`, an abstract parent class
- `Circle`, `Rectangle`, and `Triangle`, which inherit from `Shape`
- `InvalidShapeException`, used for invalid numbers
- `Main`, which runs the program

## Hierarchy

```text
Shape
  |
  |-- Circle
  |-- Rectangle
  |-- Triangle

Circle, Rectangle, and Triangle depend on InvalidShapeException
because they throw it when bad dimensions are used.
```

Abstract methods in `Shape`:

```text
getArea()
getPerimeter()
resize(double factor)
```

## Checked Or Unchecked

This version also makes `InvalidShapeException` unchecked by extending `RuntimeException`.

I chose this because it keeps the code shorter for a first-year Java student.

## Dynamic Binding

In `printAreas`, the parameter is:

```java
Shape[] list
```

But the objects inside the array can be circles, rectangles, or triangles.

When Java sees:

```java
list[i].getArea()
```

it runs the correct version of `getArea()` depending on the real object.

## Why Abstract

`Shape` is abstract because it is not complete by itself.

It tells every child class: "You must have area, perimeter, and resize methods."

Trying `new Shape()` causes a compile error.
