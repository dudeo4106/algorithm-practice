# 変装
- References : https://programmers.co.kr/learn/courses/30/lessons/42578

# Question
スパイたちは、毎日違う服を組み合わせて着て自分を偽装します。<br>
たとえば、スパイが持っている服が以下の通りで、今日スパイが丸いメガネ、長いコート、青いTシャツを着ていたら？<br>
翌日はジーンズを追加ではいたり、丸メガネの代わりに黒のサングラスをはいたりしなければなりません。<br>

- 顔 : 丸いメガネ、黒いサングラス
- 上着 : 青色Tシャツ
- 下衣 : ジーンズ
- 上着 : 長いコート

スパイの持つ衣装が込められた2次元配列clothesを与えるとき、<br>
それぞれ違う服の組み合わせの数をreturnするようにsolution関数を作成してください。<br>

# Condition
- clothesの各行は、[衣装の名前、衣装の種類]で構成されています。
- スパイが持っている衣装の数は1個以上30個以下です。
- 同じ名前の衣装は存在しません。
- clothesの全ての元素は文字列で構成されています。
- すべての文字列の長さは1以上20以下の自然数であり、アルファベットの小文字または'_'だけで構成されています。
- スパイは一日に最低一つの衣装は着ます。

# I/O Sample
|clothes|return|
|---|---|
|[["yellowhat", "headgear"], ["bluesunglasses", "eyewear"],["green_turban", "headgear"]]|5
|[["crowmask", "face"], ["bluesunglasses", "face"], ["smoky_makeup", "face"]]|3

# I/O Sample Explain
-　headgearに該当する衣装がyellow_hat、green_turbanであり、eyewearに該当する衣装がblue_sunglassesですので、以下の5つの組み合わせが可能です。
```
1. yellow_hat
2. blue_sunglasses
3. green_turban
4. yellow_hat + blue_sunglasses
5. green_turban + blue_sunglasses
```

- faceに該当する衣装がcrow_mask、blue_sunglasses、smoky_makeupなので、以下の3つの組み合わせが可能です。
```
1. crow_mask
2. blue_sunglasses
3. smoky_makeup
```