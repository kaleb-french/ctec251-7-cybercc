# Journal
Write your Journal questions and notes here.

Phase 1-
The principle of least knowlege is implemented here by Main not being directly needing to know what the legacy firewall does, This will allow them to switch from a Legacy to a new firewall without changing anything in main just keep using the adapter to call to it.

Phase 2-
In this example I hardcoded them and referenced them from the code I just wrote. In a real world scenario each class could how a field with a ArrayList of the data used to lock down(IE the userAccess class could hold a list of Users that was locked, the networkTraffic class could hold a list of ports that were just block, and could be reverted with a rollback/undo command. manually keeping track of this leads to issues with human memeory and typing errors.

Phase 3-
The comand facade simplifies the main by doing all the heavy lifting. It calls the netTrafficController, The UserAccountControl, and the Ecryption service so all main has to do it call the one method and doesn't know or care about what happens behind the curtain. If you changed the NetController with another one, no code in main will have to change only the methods in the facade class will have to change.
