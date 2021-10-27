# Find prime number
- References : https://programmers.co.kr/learn/courses/30/lessons/42839

# Question
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

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
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

11과 011은 같은 숫자로 취급합니다.

<br>