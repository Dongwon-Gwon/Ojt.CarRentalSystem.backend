package sk.ojt.backend.admin.jpa;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Admin {

    @Id
    @Column(name = "admin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adminId;

    @Column(name = "admin_name")
    private String adminName;

    @Builder
    public Admin(long adminId, String adminName) {
        this.adminId = adminId;
        this.adminName = adminName;
    }

}
