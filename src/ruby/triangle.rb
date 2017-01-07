if ARGV.length != 3
  puts '引数は3つにしてください。'
  exit
end

if ARGV.include?('0')
  puts '0は入力しないでください。'
  exit
end

sides = ARGV.map(&:to_i).sort
if sides[0] + sides[1] > sides[2]
  if sides[0] == sides[1] || sides[1] == sides[2] || sides[2] == sides[0]
    if sides[0] == sides[1] && sides[1] == sides[2]
      puts '正三角形ですね！'
      exit
    end
    puts '二等辺三角形ですね！'
    exit
  end
  puts '不等辺三角形ですね！'
else
  puts '三角形じゃないです＞＜'
end
