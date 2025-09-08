def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialId:'dockerHubCredential', usernameVariable:'dockerhubuser',passwordVariable:'dockerhubpass')]){
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
