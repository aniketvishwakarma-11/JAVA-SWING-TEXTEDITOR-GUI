# README: Swing Menu Tool with Toolbar and Text Editor

---

## Project Overview
This Java project demonstrates a simple Swing-based application featuring:
- A toolbar with buttons for common actions (e.g., Open, Save, Copy, etc.).
- A text area for editing text content.
- Integration of a `JMenuBar` for additional menu options.
- Support for opening text files and changing text color using a `JFileChooser` and `JColorChooser`.

---

## Features
1. **Toolbar**:
   - Contains buttons with icons for actions such as New, Open, Save, Copy, Cut, Split, and Close.
   - Icons are resized for a consistent appearance.

2. **Menu Bar**:
   - Includes a `File` menu with options to:
     - Save (currently a placeholder for future functionality).
     - Open a file to display its content in the text area.

3. **Text Editor**:
   - Editable text area for entering or modifying text.
   - Supports changing the font color using a color picker (`JColorChooser`).

4. **File Handling**:
   - Open a text file using `JFileChooser` to read and display its content in the text area.

5. **Customization**:
   - Easily customizable paths for toolbar button icons.
   - Option to add more features to the toolbar and menu bar.

---

## How to Run
1. **Prerequisites**:
   - Install Java Development Kit (JDK) 8 or later.
   - Use an IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code with the Java extension.

2. **Setup**:
   - Ensure the icon image files are present in the specified paths, such as:
     ```
     C:\Users\HP\OneDrive\Desktop\java\Images\
     ```
     Replace the paths in the code if necessary.
   - Place your text files in an accessible directory for testing the `Open` functionality.

3. **Compile and Run**:
   - Compile the program using:
     ```bash
     javac SwingMenuTool.java
     ```
   - Run the program using:
     ```bash
     java SwingMenuTool
     ```

---

## Code Structure
1. **Classes**:
   - `MyFrame`: The main frame that implements the GUI components and actions.
   - `SwingMenuTool`: The entry point with the `main` method.

2. **Key Components**:
   - `JToolBar`: Displays a horizontal toolbar with action buttons.
   - `JTextArea`: Provides a text editor for user input.
   - `JMenuBar` and `JMenuItem`: Implements the menu bar for file-related actions.
   - `JFileChooser` and `JColorChooser`: Allow file selection and color picking, respectively.

---

## Dependencies
- No external libraries are required. The project uses only Java's built-in Swing and AWT packages.

---

## Future Enhancements
- Implement the `Save` functionality to write the text area content to a file.
- Add tooltips for toolbar buttons for better user experience.
- Include more customization options, such as font size and style.
- Add error handling for unsupported file formats.

---

## Screenshots

1. **Toolbar with buttons and icons**:

   ![Toolbar with buttons and icons](https://github.com/aniketvishwakarma-11/JAVA-SWING-TEXTEDITOR-GUI/blob/main/SS1%20(1).png?raw=true)

2. **File chooser dialog for opening text files**:

   ![File chooser dialog for opening text files](https://github.com/aniketvishwakarma-11/JAVA-SWING-TEXTEDITOR-GUI/blob/main/SS1%20(2).png?raw=true)

3. **Color picker dialog for changing text color**:

   ![Color picker dialog for changing text color](https://github.com/aniketvishwakarma-11/JAVA-SWING-TEXTEDITOR-GUI/blob/main/SS1%20(3).png?raw=true)

4. **DEMO**:

   ![DEMO](https://github.com/aniketvishwakarma-11/JAVA-SWING-TEXTEDITOR-GUI/blob/main/SS1%20(4).png?raw=true)



---

## Contact
For any queries or issues, feel free to reach out:
- **Author**: Aniket Vishwakarma
- **Email**: aniketvis675@gmail.com
