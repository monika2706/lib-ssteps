def call(Map params) {

    checkout([
        $class: 'GitSCM',
        echo "${params.NAME}"
        userRemoteConfigs: [[ url: "${params.NAME ]]
    ])
  }
