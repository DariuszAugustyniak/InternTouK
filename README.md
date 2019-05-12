# InternTouK
Otwieramy CMD w pliku głównym 

Budujemy aplikację za pomocą
 ./mvnw clean install
 
Uruchamiamy za pomocą
./mvnw spring-boot:run

Użytkownik wybiera dzień i godzinę po której ma otrzymać listę seansów screening/rok/miesiąc/dzień/godzina/minuta 

curl -X GET -i http://localhost:8080/screening/2019/12/10/12/00

po wybraniu seansu po ID i podaniu innych danych wysyłamy request, który zostanie sprawdzony

curl -X PUT -H 'Content-Type: application/json' -i http://localhost:8080/screening/request --data '{
  "name": "Janowl",
  "surname": "Kowalowa",
  "type": "STUDENT",
  "seatRequest": {
    "row": 3,
    "collumn": 3,
    "id": 327
  }
}'
 