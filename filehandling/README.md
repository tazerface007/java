# File Handling in Java

## ***Origins:***

- Java's First file-handling support arrived with java.io in java version 1.0.
- The goal was to provide a platform-independent way to read and write files ans stream

## ***Key base classes introduced:***

- ***java.io.File***
    - represents a file or directory
    - used for metadata and file-system operations: exists, create, delete, rename, list files.
    - does not read or write file contents.

- ***java.io.InputStream/java.io.OutputStream***
    - Abstract base class for byte input/output.
    - used for binary data.

- ***java.io.Reader/java.io.Writer***
    - abstract base classes for character input/output.
    - used for text data with proper encoding support.

## Concrete file-specific classes:

- FileInputStream
- FileOutputStream
- FileReader
- FileWriter

# Early Enhancements: Buffering and Convenience Streams

- After the basics, Java added wrapper classes to improve performance and usability.

