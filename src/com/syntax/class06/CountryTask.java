package com.syntax.class06;

import java.util.Scanner;

public class CountryTask {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		Scanner input;
		String country;
		String language;
		input=new Scanner(System.in);
		System.out.println("Enter your country");
		country=input.next();
		language=input.nextLine();
		switch(country) {
		case "Antigua and Barbuda":
		case"Australia":
		case"The Bahamas":
		case"Barbados":
		case"Belize":
		case"Canada":
		case "Dominica":
		case "Grenada":
		case "Guyana":
		case "Ireland":
		case "Jamaica":
		case "New Zealand":
		case "St Kitts and Nevis":
		case "St Lucia":
		case "St Vincent and the Grenadines":
		case "Trinidad and Tobago":
		case "United Kingdom":
		case "United States of America":
			language="You speak English! How are you today?";
			break;
		case "Mexico":
		case "Colombia":
		case "Spain":
		case "Argentina":
		case "Venezuela":
		case "Peru":
		case "Chile":
		case "Ecuador":
		case"Cuba":
		case "Guatemala":
		case "Dominican Republic":
		case "Honduras":
		case "Bolivia":
		case "El Salvador":
		case "Nicaragua":
		case "PuertoRico":
		case"Costa Rica":
		case"Paraguay":
		case"Uruguay":
		case"Panama":
			language="You speak Spanish! ¿Qué tal?";
			break;
		case "France":
		case "Benin":
		case "Burkina Faso":
		case "Burundi":
		case "Cameroon":
		case "Chad":
		case "Ivory Coast":
		case "Democratic Republic of the Congo":
		case "Djibouti":
		case "Equatorial Guinea":
		case "Haiti":
		case "Madagascar":
		case "Mali":
		case "Monaco":
		case "Niger":
		case "Rwanda":
		case "Senegal":
		case "Seychelles":
		case "Togo":
		case "Vanuatu":
			language="You speak French! Je ne parle pas français.";
			break;
		case "Brazil":
		case "Angola":
		case "Mozambique":
		case "Portugal":
		case "Guinea-Bissau":
		case "East Timor":
		case "Cape Verde":
		case"São Tomé and Príncipe":
			language="You speak Portuguese!Desculpe-me por falar tão mal o português.";
			break;
		case "China": 
		case "Hong Kong": 
		case "Macau":                                      
		case "Malaysia": 
		case "Taiwan": 
		case "Singapore":                                  
		case "Tibet":  
			language="You speak Mandarin, Taiwanese, Fuzhou, Shanghainese, Cantonese or any other sub-dialects! Nǐhǎo! Nu ho!,Nóng hō!";
			break;
		case "Italy":
		case "San Marino":
		case "Switzerland":
		case "Vatican City":
			language="You speak Italian! Buona giornata!";
			break;
		case"Fiji":
		case"UAE":
			language="You speak Hindi! आप कैसे हैं";
			break;
		case"Algeria":
		case"Bahrain":
		case"Comoros":
		case "Egypt":
		case "Iraq":
		case "Jordan":
		case "Kuwait":
		case "Lebanon":
		case"Libya":
		case"Mauritania":
		case"Morocco":
		case"Oman":
		case"Qatar":
		case"Saudi Arabia":
		case"Somalia":
		case"Sudan":
		case"Syria":
		case"Tunisia":
		case"United Arab Emirates":
		case"Yemen":
		case"Palestine":
		case"Sahrawi Arab Democratic Republic":
		case"Somaliland":
		case"Zanzibar":
			language="You speak Arabic! anaa saäiid jiddan bimuqaabalatak.";
			break;
		case"Bangladesh":
			language="You speak Bengali! (তোরা) কেমন আছিস?";
			break;
		case"Russia":
		case "Belarus":
		case "South Ossetia":
		case"Transnistria":
		case"Donetsk People's Republic":
		case"Luhansk People's Republic":
			language="You speak Russian! Этот ученик заслуживает очень хорошей оценки за эту невероятную работу.";
			break;
		case "Germany":
		case "Austria": 
		case "Belgium":
		case"Liechtenstein":
		case "Luxembourg":
		language="You speak German! Ich spreche nicht viel Deutsch";
		break;
		case "North Korea":
		case"South Korea":
			language="You speak Korean! mahn-na-bwep-ge dwe-o-seo bahn-gahp-soum-ni-da.";
			break;
		case "Turkey":
		case "Cyprus":
		case "Kosovo":
		case"North Macedonia":
		case"Romania":
		language="You speak Turkish! Tanıştığıma memnun oldum";
		break;
		case "Vietnam":
			language="You speak Vietnamese!  Ban noi tieng anh duoc khong?";
			break;
		case "Greece":
			language="You speak Greek! πως σε λένε?";
			break;
		case "Ethiopia":
		language="You speak Amharic! መልካም ቀን ይሁንላችሁ።";
		break;
		default:
			language="Oops ... two situations may have happened. The first one: that you wrote an invalid entry or the second one: your country is not yet in our data base. I am pretty sure it was the first one.";
		}
		System.out.println(language);
	}

}
