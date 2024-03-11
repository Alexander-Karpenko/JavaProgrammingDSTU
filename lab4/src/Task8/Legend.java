package Task8;

class Legend extends GraphElement {
    private String text;

    public Legend(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        // Реализация прорисовки пояснения
    }
}
