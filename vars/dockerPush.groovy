def call() {
  sh """
    docker tag django-notes-app-django_app/$USER django-notes-app-django_app:latest
    docker push $USER django-notes-app-django_app:latest
    """
}
