# Linked List Implementations in Java

This repository contains my self–implemented **Linked List (LL)** data structure in Java, along with several important linked-list operations and algorithmic problems such as cycle detection, merging sorted lists, palindrome check, and more.

The goal of this project is to understand and practice core data structure concepts using clean, testable Java code.

---

## 📌 Features Implemented

### **1. Basic Linked List Operations**
- `insertAtFirst(int data)`
- `insertAtLast(int data)`
- `printList()`
- `reverseList()`
- `MiddleElement()` → returns the middle node’s value  
- `deletefromNthNode(int n)` → deletes the N-th node from the end

---

## 📌 Advanced Linked List Algorithms

### **2. Cycle Operations**
- `insertCycle(int data)` – manually creates a cycle for testing
- `cycleOrNot()` – detects if a cycle exists (Floyd’s algorithm)
- `cycleStart()` – returns the starting node of the cycle


### **3. Merge Two Sorted Lists**

### **4. Delete Nth Node from the End**

### **5. Finding the Middle Element**

## Node Structure 
public class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}

## LL Class Summary 
public class LL {
    Node head;

    // Insertions
    insertAtFirst()
    insertAtLast()

    // Cycle operations
    insertCycle()
    cycleOrNot()
    cycleStart()

    // Utility
    printList()
    reverseList()
    MiddleElement()
    deletefromNthNode()

    // Algorithms
    palindrome()
    mergeTwoSortedLists()
}

## 📌 This Repository Covers

This project includes all essential **Linked List** topics commonly asked in coding interviews:

- **Fast & Slow Pointer Technique**
- **Cycle Detection (Floyd’s Algorithm)**
- **Cycle Start Node Identification**
- **Linked List Reversal**
- **Merging Two Sorted Linked Lists**
- **Palindrome Check Using Half-Reversal**
- **Delete N-th Node From the End**
- **Find Middle Element of the List**

These implementations strengthen understanding of pointer manipulation, traversal patterns, and common interview problem-solving techniques.

