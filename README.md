# Events
A Simple App to track events of college and take notes on them

<b> Problem Statement: </b>

For the last two years, due to the global pandemic, most of the events in our college is begin conducted online and due to the 
versatility of online events, the number of events has also been increased a lot and resulted in lots of unheard events, 
multiple events in the same timing and finally leads to forgetting the events. 

<b> Proposed Solution : </b>

This project proposes an “Event App” to keep track of all the events of our college and provides all the information about the particular Event.
It also includes features like note taking . This App provides Google Sign for authentication. It lists all the events on a single screen and 
on clicking the particular event it provides the complete details of the application along with its meeting link.
This App also has a notes section where you can take notes of the events and can be referenced later.


<b> Screenshots : </b>

<img width="200" height="433" src="./assets/images/screenshots/Event SS-1.jpg">           <img width="200" height="433" src="./assets/images/screenshots/Event SS-2.jpg">           <img width="200" height="433" src="./assets/images/screenshots/Event SS-3.jpg">
<img width="200" height="433" src="./assets/images/screenshots/Event SS-4.jpg">           <img width="200" height="433" src="./assets/images/screenshots/Event SS-5.jpg">           <img width="200" height="433" src="./assets/images/screenshots/Event SS-6.jpg">
<img width="200" height="433" src="./assets/images/screenshots/Event SS-7.jpg">           <img width="200" height="433" src="./assets/images/screenshots/Event SS-8.jpg">           <img width="200" height="433" src="./assets/images/screenshots/Event SS-9.jpg">
<img width="200" height="433" src="./assets/images/screenshots/Event SS-10.jpg">           <img width="200" height="433" src="./assets/images/screenshots/Event SS-11.jpg">           <img width="200" height="433" src="./assets/images/screenshots/Event SS-12.jpg">

<b> Functionality & Concepts used : </b>

The App has a very simple and interactive interface which helps the students search their desired book and preview online. Following are few android concepts used to achieve the functionalities in app :

- `Constraint Layout` : All of the activities in the app uses a flexible constraint layout, which is easy to handle for different screen sizes.
- `Recyclerview` :  To present the list of different events and notes, we used the efficient recyclerview. 
- `LiveData & Room Database` : We are also using LiveData to create & store notes of a particular person and update it to local databases using Room.
- `Firebase Firestore` : In addition to room database we also use firestore to store the events database online
- `Firebase Authentication`: The App uses google sign-in as a method of authentication

<b> Application Link & Future Scope : </b>

The app is currently in the Alpha testing phase with SKCT institute with a limited no. of users,
You can access the app : 
Once the app is fully tested and functional in SKCT institute, we plan to make a common app where different colleges will be able to access their respective college's events.
[Download Here](release.apk)
