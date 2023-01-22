
import java.util.Objects;

public class Song {
    private Integer id;
    private String artist;
    private String album;
    private String song;
    private String songName;

    public Song(Integer id, String artist, String album, String songName) {
        this.id = id;
        this.artist = artist;
        this.album = album;
        this.songName = songName;
    }

    public Song(String artist, String album, String songName) {
        this.artist = artist;
        this.album = album;
        this.songName =songName;
    }

    public Song() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id) && Objects.equals(artist, song.artist) && Objects.equals(album, song.album) && Objects.equals(song, song1.song);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, artist, album, song);
    }

    @Override
    public String toString() {
        return "SongName{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ",song='" +songName + '\'' +
                '}';
    }
}