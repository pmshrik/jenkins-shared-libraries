def call(String url, String branch) {
    echo "Cloning repository: ${url} on branch: ${branch}"

    checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[url: url]]
    ])
}
