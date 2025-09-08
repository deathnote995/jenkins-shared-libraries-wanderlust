def call(String ImageTag, String dockerhubuser, String Project){
  withCredentials([usernamePassword(credentialId:'dockerHubCredential', usernameVariable:'dockerhubuser',passwordVariable:'dockerhubpass')]){
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
