def euclidGcd(x, y)
  if y == 0 then
    return x
  else
    return euclidGcd(y, x%y)
  end
end

puts "整数値をスペース区切りで二つ入力してください"
input = STDIN.gets.chomp.split( ).map(&:to_i)
x = input[0]
y = input[1]
if x > y then
  tmp = x
  x = y
  y = tmp
end
print "最大公約数は#{euclidGcd(x, y)}です"
# print "最大公約数は", euclidGcd(x, y), "です"


