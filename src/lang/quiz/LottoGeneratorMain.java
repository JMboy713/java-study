package lang.quiz;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        
        int[] generate = lottoGenerator.generate();
        for (int i : generate) {
            System.out.print(i+" ");
        }
    }
}
