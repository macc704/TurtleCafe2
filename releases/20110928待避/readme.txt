TurtleCafe（論プロテキスト）ビルドマニュアル（20090309，文責：橋山）

■概要
論プロのテキスト（TurtleCafe）を執筆・修正し，
Webに公開するまでの方法をまとめたもの．


■CVS管理上のポリシー
次の2つのリポジトリはそれぞれ管理ポリシーが違うので，ごちゃ混ぜにしないこと．

・/CreWWeb/subprojects/lectures/以下にあるtcafe
Web上からの閲覧を目的とするため，最終生成物であるhtml4フォルダ以下と誘導用のindex.htmlのみを設置する．

・/texts/TurtleCafe/以下
執筆・修正作業を目的とするため，ソース（xml，画像，ソースコードなど）と生成ツールのみを設置する．

途中成果物であるsdoc，binary.jarなどはコミットしないこと（.cvsignoreには記述してあるが）．


■準備
1．TurtleCafeの入手
CVSから，texts/TurtleCafeをチェックアウトする．

2．CreWDocのインストール（XML→sdoc→htmlと変換するために必要）
http://software.crew.sfc.keio.ac.jp/wiki.cgi?page=CreWDoc

3．xslファイルの差し替え
CreWDocインストール後に，xslフォルダ以下にあるronprotext.xslをTurtleCafe直下にあるものと差し替える．


■フォルダ構成
src
	バイナリ作成時のコンパイルに必要なソースコードが置いてある．
	TurtleCafe以下にあるmakebin.batを呼び出すと，このフォルダから必要なソースコードをコピーしてコンパイルに利用する．

releases
	過去にリリースしたTurtleCafeのzipとリリースノートが置いてある．
	リリースバージョンを作成するためには，makepackage.batを利用する．

TurtleCafe
	本体．テキスト（xml，画像等）やサンプルソース，テキスト生成のための各種バッチファイルなどが置いてある．

makepackage.bat
	リリースバージョン作成用のバッチファイル．詳細は中を読めば分かる．

reame.txt
	このビルドマニュアル．

ronprotext.xsl
	TurtleCafe用のXSLファイル．


■執筆・修正
全体の章立ては，TurtleCafeの直下にある「index.xml」に記述してある．

appendix
	タートルの仕様が書かれている．

chapter**
	各章をあらわしている．

finalexample
	最終作品例が公開されている．

introduction_***
	CNS，Windows，Macintoshにおける環境構築について書かれている．

kotodama_***
	言霊を用いたテキストであるが，現在は利用されていない（ただし，いつ利用を再開するか分からないので残しておくこと）．

sound
	BSoundを利用した音の鳴らし方について書かれている．


また，各章の構成はおおよそ次のようになっている．

・imageフォルダ
テキスト内で利用する画像ファイルを格納する．

・srcフォルダ
テキスト内で利用するアプレットのソースコード，リソースファイルを格納する．

・index.xml
テキスト本体．基本的にはこのファイルを元に加筆・修正していく．


■コンパイル
コンパイルは次の段階に分けて行う．

1．srcフォルダ内のリソースファイルを，binフォルダにコピーする．
2．srcフォルダ内のソースコードをコンパイルし，binフォルダに出力する．
3．binフォルダ内の全ファイルを，binary.jarにまとめる
4．CreWDocのtxsltコマンドを使って，index.xmlをindex.sdocに変換する
5．CreWDocのsdocexコマンドを使ってindex.sdocを処理し，html4フォルダ以下に完成したテキスト（html，画像ファイル）を出力する．
6．binary.jarをhtml4フォルダ以下にリネームしてコピーし，テキストからアプレットが実行できるようにする．
7．srcフォルダをhtml4フォルダ以下にコピーし，ソースコードがダウンロードできるようにする．
8. JDKマニュアルに関連したファイルをコピーする．

コンパイルの手間を省くため，3つのバッチファイルが用意してある．
makebinone.batは，1-3を行う．
makebin.batは，全テキストに対して，makebinone.batの処理を行う．
make.batは4-8の処理を行う．

バッチファイルを使う場合，コンパイルは次のように実施する．

【執筆箇所が1つの章に収まっている場合】
・makebinone.bat（引数にその章のフォルダ名を指定する）を実行する
・make.batを実行する

【執筆箇所が複数の章にまたがっている場合】
・makebin.batを実行する
・make.batを実行する


■Webへの公開
1. CVS（CreWWeb/subprojects/lectures/）以下に，html4フォルダ以下と誘導用のindex.htmlをコミットする．
2. Webmasterでログインし，updateコマンドを利用し，Webを更新する．

例えば，2008年春学期のテキストは次のURLから閲覧できる．
http://www.crew.sfc.keio.ac.jp/lectures/2008s_tcafe/html4/


■注意点
・Javaのパスは当然のこと，CreWDocのパスが通っていないと，コマンドが実行できないので，あらかじめコマンドライン上で確認しておくこと．
・コミット時には上記ポリシーに十分注意すること．