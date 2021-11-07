# Find prime number
- References : https://programmers.co.kr/learn/courses/30/lessons/42839

# Question
一桁の数字が書かれた紙切れが散らばっています。 散らばった紙切れをつけて素数をいくつ作れるか調べようと思います。

各紙切れに書かれた数字が書かれた文字列numbersを与えられたとき、紙切れで作ることのできる素数がいくつなのかreturnするようにsolution関数を完成させてください。

# Condition
- numbersは長さ1以上7以下の文字列です。
- numbersは0~9までの数字だけで構成されています。
- "013"は、0、1、3の数字が書かれた紙片が散らばっているという意味です。

# I/O Sample
|answers|return|
|---|---|
|"17"|3|
|"011"|2|

# I/O Sample Explain
例題＃1です。
【1、7】では、素数の［7、17、71］を作ることができます。

例題「＃2」です。
[0、1、1]では、素数の[11、101]を作ることができます。

11と011は同じ数字で扱います。

<br>