docker-compose -f docker-compose-local.yml up
명령어 실행 후 초기 init db 생성 용 sql 실행 안되면
1. docker exec -it [container id] bash
그냥 sql 스크립트를
2. mysql -uroot -p 로 실행
3. show databases;
4. use [certain databse name]
5. 복붙 후 실행