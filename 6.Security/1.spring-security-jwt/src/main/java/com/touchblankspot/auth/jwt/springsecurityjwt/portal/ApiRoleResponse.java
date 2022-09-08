package com.touchblankspot.auth.jwt.springsecurityjwt.portal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class ApiRoleResponse {

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;
}
