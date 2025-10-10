**Project Proposal: Dota Hero Matchup Helper**



**Intro/Scenario**

In every Dota 2 patch, the balance of the game changes and certain heroes become stronger than others. These “meta heroes” are usually the ones picked often in pubs and tournaments. Knowing how to counter these heroes is important, but it can be difficult to remember all the matchups.



This project will create a simple program that helps players identify counter picks for the current patch’s meta heroes. The program is not meant to cover all 120+ heroes in the game. Instead, it will focus only on 15–20 meta heroes from the latest patch so the scope is manageable but still useful.



**Features / Use Cases**

1. Meta Hero Pool



&nbsp;	The system will only include a limited list of 15–20 meta heroes.

&nbsp;	Players can see the available list before using the program.



2\. Counter Suggestions



&nbsp;	When the user inputs an enemy hero name, the program will suggest counter heroes from the available pool.



3\. Error Handling



&nbsp;	If a user enters a hero outside the pool, the program will remind them of the heroes included.



3\. Multiple Queries



&nbsp;	The user can check counters for different heroes in the same session.

&nbsp;	There will also be an “exit” option to quit the program.



**How It Will Be Implemented**



Design:



&nbsp;	A Hero class will store the hero’s name, role (carry, support, mid, etc.), and a list of counters.

&nbsp;	A CounterSystem class will manage the hero pool and provide methods to display available heroes, search for a hero, and show 	counters.



User Interaction:



&nbsp;	Console-based program.

&nbsp;	At startup, it will show the list of heroes included.

&nbsp;	User enters a hero name to get counter suggestions.



Scope:



&nbsp;	Limited to 15–20 meta heroes from the current patch.

&nbsp;	Counters will be based on general community knowledge and guides.

&nbsp;	Program is meant for practice and demonstration, not professional use.

