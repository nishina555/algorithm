def printHello
  print("Hello¥n")
end

printHello

puts("整数値を入力してください")
message = STDIN.gets.chomp
print("あなたが入力したのは#{message}です")
