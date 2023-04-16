multibranchPipelineJob('CI-Pipelines/cart') {
  branchSources {
    github {
      id('23232323') // IMPORTANT: use a constant and unique identifier
//      scanCredentialsId('github-ci')
      repository('shashang13/cart')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(20)
    }
  }
}