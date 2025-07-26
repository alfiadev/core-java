# Copilot Instructions for Alfia-java

## Project Overview
This repository contains a collection of standalone Java files, each demonstrating a specific concept, algorithm, or Java feature. There is no central application or framework; each file is intended to be run and understood independently.

## Architecture & Patterns
- **Single-file Examples:** Each `.java` file is self-contained. There are no shared packages or cross-file dependencies.
- **Naming Conventions:** Filenames reflect the concept or algorithm implemented (e.g., `PalindromeString.java`, `ExceptionHandle.java`, `ArrayList1.java`).
- **No Main Index:** There is no main entry point or orchestrator. To run or debug, select the file of interest and execute its `main` method.
- **No External Libraries:** All code uses only standard Java libraries. No build system (Maven/Gradle) or third-party dependencies are present.

## Developer Workflows
- **Compiling & Running:**
  - Use `javac <FileName>.java` to compile individual files.
  - Use `java <ClassName>` to run the compiled class. Example:
    ```zsh
    javac RemoveURL.java && java RemoveURL
    ```
- **No Automated Tests:** There are no test files or frameworks. Manual testing is done by running the relevant file.
- **Debugging:** Use IDE features to set breakpoints in the file of interest. No project-wide debugging configuration.

## Project-Specific Conventions
- **Standalone Classes:** Each file typically contains a single public class matching the filename.
- **Demonstration Focus:** Files are often written for demonstration or experimentation, not production use.
- **Minimal Error Handling:** Exception handling is basic and varies by file.
- **No Documentation Files:** There is no README or project-level documentation. Refer to file names and code comments for guidance.

## Examples
- `RemoveURL.java`: Demonstrates string manipulation and user input via `Scanner`.
- `ExceptionHandle.java`, `MultiCatch.java`: Show different exception handling patterns.
- `PalindromeString.java`, `PrimeNumber.java`: Implement classic algorithms.

## How to Contribute
- Add new concepts as separate `.java` files.
- Follow the naming convention: `<ConceptName>.java`.
- Keep each file self-contained; avoid cross-file dependencies.

## Key Files
- All `.java` files in the root directory are important; there are no submodules or hidden entry points.

---
For questions or unclear conventions, review the relevant `.java` file or ask for clarification.
