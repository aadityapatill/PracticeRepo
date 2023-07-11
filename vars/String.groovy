def call(List<String> msg) {
    msg.each { message ->
        echo "- $msg"
    }
}
