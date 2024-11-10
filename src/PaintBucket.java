public interface PaintBucket {

    void paint();
    void scrap();

    static void washBrush(){

    }

    default String progress(){
        return "All Done!";
    }


}
