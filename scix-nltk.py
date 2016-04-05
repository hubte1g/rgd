
data = sc.textFile('C:/Users/Kizmet/Documents/rgd/scix/scix-raw.txt')
import nltk

words = data.flatMap(lambda x: nltk.word_tokenize(x))
print words.take(10)

pos_word = words.map(lambda x: nltk.pos_tag([x]))
print pos_word.take(5)
