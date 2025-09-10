def call(){
  dependencyCheck additionalArguments: '--scan ./ --disableYarnAudit', odcInstallation: 'OWASP'
  // dependencyCheckPublisher pattern: '**/dependency-check-report.xml', stopBuildOnFailure: false
    catchError(buildResult: 'UNSTABLE', stageResult: 'FAILURE') {
        dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
    }
}
