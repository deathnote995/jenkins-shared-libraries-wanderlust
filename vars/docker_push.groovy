def call(String Project, String ImageTag, String dockerhubuser){
   echo "About to log in with credentialId=dockerHubCredential for user ${dockerhubuser}"
  withCredentials([usernamePassword(credentialId:'dockerHubCredential', usernameVariable:'dockerUSER',passwordVariable:'dockerPASS')]){
    sh "docker login -u ${dockerUSER} -p ${dockerPASS}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
