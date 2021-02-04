package safebox.cubancoder.entities;

import javax.persistence.*;

@Entity
@Table(name="SAFE_BOX")
public class SafeBox {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
  @Column(name = "ID")
  Long id;


}
