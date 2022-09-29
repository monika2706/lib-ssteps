def call(Map params.NAME) {

    checkout([
        $class: 'GitSCM',
        echo "${params.NAME}"
        userRemoteConfigs: [[ url: "${params.NAME ]]
    ])
  }
