def call( )
stage("codecompile & package"){
steps{
bat "mvn clean"
bat "mvn compile"
bat "mvn package"
}
}
