# vendingMachine2

[1 年前に作ったもの](https://github.com/shin1127/VendingMachine)よりもクオリティの高いものを作ることを目標とする

# 昔と比べてスキルアップしたこと、身につけたこと

- フロントエンド技術
- サーバーサイド技術
- DB/SQL
- クラスに対する、以前より深い理解
- インフラ、特に PaaS や IaaS に関する知識

# この制作を通じて身につけたい技術

- 利用言語は Java
- DB 接続を行う
- (JavaFX で作った GUI アプリケーションか、Web アプリケーションが望ましい)
- 飲み物の種類を題材に、クラスの継承などを行う

# 要件定義

自販機を模倣したアプリケーションを作る

- お金を投入する機能
- 今回は飲み物の在庫に関しても記述する

# クラス

インターフェース：商品  
抽象クラス：ドリンククラス、食べ物クラス、切符クラス  
ドリンククラスの継承：ソフトドリンククラス、アルコールクラス

- 商品クラスのプロパティ：名前、価格
  - ドリンククラスのプロパティ：内容量、容器
    - ソフトドリンククラス
    - アルコールクラス（年齢確認機能を持つ）
