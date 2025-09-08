def call(String Project, String ImageTag, String dockerhubuser){
  sh "docker build -t ${dockerhubuser}/${Project}:${ImageTag} ."
}
