def call(String Project, String ImageTag, String dockerhubuser){
   echo "About to log in with credentialsId=dockerHubCredential for user ${dockerhubuser}"
  withCredentials([usernamePassword(credentialsId:'dockerHubCredential', usernameVariable:'dockerUSER',passwordVariable:'dockerPASS')]){
    sh "docker login -u ${dockerUSER} -p ${dockerPASS}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
