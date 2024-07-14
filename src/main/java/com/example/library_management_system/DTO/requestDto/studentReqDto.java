package com.example.library_management_system.DTO.requestDto;

import com.example.library_management_system.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class studentReqDto {

    private String name;
    private Department dep;
    private String mob;

}
