package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Winner of the game. `.` means nobody has won yet.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-06T20:59:53.831107+02:00[Europe/Madrid]", comments = "Generator version: 7.8.0")
public enum Winner {
  
  PERIOD("."),
  
  X("X"),
  
  O("O");

  private String value;

  Winner(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Winner fromValue(String value) {
    for (Winner b : Winner.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

