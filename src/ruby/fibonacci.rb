def fibonacci(n)
  if n == 0 || n == 1 then
    return n
  else
    return fibonacci(n - 2) + fibonacci(n - 1)
  end
end

10.times do |i|
  puts "#{i+1} 番目のフィボナッチ数列は #{fibonacci(i)} です"
end