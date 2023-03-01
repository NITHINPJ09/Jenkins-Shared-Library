def call() {
 sh 'cd /tmp/library's
 sh 'ls -l'
 sh 'javac Welcome.java'
 sh 'java Welcome'
}
