# Glossary:
- ChocAn: Chocoholics Anonymous
- Member: User of ChocAn, will have a member card
- Provider: Health care professionals that work with/for ChocAn and provides service to members, includes dietitians, internists, and exercise experts
- Member Number: A nine-digit number that is specific to each member
- Member Card: Plastic card that contains the member's name and their member number
- Terminal: Computer terminal that is responsible for connecting provider to ChocAn data center
- Provider number: A number that is specific to each provider
- Services: Health care services that are provided by ChocAn
- Card Reader: A card scanner built into the terminal that scans the member card
- Data Center: ChocAn data center that controls all backend operations
- Monthly Fees: Monthly ChocAn membership fee
- Service Date: Date the services were provided, in the format MM-DD-YYYY
- Service Code: a six digit code that stands for a service
- Provider Directory: A storage directory that has the six digit service code for every possible service
    - Potential Codes: 598470 - session with dietitian, 883948 - aerobics exercise session
- Record: A formatted output of a service transaction
```text
MM-DD-YYYY HH:MM:SS (Current Date and Time)
MM-DD-YYYY (Service Date)
XXXXXXXXX (9 digit Provider Number)
XXXXXXXXX (9 digit Member Number)
XXXXXX (6 digit Service Code)
*Optional* (100 character comments)
```
- Disk: A storage drive
- Service Fees: Fee for services provided by providers 
- Service Form: A form for providers to fill out after a service has been provided that includes: current date and time, the date the service was provided, member name and number, service code, and fee to be paid
- Provider Directory: an alphabetically ordered list of service names and their corresponding service codes and fees
- Main Accounting Procedure: another name for the Data Center backend or automatic server
- EFT: electronic fund transfer
- Manager: ChocAn head, in charge of paying providers
- Interactice Mode: A software state that allows operators to add new members, delete members, and update members.