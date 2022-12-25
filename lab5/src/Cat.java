public abstract class Cat extends Animal{
    public String getVoice() {
        return voice;
    }

    private String voice = "May";
    @Override
    void voice() {
        System.out.println(voice);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "voice='" + voice + '\'' +
                '}';
    }

    public Cat() {
    }

    public Cat(String voice) {
        this.voice = voice;
    }
}
