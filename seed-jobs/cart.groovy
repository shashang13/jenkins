multibranchPipelineJob('example') {
  branchSources {
    git {
      id('123456789') // IMPORTANT: use a constant and unique identifier
      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(20)
    }
  }
}