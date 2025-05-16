# Intermediate Java Data Structures

This module contains robust, real-world implementations of common data structures using object-oriented principles in Java.  
Each structure is modular, test-driven, and version-controlled using Maven and JUnit 5.

---

## 📦 Implemented Structures

| Structure     | Implementation Type | Test Coverage | Notes                       |
|---------------|----------------------|----------------|------------------------------|
| Stack         | Array, Linked        | ✅ Yes         | Includes dynamic resizing   |
| Queue         | Array (circular)     | ✅ Yes         | Handles overflow & wraparound |

More structures (linked queues, lists, trees, etc.) are in development.

---

## 🧪 Running Tests

Each submodule includes a complete test suite.

```bash
cd intermediate/stack
mvn clean test

cd ../queue
mvn clean test