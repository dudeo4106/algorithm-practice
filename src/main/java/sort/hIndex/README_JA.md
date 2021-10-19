# H Index
- References : https://programmers.co.kr/learn/courses/30/lessons/42747

# Question
H-Indexは科学者の生産性と影響力を表す指標です。 ある科学者のH-Indexを表す値であるhを求めようとします。 ウィキペディア1によると、H-Indexは次のように求めます。

ある科学者が発表した論文n編のうち、h番以上引用された論文がh編以上で残りの論文がh番以下引用されたとしたら、hの最大値がこの科学者のH-Indexです。

ある科学者が発表した論文の引用回数を盛り込んだ配列citationsが媒介変数として与えられるとき、この科学者のH-Indexをreturnするようにsolution関数を作成してください。

# Condition
- 科学者が発表した論文の数は1編以上1,000編以下です。
- 論文別の引用回数は0回以上10,000回以下です。

# I/O Sample
|citations|return|
|---|---|
|[3, 0, 6, 1, 5]|3|

# I/O Sample Explain
この科学者が発表した論文の数は5編で、そのうち3編の論文は3回以上引用されました。<br>
そして、残りの2論文は3回以下引用されたので、この科学者のH-Indexは3です。

<br>