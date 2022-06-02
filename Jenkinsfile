//Pipeline for Create Continuous Integration and Continuous Delivery for IGRPWEB FRAMEWORK.
// This Pipeline Build a COMPLETE IGRP-FRAMEWORK, for a PARTIAL build consider the proper branch

pipeline{

	environment{
		projectName = "IGRP-Template"
		configs= "igrpweb-configs"
		registryURL = "https://registry.nosi.cv"
		registryBasePath = "igrpweb-opensource"
		registryIgrpPath = "/igrpwebopensource"
		registryCredential = "harbor-creds"
	}
    
    agent any
	
    stages{
	
		stage('Git Clone'){
			steps{
				git([url: 'http://git.nosi.cv/Iekini.fernandes/marcacao_consulta.git' , branch: 'features', credentialsId: '356c8c0d-9a55-42c2-aa63-4b2bd01d80ae'])
			}
		}

		stage('Send Database Config'){
			steps{
				sh 'cp ../$configs/hibernate-igrp-core.cfg.xml $projectName/src/main/resources/'
				sh 'cp ../$configs/pom.xml $projectName/'
				sh 'cp ../$configs/context.xml ./'
				sh 'cp ../$configs/tomcat-users.xml ./'
			}
		}

		stage('Mvn Clean'){
			steps{
				sh 'mvn clean'
			}
		}

		stage('Mvn Validate'){
			steps{
				sh "echo 'validate - validate the project is correct and all necessary information is available'"
				sh 'mvn clean validate'
			}
		}

		stage('Mvn Compile'){
			steps{
				sh 'mvn compile'
			}
		}

		stage('Mvn Migration'){
			steps{
				sh  'cd $projectName && mvn flyway:migrate'
			}
		}

		stage('Maven Test'){
			steps{
				sh 'mvn test'
			}
		}

		stage('Maven Package'){
			steps{
				sh 'mvn package'
			}
		}

		stage('Building Image'){
			steps{
				script{          
					dockerImage = docker.build registryBasePath + registryIgrpPath + ":$BUILD_NUMBER"
				}
			}
		}    

		stage('Push Image to Registry'){
			steps{
				script{
					docker.withRegistry( registryURL + '/' + registryBasePath, registryCredential, ){
						dockerImage.push()
					}
				}  
			}   
		}

		stage('Remove Unused docker image'){
			steps{
				script{          
					sh "docker rmi $registryBasePath" + "$registryIgrpPath" + ":$BUILD_NUMBER" 
				}   
			}
		}

		stage('Build to DEV Environment'){
			steps{
				rancherRedeploy alwaysPull: false, credential: 'teste', images: 'registry.nosi.cv/cicdjenkins/igrpweb:${BUILD_NUMBER}', workload: '/project/c-57dx6:p-dfwrn/workload/deployment:default:igrpweb-postgres-k8s'
			}
		}
		
    } 
	
}
