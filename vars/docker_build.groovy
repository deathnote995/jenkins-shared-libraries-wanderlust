def call(String dockerhubuser, String Project, String ImageTag){
  sh "docker build -t ${dockerhubuser}/${Project}:${ImageTag} ."
}
