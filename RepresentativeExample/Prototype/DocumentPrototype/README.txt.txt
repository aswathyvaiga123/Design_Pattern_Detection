Example: DocumentPrototype
Description: 

Pattern specification: 𝑥 . 𝑚 → 𝑦 . 𝑛,  𝑥 . 𝑚 → 𝑦 . 𝑛,  𝑦 . 𝑛 → ∧ 𝑧 . 𝑝,  ∧ 𝑧 . 𝑝 → ∧𝑢 . 𝑞,  ∧ 𝑧 ◊− ∧𝑢,  ∧ 𝑧 . 𝑝 → ∧ 𝑤 . 𝑟,
𝑧 . 𝑝 = 𝑤 . 𝑝,  ∧𝑧 . 𝑝 − ∗ ∧ 𝑤,  ∧ 𝑤 . 𝑟 − ∗ ∧𝑢


src/
-AuthorizedSignatory.java
-DocumentPrototypeManager.java
-DocumentPrototypeManagerTest.java
-NDAgreement.java
-PrototypeCapableDocument.java
-TAndC.java

trace/
-trace.csv

results/
-dp_result.csv

UI
-dp_ui.png