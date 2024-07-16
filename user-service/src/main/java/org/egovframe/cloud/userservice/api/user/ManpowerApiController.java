package org.egovframe.cloud.userservice.api.user;

import lombok.RequiredArgsConstructor;
import org.egovframe.cloud.userservice.api.user.dto.ManpowerSaveRequestDto;
import org.egovframe.cloud.userservice.api.user.dto.ManpowerResponseDto;
import org.egovframe.cloud.userservice.service.user.ManpowerService;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/manpower")
public class ManpowerApiController {

    private final ManpowerService manpowerService;

    @PostMapping
    public Long save(@RequestBody ManpowerSaveRequestDto requestDto) {
        return manpowerService.save(requestDto);
    }

    @GetMapping("/{id}")
    public ManpowerResponseDto findById(@PathVariable Long id) {
        return manpowerService.findById(id);
    }

    // Update, delete mappings can be added similarly
}
