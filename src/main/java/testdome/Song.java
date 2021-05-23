package testdome;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        Song slow = this.nextSong;
        Song fast = slow == null ? null : slow.nextSong;
        System.out.println("[slow] : " + slow.name + " / [fast] : " + fast.name);

        while (fast != null) {
            if (slow == this || slow == fast) {
                return true;
            }
            slow = slow.nextSong;
            fast = fast.nextSong;

            if (fast != null) {
                fast = fast.nextSong;
            }
        }
        return false;
        // throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}