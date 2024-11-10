public class PainterApp implements PaintBucket{

    public static void main(String[] args) {

    }

    @Override
    public void paint() {

    }

    @Override
    public void scrap() {

    }

    @Override
    public String progress() {
        return PaintBucket.super.progress();
    }
}
