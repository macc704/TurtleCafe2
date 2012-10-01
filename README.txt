TurtleCafe（論プロテキスト）ビルドマニュアル

■準備
1．CreWDocのインストール（XML→sdoc→htmlと変換するために必要）
http://software.crew.sfc.keio.ac.jp/wiki.cgi?page=CreWDoc

2．xslファイルの差し替え
CreWDocインストール後に，xslフォルダ以下にあるronprotext.xslをTurtleCafe直下にあるものと差し替える．

■全体ビルド
make

■開発ビルド
cd TurtleCafe
make
	
■備考
テキストソースはCreWDoc,XML形式
CreWDocXML -> (txslt) -> SmartDoc -> (sdocex) -> HTML


