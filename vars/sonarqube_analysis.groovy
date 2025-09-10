def call(String SonarQubeAPI, String Projectname, String ProjectKey){
  withSonarQubeEnv("${SonarQubeAPI}"){
     sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey} -X"
  }
}
// def call(String SonarQubeAPI, String Projectname, String ProjectKey) {
//   withSonarQubeEnv("${SonarQubeAPI}") {
//     def scannerHome = tool 'Sonar'  // matches the name from your screenshot
//     sh """
//       ${scannerHome}/bin/sonar-scanner \
//         -Dsonar.projectName=${Projectname} \
//         -Dsonar.projectKey=${ProjectKey} \
//         -Dsonar.host.url=$SONAR_HOST_URL \
//         -Dsonar.login=$SONAR_AUTH_TOKEN \
//         -X
//     """
//   }
// }
