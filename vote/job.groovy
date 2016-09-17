node{
    
    docker.withRegistry('https://dtrnodednsgqu3wspddbmle.eastus2.cloudapp.azure.com/', 'ddc-dtr-login') {
        git 'https://github.com/SattaRavi/example-voting-app.git'
    
        docker.build('admin/com.sysgain.voting-app.vote','./vote').push('latest')
    }
    
}
