multibranchPipelineJob('CI-Pipelines/cart') {
  branchSources {
    github {
      id('23232323') // IMPORTANT: use a constant and unique identifier
//      scanCredentialsId('github-ci')
      repository('cart')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(20)
    }
  }
}