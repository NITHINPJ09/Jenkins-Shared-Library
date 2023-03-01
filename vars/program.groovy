def call() {
 sh 'cd /tmp/library'
 sh 'javac Welcome.java'
 sh 'java Welcome'
}
