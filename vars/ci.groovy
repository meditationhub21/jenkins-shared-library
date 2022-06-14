#!/usr/bin/env groovy

def call(String javaVersion = "java.8"){

    pipeline {
        agent any
        stages {
            stage('build step') {
                steps {
                    echo "Build stage is running"
                }
            }
            stage('test step') {
                steps {
                    echo "test stage is running"
                }
            }
            stage('deploy step') {
                steps {
                    echo "deploy stage is running"
                }
            }
        }
    }
}
