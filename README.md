# Smart-Home-System

This is a simple console-based application built to practice **Object-Oriented Programming (OOP)** concepts in Java. It simulates a central Smart Home system that can control various devices (lights, music players) using a unified interface.

## 🎯 Goal
The main goal of this project was to understand how **Interfaces** and **Polymorphism** allow different objects to be treated in the same way.

## 🧠 What I Learned
By building this project, I applied the following concepts:

*   **Interfaces:** Created a `SmartDevice` interface that defines a contract (`turnOn`, `turnOff`) that all devices must follow.
*   **Polymorphism:** The `SmartHome` class controls a list of `SmartDevice` objects. It doesn't need to know if a device is a Light or a Speaker—it just calls `turnOn()` and the specific object handles the rest.
*   **Collections:** Used `ArrayList` to manage a dynamic list of connected devices.
*   **Encapsulation:** Kept device states (like `isOn`) private and modified them only through public methods.

## 📂 Project Structure

*   `Main.java`: The entry point. It creates the home, connects devices, and runs the simulation.
*   `SmartDevice.java` **(Interface)**: Defines the standard behavior for all smart devices.
*   `SmartHome.java`: The controller class. It holds the list of devices and manages them collectively.
*   `SmartLight.java`: A concrete class implementing `SmartDevice`. It simulates a smart light bulb.
*   `SmartMusicPlayer.java`: A concrete class implementing `SmartDevice`. It simulates a smart speaker.

## 🚀 How to Run

1.  **Clone the repository** (or download the files):
    ```bash
    git clone https://github.com/yourusername/smart-home-java.git
    cd smart-home-java
    ```

2.  **Compile the Java files:**
    ```bash
    javac *.java
    ```

3.  **Run the application:**
    ```bash
    java Main
    ```

## 💻 Output Preview

When running the program, the system connects devices and triggers bulk actions:

```text
Connected: Living Room Light
Connected: Bedroom Speaker Music Player
Connected: Kitchen Light

----- Waking up the House -----

[Smart Home System]: Living Room Light is now ON
[Smart Home System]: Loading Playlist... Music is playing
[Smart Home System]: Kitchen Light is now ON

----- Shutting Down the House -----

[Smart Home System]: Living Room Light is now OFF
[Smart Home System]: Music paused
[Smart Home System]: Kitchen Light is now OFF
```

## 🔮 Future Improvements
As I continue learning, I plan to add:
*  A `SmartThermostat` class to control temperature.
*  User input (`Scanner`) to let the user add devices dynamically.
* Exception handling for broken devices.

---
*This project was created as part of my Java learning journey.*
