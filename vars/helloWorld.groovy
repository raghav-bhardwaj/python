def call() {
  sh 'echo checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '4f04306a-4af7-493c-9635-da71f3e4547a', url: 'https://github.com/raghav-bhardwaj/python/']])'
}
