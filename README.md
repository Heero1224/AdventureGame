# AdventureGame
A GUI game following an adventure campaign

Planned development:

  	2Model/Controller/View
  
 Model1:
  
  	Holds current state of character
	Fields:
		String name
		int health
		String[] equipment
		String[] items
 
 Model2:
 	
 	Holds current state of world
	String[] citiesFound
	int fame
	int infamy
	int troubles
 
 Controller:
 
 	Modifies both models as necessary
 
 View:
 
 	Will eventually be a GUI but will also have a text version initially
