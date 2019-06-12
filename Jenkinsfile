stage('Checkout'){
steps{
echo "------------>Checkout<------------"
checkout([$class: 'GitSCM', branches: [[name: '*/master']],
doGenerateSubmoduleConfigurations: false, extensions: [], gitTool:
'Git_Centos', submoduleCfg: [], userRemoteConfigs: [[credentialsId:
'GitHub_yucaci24', url:'https://github.com/yucaci24/PC_MultiProjectGradle']]])
}
}

stage('Unit Tests') {
steps{echo "------------>Unit Tests<------------"
sh 'gradle --b ./build.gradle test'}
}

