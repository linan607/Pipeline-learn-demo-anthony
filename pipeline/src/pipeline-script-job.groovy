import hudson.model.*;

println env.JOB_NAME
println env.BUILD_NUMBER
println env.WORKSPACE

pipeline{
	
	agent any
	stages{
		stage("init") {
			steps{
				script{
					println "欢迎来到Anthony的Pipeline教程。"
					model_test = load env.WORKSPACE + "/pipeline/module/pipeline-demo-module.groovy"
				}
			}
		}
		stage("Test Method") {
			steps{
				script{
					log_files = model_test.find_files('**/*.log')
				}
			}
		}
	}
}


