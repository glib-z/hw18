package gz;

import gz.model.*;
import gz.utills.ApiService;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ApiService service = ApiService.getInstance();

        System.out.println("===\n" + service.getPostById(1));
        System.out.println("===\n" + service.getCommentById(2));
        System.out.println("===\n" + service.getAlbumById(3));
        System.out.println("===\n" + service.getPhotoById(4));
        System.out.println("===\n" + service.getUserById(5));
        System.out.println("===\n" + service.getTodoById(6));
        System.out.println("----------------------------------------");

        List<Post> posts = service.getPosts();
        List<Comment> comments = service.getComments();
        List<Album> albums = service.getAlbums();
        List<Photo> photos = service.getPhotos();
        List<User> users = service.getUsers();
        List<Todo> todos = service.getTodos();


        System.out.println("\nPosts(1): " + posts.get(0));
        System.out.println("\nComments(2): " + comments.get(1));
        System.out.println("\nAlbums(3): " + albums.get(2));
        System.out.println("\nPhotos(4): " + photos.get(3));
        System.out.println("\nUsers(5): " + users.get(4));
        System.out.println("\nTodos(6): " + todos.get(5));

    }
}
