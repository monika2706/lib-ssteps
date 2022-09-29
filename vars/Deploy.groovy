def call() {
  bat "copy target\\addressbook.war \"${tomcatWeb}\\addressbook.war\""
}
