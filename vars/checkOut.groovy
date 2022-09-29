def call(Map params) {

    checkout([
        $class: 'GitSCM',
        git url: "${params.NAME}"
        // userRemoteConfigs: [[ url: "${params.NAME}"]]
    ])
  }
