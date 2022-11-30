down:
	docker compose down --volumes
stop:
	docker compose stop
up:
	docker compose up -d
build:
	docker compose build
db:
	docker compose exec db bash
logs:
	docker compose logs
ps:
	docker compose ps -a
