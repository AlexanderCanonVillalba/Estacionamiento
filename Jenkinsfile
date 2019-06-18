
pipeline {
 agent {
 label 'Slave_Induccion'
 }

options {
//Mantener artefactos y salida de consola para el # específico de ejecuciones
recientes del Pipeline.
buildDiscarder(logRotator(numToKeepStr: '3'))
//No permitir ejecuciones concurrentes de Pipeline
disableConcurrentBuilds()
 }

 tools {
 jdk 'JDK8_Centos' //Preinstalada en la Configuración del Master
 gradle 'Gradle4.5_Centos' //Preinstalada en la Configuración del Master
 }

stages{
 stage('Checkout') {
 steps{
 echo "------------>Checkout<------------"
 
 checkout([$class: 'GitSCM', branches: [[name: '*/master']],doGenerateSubmoduleConfigurations: false, extensions: [], gitTool:'Git_Centos', submoduleCfg: [], 
 userRemoteConfigs: [[credentialsId:'GitHub_Alexander10', 
 url:'https://github.com/AlexanderCanonVillalba/Estacionamiento']]])}
 }
 }
 
 stage('Unit Tests') {
 steps{
 echo "------------>Unit Tests<------------"
 sh 'gradle --b ./build.gradle test'
 }
 }
 
 stage('Integration Tests') {
 steps {
 echo "------------>Integration Tests<------------"
 }
 }
 
 
 stage('Static Code Analysis') {
	 steps{
	 echo '------------>Análisis de código estático<------------'
	 
	   }
	  }
	  
	 stage('Build') {
	 steps {
	 echo "------------>Build<------------"
	 }
	}
 }
 
 
	 post {
	 always {
	 echo 'This will always run'
	 }
	 success {
	 echo 'This will run only if successful'
	 }
	 failure {
	 echo 'This will run only if failed'
	 }
	 unstable {
	 echo 'This will run only if the run was marked as unstable'
	 }
	 changed {
	 echo 'This will run only if the state of the Pipeline has changed'
	 echo 'For example, if the Pipeline was previously failing but is now successful'
	 }
	 }
	}
