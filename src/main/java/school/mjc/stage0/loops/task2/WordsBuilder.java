package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
     int count =0;
     String words="";
     while(count < chars.length){
         words += chars[count];
         count++;
     }
        System.out.print(words);
    }
}
