docker build --no-cache -t kotlindemo .

docker image ls

docker run --name runkotlinspring -p 8888:8080 -it kotlindemo