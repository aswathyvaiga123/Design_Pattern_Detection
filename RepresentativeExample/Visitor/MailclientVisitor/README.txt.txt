Example:MailclientVisitor
Description: 

Pattern specification: 𝑥 . 𝑚 → ∧ 𝑦 . 𝑦,  𝑥 . 𝑚 → ∧𝑧 . 𝑧,  𝑥 . 𝑚 → ∧ 𝑦 . 𝑝,  ∧𝑦 . 𝑝 → ∧ 𝑧 . 𝑞,  ∧𝑦 . 𝑝 = ∧𝑤 . 𝑝,  ∧𝑧 . 𝑞 = ∧ 𝑢 . 𝑞


src/
-LinuxMailClientVisitor.java
-MacMailClientVisitor.java
-MailClient.java
-MailClientVisitor.java
-MailClientVisitorTest.java
-OperaMailClient.java
-SquirrelMailClient.java
-WindowsMailClientVisitor.java
-ZimbraMailClient.java


trace/
-trace.csv

results/
- dp_result.csv

UI
- dp_ui.png