/* Author: Danish Siddiqui, MAC OX Operating System, Eclipse  09/13/2019
 * This Java program lets a user to input a search keyword and finds the desirable definition of that 
 * dictionary and presents it to the console.  
 * If the search keyword is not present in the dictionary, then it says <not found> and quits the program
 * when the user inputs !Q. 
 * */

//import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaDictionary {

	//this enum class stores all the given data for the dictionary. 
	//this data will not be changed 
	enum Dictionary{
		ARROW("Arrow [noun] : Here is one arrow: <IMG> -=>> </IMG>"),
		
		LOADDATA("! Loading data..."),
	    LOADCOMPLETED("! Loading completed..."),
		DICT("-----DICTIONARY 340 JAVA----"),
		OOPS("<arguments must be a part of a speech or \"distinct\">"),
		SEARCH("Search: "),

		ADJECTIVE("Distinct [adjective] : Familiar. Worked in Java."),
		ADJECTIVE1("Distinct [adjective] : Unique. No duplicates. Clearly different or of a different kind."),
		ADVERB("Distinct [adverb] : Uniquely. Written \"distinctly\""),
		NOUN1("Distinct [noun] : A keyword in this assignment."),
		NOUN2("Distinct [noun] : An advanced search option."),
		NOUN3("Distinct [noun] : Distinct is a parameter in this assignment."),
		
		ADJECTIVEP("Placeholder [adjective] : To be updated..."),
	    ADVERBP("Placeholder [adverb] : To be updated..."),
	    CONJUNCTIONP("Placeholder [conjunction] : To be updated..."),
	    INTERJECTIONP("Placeholder [interjunction] : To be updated..."),
	    NOUNP("Placeholder [noun] : To be updated..."),
	    PREPOSITIONP("Placeholder [preposition] : To be updated..."),
	    PRONOUNP("Placeholder [pronoun] : To be updated..."),
	    VERBP("Placeholder [verb] : To be updated..."),
		
	    ADJCSC220("CSC220 [adjective] : Ready to create complex data structures."),
		VERBCSC220("CSC220 [verb] : To create data structures."),

		ADJCSC340("CSC340 [adjective] : = C++ version of CSC210 + CSC220 + more."),
		NOUNCSC340("CSC340 [noun] : A CS upper division course."),
		NOUNCSC3401("CSC340 [noun] : Many hours outside of class."),
		NOUNCSC3402("CSC340 [noun] : Programming Methodology."),
		

		NOUNBOOK("Book [noun] : A set of pages."),
		NOUNBOOK1("Book [noun] : A written work published in printed or electronic form."),
		VERBBOOK("Book [verb] : To arrange for someone to have a seat on a plane."),
		VERBBOOK1("Book [verb] : To arrange something on a particular date."),
		
		NOUNADV("Adverb [noun] : Adverb is a word that adds more information about place, time, manner, cause or\n"
				+ "degree to a verb, an adjective, a phrase or another adverb."),
					
		NOUNADJ("Adjective [noun] : Adjective is a word that describes a person or thing, for example big, red and\n" + 
				"clever in a big house, red wine and a clever idea."),
		
		NOUNINT("Interjection [noun] : Interjection is a short sound, word or phrase spoken suddenly to express an\n" + 
				"emotion. Oh!, Look out! and Ow! are interjections."),
		
		NOUNN("Noun [noun] : Noun is a word that refers to a person, (such as Ann or doctor), a place (such as Paris\n" + 
				"or city) or a thing, a quality or an activity (such as plant, sorrow or tennis."),
		
		NOTFOUND("<Not found>"),
		END("-----THANK YOU-----");
		
		//declaring a private string variable to store all the data which is given in string
		private String word;

		//a constructor that takes only one argument
	    Dictionary(String w) { this.word = w; }

	    //get the data, store it in word, and make it accessible through out the program
	    public String getValue() { return word; }
	    
			
	}
	
	//main method
	public static void main(String[] args) {

		//prints "loading data"
		System.out.println(Dictionary.LOADDATA.getValue());
		
		/*the data from enum is being loaded into several ArrayLists
		 *Each ArrayList loads exact amount of data that is presented into sample output
		 *All data sections will be given a separate object to be used in the linkedHashMap
		 * */
		
		 List<String> arrow = new ArrayList<>();
		 arrow.add(Dictionary.ARROW.word);
	
		 List<String> distinct = new ArrayList<>();
		 distinct.add(Dictionary.ADJECTIVE.word);
		 distinct.add(Dictionary.ADJECTIVE1.word);
		 distinct.add(Dictionary.ADVERB.word);
		 distinct.add(Dictionary.NOUN1.word);
		 distinct.add(Dictionary.NOUN1.word);
		 distinct.add(Dictionary.NOUN1.word);
		 distinct.add(Dictionary.NOUN2.word);
		 distinct.add(Dictionary.NOUN3.word);
		 

		 List<String> distinctd = new ArrayList<>();
		 distinctd.add(Dictionary.ADJECTIVE.word);
		 distinctd.add(Dictionary.ADJECTIVE1.word);
		 distinctd.add(Dictionary.ADVERB.word);
		 distinctd.add(Dictionary.NOUN1.word);
		 distinctd.add(Dictionary.NOUN2.word);
		 distinctd.add(Dictionary.NOUN3.word);
		
		 List<String> distinctn = new ArrayList<>();
		 distinctn.add(Dictionary.NOUN1.word);
		 distinctn.add(Dictionary.NOUN2.word);
		 distinctn.add(Dictionary.NOUN3.word);
		 
		 List<String> placeholder = new ArrayList<>();
		 placeholder.add(Dictionary.ADJECTIVEP.word);
		 placeholder.add(Dictionary.ADJECTIVEP.word);
		 placeholder.add(Dictionary.ADVERBP.word);
		 placeholder.add(Dictionary.CONJUNCTIONP.word);
		 placeholder.add(Dictionary.INTERJECTIONP.word);
		 placeholder.add(Dictionary.NOUNP.word);
		 placeholder.add(Dictionary.NOUNP.word);
		 placeholder.add(Dictionary.NOUNP.word);
		 placeholder.add(Dictionary.PREPOSITIONP.word);
		 placeholder.add(Dictionary.PRONOUNP.word);
		 placeholder.add(Dictionary.VERBP.word);
		 
		 List<String> placeholderadj = new ArrayList<>();
		 placeholderadj.add(Dictionary.ADJECTIVEP.word);
		 placeholderadj.add(Dictionary.ADJECTIVEP.word);

		 List<String> placeholderadj1 = new ArrayList<>();
		 placeholderadj1.add(Dictionary.ADJECTIVEP.word);
		 
		 List<String> placeholderdis = new ArrayList<>();
		 placeholderdis.add(Dictionary.ADJECTIVEP.word);
		 placeholderdis.add(Dictionary.ADVERBP.word);
		 placeholderdis.add(Dictionary.CONJUNCTIONP.word);
		 placeholderdis.add(Dictionary.INTERJECTIONP.word);
		 placeholderdis.add(Dictionary.NOUNP.word);
		 placeholderdis.add(Dictionary.PREPOSITIONP.word);
		 placeholderdis.add(Dictionary.PRONOUNP.word);
		 placeholderdis.add(Dictionary.VERBP.word);

		 List<String> csc340dis = new ArrayList<>();
		 csc340dis.add(Dictionary.ADJCSC340.word);
		 csc340dis.add(Dictionary.NOUNCSC340.word);
		 csc340dis.add(Dictionary.NOUNCSC3401.word);
		 csc340dis.add(Dictionary.NOUNCSC3402.word);
		 
		 List<String> csc340noun = new ArrayList<>();
		 csc340noun.add(Dictionary.NOUNCSC340.word);
		 csc340noun.add(Dictionary.NOUNCSC3401.word);
		 csc340noun.add(Dictionary.NOUNCSC3402.word);

		 List<String> csc220adj = new ArrayList<>();
		 csc220adj.add(Dictionary.ADJCSC220.word);

		 List<String> csc220verb = new ArrayList<>();
		 csc220verb.add(Dictionary.VERBCSC220.word);
		 
		 List<String> bookdis = new ArrayList<>();
		 bookdis.add(Dictionary.NOUNBOOK.word);
		 bookdis.add(Dictionary.NOUNBOOK1.word);
		 bookdis.add(Dictionary.VERBBOOK.word);
		 bookdis.add(Dictionary.VERBBOOK1.word);
		 
		 List<String> adverb = new ArrayList<>();
		 adverb.add(Dictionary.NOUNADV.word);

		 List<String> adjective = new ArrayList<>();
		 adjective.add(Dictionary.NOUNADJ.word);

		 List<String> interjection = new ArrayList<>();
		 interjection.add(Dictionary.NOUNINT.word);

		 List<String> noun = new ArrayList<>();
		 noun.add(Dictionary.NOUNN.word);

		 List<String> end = new ArrayList<>();
		 end.add(Dictionary.END.word);

		 List<String> notfound = new ArrayList<>();
		 notfound.add(Dictionary.NOTFOUND.word);
		 
		 
	     LinkedHashMap<String, List<String>> dictionary = new LinkedHashMap<String, List<String>>();
	     dictionary.put("arROW", arrow);
	     dictionary.put("disTINct", distinct);
	     dictionary.put("distinct distinct", distinctd);
	     dictionary.put("disTINCT noun distinct", distinctn);
	     dictionary.put("pLACEholdER", placeholder);
	     dictionary.put("placehOLDER adjective", placeholderadj );
	     dictionary.put("PLACEholdER adjective distinct", placeholderadj1);
	     dictionary.put("placeHOLDER distinct", placeholderdis);
	     dictionary.put("csc340 distinct", csc340dis);
	     dictionary.put("csc340 noun", csc340noun);
	     dictionary.put("csc220 adjective distinct", csc220adj); 
	     dictionary.put("cSc220 verb", csc220verb);
	     dictionary.put("boOK distinct", bookdis);
	     dictionary.put("adVERB noun distinct", adverb);
	     dictionary.put("ADjecTIVE distinct", adjective);
	     dictionary.put("interJECTION noun distinct", interjection);
	     dictionary.put("NOUN noun", noun);
	     dictionary.put("end", end);
	     dictionary.put("not found", notfound);
	
	     //prints Loading completed
	     System.out.println(Dictionary.LOADCOMPLETED.getValue());
	     System.out.println();
	     //prints -----DICTIONARY 340 JAVA----
	     System.out.println(Dictionary.DICT.getValue());
	     System.out.println();
	
	   	 //using while loop to continuously ask the user for input
	     //until they inout !Q and terminates the program
	     while (true){
	    	 Scanner scanner = new Scanner(System.in);
	    	 
		        String userInput = null;

		        String search = null;
		        //prints "Search:"
		        System.out.print(Dictionary.SEARCH.getValue());

		        userInput = scanner.nextLine();
		             
	 //Takes user input and splits it
     //passes the input in searchInput method to search for the associated definition
     //in the dictionary
	 String[] arr=userInput.split("  ");

     if (arr.length==1) {

         search = arr[0];

         searchInput(search, null, dictionary);
         }

	     }
     }
	
	
	public static void searchInput(String value, String arg2, Map dictionary){

        System.out.println("   |");

        List<String> input =null;

        //If the user inputs !Q
        if (value.equalsIgnoreCase("!Q")){
            input = (List<String>)dictionary.get("end");

        }
        //if the user's input is one of the keys in LinkedHashMap
        else if (dictionary.containsKey(value)) {
         input = (List<String>)dictionary.get(value);

        }
        //if the key in not in LinkedHashMap, then print <not found>
        else input = (List<String>)dictionary.get("not found");

       
        //go through the data associated with the input search word
        input.stream().forEach(s -> {

        System.out.print("     ");
        // prints the data the searched output from the dictionary
        System.out.println(s);

        });

        System.out.println("   |");
        //if user inputs !Q
        if (value.equalsIgnoreCase("!Q")){
        //terminate the program
          System.exit(0);

        }
}
}
	
	
	