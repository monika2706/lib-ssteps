def call(Map params) {

    checkout([
        $class: 'GitSCM',
        bat "echo ${params.NAME}"
        userRemoteConfigs: [[ url: "${params.NAME ]]
    ])
  }
