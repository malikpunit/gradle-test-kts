import org.gradle.internal.snapshot.Snapshot

plugins {
    //java
    id("application")
    //id("org.flywaydb.flyway") version("9.8.1")

}

version  "1.0-SNAPSHOT"

application {
    //mainModule.set("org.example.Main")
    mainClass.set("TestSourceSet")
}

sourceSets {
    main{
        java {
            setSrcDirs(listOf("src/main/java","src/main/scala"))

        }
    }
}

dependencies {
    implementation("log4j:log4j:1.2.8")
    implementation("javax.xml.bind:jaxb-api:2.3.1")
    testImplementation("junit:junit:3.8.1")
}



/*
group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}*/


/*
tasks.register("hello_gradle") {
    doFirst{
        print("Hello, ")
    }
    doLast{
        println("Gradle!")
    }
}
*/
/*
tasks.register("hello_world") {

    dependsOn("hello_gradle")


    doFirst{
        print("Hello ")
    }
    doLast{
        println("World!")
    }
}*/
