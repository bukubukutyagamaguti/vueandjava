package com.example.posgretaql.model;

import java.util.List;

public record LoginUserModel(
        String userId,
        String name,
        String password,
        List<String> roleList
) {
}
