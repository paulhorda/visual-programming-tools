public class BritishСat extends Cat{
    private String mice;

    @Override
    void voice() {
        System.out.println("Mey");
    }

    public void catchMice(){
        System.out.println("It hunt with tea");
    }

    public BritishСat(String voice) {
        super(voice);
    }

    public BritishСat() {
    }

    public BritishСat(String voice, String mice) {
        super(voice);
        this.mice = mice;
    }

    @Override
    public String toString() {
        return "BritishСat{" +
                "voice='" + getVoice() + '\'' +
                "mice='" + mice + '\'' +
                '}';
    }
}
