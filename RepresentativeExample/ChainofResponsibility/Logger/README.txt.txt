Example: Logger
Description: 

Pattern specification: 𝑥 . 𝑚 → 𝑦 . 𝑛,  𝑦 . 𝑛 − ∗ ∧𝑤,  ∧ 𝑤 . 𝑤 → 𝐴𝑧 . 𝑧,  𝑦 . 𝑛 → ∧ 𝑢 . 𝑢,  ∧𝑤 . 𝑝 = ∧ 𝑢 . 𝑝,  𝐴 𝑧 . 𝑧 = 𝐴𝑣 . 𝑣,
𝑦 . 𝑛 → 𝐴𝑧 . 𝑠,  𝑦 . 𝑛 → 𝐴 𝑣 . 𝑠

src/
- ChainOfResponsibilityClient.java
-ConsoleBasedLogger.java
-DebugBasedLogger.java
-ErrorBasedLogger.java
-Logger.java
-RequestorClient.java

trace/
-trace.csv

results/
- dp_result.csv

UI
- dp_ui.png
