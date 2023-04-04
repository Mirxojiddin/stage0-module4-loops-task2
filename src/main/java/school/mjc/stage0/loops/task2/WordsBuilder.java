package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int len = chars.length;
        int son = 0;
        String ress=""; 
        while (son<len)
            ress+=chars[son++];
        System.out.println(ress);
    }
    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('<','l','o','o','p','s',' ','a','r','e',' ','c','o','o','l','>');
    }
}
