package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "server")
public class Server {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;

   @Column(name = "hostname")
   private String hostname;

   public Server() {
   }

   public Server(Integer id, String hostname) {
      this.id = id;
      this.hostname = hostname;
   }

   public Server(String hostname) {
      this.hostname = hostname;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getHostname() {
      return hostname;
   }

   public void setHostname(String hostname) {
      this.hostname = hostname;
   }

   @Override
   public String toString() {
      return "Server: " + this.id + ", " + this.hostname;
   }
}