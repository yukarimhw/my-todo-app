TODOアプリです。<br>
新人研修の教えていただく側、教える側両方を経験し、教え終わっていること、これから教えることなど一目でわかる、かつ更新できるものがあればいいなと思い、制作しました。tasksテーブルのstatusのDo,Doing,Doneで分かるようになっています。<br>
1人につき1つtasksテーブルを持つように実装予定でしたが、その実装は難しかったため、1つのtasksテーブルをユーザーで共有して編集する形になっています。


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
  <li>403エラーページ</li>
  <li>404エラーページ</li>
</ul>

～機能～
<ul>
 <li>タスク登録</li>
  <li>タスク編集</li>
  <li>タスク削除</li>
 <li>タスク検索（summary全文検索/Statusのdo・doing・done検索）</li>
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

制限は3段階により実装しています<br>
1、"sec"により権限で表示内容（ユーザー一覧へのリンクの有無）を変更<br>
2、@PreAuthorizeで権限によるメソッド制御（ユーザー一覧取得など）<br>
3、権限により特定のURLへのアクセス制御<br><br><br>


!今後追加で行いたいこと、実装したいこと
<ul>
 <li>AWSを用いてデプロイ</li>
  <li>ユーザー削除</li>
  <li>タスク作成時にログインユーザーの名前が入るようにする（誰が作成したかわかるように）</li>
  <li>タスクstatusをdone（済）にしたログインユーザーの名前が入るようにする</li>
  <li>statusがdoneになったタスクの自動削除or移動</li>
  <li>現在タスクIDがタスク削除後も続きから自動インクリメントされている問題の解決</li>
</ul>

