Example: BidderObserver
Description: 

Pattern specification: 𝑥 . 𝑚 → ∧ 𝑦 . 𝑦,  𝑥 . 𝑚 → ∧𝑦 . 𝑛,  𝑥 . 𝑚 → ∧𝑧 . 𝑧,  𝑥 . 𝑚 → ∧ 𝑦 . 𝑝,  ∧ 𝑦 . 𝑝 → ∧𝑦 . 𝑞,  ∧𝑦 . 𝑞 → ∧𝑧 . 𝑠,
∧ 𝑦 ◊− ∧ 𝑧,  ∧𝑧 . 𝑠 = ∧𝑤 . 𝑠


src/
-Bidder.java
-Observer.java
-Observertest.java
-Product.java
-Subject.java

trace/
-trace.csv

results/
- dp_result.csv

UI
- dp_ui.png