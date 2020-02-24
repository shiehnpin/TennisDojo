# tennis game coding dojo

## 活動內容

+ 已 pair programming 形式進行，一組 10 分鐘
  + 一位 driver (輸入程式碼的人)，一位 navigator (審查程式碼的人)
  + 下一輪時 navigator 變成 driver 跟下一個 navigator 再變成一組
+ 本次 coding dojo 採用的題目是 [tennis game](https://en.wikipedia.org/wiki/Tennis#Scoring) 
+ 本專案改自[https://github.com/bng86/tennis_coding_dojo_20190327](https://github.com/bng86/tennis_coding_dojo_20190327)

## 活動目標

+ 上台膽量
+ 不是做完，是從別人身上偷學一些思考及技巧

## 活動規則

+ 要寫測試
+ 有紅燈時要先修測試
+ 有紅燈時不能重構
+ 要寫功能要有測試
+ 每一輪時間到的時候至少要可以編譯

## 實用快速鍵

+ 上個游標處 Command+[
+ 下個游標處 Command+]
+ 找檔案 shift+shift
+ 檔案內搜尋 Command+F
+ 重新命名 shift+F6
+ 執行測試 Control+R
+ Git上Commit Command+K


## tennis game 遊戲需求

這個Dojo是要實作一個簡單的網球計分系統。

規則如下：

1. 每個玩家可能顯示的分數為0、15、30和40

2. 如果其中玩家已獲得40分且贏得該局則獲勝，但若滿足特殊條件則除外。

3. 如果雙方玩家都獲得40分則"Deuce"，則依照下列規則
    
    a. 若雙方處在"Deuce"，則贏得該局的玩家稱"Advantage"
    
    b. 若取得"Advantage"的玩家贏得該局，則獲勝
    
    c. 若未取得"Advantage"的玩家贏得該局，則重回"Deuce"

##test case

 player1 = Foo
 player2 = Bar
 
 + score = 0:0 output = 'Love all'
 + score = 1:0 output = 'Fifteen/Love'
 + score = 0:1 output = 'Love/Fifteen'
 + score = 2:0 output = 'Thirty/Love'
 + score = 0:2 output = 'Love/Thirty'
 + score = 3:0 output = 'Forty/Love'
 + score = 2:3 output = 'Thirty/Forty'
 + score = 4:0 output = 'Foo win'
 + score = 2:4 output = 'Bar win'
 + score = 3:3 output = 'Deuce'
 + score = 4:5 output = 'Advantage, Bar'
 + score = 5:4 output = 'Advantage, Foo'
 + score = 6:4 output = 'Foo win'
 + score = 4:6 output = 'Bar win' 
 ... 