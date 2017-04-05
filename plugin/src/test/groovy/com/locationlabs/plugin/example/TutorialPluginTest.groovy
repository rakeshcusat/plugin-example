
package com.locationlabs.plugin.example;

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class TutorialPluginTest extends Specification {


	def "add task to the project"() {
		when:
		Project project = ProjectBuilder.builder().build()
		project.pluginManager.apply 'tutorialPlugin'

		then:
		project.tasks.tutorialPluginTask instanceof TutorialExampleTask
	}
}