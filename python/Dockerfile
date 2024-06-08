FROM python:3.12.2-slim-bullseye

WORKDIR /app

COPY . .

RUN pip install -r ./requirements/backend.in


CMD ["uvicorn", "spaceship.main:app", "--host=0.0.0.0", "--port=8080"]