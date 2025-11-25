def call(String url, String branch) { 
    echo "Cloning code from ${url} , branch: ${branch}"
    git url: url, branch: branch
}
