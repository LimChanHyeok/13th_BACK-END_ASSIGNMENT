package com.Limchanhyeok.LikeLionWeek4.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatRoomDetailsResponseDto {
    private Long id;
    private String name;
    private List<String> usernames;
}
