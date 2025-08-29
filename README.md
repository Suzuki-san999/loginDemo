[http://localhost:8080](http://localhost:8080)にアクセスすると
[http://localhost:8080/loginForm](http://localhost:8080/loginForm)に遷移する。


[http://localhost:8080/users](http://localhost:8080/users)にアクセスするとユーザー作成画面。
作成後、再度[http://localhost:8080](http://localhost:8080)にアクセスし、作成したユーザーでログインすると[http://localhost:8080/users](http://localhost:8080/users)に遷移する。

SecurityConfig.javaの.defaultSuccessUrlの記述のところをコントローラクラスのパスを指定すると自由なページに遷移できる。
現状は、HelloController.javaを作成し、hello.htmlに遷移するようにしている。

-今、application.propertiesに${DB_URL}とあるので、環境変数を設定する必要がある。-
ローカル環境であれば、windowsの環境変数にlocalhostと設定する。
aws環境なのであれば、あとで作成するzipファイルの中に.ebextensionsというディレクトリを作り、
option_settings:
  - namespace: aws:elasticbeanstalk:application:environment
    option_name: DB_URL
    value: database-1.xxx.amazonaws.com

この書き方でconfigファイルを作成する。
