def call() {
  sh """
      docker tag django-notes-app $USER/django-notes-app:latest
      docker push $USER/django-notes-app:latest
      """
}
