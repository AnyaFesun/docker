FROM python:3.12.2-slim-bullseye

WORKDIR /app

COPY . .

RUN pip install pip-tools

RUN pip-compile /app/requirements/backend.in

RUN pip install --no-cache-dir -r /app/requirements/backend.txt

CMD ["uvicorn", "spaceship.main:app", "--host=0.0.0.0", "--port=8080"]