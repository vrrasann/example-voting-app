node{
    
    docker.withRegistry('https://dtrnodednsgqu3wspddbmle.eastus2.cloudapp.azure.com/', 'ddc-dtr-login') {
        git 'https://github.com/docker/example-voting-app.git'
        
         build 'Job-Result'
         build 'Job-Vote'
         build 'Job-Worker'
        
    }
    
}
