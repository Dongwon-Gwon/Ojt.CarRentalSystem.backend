# CarRentalSystem.backend
**자동차 렌탈 시스템**
## 객체
1. Car
2. User
3. Admin
4. RentalInfo  

##사용 기술 스택 목록
* Spring Boot
* Maven 빌드
* JPA
* MVC패턴 
* Restful API
* MySQL

## 이미지 빌드
```bash
# jar파일 생성
$ mvn clean package
$ java -jar target/{file-name}.jar

# 이미지 빌드
$ docker build --tag {image-name}:0.1 . # 이미지 생성
$ docker images  # 이미지 확인
$ docker run -d -p 8080:8080 {image-name}:0.1  # 이미지 실행
```