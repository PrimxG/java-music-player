# Java Music Player (DSA Project)

## Overview
This is a console-based music player built in **Java** using a **Doubly Linked List** to manage a playlist.

Each song is stored as a node in the linked list, allowing efficient navigation **forward and backward** between songs.

This project demonstrates how **Data Structures and Algorithms (DSA)** concepts can be applied to build a real-world style application such as a music playlist system.

---

## Features

- Add songs to the playlist
- Play the current song
- Move to the next song
- Move to the previous song
- Remove the current song
- Shuffle the playlist
- Search songs by name
- Display the entire playlist
- Highlight the currently playing song
- Playback modes:
  - **Loop Song** – repeat the current song
  - **Loop Playlist** – restart playlist after the last song
  - **Normal Mode** – stop at the end of the playlist
- Interactive **command-line interface (CLI)**

---

## Data Structures Used

### Doubly Linked List
The playlist is implemented using a **doubly linked list**.

Each node contains:
- Song information
- Reference to the **next song**
- Reference to the **previous song**

This allows efficient navigation in both directions.

### Traversal
Traversal is used to:
- Display the playlist
- Navigate between songs

### Linear Search
Used for searching songs by name.

### Random Index Selection
Used in the **shuffle feature** to jump to a random song.

---

## Playback Modes

The player supports three playback modes:

| Mode | Behavior |
|-----|------|
| Loop Song | Repeats the currently playing song |
| Loop Playlist | After the last song, playback returns to the first song |
| Normal | Playback stops at the last song |

---

## Menu

Add

Play

Remove

Next

Previous

Shuffle

Search

Show Playlist

Modes

Exit

yaml
Copy code

---

## Example Playlist Output

Believer - Imagine Dragons
Sunflower - Post Malone <-- Playing
Monster - Skillet

yaml
Copy code

---

## How to Run

### Compile the program

javac *.java

shell
Copy code

### Run the program

java Musicplayer

yaml
Copy code

---

## Project Structure

Musicplayer.java
Song.java

markdown
Copy code

### Musicplayer
Handles:
- Playlist management
- Navigation between songs
- Playback modes
- CLI menu system

### Song
Stores song information such as:
- Song name
- Artist
- Duration

---

## Learning Purpose

This project was built to practice and demonstrate:

- **Doubly Linked Lists**
- **Pointer manipulation**
- **Object-Oriented Programming (OOP)**
- **Command Line Interface (CLI) application design**
- Applying **Data Structures in practical programs**

---

## Possible Future Improvements

- Save and load playlists from files
- Real audio playback support
- Playlist sorting
- Queue system
- Graphical User Interface (GUI)