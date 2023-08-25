**Use Case**: Receiving Health Services:

1. Member provides member card to provider
2. Provider swipes member card in card reader
3. Terminal dials data center
4. Data center verifies member number
   - If number is valid, Validated appears on terminal screen
   - If number is not valid,
   - If number is valid and member owes monthly fees, Member suspended appears on screen

# Use Case - Bill ChocAn (after services have been provided)

1. Provider scans member card with card reader or manually enters member number
2. Provider enters service date
   - Potential Errors: Hardware or other difficulties prevent the provider from billing ChocAn immediately after service
3. Provider looks up service code in the Provider Directory
4. Provider enters the service code
5. Software displays the name of the service for the given service code (max 20 characters for service name)
   - If nonexistent code given, error message is printed
6. Provider verifies service was correctly entered
7. Provider can add comments about the service
8. Software Product now writes record to disk
9. Software Product looks up service fees for service and displays it
10. Provider fills out service form
11. End of the week, provider totals the fees to verify amount to be received from ChocAn

# Use Case - Request the software product for a Provider Directory

1. Provider can request a provider directory
2. The provider will receive it in an email

# Use Case - Weekly main accounting procedure run at ChocAn Data Center

1. Data Center reads a week's file of services and uprints a number of reports.
2. Manager can request a report to be run individually at any time of the week.
3. Each member that consulted with a provioder recieves an email attachment containing a list of services provided to them.
4. Each provider that bills ChocAn recieves an email attachment containing a list of services that he or she provided to a ChocAn member.

# Use Case - ChocAn Data Center operators

1. Operators are able to: add members, delete members, update member records.
2. Operators are also able to: add provider records, delete provider records and update provider records.

# Use Case - Acme Computer
<<<<<<< HEAD:Team7_Requirements/Use_Cases.md
1. Acme computer updates the ChocAn data center membership records at 9PM
=======

1. Acme computer updates the ChocAn data center membership records
>>>>>>> 4b578f5a357b7e0ded7db40642dc97fe117b2c2f:Team7_Requirements/old_p1_files/old_use_cases.md
