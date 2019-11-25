// Using InputStreamReader

import java.io.*;
public class DAYFINDER
{
public static void main()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int YEAR,MONTH,DATE,DAY,SUM,YEARCODE,MONTHCODE,SUBTRACTIONNUMBER,DIFFERENCE;YEARCODE=0;MONTHCODE=0;
System.out.println("Enter the year");
YEAR = Integer.parseInt(br.readLine());
if(YEAR == 2000||YEAR == 2006||YEAR == 2017||YEAR == 2023||YEAR == 2028||YEAR == 2034||YEAR == 2045||YEAR == 2045||YEAR == 2051||YEAR == 2056||YEAR == 2062||YEAR == 2073||YEAR == 2079||YEAR == 2084||YEAR == 2090)
{YEARCODE = 0;}
if(YEAR == 2001||YEAR == 2007||YEAR == 2012||YEAR == 2018||YEAR == 2029||YEAR == 2035||YEAR == 2040||YEAR == 2046||YEAR == 2057||YEAR == 2063||YEAR == 2068||YEAR == 2074||YEAR == 2085||YEAR == 2091||YEAR == 2096||YEAR == 1900||YEAR == 1906||YEAR == 1917||YEAR == 1923||YEAR == 1928||YEAR == 1934||YEAR == 1945||YEAR == 1951||YEAR == 1956||YEAR == 1962||YEAR == 1973||YEAR == 1979||YEAR == 1984||YEAR == 1990)
{YEARCODE = 1;}
if(YEAR == 2002||YEAR == 2013||YEAR == 2019||YEAR == 2024||YEAR == 2030||YEAR == 2041||YEAR == 2047||YEAR == 2052||YEAR == 2058||YEAR == 2069||YEAR == 2075||YEAR == 2080||YEAR == 2086||YEAR == 2097||YEAR == 1907||YEAR ==1912||YEAR == 1918||YEAR == 1929||YEAR == 1935||YEAR == 1940||YEAR == 1946||YEAR == 1957||YEAR == 1963||YEAR == 1968||YEAR == 1974||YEAR == 1985||YEAR == 1991||YEAR == 1996)
{YEARCODE = 2;}
if(YEAR == 2003||YEAR == 2008||YEAR == 2014||YEAR == 2025||YEAR == 2042||YEAR == 2053||YEAR == 2059||YEAR == 2081||YEAR == 2087||YEAR == 2092||YEAR == 2098||YEAR == 2031||YEAR == 2036||YEAR == 2064||YEAR == 2070||YEAR == 1902||YEAR == 1913||YEAR == 1919||YEAR == 1924||YEAR == 1930||YEAR == 1941||YEAR == 1947||YEAR == 1952||YEAR == 1958||YEAR == 1969||YEAR == 1975||YEAR == 1980||YEAR == 1986||YEAR == 1997)
{YEARCODE = 3;}
if(YEAR == 2009||YEAR == 2015||YEAR == 2020||YEAR == 2026||YEAR == 2037||YEAR == 2043||YEAR == 2048||YEAR == 2054||YEAR == 2065||YEAR == 2071||YEAR == 2076||YEAR == 2082||YEAR == 2093||YEAR == 2099||YEAR == 1903||YEAR == 1908||YEAR == 1914||YEAR == 1925||YEAR == 1942||YEAR == 1953||YEAR == 1959||YEAR == 1981||YEAR == 1987||YEAR == 1992||YEAR ==1998||YEAR == 1931||YEAR ==1936||YEAR == 1964||YEAR == 1970)
{YEARCODE = 4;}
if(YEAR == 2004||YEAR == 2010||YEAR == 2021||YEAR == 2027||YEAR == 2032||YEAR == 2038||YEAR == 2049||YEAR == 2055||YEAR == 2060||YEAR == 2066||YEAR == 2077||YEAR == 2083||YEAR == 2088||YEAR == 2094||YEAR == 1909||YEAR == 1915||YEAR == 1920||YEAR == 1926||YEAR == 1937||YEAR == 1943||YEAR == 1948||YEAR == 1954||YEAR == 1965||YEAR == 1971||YEAR == 1976||YEAR == 1982||YEAR == 1993||YEAR == 1999)
{YEARCODE = 5;}
if(YEAR == 2005||YEAR == 2011||YEAR == 2016||YEAR == 2022||YEAR == 2033||YEAR == 2039||YEAR == 2044||YEAR == 2050||YEAR == 2061||YEAR == 2067||YEAR == 2072||YEAR == 2078||YEAR == 2089||YEAR == 2095||YEAR == 1904||YEAR == 1910||YEAR == 1921||YEAR == 1927||YEAR == 1932||YEAR == 1938||YEAR == 1949||YEAR == 1955||YEAR == 1960||YEAR == 1966||YEAR == 1977||YEAR == 1983||YEAR == 1988||YEAR == 1994)
{YEARCODE = 6;}
if(YEAR == 1905||YEAR == 1911||YEAR == 1916||YEAR == 1922||YEAR == 1933||YEAR == 1939||YEAR == 1944||YEAR == 1950||YEAR == 1961||YEAR == 1967||YEAR == 1972||YEAR == 1978||YEAR == 1989||YEAR == 1995)
{YEARCODE = 7;}
System.out.println("      ");
System.out.println("JANUARY = 1st  month,so enter 1");
System.out.println("FEBRUARY = 2nd month, so enter 2 ");
System.out.println("MARCH = 3rd  month, so enter 3 ");
System.out.println("APRIL = 4rth  month, so enter 4 ");
System.out.println("MAY = 5th  month, so enter 5 ");
System.out.println("JUNE = 6th  month, so enter 6 ");
System.out.println("JULY = 7th  month, so enter 7 ");
System.out.println("AUGUST = 8th  month, so enter 8 ");
System.out.println("SEPTEMBER = 9th  month, so enter 9 ");
System.out.println("OCTOBER = 10th  month, so enter 10 ");
System.out.println("NOVEMBER = 11th  month, so enter 11 ");
System.out.println("DECEMBER = 12th month, so enter 12 ");
System.out.println("      ");
System.out.println("Enter the month's number");
MONTH = Integer.parseInt(br.readLine());
if(MONTH == 8)
{MONTHCODE = 1;}
if(MONTH == 2||MONTH == 3||MONTH == 11)
{MONTHCODE = 2;}
if(MONTH == 6)
{MONTHCODE = 3;}
if(MONTH == 9||MONTH == 12)
{MONTHCODE = 4;}
if(MONTH == 4||MONTH == 7)
{MONTHCODE = 5;}
if(MONTH == 1||MONTH == 10)
{MONTHCODE = 6;}
if(YEAR%4 == 0 && MONTH == 1)
{MONTHCODE = 5;}
if(YEAR%4 == 0 && MONTH == 2)
{MONTHCODE = 1;}
System.out.println("Enter the date");
DATE = Integer.parseInt(br.readLine());
SUM = DATE + MONTHCODE + YEARCODE;
SUBTRACTIONNUMBER = SUM/7*7;
DIFFERENCE = SUM - SUBTRACTIONNUMBER;
if(DIFFERENCE == 1)
System.out.println("MONDAY");
if(DIFFERENCE == 2)
System.out.println("TUESDAY");
if(DIFFERENCE == 3)
System.out.println("WEDNESDAY");
if(DIFFERENCE == 4)
System.out.println("THURSDAY");
if(DIFFERENCE == 5)
System.out.println("FRIDAY");
if(DIFFERENCE == 6)
System.out.println("SATURDAY");
if(DIFFERENCE == 7||DIFFERENCE == 0)
System.out.println(" SUNDAY");
}
}
