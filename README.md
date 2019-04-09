# Simple Upload-Download REST Server

## Build and Run
  Use the following command to build docker image

  - `docker build -t imageName .`

  Use the following command to run docker image (it will expose 8000 on docker host)
  
  - `docker run --rm -p 8000:8001 imageName`

## Testing

  - To test upload, use curl to upload test data e,g.
  `curl -i -v -F id=1234 -F file=@something.txt http://localhost:8000/upload`
  Note: makesure something.txt is on your current path
  
  - To test download, use curl or your browser since it is GET 
  `curl http://localhost:8000/something.txt`
