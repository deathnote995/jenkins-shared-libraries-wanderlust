def call(){
  timeout(time: 10,units: "MINUTES"){
    waitForQualityGate abortPipeline: false
  }
}
