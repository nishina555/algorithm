def print_hello
  print('Hello¥n')
end

print_hello

puts('整数値を入力してください')
message = STDIN.gets.chomp
print("あなたが入力したのは#{message}です")
