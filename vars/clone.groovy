def call(String url, String branch) {
  echo "Cloning code...."
  git url: "${url}", branch: "${branch}"
