## Overview
- application to expose rest apis for getting, adding and deleting products
- implemented using spring boot, spring data, spring web, h2 db 

##TODO
- Product search by category/ name etc need to be implemented
- Add product need to keep a count of products available, and there should be validation for added products
- need to enhance to have user login functionality (using spring security and redis server to store session and establish client connections, 
username and password can be stored to the in memory h2 db (or LDAP), where password is encrypted)
- Add other functionality to link user to cart and updating cart
- include validations, if store has sufficient items once items selected or checkout process started
- Add testcases for all