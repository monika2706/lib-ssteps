def call(Map params) {

    checkout([
        $class: 'GitSCM',
        userRemoteConfigs: [[ url: "${params.NAME}"]]
    ])
  }
