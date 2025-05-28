TODOアプリです。<br>

～使用技術～<br>
＜言語＞ 
 &nbsp;Java 17/HTML /CSS(Bootstrap)<br> 
 ＜開発環境＞
 &nbsp;Intelij<br> 
 ＜データベース＞
 &nbsp; MySQL<br>
＜フレームワーク＞
 &nbsp;Springboot version '3.1.2'/ SpringSecurity/ MyBatis/ Bootstrap<br>
＜テスト＞
 &nbsp;Junit<br>
＜バージョン管理（途中から)＞
&nbsp; Github<br>
＜ライブラリ＞
&nbsp;Lombok <br>
＜テンプレートエンジン＞
 &nbsp;Thymeleaf<br><br>


～ページ構成～
<ul>
  <li>ログイン</li>
  <li>トップ</li>
  <li>タスク一覧</li>
  <li>タスク詳細</li>
  <li>タスク作成</li>
  <li>タスク編集・削除</li>
  <li>ユーザー一覧画面（Adminのみ）</li>
  <li>ユーザー作成画面（Adminのみ）</li>
  <li>ログアウト画面</li>
  <li>404エラーページ</li>
  <li>405エラーページ</li>
</ul>

～機能～
<ul>
 <li>タスク登録</li>
  <li>タスク編集</li>
  <li>タスク削除</li>
  <li>ユーザー登録（Adminのみ）</li>
</ul><br>
～説明～<br>
<セキュリティ対策><br>
・バリデーションによりパスワードを12文字以上（128文字以下）でしか登録できないようにしています。（JPCERT/CC）<br>
・パスワード登録時ハッシュ、ソルト、ストレッチングを用いてエンコードしてからデータベースへ登録されるように実装しています。<br><br>

＜権限制限＞<br>
authority(権限)　AdminとUser（一般）の2種類用意<br>
Adminのみできること<br>
・ユーザー一覧画面へのアクセス<br>
・ユーザー登録画面へのアクセス（＋ユーザー登録）

制限は3段階により実装している<br>
1、<br>
2、<br>
3、<br>



