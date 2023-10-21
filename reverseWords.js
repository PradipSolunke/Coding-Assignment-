function reverseWords(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => {
        let reversedWord = '';
        for (let i = word.length - 1; i >= 0; i--) {
            reversedWord += word[i];
        }
        return reversedWord;
    });
    return reversedWords.join(' ');
}

const sentence = 'This is a sunny day';
console.log(reverseWords(sentence));
