public class RussianBlueСat extends Cat{
    private String mice = "*******";
    @Override
    void voice() {
        System.out.println(getVoice());
    }

    public void catchMice(){
        System.out.println(mice);
    }

    public RussianBlueСat() {
        super("May");
    }

    public RussianBlueСat(String voice) {
        super(voice);
    }

    public RussianBlueСat(String voice, String mice) {
        super(voice);
        this.mice = mice;
    }

    @Override
    public String toString() {
        return "RussianBlueСat{" +
                "voice='" + getVoice() + '\'' +
                "mice='" + mice + '\'' +
                '}';
    }
}
