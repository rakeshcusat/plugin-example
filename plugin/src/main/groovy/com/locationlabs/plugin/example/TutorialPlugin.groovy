package com.locationlabs.plugin.example

import org.gradle.api.Project
import org.gradle.api.Plugin

class TutorialPlugin implements Plugin<Project> {

	@Override
	void apply(Project target) {
		target.task('tutorialPluginTask', type: TutorialExampleTask) 
	}
}