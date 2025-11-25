def call() {
  
    sh """
      
      docker tag cicd_django_notes_app-django_app:latest $USER/django-notes-app:latest
      docker push $USER/django-notes-app:latest
    """
  
}

