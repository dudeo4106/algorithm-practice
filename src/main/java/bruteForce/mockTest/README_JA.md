# Mock Test
- References : https://programmers.co.kr/learn/courses/30/lessons/42840

# Question
数学を諦めた三人組は模擬試験に数学問題を全部当てずっぽうで解くと思っています。 数字は1番から最後の問題まで、次のように書きます。

1番、数学を諦めた人が当てずっぽうで解く方式: 1、2、3、4、5、1、2、3、4、5...
2番、数学を諦めた人が当てずっぽうで解く方式: 2、1、2、3、2、4、2、5、2、1、2、3、2、4、2、5···。
3番、数学を諦めた人が当てずっぽうで解く方式: 3、3、1、1、2、4、5、3、1、2、4、5、5、5、3、1、2、4、5、5、1...

1番から最後の問題までの正解が、順番に聞いた配列answersを与えられたとき、最も多くの問題を当てた人が誰なのか、配列に入れてreturnするようにsolution関数を作成してください。

# Condition
- 試験は最大10,000問題で構成されています。
- 問題の正解は1、2、3、4、5の中の一つです。
- 最も高い点数を受けた人が複数いる場合、returnする値を昇順に整列してください。

# I/O Sample
|answers|return|
|---|---|
|[1,2,3,4,5]|[1]|
|[1,3,2,4,2]|[1,2,3]|

# I/O Sample Explain
Example #1

数学を諦めた人1はすべての問題を当てました。
数学を諦めた人2はすべての問題を間違いました。
数学を諦めた人3は全ての問題を間違いました。
したがって、最も多く当てた人は数学を諦めた人1です。

Example #2

全ての人が2問ずつ当てました。

<br>