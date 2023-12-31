package com.epicode.Spring.security.payload;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    private String name;
    private String username;
    private String email;
    private String password;
    private String secretCode; //passaggio di ruoli dal client (facoltativo)
    private Set<String> roles;
}


/* dal client mi aspetto un oggetto JOSN fatto in questo modo:
  
 {
 		"name": "Mario",
 		"username": "Mariolino",
 		"email": "m.rossi@example.com",
 		"password": "qwerty",
 		"secretCode": "12345",
 		"roles": ["USER"]
 }
*/
