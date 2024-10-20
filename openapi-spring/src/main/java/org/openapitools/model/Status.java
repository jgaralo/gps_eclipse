package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Mark;
import org.openapitools.model.Winner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Status
 */

@JsonTypeName("status")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-06T20:59:53.831107+02:00[Europe/Madrid]", comments = "Generator version: 7.8.0")
public class Status {

  private Winner winner;

  @Valid
  private List<List<Mark>> board = new ArrayList<>();

  public Status winner(Winner winner) {
    this.winner = winner;
    return this;
  }

  /**
   * Get winner
   * @return winner
   */
  @Valid 
  @Schema(name = "winner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winner")
  public Winner getWinner() {
    return winner;
  }

  public void setWinner(Winner winner) {
    this.winner = winner;
  }

  public Status board(List<List<Mark>> board) {
    this.board = board;
    return this;
  }

  public Status addBoardItem(List<Mark> boardItem) {
    if (this.board == null) {
      this.board = new ArrayList<>();
    }
    this.board.add(boardItem);
    return this;
  }

  /**
   * Get board
   * @return board
   */
  @Valid @Size(min = 3, max = 3) 
  @Schema(name = "board", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board")
  public List<List<Mark>> getBoard() {
    return board;
  }

  public void setBoard(List<List<Mark>> board) {
    this.board = board;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.winner, status.winner) &&
        Objects.equals(this.board, status.board);
  }

  @Override
  public int hashCode() {
    return Objects.hash(winner, board);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    winner: ").append(toIndentedString(winner)).append("\n");
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

