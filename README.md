# EduGraph-Process-SchemaEngineering
## Contributors
Sebastion Blossey
Philip Vojkovic


---Process Description---

--BPMN--
-Steering Committee-
The Process starts with a received Change Request (CR). After that the CR gets classified by the DMN process. A community discussion starts on the CR. After one week, it is verified if the discussion is still based on the CR. After the verification, a decision is made if the discussion continues or will be interrupted by the Steering Committee. This decision will be reviewed in the next step and an additional decision is made if the results are usable as a CR or not. If not, the whole CR is canceled. If working on the CR is supposed to be continued, a new discussion is initiated. If the results are usable as a change all results are send to the Project Webmaster und the Steering Committee waits for a notification of success.
If after two weeks no notification of success is received a reminder is send to the Project Webmaster.

-Project Webmaster-
The Project Webmaster starts the implementation of the CR. He revises the CR and places him in the update queue. If the CR cannot be implemented the Project Webmaster is revising the CR again and waits for two days before putting the CR again in the update queue. Now the CR can be implemented and a notification of success is send to the Steering Committee.
The reminder of the Steering Committee is checked on urgency. If the CR is very urgent it is immediately implemented. If not, the CR is placed in the usual update queue.

--CMMN--
The CMMN-Prozess contains the schema documentation, three stages and three milestones.
In the first stage the CR is created. It is complete if the owner of the CR has done at least one of the following four tasks. These Tasks are called: Brainstorming, look at former CRs, asking the community for ideas or calling for friends and family members who might have an idea. The Milestone name is: CR created.
The next Stage contains the controlling of the CR. Therefore, the owner has to at least check his own work. Furthermore, he can choose three optional tasks. These tasks are:  Ask Friends and Familiy to look over his CR, hire an external to check the CR or asks the community. The Milestone is: CR checked.
After that, the Stage CR publishing is opened. On this stage the owner has to publish the CR in the community. If he is not able to do it by himself then he may ask someone to publish the CR on his behalf. He can also send the CR to the software developer who then takes care of the publishing.

--DMN--
In the beginning of the process, the change request needs to be classified. This is realized through two input parameters.
1)Change already submitted (boolean)
2) Change category (String)


---Resources---
*BPMN Model
*DMN Model
*CMMN Model (not imlemented)


---Forms---
*cr-anpassen
*cr-umsetzen
*erfolgs-best
*implement
*klassifizieren
*mahnung-schreiben
*pruefe-mahnung
*queue
*review-results
*start-process
*themenbezug-pruefen
