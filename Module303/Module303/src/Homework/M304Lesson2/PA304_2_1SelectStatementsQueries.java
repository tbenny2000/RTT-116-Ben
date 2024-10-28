package Homework.M304Lesson2;

public class PA304_2_1SelectStatementsQueries {

    // Hackerrank Query #1 JAPANESE CITIES ATTRIBUTES
    // /*
    //    Enter your query here and follow these instructions:
    //    1. Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
    //    2. The AS keyword causes errors, so follow this convention: "Select t.Field From table1 t" instead of "select t.Field From table1 AS t"
    //    3. Type your code immediately after comment. Don't leave any blank line.
    //*/
    // Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.
    // The CITY table is described as follows:
    //  CITY
    // FIELD        TYPE
    // ID           NUMBER
    // NAME         VARCHAR(17)
    // COUNTRYCODE  VARCHAR(3)
    // DISTRICT     VARCHAR2(20)
    // POPULATION   NUMBER
    // ==== select * from city where COUNTRYCODE = 'JPN'; ======

    // Hackerrank Query #2 Japanese Cities' Names
    // Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.
    // Same table as above:
    // ===== select name from city where countrycode = 'JPN'; =====

    // Hackerrank Query #3 Select By ID
    // Query all columns for a city in CITY with the ID 1661.
    // Same table
    // ==== select * from city where id = '1661'; ====

    // Hackerrank Query #4 Weather Observation Station 1
    // Query a list of CITY in STATE from STATION table.
    // The STATION table is described as follows:
    // Field        Type
    // ID           NUMBER
    // CITY         VARCHAR(21)
    // STATE        VARCHAR(2)
    // LAT_N        NUMBER
    // LONG_W       NUMBER
    // where LAT_N is the northern latitude and LONG_W is the western longitude.
    // === select city, state from station; =====
}
