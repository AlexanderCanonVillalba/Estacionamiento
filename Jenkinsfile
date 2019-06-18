stage('Checkout'){
steps{
echo "------------>Checkout<------------"
checkout([$class: 'GitSCM', branches: [[name: '*/master']],
doGenerateSubmoduleConfigurations: false, extensions: [], gitTool:
'Git_Centos', submoduleCfg: [], userRemoteConfigs: [[credentialsId:
'GitHub_alexander10', url:'https://github.com/AlexanderCanonVillalba/Estacionamiento']]])
}
}

stage('Unit Tests') {
steps{echo "------------>Unit Tests<------------"
sh 'gradle --b ./build.gradle test'}
}

