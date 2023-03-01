def call() {
 sh 'javac /tmp/library/Welcome.java'
 sh 'java /tmp/library/Welcome'
 sh 'pwd'
 sh 'ls -l'
}
