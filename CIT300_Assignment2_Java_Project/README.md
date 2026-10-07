# CIT300 Data Structure & Graph Performance Analyzer

## 1. Project Description

The **CIT300 Data Structure & Graph Performance Analyzer** is a Java-based console application developed to demonstrate the practical implementation of data structures, searching algorithms, graph traversal algorithms, and algorithm performance analysis.

The system provides a menu-driven interface for performing operations on Arrays, Stacks, Queues, Linked Lists, Searching algorithms, and Graphs. It also compares algorithm performance using execution time and time complexity.

---

## 2. Main Features

The system includes the following features:

1. **Array Operations**
   - Insert
   - Delete
   - Search
   - Display

2. **Stack Operations**
   - Push
   - Pop
   - Peek
   - Display
   - Empty-stack handling

3. **Queue Operations**
   - Enqueue
   - Dequeue
   - Peek/Front
   - Display
   - Empty-queue handling

4. **Linked List Operations**
   - Insert
   - Delete
   - Search
   - Display

5. **Searching Operations**
   - Linear Search
   - Binary Search
   - Search result comparison
   - Execution time comparison

6. **Graph Operations**
   - Add Vertex
   - Add Edge
   - Display Graph
   - Breadth-First Search (BFS)
   - Depth-First Search (DFS)

7. **Performance Comparison**
   - Search result
   - Execution time
   - Algorithm complexity
   - Linear Search vs Binary Search comparison

8. **Display All Results**
   - Displays the current data from the implemented data structures and graph.

---

## 3. Project Structure

```text
CIT300_Assignment2/
│
└── dataStructureAnalyzer/
    ├── Main.java
    ├── ArrayOperations.java
    ├── StackOperations.java
    ├── QueueOperations.java
    ├── LinkedListOperations.java
    ├── SearchingOperations.java
    ├── GraphOperations.java
    └── PerformanceAnalyzer.java
```

---

## 4. Technologies Used

- **Programming Language:** Java
- **Development Environment:** Visual Studio Code
- **Version Control:** Git
- **Repository:** GitHub
- **Application Type:** Console-Based Application

---

## 5. Object-Oriented Programming

The project follows Object-Oriented Programming principles through a class-based design.

### Encapsulation
Each operation is organized inside separate classes with methods responsible for specific tasks.

### Abstraction
Complex data structure operations are handled through methods, allowing the main program to interact with them without handling the internal implementation directly.

### Modularity
Each data structure and algorithm is implemented in a separate Java class.

### Separation of Responsibilities
Each class has a specific responsibility, such as array operations, stack operations, queue operations, linked list operations, searching, graph operations, or performance analysis.

---

## 6. Algorithm Complexity

| Data Structure / Algorithm | Operation | Complexity |
|---|---|---|
| Array | Search | O(n) |
| Stack | Push | O(1) |
| Stack | Pop | O(1) |
| Stack | Peek | O(1) |
| Queue | Enqueue | O(1) |
| Queue | Dequeue | O(1) |
| Queue | Peek | O(1) |
| Linked List | Search | O(n) |
| Linked List | Delete | O(n) |
| Linear Search | Search | O(n) |
| Binary Search | Search | O(log n) |
| BFS | Traversal | O(V + E) |
| DFS | Traversal | O(V + E) |

**Note:** Binary Search requires the data to be sorted.

---

## 7. Group Members

| No. | Name | Student ID |
|---|---|---|
| 1 | MA AATHIF AHAMED | 23DA2-0872 |
| 2 | MF FASEERA | 23DA2-0662 |
| 3 | RFF NUSHA | 23DA2-0946 |
| 4 | AF NASRIYA | 23DA2-1017 |

---

## 8. Responsibilities and Individual Contributions

### MA AATHIF AHAMED – 23DA2-0872
**Responsibility:** Array and Searching

**Contribution:**
- Implemented Array operations.
- Implemented Insert, Delete, Search and Display.
- Implemented Linear Search.
- Implemented Binary Search.
- Added input validation and invalid-operation handling.
- Participated in testing and system integration.

### MF FASEERA – 23DA2-0662
**Responsibility:** Stack and Queue

**Contribution:**
- Implemented Stack operations.
- Implemented Push, Pop, Peek and Display.
- Implemented Queue operations.
- Implemented Enqueue, Dequeue, Peek/Front and Display.
- Added empty Stack and Queue handling.
- Participated in input validation, testing and integration.

### RFF NUSHA – 23DA2-0946
**Responsibility:** Linked List

**Contribution:**
- Implemented Linked List operations.
- Implemented Insert, Delete, Search and Display.
- Added handling for empty lists and unsuccessful searches.
- Added input validation.
- Participated in testing and system integration.

### AF NASRIYA – 23DA2-1017
**Responsibility:** Graph, Performance Comparison and Integration

**Contribution:**
- Implemented Graph operations.
- Implemented Add Vertex and Add Edge.
- Implemented Graph Display.
- Implemented BFS traversal.
- Implemented DFS traversal.
- Implemented performance comparison.
- Integrated the main menu and system components.
- Participated in overall system testing and debugging.

### All Group Members

All group members contributed to:

- System integration
- Testing
- Debugging
- Input validation
- Error handling
- Documentation
- GitHub collaboration

---

## 9. How to Compile and Run

Open the terminal inside the project root folder.

Compile all Java files:

```text
javac dataStructureAnalyzer\*.java
```

Run the application:

```text
java dataStructureAnalyzer.Main
```

The main menu will then be displayed.

---

## 10. Main Menu

The application provides the following main menu:

```text
==============================================
     DATA STRUCTURE & GRAPH ANALYZER
==============================================
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
==============================================
```

---

## 11. Testing

The system was tested using different valid and invalid inputs.

### Array Testing
- Inserted elements.
- Deleted elements.
- Searched for elements.
- Displayed array elements.

### Stack Testing
- Pushed elements.
- Popped elements.
- Used Peek.
- Displayed stack.
- Tested empty-stack handling.

### Queue Testing
- Enqueued elements.
- Dequeued elements.
- Used Peek/Front.
- Displayed queue.
- Tested empty-queue handling.

### Linked List Testing
- Inserted elements.
- Deleted elements.
- Searched for elements.
- Displayed linked list.

### Searching Testing
Both Linear Search and Binary Search were tested with existing and non-existing values.

Example:

```text
Linear Search Result: Found
Binary Search Result: Found
```

Not-found values were also tested successfully.

### Graph Testing

The graph was tested using vertices:

```text
1
2
3
4
```

Edges were added between the vertices.

Example graph:

```text
1 -> 2
2 -> 3 4
3 ->
4 ->
```

BFS was tested:

```text
BFS Traversal: 1 2 3 4
```

DFS was also tested:

```text
DFS Traversal: 1 2 3 4
```

### Performance Testing

Linear Search and Binary Search were compared using execution time and complexity.

Example:

```text
Linear Search Complexity: O(n)
Binary Search Complexity: O(log n)
```

---

## 12. GitHub Collaboration

Git and GitHub were used for version control and project collaboration.

The project development process included:

- Meaningful commits
- GitHub repository management
- Code integration
- Testing and debugging
- Documentation updates
- Individual contribution tracking

Each group member contributed to the development and integration of the project.

---

## 13. Demonstration Video

A merged demonstration video will be submitted according to the assignment requirements.

Each group member will:

1. Introduce themselves.
2. Mention their name and student ID.
3. Explain their assigned responsibility.
4. Show the implemented code.
5. Demonstrate the relevant functionality.
6. Explain the data structure or algorithm used.
7. Explain the relevant time complexity.
8. Demonstrate the integrated system.

The final demonstration video will be kept within the required **15-minute limit**.

---

## 14. Conclusion

The **CIT300 Data Structure & Graph Performance Analyzer** demonstrates the practical implementation of fundamental data structures, searching algorithms, graph traversal algorithms, and algorithm complexity analysis using Java.

The project provides hands-on understanding of how different data structures and algorithms work and how their performance differs based on their time complexity.