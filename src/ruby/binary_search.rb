def binary_search(key, data)
  p_left = 0
  p_right = data.length - 1
  while p_left <= p_right
    center = (p_left + p_right) / 2
    return center if data[center] == key
    if data[center] < key
      p_left = center + 1
    else
      p_right = center - 1
    end
  end
  -1
end

data = []
10.times do |i|
  data.push(i + 1)
end

puts '数値を入力してください'
search_num = gets.chomp.to_i

if searchNum > 10 || searchNum < 1
  puts '1から10の間で入力してください'
  exit
else
  puts search_num
end

puts 'バイナリーサーチを開始します'

position = binary_search(searchNum, data)
if position == -1
  puts "#{searchNum}はみつかりませんでした"
else
  puts "#{searchNum}は#{position}番目にあります"
end

puts 'バイナリーサーチを終了します'
