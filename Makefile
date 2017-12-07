app.kt:
	kotlinc ./src/app.kt -include-runtime -d ./out/app.jar

run: app.kt
	kotlin ./out/app.jar
