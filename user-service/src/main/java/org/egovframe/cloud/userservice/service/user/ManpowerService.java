package org.egovframe.cloud.userservice.service.user;

import lombok.RequiredArgsConstructor;
import org.egovframe.cloud.userservice.api.user.dto.ManpowerSaveRequestDto;
import org.egovframe.cloud.userservice.api.user.dto.ManpowerResponseDto;
import org.egovframe.cloud.userservice.domain.user.Manpower;
import org.egovframe.cloud.userservice.domain.user.ManpowerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ManpowerService {

    private final ManpowerRepository manpowerRepository;

    @Transactional
    public Long save(ManpowerSaveRequestDto requestDto) {
        Manpower manpower = requestDto.toEntity();
        manpowerRepository.save(manpower);
        return manpower.getId();
    }

    public ManpowerResponseDto findById(Long id) {
        Manpower entity = manpowerRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("해당 인재가 없습니다. id=" + id));
        return new ManpowerResponseDto(entity);
    }
}
