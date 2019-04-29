package net.hafiznaufalr.shimmer.model;

public class Model {

//     "albumId": 1,
//             "id": 1,
//             "title": "accusamus beatae ad facilis cum similique qui sunt",
//             "url": "https://via.placeholder.com/600/92c952",
//             "thumbnailUrl": "https://via.placeholder.com/150/92c952"

    private String albumId,id,title,url,thumbnailUrl;

    public Model() {
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
