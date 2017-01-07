# Eratosthenes
class Eratosthenes
  @@lowest_prime = 2
  def self.primes(input)
    primes = []
    candidates = (@@lowest_prime..input).to_a
    while candidates.first <= Math.sqrt(input)
      prime = candidates.first
      primes.push(prime)
      candidates.each do |candidate|
        candidates.delete(candidate) if (candidate % prime).zero?
      end
      candidates.delete(prime)
    end
    primes.concat(candidates)
  end
end

def main
  input = ARGV[0].to_i
  p Eratosthenes.primes(input)
end

main if $PROGRAM_NAME == __FILE__
