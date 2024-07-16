package org.egovframe.cloud.userservice.service.user;

import lombok.RequiredArgsConstructor;
import org.egovframe.cloud.userservice.domain.user.Manpower;
import org.egovframe.cloud.userservice.domain.user.ManpowerRepository;
import org.egovframe.cloud.userservice.api.user.dto.ManpowerSaveRequestDto;
import org.egovframe.cloud.userservice.api.user.dto.ManpowerResponseDto;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ManpowerService {

    private final ManpowerRepository manpowerRepository;

    public Long save(ManpowerSaveRequestDto requestDto) {
        Manpower manpower = requestDto.toEntity();
        manpowerRepository.save(manpower);
        return manpower.getId();
    }

    public ManpowerResponseDto findById(Long id) {
        Manpower manpower = manpowerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No manpower found with id " + id));
        return new ManpowerResponseDto(manpower);
    }

    // Update, delete methods can be added similarly
}
