package org.egovframe.cloud.userservice.api.user.dto;

import lombok.Getter;
import org.egovframe.cloud.userservice.domain.user.Manpower;

@Getter
public class ManpowerResponseDto {

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

    public ManpowerResponseDto(Manpower entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.residentNumber = entity.getResidentNumber();
        this.address = entity.getAddress();
        this.email = entity.getEmail();
        this.qualification = entity.getQualification();
        this.major = entity.getMajor();
        this.otherSkills = entity.getOtherSkills();
        this.evaluationCode = entity.getEvaluationCode();
        this.evaluationContent = entity.getEvaluationContent();
        this.blacklist = entity.isBlacklist();
        this.blacklistReason = entity.getBlacklistReason();
        this.profile = entity.getProfile();
    }
}
