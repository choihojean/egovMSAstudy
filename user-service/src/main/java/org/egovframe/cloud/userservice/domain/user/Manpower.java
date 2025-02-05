package org.egovframe.cloud.userservice.domain.user;

import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name="talent")
public class Manpower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String residentNumber;
    private String address;
    private String email;
    private String qualification;
    private String major;
    private String otherSkills;
    private String evaluationCode;
    private String evaluationContent;
    private boolean blacklist;
    private String blacklistReason;
    private String profile;

    @Builder
    public Manpower(String name, String residentNumber, String address, String email, String qualification, String major, String otherSkills, String evaluationCode, String evaluationContent, boolean blacklist, String blacklistReason, String profile) {
        this.name = name;
        this.residentNumber = residentNumber;
        this.address = address;
        this.email = email;
        this.qualification = qualification;
        this.major = major;
        this.otherSkills = otherSkills;
        this.evaluationCode = evaluationCode;
        this.evaluationContent = evaluationContent;
        this.blacklist = blacklist;
        this.blacklistReason = blacklistReason;
        this.profile = profile;
    }
}
