package safebox.cubancoder.entities;

import javax.persistence.*;

@Entity
@Table(name="USER_SAFE_BOX")
public class UserSafeBox {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
  @Column(name = "ID")
  Long id;


  @Column(name = "USER_NAME")
  String username;

  @Column(name = "USER_PASSWORD")
  String userpassword;





}
