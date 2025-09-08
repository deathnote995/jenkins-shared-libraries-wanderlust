def call(){
  timeout(time: 1,units: "MINUTES"){
    waitForQualityGate abortPipeline: false
  }
}
