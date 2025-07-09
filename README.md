[http://localhost:8080](http://localhost:8080)にアクセスすると
[http://localhost:8080/loginForm](http://localhost:8080/loginForm)に遷移する。
[http://localhost:8080/users](http://localhost:8080/users)にアクセスするとユーザー作成画面。
作成後、再度[http://localhost:8080](http://localhost:8080)にアクセスし、作成したユーザーでログインすると[http://localhost:8080/users](http://localhost:8080/users)に遷移する。

SecurityConfig.javaの.defaultSuccessUrlの記述のところをコントローラクラスのパスを指定すると自由なページに遷移できる。
現状は、HelloController.javaを作成し、hello.htmlに遷移するようにしている。
