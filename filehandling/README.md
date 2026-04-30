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

## Important classes:

- ***BufferedInputStream/BufferedOutputStream***
- ***BufferedReader/BufferedWriter***
- ***PrintWriter***
- ***DataInputStream/DataOutputStream***
- ***PushbackInputStream/PushbackReader***

### ***Why BUffered Streams Matter?***

- Buffering reduce the disk access overhead.
- ***BufferedReader*** enabled readLine().
- ***PrintWriter*** made formatted text output conveinet.
- ***DataInputStream*** and ***DataOutputStream*** supported binary primitives.



# Random Access: ***RandomAccessFile***

- Introduced to allow non-sequential file access.
- Supports read/write at arbitrary positions.
- Usefult for databases, indexes, and file formats that needs seeks.


# Java 1.4: NIO Introduced Channels and Buffers

- java NIO (***java.nio***) brought lower-level, efficient I/O.
- Main concepts:
    - ***java.nio.channels.FileChannel***
    - ***java.nio.ByteBuffer***
    - Selectors and non-blocking I/O (mostly for sockets, but file channels are part of NIO).

## Why it was important

- Better performance on large files.
- Ability to map files into memory with FileChannel.map(...).
- More direct control of byte-level data flow.


# Java 7: NIO.2 - ***java.nio.file***

- This was the biggest upgrade for the file handling.

- Key new API elements:
    - ***java.nio.file.Path***
    - ***java.nio.file.Paths***
    - ***java.nio.file.Files***
    - ***java.nio.file.FileSystem***
    - ***java.nio.file.attribute***
    - ***java.nio.file.StandardOpenOption***
    - ***java.nio.file.DirectoryStream***


Why NIO.2 matters:

Path replaced File as the main path abstraction.
Files offers static methods for creating, reading, writing, copying, moving, deleting, and checking files or directories.
Better exception handling with IOException.
Platform-independent path operations.
Watch service to monitor directory changes.
Support for symbolic links and file attributes.
Example operations with Files:

Files.createFile(path)
Files.readAllLines(path)
Files.write(path, bytes)
Files.copy(source, target)
Files.delete(path)
6. Java 8 and Later: Streams and Convenience APIs
Java 8 added stream-friendly file operations:

Files.lines(path) returns a Stream<String>
Files.walk(path) works with directory trees
Files.find(...) for searching files
Files.list(path) to list directory entries
This made file handling integrate nicely with functional-style processing.

7. Modern Best Practices
Today, the usual recommended approach is:

Use Path/Paths instead of File
Use Files for most common operations
Use try-with-resources for safe closing
Prefer BufferedReader/BufferedWriter or Files.newBufferedReader/newBufferedWriter
Use StandardOpenOption for append, create, truncate, and read/write modes
8. Core Class Hierarchy Summary
java.io.File

path and metadata only
Stream hierarchy

InputStream
FileInputStream
BufferedInputStream
DataInputStream
OutputStream
FileOutputStream
BufferedOutputStream
DataOutputStream
Reader/Writer hierarchy

Reader
FileReader
BufferedReader
Writer
FileWriter
BufferedWriter
PrintWriter
Random access

RandomAccessFile
NIO

Path
Paths
Files
FileChannel
ByteBuffer
9. Recommended Learning Path
Start with File, FileReader, FileWriter
Move to BufferedReader/BufferedWriter
Learn FileInputStream / FileOutputStream
Explore RandomAccessFile
Shift to Path / Files and use try-with-resources
Finally, study NIO.2 utilities like Files.walk, Files.lines, and directory operations
Quick Notes
File does not read data, only describes paths.
Use streams for raw bytes, readers/writers for text.
Use Files and Path for modern code.
Chronologically, Java file handling evolved from simple java.io streams to the richer java.nio.file APIs.
