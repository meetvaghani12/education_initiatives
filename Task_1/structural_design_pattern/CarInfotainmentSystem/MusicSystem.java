public class MusicSystem {
    private String playlist;

    public void turnOn() {
        System.out.println("Music system is now ON.");
    }

    public void turnOff() {
        System.out.println("Music system is now OFF.");
    }

    public void playPlaylist(String playlist) {
        this.playlist = playlist;
        System.out.println("Playing playlist: " + playlist);
    }
}
