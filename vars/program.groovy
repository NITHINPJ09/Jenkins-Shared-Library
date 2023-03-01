def call() {
 sh 'cd /tmp/library'
 javac Welcome.java
 java Welcome
}
