Example: Expression
Description: 

Pattern specification: 𝑥 . 𝑚 → ∧ 𝑦 . 𝑞,  ∧ 𝑦 . 𝑞 → ∧ 𝑧 . 𝑞,  𝑥 . 𝑚 → ∧𝑤 . 𝑞,  ∧ 𝑤 . 𝑞 → ∧ 𝑣 . 𝑞,  ∧ 𝑦 . 𝑞 = ∧𝑤 . 𝑞,  ∧ 𝑦 . 𝑞 = ∧𝑧 . 𝑞,  𝑧 . 𝑞 = 𝑣 . 𝑞

src/
-AdditionExpression.java
-Expression.java
-ExpressionParser.java
-ExpressionParserTest.java
-MultiplicationExpression.java
-NumberExpression.java
-ParserUtil.java
-SubtractionExpression

trace/
-trace.csv

results/
- dp_result.csv

UI
- dp_ui.p