[http://localhost:8080](http://localhost:8080)にアクセスすると
http://localhost:8080/loginFormに遷移する。
http://localhost:8080/usersにアクセスするとユーザー作成画面。
作成後、再度http://localhost:8080にアクセスし、作成したユーザーでログインするとhttp://localhost:8080/helloに遷移する。

SecurityConfig.javaの.defaultSuccessUrlの記述のところをコントローラクラスのパスを指定すると自由なページに遷移できる。
現状は、HelloController.javaを作成し、hello.htmlに遷移するようにしている。
