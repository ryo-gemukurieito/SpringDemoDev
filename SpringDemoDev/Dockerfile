# Javaランタイムのベースイメージを指定
FROM openjdk:17-jdk-slim

# 作業ディレクトリを指定
WORKDIR /app

# アプリケーションのJARファイルをコンテナにコピー
COPY target/SpringDemoDev-0.0.1-SNAPSHOT.jar /app/app.jar

# コンテナが使用するポートを公開
EXPOSE 8080

# JARファイルを実行するコマンド
CMD ["java", "-jar", "/app/app.jar"]
