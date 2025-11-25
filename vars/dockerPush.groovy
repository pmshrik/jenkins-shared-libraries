def call() {
  withCredentials([usernamePassword(
      credentialsId: 'dockerHubCred',
      usernameVariable: 'USER',
      passwordVariable: 'PASS'
  )]) {

    sh """
      echo $PASS | docker login -u $USER --password-stdin
      docker tag django-notes-app $USER/django-notes-app:latest
      docker push $USER/django-notes-app:latest
    """
  }
}
