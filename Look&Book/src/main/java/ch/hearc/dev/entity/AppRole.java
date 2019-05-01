package ch.hearc.dev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "App_Role", uniqueConstraints = {@UniqueConstraint(name = "APP_ROLE_UK", columnNames = "Role_Name") })
public class AppRole {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Role_Id", nullable = false)
    private Long id;
	
	@Column(name = "Role_Name", length = 30, nullable = false)
    private String roleName;
 
    public Long getRoleId() {
        return id;
    }
 
    public void setRoleId(Long roleId) {
        this.id = roleId;
    }
 
    public String getRoleName() {
        return roleName;
    }
 
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}