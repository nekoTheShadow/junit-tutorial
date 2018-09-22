[渡辺修司『JUnit実践入門: 体系的に学ぶユニットテストの技法』(技術評論社)](https://www.amazon.co.jp/JUnit%E5%AE%9F%E8%B7%B5%E5%85%A5%E9%96%80-%E4%BD%93%E7%B3%BB%E7%9A%84%E3%81%AB%E5%AD%A6%E3%81%B6%E3%83%A6%E3%83%8B%E3%83%83%E3%83%88%E3%83%86%E3%82%B9%E3%83%88%E3%81%AE%E6%8A%80%E6%B3%95-WEB-PRESS-plus/dp/477415377X)の「Part5 演習問題」の回答集です。ただし本書は出版年がやや前ということもあるため、2018年9月現在に合わせて、本書が採用している環境からは一部変更しています。変更箇所については、具体的には以下の通りです。

- Java10を利用しています。
    - ローカル変数の型推論やStreamなどを注釈なく利用しています。
- JUnit5を利用しています。
- 本書ではmatcherとしてHamcrestを採用していますが、この回答集ではAssertJを利用しています。