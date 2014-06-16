.PHONY: build deploy dev

build:
	bundle exec middleman build

deploy:
	bundle exec middleman deploy

dev:
	bundle exec middleman

