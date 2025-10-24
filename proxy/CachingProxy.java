package media;

public class CachingProxy implements IMediaSource {
    private IMediaSource realSource;
    private boolean cached = false;

    public CachingProxy(IMediaSource realSource) {
        this.realSource = realSource;
    }

    @Override
    public void open() {
        if (!cached) {
            System.out.println("Fetching remote stream...");
            cached = true;
        } else {
            System.out.println("Loading from cache...");
        }
        realSource.open();
    }

    @Override
    public void play() {
        realSource.play();
    }

    @Override
    public void close() {
        realSource.close();
    }
}
