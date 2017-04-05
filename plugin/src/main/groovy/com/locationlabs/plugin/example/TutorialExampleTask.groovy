package com.locationlabs.plugin.example


import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TutorialExampleTask extends DefaultTask {


	@TaskAction
	def doSomething(){
		doFirst {
			println "TutorialExampleTask doFirst"
		}
		doLast {
			println "TutorialExampleTask doLast"
		}
	}
}