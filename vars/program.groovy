def call() {
 sh 'cd /tmp/library'
 sh '/tmp/library/test.sh'
 sh 'ls -l'
 sh 'pwd'
}
