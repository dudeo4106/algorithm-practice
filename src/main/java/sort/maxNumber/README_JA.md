# 最も大きい数字
- References : https://programmers.co.kr/learn/courses/30/lessons/42746

# Question
0または正の整数を与えられたとき、整数をつなげて作ることができる最大数を探し出してください。<br>

例えば、与えられた整数が[6、10、2]なら、[6102、6210、1062、1026、2610、2106]となり、このうち最大の数は6210です。<br>

0または正の整数を含んだ配列numbersが媒介変数として与えられる時、<br>
順序を再配置して作ることができる最大の数を文字列に変えてreturnするようにsolution関数を作成してください。

# Condition
- numbersの長さは1以上100,000以下です。
- numbersの元素は0以上1,000以下です。
- 答えが大きすぎる可能性があるので文字列に変えてreturnします。

# I/O Sample
|array|return|
|---|---|
|[6, 10, 2]|6210|
|[3, 30, 34, 5, 9]|9534330|

<br>