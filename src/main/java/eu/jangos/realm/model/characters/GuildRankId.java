package eu.jangos.realm.model.characters;
// Generated 06-mai-2016 23:00:34 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GuildRankId generated by hbm2java
 */
@Embeddable
public class GuildRankId  implements java.io.Serializable {


     private int fkGuildId;
     private byte id;

    public GuildRankId() {
    }

    public GuildRankId(int fkGuildId, byte id) {
       this.fkGuildId = fkGuildId;
       this.id = id;
    }
   


    @Column(name="fk_guild_id", nullable=false)
    public int getFkGuildId() {
        return this.fkGuildId;
    }
    
    public void setFkGuildId(int fkGuildId) {
        this.fkGuildId = fkGuildId;
    }


    @Column(name="id", nullable=false)
    public byte getId() {
        return this.id;
    }
    
    public void setId(byte id) {
        this.id = id;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GuildRankId) ) return false;
		 GuildRankId castOther = ( GuildRankId ) other; 
         
		 return (this.getFkGuildId()==castOther.getFkGuildId())
 && (this.getId()==castOther.getId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkGuildId();
         result = 37 * result + this.getId();
         return result;
   }   


}


