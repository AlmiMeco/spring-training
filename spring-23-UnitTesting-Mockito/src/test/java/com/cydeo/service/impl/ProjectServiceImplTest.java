package com.cydeo.service.impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.entity.Project;
import com.cydeo.mapper.ProjectMapper;
import com.cydeo.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProjectServiceImplTest {

    @InjectMocks
    ProjectServiceImpl projectService;
    @Mock
    ProjectRepository projectRepository;
    @Mock
    ProjectMapper projectMapper;


    @Test
    void getByProjectCodeTest(){

        when(projectRepository.findByProjectCode(anyString())).thenReturn(new Project());

        when(projectMapper.convertToDto(any(Project.class))).thenReturn(new ProjectDTO());
    }


}