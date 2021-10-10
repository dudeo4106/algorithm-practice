# Stock price
- References : https://programmers.co.kr/learn/courses/30/lessons/42584

# Question
秒単位で記録された株式価格を含む配列pricesが媒介変数として与えられる時、<br>
価格が下がらない期間が何秒かをreturnするためにsolution関数を完成させなさい.

# Condition
- pricesの各価格は1以上10,000以下の自然水です。
- pricesの長さは2以上100,000以下です

# I/O Sample
|prices|return|
|---|---|
|1, 2, 3, 2, 3|4, 3, 1, 1, 0|

# I/O Sample Explain
- 1秒時点の1円は最後まで価格が下がりませんでした。
- 2秒時点の2円は最後まで価格が下がりませんでした。
- 3秒時点の3円は、1秒後に価格が下がります。したがって、1秒間価格が下がらなかったものと思います。
- 4秒時点の2円は、1秒間価格が下がりませんでした。
- 5秒時点の3円は0秒間価格が下がりませんでした。

<br>