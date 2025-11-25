def call(user) {
  sh """
    docker tag cicd_django_notes_app-django_app:latest ${user}/django-notes-app:latest
    docker push ${user}/django-notes-app:latest
  """
}


