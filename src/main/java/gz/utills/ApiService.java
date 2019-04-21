package gz.utills;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import gz.model.*;
import java.lang.reflect.Type;
import java.util.List;

public class ApiService {

    private final String SERVER_URL = "https://jsonplaceholder.typicode.com/";
    private final String POSTS = SERVER_URL + "posts/";
    private final String COMMENTS = SERVER_URL + "comments/";
    private final String ALBUMS = SERVER_URL + "albums/";
    private final String PHOTOS = SERVER_URL + "photos/";
    private final String USERS = SERVER_URL + "users/";
    private final String TODOS = SERVER_URL + "todos/";

    private static ApiService instance;

    private ApiService() {
    }

    public static synchronized ApiService getInstance() {
        if (instance == null) {
            instance = new ApiService();
        }
        return instance;
    }


    public Post getPostById(int i) {
        return getDataById(POSTS + i, Post.class);
    }

    public Comment getCommentById(int i) {
        return getDataById(COMMENTS + i, Comment.class);
    }

    public Album getAlbumById(int i) {
        return getDataById(ALBUMS + i, Album.class);
    }

    public Photo getPhotoById(int i) {
        return getDataById(PHOTOS + i, Photo.class);
    }

    public User getUserById(int i) {
        return getDataById(USERS + i, User.class);
    }

    public Todo getTodoById(int i) {
        return getDataById(TODOS + i, Todo.class);
    }


    private <T> T getDataById(String url, Class<T> tClass) {
        String response = UseOkHttp.request(url);
        if (UseOkHttp.status.compareTo("OK") == 0) {
            Gson gson = new Gson();
            return gson.fromJson(response, tClass);
        } else {
            System.out.println("UseOkHttp.status: " + UseOkHttp.status);
        }
        return null;
    }


    public List<Post> getPosts() {
        return getAlData(POSTS);
    }

    public List<Comment> getComments() {
        return getAlData(COMMENTS);
    }

    public List<Album> getAlbums() {
        return getAlData(ALBUMS);
    }

    public List<Photo> getPhotos() {
        return getAlData(PHOTOS);
    }

    public List<User> getUsers() {
        return getAlData(USERS);
    }

    public List<Todo> getTodos() {
        return getAlData(TODOS);
    }

    private  <T> List<T> getAlData(String url) {
        String response = UseOkHttp.request(url);
        if (UseOkHttp.status.compareTo("OK") == 0) {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<T>>() {}.getType();
            return gson.fromJson(response, listType);
        } else {
            System.out.println("UseOkHttp.status: " + UseOkHttp.status);
        }
        return null;
    }

}
