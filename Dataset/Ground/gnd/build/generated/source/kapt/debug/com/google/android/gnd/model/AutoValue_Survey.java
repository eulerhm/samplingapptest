package com.google.android.gnd.model;

import androidx.annotation.NonNull;
import com.google.android.gnd.model.basemap.BaseMap;
import com.google.android.gnd.model.job.Job;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

// Generated by com.google.auto.value.processor.AutoValueProcessor
final class AutoValue_Survey extends Survey {

  private final String id;

  private final String title;

  private final String description;

  private final ImmutableMap<String, Job> jobMap;

  private final ImmutableList<BaseMap> baseMaps;

  private final ImmutableMap<String, String> acl;

  private AutoValue_Survey(
      String id,
      String title,
      String description,
      ImmutableMap<String, Job> jobMap,
      ImmutableList<BaseMap> baseMaps,
      ImmutableMap<String, String> acl) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.jobMap = jobMap;
    this.baseMaps = baseMaps;
    this.acl = acl;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @NonNull
  @Override
  protected ImmutableMap<String, Job> getJobMap() {
    return jobMap;
  }

  @NonNull
  @Override
  public ImmutableList<BaseMap> getBaseMaps() {
    return baseMaps;
  }

  @Override
  public ImmutableMap<String, String> getAcl() {
    return acl;
  }

  @Override
  public String toString() {
    return "Survey{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "jobMap=" + jobMap + ", "
        + "baseMaps=" + baseMaps + ", "
        + "acl=" + acl
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Survey) {
      Survey that = (Survey) o;
      return this.id.equals(that.getId())
          && this.title.equals(that.getTitle())
          && this.description.equals(that.getDescription())
          && this.jobMap.equals(that.getJobMap())
          && this.baseMaps.equals(that.getBaseMaps())
          && this.acl.equals(that.getAcl());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= id.hashCode();
    h$ *= 1000003;
    h$ ^= title.hashCode();
    h$ *= 1000003;
    h$ ^= description.hashCode();
    h$ *= 1000003;
    h$ ^= jobMap.hashCode();
    h$ *= 1000003;
    h$ ^= baseMaps.hashCode();
    h$ *= 1000003;
    h$ ^= acl.hashCode();
    return h$;
  }

  @Override
  public Survey.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends Survey.Builder {
    private String id;
    private String title;
    private String description;
    private ImmutableMap.Builder<String, Job> jobMapBuilder$;
    private ImmutableMap<String, Job> jobMap;
    private ImmutableList.Builder<BaseMap> baseMapsBuilder$;
    private ImmutableList<BaseMap> baseMaps;
    private ImmutableMap<String, String> acl;
    Builder() {
    }
    private Builder(Survey source) {
      this.id = source.getId();
      this.title = source.getTitle();
      this.description = source.getDescription();
      this.jobMap = source.getJobMap();
      this.baseMaps = source.getBaseMaps();
      this.acl = source.getAcl();
    }
    @Override
    public Survey.Builder setId(String id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public Survey.Builder setTitle(String title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public Survey.Builder setDescription(String description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public Survey.Builder setJobMap(ImmutableMap jobMap) {
      if (jobMap == null) {
        throw new NullPointerException("Null jobMap");
      }
      if (jobMapBuilder$ != null) {
        throw new IllegalStateException("Cannot set jobMap after calling jobMapBuilder()");
      }
      this.jobMap = jobMap;
      return this;
    }
    @Override
    public ImmutableMap.Builder<String, Job> jobMapBuilder() {
      if (jobMapBuilder$ == null) {
        if (jobMap == null) {
          jobMapBuilder$ = ImmutableMap.builder();
        } else {
          jobMapBuilder$ = ImmutableMap.builder();
          jobMapBuilder$.putAll(jobMap);
          jobMap = null;
        }
      }
      return jobMapBuilder$;
    }
    @Override
    public ImmutableList.Builder<BaseMap> baseMapsBuilder() {
      if (baseMapsBuilder$ == null) {
        if (baseMaps == null) {
          baseMapsBuilder$ = ImmutableList.builder();
        } else {
          baseMapsBuilder$ = ImmutableList.builder();
          baseMapsBuilder$.addAll(baseMaps);
          baseMaps = null;
        }
      }
      return baseMapsBuilder$;
    }
    @Override
    public Survey.Builder setAcl(ImmutableMap<String, String> acl) {
      if (acl == null) {
        throw new NullPointerException("Null acl");
      }
      this.acl = acl;
      return this;
    }
    @Override
    public Survey build() {
      if (jobMapBuilder$ != null) {
        this.jobMap = jobMapBuilder$.build();
      } else if (this.jobMap == null) {
        this.jobMap = ImmutableMap.of();
      }
      if (baseMapsBuilder$ != null) {
        this.baseMaps = baseMapsBuilder$.build();
      } else if (this.baseMaps == null) {
        this.baseMaps = ImmutableList.of();
      }
      String missing = "";
      if (this.id == null) {
        missing += " id";
      }
      if (this.title == null) {
        missing += " title";
      }
      if (this.description == null) {
        missing += " description";
      }
      if (this.acl == null) {
        missing += " acl";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Survey(
          this.id,
          this.title,
          this.description,
          this.jobMap,
          this.baseMaps,
          this.acl);
    }
  }

}
