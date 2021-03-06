package com.google.android.gnd.persistence.local.room.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

// Generated by com.google.auto.value.processor.AutoValueProcessor
final class AutoValue_TaskEntity extends TaskEntity {

  @NonNull
  @PrimaryKey
  @ColumnInfo(name = "id")
  private final String id;

  @Nullable
  @ColumnInfo(name = "title")
  private final String title;

  @NonNull
  @ColumnInfo(name = "job_id")
  private final String jobId;

  private AutoValue_TaskEntity(
      String id,
      @Nullable String title,
      String jobId) {
    this.id = id;
    this.title = title;
    this.jobId = jobId;
  }

  @NonNull
  @PrimaryKey
  @ColumnInfo(name = "id")
  @Override
  public String getId() {
    return id;
  }

  @Nullable
  @ColumnInfo(name = "title")
  @Override
  public String getTitle() {
    return title;
  }

  @NonNull
  @ColumnInfo(name = "job_id")
  @Override
  public String getJobId() {
    return jobId;
  }

  @Override
  public String toString() {
    return "TaskEntity{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "jobId=" + jobId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TaskEntity) {
      TaskEntity that = (TaskEntity) o;
      return this.id.equals(that.getId())
          && (this.title == null ? that.getTitle() == null : this.title.equals(that.getTitle()))
          && this.jobId.equals(that.getJobId());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= id.hashCode();
    h$ *= 1000003;
    h$ ^= (title == null) ? 0 : title.hashCode();
    h$ *= 1000003;
    h$ ^= jobId.hashCode();
    return h$;
  }

  static final class Builder extends TaskEntity.Builder {
    private String id;
    private String title;
    private String jobId;
    Builder() {
    }
    @Override
    public TaskEntity.Builder setId(String id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public TaskEntity.Builder setTitle(String title) {
      this.title = title;
      return this;
    }
    @Override
    public TaskEntity.Builder setJobId(String jobId) {
      if (jobId == null) {
        throw new NullPointerException("Null jobId");
      }
      this.jobId = jobId;
      return this;
    }
    @Override
    public TaskEntity build() {
      String missing = "";
      if (this.id == null) {
        missing += " id";
      }
      if (this.jobId == null) {
        missing += " jobId";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_TaskEntity(
          this.id,
          this.title,
          this.jobId);
    }
  }

}
