# Java Music Player

## Overview
This is a console-based music player built in **Java** using a **Doubly Linked List** to manage a playlist.

Each song is stored as a node, enabling efficient navigation both **forward and backward**.

The project demonstrates how **Data Structures and Algorithms (DSA)** concepts can be applied to build a real-world application such as a music playlist system, along with a structured **modular CLI design**.

The project focuses on clean structure, modular design, and practical implementation of core data structures.

---

## Features

- Add songs to the playlist
- Remove the current song
- Play the current song
- Navigate to next and previous songs
- Shuffle playback
- Search songs by name
- Display the full playlist
- Highlight the currently playing song
- Playback modes:
  - **Normal Mode**
  - **Loop Song**
  - **Loop Playlist**
- Structured **modular menu system**
- Interactive **command-line interface (CLI)**

---

## Data Structures Used

### Doubly Linked List
The playlist is implemented using a **doubly linked list**, where each node contains:
- Song data
- Reference to the next node
- Reference to the previous node

This allows efficient bidirectional traversal.

### Traversal
Used to:
- Display the playlist
- Navigate between songs

### Linear Search
Used to search songs by name.

### Random Index Selection
Used in the shuffle feature to jump to a random song.

---

## Playback Modes

| Mode | Behavior |
|------|---------|
| Normal | Stops at the last song |
| Loop Song | Repeats the current song |
| Loop Playlist | Loops back to the first song after the last |

---

## Menu Structure

### Main Menu
- Playlist
- Player Controls
- Modes
- Exit

### Playlist Menu
- Add Song
- Delete Song
- Display Playlist
- Search Song

### Player Controls
- Play
- Next
- Previous

### Modes
- Normal
- Loop Song
- Loop Playlist
- Shuffle

---

## Example Output


Believer - Imagine Dragons
Sunflower - Post Malone <-- Playing
Monster - Skillet


---

## How to Run

### Compile

javac *.java


### Run

java Musicplayer


---

## Project Structure


Musicplayer.java
Song.java


### Musicplayer
Handles:
- Playlist management
- Navigation
- Playback modes
- Modular CLI menus

### Song
Stores:
- Song name
- Artist
- Duration

---

## Learning Objectives

This project demonstrates:

- **Doubly Linked Lists**
- **Pointer manipulation**
- **Object-Oriented Programming (OOP)**
- **CLI-based application design**
- Applying **DSA in real-world scenarios**

---

## Future Improvements

- Play song directly by name
- Display current song and playlist stats
- Save/load playlists from files
- Real audio playback (MP3 support)
- GUI-based music player