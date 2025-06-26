# Design-a-Linked-List
Leetcode Problem #707. Design a Linked List 

# MyLinkedList

A custom implementation of a singly or doubly linked list in Java.

## Description

This class implements a basic linked list with common operations such as getting a value at an index, adding elements at the head or tail, inserting at a specific index, and deleting nodes.

The list is **0-indexed**, meaning the first element is at index `0`.

You can choose between a **singly linked list** (with `val` and `next` attributes) or a **doubly linked list** (with an additional `prev` attribute).

---

## Class: `MyLinkedList`

### Constructor

- `MyLinkedList()`
  - Initializes the `MyLinkedList` object.

---

## Methods

### `get(index: int) -> int`

- Returns the value of the `index`-th node in the linked list.
- Returns `-1` if the index is invalid.

### `addAtHead(val: int) -> None`

- Adds a node of value `val` before the first element of the linked list.
- The new node becomes the first node of the list.

### `addAtTail(val: int) -> None`

- Appends a node of value `val` as the last element of the linked list.

### `addAtIndex(index: int, val: int) -> None`

- Adds a node of value `val` before the `index`-th node in the list.
- If `index == length` of the list, the node is appended to the end.
- If `index > length`, the node is **not** inserted.

### `deleteAtIndex(index: int) -> None`

- Deletes the `index`-th node in the linked list, if the index is valid.

---
