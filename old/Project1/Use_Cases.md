**Use case**: Update/Create Provider File

**Context**: Creates the weekly provider file

**Actors**: Provider

**Main Success Scenario**:

1. Provider opens up terminal
2. Provider enters provider number
3. Selects either update provider file or create provider file
4. New file is returned to the provider

**Extensions**:

2. Provider enter wrong provider number and an error pops up asking to re-enter code

---

**Use case**: Provider Service Code

**Context**: Provider asks for service code directory

**Actors**: Provider

**Main Success Scenario**:

1. Provider opens up terminal
2. Provider enters provider number
3. Provider then chooses for provider directory
4. Provider directory is returned to the provider

**Extensions**:

2. Provider enter wrong provider number and an error pops up asking to re-enter code

---

**Use case**: Weekly Schedule

**Context**: The automatic server / main accounting procedure runs generating the weekly reports for member and provider files

**Actors**: Automatic Server

**Main Success Scenario**:

1. It end of the week comes around
2. Automatic Server triggers weekly operation
3. A report is generated for both member and provider files

**Extensions**:

N/A

---

**Use case**: Add Service

**Context**: Provider adds service to member's account

**Actors**: Provider, Member

**Main Success Scenario**:

1. Provider opens up terminal
2. Provider enters provider number
3. Provider enters member number
4. Provider then chooses to add the service and enters the service code
5. Provider must confirm service and then the service is added to member file and weekly provider file

**Extensions**:

2. Provider enter wrong provider number and an error pops up asking to re-enter code
3. Provider enters wrong member number and Invalid Number appears on terminal screen
4. Provider enters member number and the member account is suspended due to fees
5. Provider enters invalid service code
6. Provider doesn't confirm service and operation ends

---

**Use case**: Generate Reports

**Context**: The manager generates reports for member and provider files

**Actors**: Manager

**Main Success Scenario**:

1. Manager opens up terminal
2. Manager then chooses to generate reports
3. A report is generated for both member and provider files

**Extensions**:

N/A

---

**Use case**: Add, update or delete provider files

**Context**: The Operator at any time can choose to add remove or update provider files

**Actors**: Operator

**Main Success Scenario**:

1. Operator opens up terminal
2. Operator then chooses to add/remove/update files
3. Provider files are updated based on choices

**Extensions**:

N/A

**Use case**: Add, update or delete member files

**Context**: The Operator at any time can choose to add remove or update member files

**Actors**: Operator

**Main Success Scenario**:

1. Operator opens up terminal
2. Operator then chooses to add/remove/update files
3. Member files are updated based on choices

**Extensions**:

N/A
