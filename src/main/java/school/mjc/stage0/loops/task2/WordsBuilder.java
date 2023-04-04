package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int len = chars.length;
        int son = 0;
        while (son<len)
            System.out.print(chars[son++]);
    }
    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('<','l','o','o','p','s',' ','a','r','e',' ','c','o','o','l','>');
    }
}
