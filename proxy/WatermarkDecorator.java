package media;

public class WatermarkDecorator extends MediaDecorator {
    public WatermarkDecorator(PlaylistComponent component) {
        super(component);
    }

    @Override
    public void play() {
        System.out.println("Applying watermark...");
        component.play();
    }
}
