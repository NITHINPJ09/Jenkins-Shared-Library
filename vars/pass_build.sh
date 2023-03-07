def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    sh "./oddOrEven.sh ${config.name} ${config.dayOfWeek}"
}
