# CSE1120 Discrete Structures - Computer Project

## 2022-2023 Spring Semester

### Overview

You can access the assessment and the solutions from the following links:
- [Assessment](CSE1120_ComputerProject.docx)
- [Solutions](Report.pdf)
### Problems and Solutions

1. **Mathematical Induction Proof**

   **Problem Statement:**
   Use mathematical induction to show that a given equation holds for all nonnegative integers \( n \). 

   **Solution:**
   The proof involves two main steps:
   - **Base Case:** Verify the equation for the initial value (usually \( n = 0 \) or \( n = 1 \)).
   - **Inductive Step:** Assume the equation is true for an arbitrary integer \( k \), and then show it holds for \( k + 1 \).

   The details of the proof can be found in the `Q1.java` file.

2. **Equation Validation Program**

   **Problem Statement:**
   Write a computer program to validate the given equation.

   **Solution:**
   A Java program is provided that takes an integer \( n \) as input and verifies whether the equation holds. The code can be found in `Q2.java`.

3. **Lucas Numbers Generator**

   **Problem Statement:**
   Write a recursive method to generate Lucas numbers.

   **Solution:**
   A recursive Java method is implemented to generate Lucas numbers. The Lucas numbers are similar to Fibonacci numbers but with different initial values. The implementation can be found in `Q3.java`.

4. **Least Airfare Route Finder**

   **Problem Statement:**
   Write a computer program to find a route with the least total airfare that visits each of the cities in a given graph, where the weight on an edge represents the least price available for a flight between the two cities.

   **Solution:**
   The solution involves implementing an algorithm to find the shortest path in a weighted graph. The code for finding the minimum airfare route can be found in `Q4.java`.

### Files

- `Q1.java` - Contains the detailed proof for the mathematical induction problem.
- `Q2.java` - Java program for validating the equation.
- `Q3.java` - Java program for generating Lucas numbers.
- `Q4.java` - Java program for finding the least total airfare route.
