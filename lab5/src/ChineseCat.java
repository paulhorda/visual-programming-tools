public class ChineseCat extends Cat{
    private String mice = "It hunt with China";
    @Override
    void voice() {
        System.out.println("|D|FS|");
    }

    public void catchMice(){
        System.out.println(mice);
    }

    public ChineseCat(){
        super("May");
    }

    public ChineseCat(String voice) {
        super(voice);
    }

    public ChineseCat(String voice, String mice) {
        super(voice);
        this.mice = mice;
    }
    @Override
    public String toString() {
        return "ChineseCat{" +
                "voice='" + getVoice() + '\'' +
                "mice='" + mice + '\'' +
                '}';
    }

}
