#Дз18

Написать класс ApiService с использванием паттерна синглтон для доступа к API:

Пример:
        ApiService service = ApiService.getInstance();
        List


/posts    100 posts
/comments    500 comments
/albums    100 albums
/photos    5000 photos
/todos    200 todos
/users    10 users

Posts https://jsonplaceholder.typicode.com/posts/1
Comments https://jsonplaceholder.typicode.com/comments/1
Albums https://jsonplaceholder.typicode.com/albums/1
Photos https://jsonplaceholder.typicode.com/photos/1
Users https://jsonplaceholder.typicode.com/users/1
Todos https://jsonplaceholder.typicode.com/todos/1

Комментарии для поста №1:
https://jsonplaceholder.typicode.com/comments?postId=1

Для каждого:
- получить все
- получить по id

Для posts:
POST    /posts
PUT     /posts/1
DELETE  /posts/1
GET     /comments?postId=1
GET     /posts?userId=1
