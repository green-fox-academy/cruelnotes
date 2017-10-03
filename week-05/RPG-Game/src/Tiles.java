public class Tiles {

    String tileName;

    public Tiles(String tileName) {
        this.tileName = tileName;

    }

    public void drawTile() {

        Canvas csStatusImage = new Canvas();
        csStatusImage.setBounds(393, 36, 200, 200);
        frame.getContentPane().add(csStatusImage);

        Image iMg;
        try {
            iMg = ImageIO.read(new File("Images/Error_status_1.png"));
            csStatusImage.imageUpdate(iMg, 10, 2, 2, 9, 10);
            csStatusImage.checkImage(iMg, (ImageObserver) this);
            csStatusImage.createImage((ImageProducer) iMg);

        } catch (IOException e1) {
            e1.printStackTrace();
        }



    }

}
