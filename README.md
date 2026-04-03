# 📱 Multiplication Table App

A modern Android application built with **Kotlin** that generates multiplication tables in a clean, user-friendly interface.

---

## ✨ Features

* 🔢 Generate multiplication tables instantly
* 🎯 Simple and intuitive user input
* 📜 Scrollable results for better readability
* 🔙 Easy navigation with a back button
* 💡 Input validation to prevent errors
* 🎨 Clean Material Design UI
* 🌙 Supports Light & Dark Mode

---

## 📸 Preview

<img width="492" height="949" alt="Screenshot 2026-04-03 182140" src="https://github.com/user-attachments/assets/a6303494-2062-4913-b8bb-54d99d812780" />
<img width="478" height="946" alt="Screenshot 2026-04-03 182236" src="https://github.com/user-attachments/assets/cd5d4af2-7f94-426a-9251-f49271ff2679" />

```

---

## 🛠️ Built With

* **Kotlin** – Primary programming language
* **Android Studio** – Development environment
* **Material Design Components** – Modern UI
* **ConstraintLayout** – Responsive layouts

---

## 🚀 How It Works

1. Enter any number in the input field
2. Tap **Generate**
3. View the multiplication table (1–10)
4. Tap **Back** to return and try another number

---

## 📂 Project Structure

```
MultiplicationTable/
│── MainActivity.kt              # Handles user input
│── MultiplicationTable.kt       # Displays results
│── activity_main.xml            # Main screen UI
│── activity_multiplication_table.xml # Result screen UI
```

---

## ⚙️ Installation

1. Clone the repository:

```bash
git clone https://github.com/franclinbatchamen-lgtm/MultiplicationTable.git
```

2. Open in **Android Studio**

3. Sync Gradle and run the app on:

   * Emulator OR
   * Physical Android device

---

## 🧠 Code Highlights

### Passing Data Between Activities

```kotlin
intent.putExtra("tableNumber", editTextNumber.text.toString())
```

### Generating the Table

```kotlin
while (counter <= 10) {
    val answer = tableNumber * counter
    tableDisplay += "$tableNumber x $counter = $answer\n"
    counter++
}
```

---

## ⚠️ Input Validation

The app safely handles invalid inputs to prevent crashes:

```kotlin
val tableNumber = tableString?.toIntOrNull()
```

---

## 🎯 Future Improvements

* 🔢 Custom range selection (e.g., 1–20, 1–50)
* 📊 Grid/table layout instead of plain text
* 🎨 Theme customization
* 🔊 Sound effects & animations
* 🌍 Multi-language support

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a new branch
3. Make your changes
4. Submit a pull request

---

## 📄 License

This project is open-source and available under the **MIT License**.

---

## 👨‍💻 Author

**Franclin Batchame**

* GitHub: https://github.com/franclinbatchamen-lgtm

---

## ⭐ Support

If you like this project, please ⭐ star the repository and share it!

---

## 💬 Feedback

Feel free to open an issue for suggestions or improvements.

---
## Title: Disclosure of AI Usage in my Assessment.
• activity_main.xml, activity_multiplication_table.xml and the code for the button within the assessment in which generative AI was used 

• i used chat GPT.

• to create visually better layout and more interactive app

• 18:33 was the time i used it.

• <img width="1592" height="1107" alt="Screenshot 2026-04-03 183445" src="https://github.com/user-attachments/assets/bcfe8148-dfc8-4d0b-93e8-a40a88e2a3b2" />
<img width="1594" height="1112" alt="Screenshot 2026-04-03 183429" src="https://github.com/user-attachments/assets/9f1e36d3-64f0-4412-b868-3d5b4122e546" />
