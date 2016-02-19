package eu.jangos.realm.model.auth;

import java.util.Date;
import java.util.Objects;

/**
 * Bannedaccount generated by hbm2java
 */
public class Bannedaccount  implements java.io.Serializable {


     private Integer id;
     private Account accountByFkBannedby;
     private Account accountByFkBannedaccount;
     private Date bandate;
     private Date unban;
     private String reason;
     private boolean active;

    public Bannedaccount() {
    }

	
    public Bannedaccount(Account accountByFkBannedby, Account accountByFkBannedaccount, Date bandate, String reason, boolean active) {
        this.accountByFkBannedby = accountByFkBannedby;
        this.accountByFkBannedaccount = accountByFkBannedaccount;
        this.bandate = bandate;
        this.reason = reason;
        this.active = active;
    }
    public Bannedaccount(Account accountByFkBannedby, Account accountByFkBannedaccount, Date bandate, Date unban, String reason, boolean active) {
       this.accountByFkBannedby = accountByFkBannedby;
       this.accountByFkBannedaccount = accountByFkBannedaccount;
       this.bandate = bandate;
       this.unban = unban;
       this.reason = reason;
       this.active = active;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Account getAccountByFkBannedby() {
        return this.accountByFkBannedby;
    }
    
    public void setAccountByFkBannedby(Account accountByFkBannedby) {
        this.accountByFkBannedby = accountByFkBannedby;
    }
    public Account getAccountByFkBannedaccount() {
        return this.accountByFkBannedaccount;
    }
    
    public void setAccountByFkBannedaccount(Account accountByFkBannedaccount) {
        this.accountByFkBannedaccount = accountByFkBannedaccount;
    }
    public Date getBandate() {
        return this.bandate;
    }
    
    public void setBandate(Date bandate) {
        this.bandate = bandate;
    }
    public Date getUnban() {
        return this.unban;
    }
    
    public void setUnban(Date unban) {
        this.unban = unban;
    }
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bannedaccount other = (Bannedaccount) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}

