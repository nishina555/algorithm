def binarySearch(key, data)
  pLeft = 0
  pRight = data.length - 1
  while pLeft <= pRight do
    center = (pLeft + pRight) / 2
    if data[center] == key then
      return center
    end
    if data[center] < key then
      pLeft = center + 1
    else
      pRight = center - 1
    end
  end
  return -1
end

data = []
10.times do |i|
  data.push(i+1)
end

puts "数値を入力してください"
searchNum = gets.chomp.to_i

if searchNum > 10 || searchNum < 1 then
  puts "1から10の間で入力してください"
  exit
else
  puts searchNum
end

puts "バイナリーサーチを開始します"

position = binarySearch(searchNum, data)
if position == -1 then
  puts "#{searchNum}はみつかりませんでした"
else
  puts "#{searchNum}は#{position}番目にあります"
end

puts "バイナリーサーチを終了します"